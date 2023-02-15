<?php
require '../../includes/app.php';

use App\Propiedad;
use App\Vendedor;
use Intervention\Image\ImageManagerStatic as Image;

estaAutenticado();

$propiedad = new Propiedad;

//Consulta para obtener todos los vendedores
$vendedores = Vendedor::all();

//Manejo de errores
$errores = Propiedad::getErrores();

// Ejecutar codigo despues de que el usuario envia el formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    //Crear una nueva instancia
    $propiedad = new Propiedad($_POST['propiedad']);

    //Generar nombre unico imagen
    $nombreImagen = md5(uniqid(rand(), true)) . ".jpg";

    //Setear la imagen | Realizar un resize a la imagen con intervetion
    if ($_FILES['propiedad']['tmp_name']['imagen']) {
        $image = Image::make($_FILES['propiedad']['tmp_name']['imagen'])->fit(800, 600);
        $propiedad->setImagen($nombreImagen);
    }
    //Validar
    $errores = $propiedad->validar();

    //Revisar que el array de errores este vacio
    if (empty($errores)) {

        // Crear la carpeta para subir imagenes
        if (!is_dir(CARPETA_IMAGENES)) {
            mkdir(CARPETA_IMAGENES);
        }

        // Guarda la imagen en el servidor
        $image->save(CARPETA_IMAGENES . $nombreImagen);

        // Guarda en la base de datos
        $propiedad->guardar(); 
    }
}


incluirTemplate('header', $inicio = false);
?>

<main class="contenedor seccion">
    <h2>Crear Propiedad</h2>

    <a href="/admin/index.php" class="boton boton-verde-inline-block">Volver</a>

    <?php foreach ($errores as $error) : ?>
        <div class="alerta error">
            <?php echo $error ?>
        </div>
    <?php endforeach; ?>
    <form class="formulario" method="POST" action="crear.php" enctype="multipart/form-data">
        <?php include '../../includes/templates/formulario.php' ?>

        <input type="submit" value="Crear Propiedad" class="boton boton-verde">
    </form>

</main>

<?php
incluirTemplate('footer');
?>