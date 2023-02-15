<?php
    require 'includes/app.php';
    incluirTemplate('header', $inicio = false);
?>
    <main class="seccion contenedor">
        <h2>Casas y Departamentos en Venta</h2>

        <?php
            $limite = 100;
            include 'includes/templates/anuncios.php';
        ?>
    </main>

<?php
    incluirTemplate('footer');
?>