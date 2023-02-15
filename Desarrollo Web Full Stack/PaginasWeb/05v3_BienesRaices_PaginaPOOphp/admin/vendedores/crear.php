<?php
require '../../includes/app.php';

use App\Vendedor;

estaAutenticado();

$vendedor = new Vendedor;

//Manejo de errores
$errores = Vendedor::getErrores();

// Ejecutar codigo despues de que el usuario envia el formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    //Crear una nueva instancia
    $vendedor = new Vendedor($_POST['vendedor']);

    //Validar q no existan campos vacios
    $errores = $vendedor->validar();

    //No errores
    if(empty($errores)){
        $vendedor->guardar();
    }
}

incluirTemplate('header', $inicio = false);
?>

<main class="contenedor seccion">
    <h2>Registrar Vendedor</h2>

    <a href="/admin/index.php" class="boton boton-verde-inline-block">Volver</a>

    <?php foreach ($errores as $error) : ?>
        <div class="alerta error">
            <?php echo $error ?>
        </div>
    <?php endforeach; ?>
    <form class="formulario" method="POST">
        <?php include '../../includes/templates/formulario_vendedores.php' ?>

        <input type="submit" value="Registrar Vendedor" class="boton boton-verde">
    </form>

</main>

<?php
incluirTemplate('footer');
?>