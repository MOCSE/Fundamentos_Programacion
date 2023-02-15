<?php

use App\Propiedad;
use App\Vendedor;
use Intervention\Image\ImageManagerStatic as Image;

require '../../includes/app.php';
estaAutenticado();

$vendedores = Vendedor::all();

// Filtro Para validar tipo de datos y evitar inyecciones SQL
$id = $_GET['id'];
$id = filter_var($id, FILTER_VALIDATE_INT);
if (!$id) {
    header('Location: /admin/index.php');
}

//Consulta Obtener los datos de la propiedad
$propiedad = Propiedad::find($id);

//Arreglo con mensajes de errores
$errores = Propiedad::getErrores();

// Ejecutar codigo despues de que el usuario envia el formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    //Asignar los atributos
    $args = $_POST['propiedad'];

    //Sincronizar
    $propiedad->sinconizar($args);

    //Validación
    $errores = $propiedad->validar();

    //Generar nombre unico imagen
    $nombreImagen = md5(uniqid(rand(), true)) . ".jpg";

    //Subida de Archivos
    if($_FILES['propiedad']['tmp_name']['imagen']) {
        $image = Image::make($_FILES['propiedad']['tmp_name']['imagen'])->fit(800,600);
        $propiedad->setImagen($nombreImagen);
    }

    if(empty($errores)) {
        // Almacenar la imagen
        if($_FILES['propiedad']['tmp_name']['imagen']) {
            $image->save(CARPETA_IMAGENES . $nombreImagen);
        }

        $propiedad->guardar();
    }
}




incluirTemplate('header', $inicio = false);
?>

<main class="contenedor seccion">
    <h2>Actualizar Propiedad</h2>

    <a href="/admin/index.php"" class="boton boton-verde-inline-block">Volver</a>

    <?php foreach ($errores as $error) : ?>
        <div class="alerta error">
            <?php echo $error ?>
        </div>
    <?php endforeach; ?>

    <form class="formulario" method="POST" enctype="multipart/form-data">
        <?php include '../../includes/templates/formulario.php' ?>
        <input type="submit" value="Actualizar Propiedad" class="boton boton-verde">
    </form>

</main>

<?php
incluirTemplate('footer');
?>