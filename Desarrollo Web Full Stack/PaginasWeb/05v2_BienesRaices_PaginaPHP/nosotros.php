<?php
    require 'includes/funciones.php';
    incluirTemplate('header', $inicio = false);
?>

    <main class="contenedor seccion">
        <h2>Conoce Sobre Nosotros</h2>

        <div class="contenido-nosotros">
            <div class="iamgen">
                <picture>
                    <source srcset="build/img/nosotros.avif" type="image/avif">
                    <source srcset="build/img/nosotros.webp" type="image/webp">
                    <img loading="lazy" width="200" heigth="300" src="build/img/nosotros.jpg" alt="Imagen nosotros">
                </picture>
            </div>

            <div class="texto-nosotros">
                <blockquote>25 años de experiencia</blockquote>
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Vel cupiditate dolore sapiente facilis
                    velit fugit necessitatibus odio nobis nemo inventore in labore sed dolor minima error, asperiores
                    .
                    

                </p>
                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Vel ab veritatis velit laboriosam natus
                    labore, voluptatem dolorum earum, voluptatibus ea quam exercitationem similique nulla quae! Tempore
                    reiciendis minus facilis rem?</p>
            </div>
        </div>

        <section class="contenedor seccion">
            <h2>Sobre Nosotros</h2>
    
            <div class="iconos-nosotros">
                <div class="icono">
                    <img src="build/img/icono1.svg" alt="Icono Seguridad" loading="lazy">
                    <h3>Seguridad</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore ipsa eos eius atque minus.
                        Recusandae saepe ex rerum necessitatibus minus hic? Rerum iure aspernatur, quo repudiandae
                        consectetur maiores. Saepe, rerum!</p>
                </div>
                <div class="icono">
                    <img src="build/img/icono2.svg" alt="Icono Precio" loading="lazy">
                    <h3>Precio</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore ipsa eos eius atque minus.
                        Recusandae saepe ex rerum necessitatibus minus hic? Rerum iure aspernatur, quo repudiandae
                        consectetur maiores. Saepe, rerum!</p>
                </div>
                <div class="icono">
                    <img src="build/img/icono3.svg" alt="Icono Tiempo" loading="lazy">
                    <h3>Tiempo</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore ipsa eos eius atque minus.
                        Recusandae saepe ex rerum necessitatibus minus hic? Rerum iure aspernatur, quo repudiandae
                        consectetur maiores. Saepe, rerum!</p>
                </div>
            </div>
        </section>

    </main>



<?php
    incluirTemplate('footer');
?>