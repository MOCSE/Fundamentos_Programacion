<?php
    require 'includes/funciones.php';
    incluirTemplate('header', $inicio = false);
?>

    <main class="contenedor seccion contenido-centrado">
        <h2>Nuestro Blog</h2>
        <section class="blog">
            <article class="entrada-blog">
                <div class="imagen">
                    <picture>
                        <source srcset="build/img/blog1.avif" type="image/avif">
                        <source srcset="build/img/blog1.webp" type="image/webp">
                        <img loading="lazy" width="200" heigth="300" src="build/img/blog1.jpg" alt="Imagen Blog 1">
                    </picture>
                </div>

                <div class="texto-entrada">
                    <a href="entrada.html">
                        <h4>Terraza en el techo de tu casa</h4>
                        <p>Escrito el: <span>20/10/2022</span> por <span>Admin</span></p>
                        <p>
                            Consejos para construir una terraza en el techo de tu Casa
                            con los mejores materiales y ahorrando dinero.
                        </p>
                    </a>
                </div>
            </article>

            <article class="entrada-blog">
                <div class="imagen">
                    <picture>
                        <source srcset="build/img/blog2.avif" type="image/avif">
                        <source srcset="build/img/blog2.webp" type="image/webp">
                        <img loading="lazy" width="200" heigth="300" src="build/img/blog2.jpg" alt="Imagen Blog 2">
                    </picture>
                </div>

                <div class="texto-entrada">
                    <a href="entrada.html">
                        <h4>Guía para la decoración de tu hogar</h4>
                        <p>Escrito el: <spa>20/10/2022</spa> por <span>Admin</span></p>
                        <p>
                            Maximiza el espacio en tu hogar con esta guía, aprende a combinar
                            muebles y colores para darle vida a tu espacio.
                        </p>
                    </a>
            </article>

            <article class="entrada-blog">
                <div class="imagen">
                    <picture>
                        <source srcset="build/img/blog3.avif" type="image/avif">
                        <source srcset="build/img/blog3.webp" type="image/webp">
                        <img loading="lazy" width="200" heigth="300" src="build/img/blog3.jpg" alt="Imagen Blog 2">
                    </picture>
                </div>

                <div class="texto-entrada">
                    <a href="entrada.html">
                        <h4>Terraza en el techo de tu casa</h4>
                        <p>Escrito el: <spa>20/10/2022</spa> por <span>Admin</span></p>
                        <p>
                            Maximiza el espacio en tu hogar con esta guía, aprende a combinar
                            muebles y colores para darle vida a tu espacio.
                        </p>
                    </a>
            </article>

            <article class="entrada-blog">
                <div class="imagen">
                    <picture>
                        <source srcset="build/img/blog4.avif" type="image/avif">
                        <source srcset="build/img/blog4.webp" type="image/webp">
                        <img loading="lazy" width="200" heigth="300" src="build/img/blog4.jpg" alt="Imagen Blog 2">
                    </picture>
                </div>

                <div class="texto-entrada">
                    <a href="entrada.html">
                        <h4>Guía para la decoración de tu hogar</h4>
                        <p>Escrito el: <spa>20/10/2022</spa> por <span>Admin</span></p>
                        <p>
                            Maximiza el espacio en tu hogar con esta guía, aprende a combinar
                            muebles y colores para darle vida a tu espacio.
                        </p>
                    </a>
            </article>

            
        </section>
        </div>
    </main>

<?php
    incluirTemplate('footer');
?>