<?php
    require 'includes/config/database.php';
    $db = conectarDB();

    $query = "SELECT * FROM propiedades LIMIT $limite";
    $resultado = mysqli_query($db, $query);

?>

<div class="contenedor-anuncios">

    <?php while ($propiedad = mysqli_fetch_assoc($resultado)):?>
    <div class="anuncio">

        <img loading="lazy" src="/imagenes/<?php echo $propiedad['imagen']; ?>" alt="Casa">

        <div class="contenido-anuncio">
            <h3><?php echo $propiedad['titulo']; ?></h3>
            <!-- substr($texto, posicionInicio, cantidadDevolver); -->
            <p><?php echo substr($propiedad['descripcion'], 0, 90); ?>  ...</p>
            <p class="precio">$ <?php echo number_format($propiedad['precio']); ?></p>

            <ul class="iconos-caracteristicas">
                <li>
                    <img class="icono" loading="lazy" src="build/img/icono_wc.svg" alt="icono wc">
                    <p><?php echo $propiedad['wc'];?></p>
                </li>
                <li>
                    <img class="icono" loading="lazy" src="build/img/icono_estacionamiento.svg" alt="icono estacionamiento">
                    <p><?php echo $propiedad['estacionamiento'];?></p>
                </li>
                <li>
                    <img class="icono" loading="lazy" src="build/img/icono_dormitorio.svg" alt="icono dormitorio">
                    <p><?php echo $propiedad['habitaciones'];?></p>
                </li>
            </ul>

            <a href="/../../anuncio.php?id=<?php echo $propiedad['id'];?>" class="boton boton-amarillo">Ver Propiedad</a>
        </div>
    </div>

    <?php endwhile; ?>
</div>

<?php
    mysqli_close($db);
?>