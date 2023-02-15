<?php
    require 'includes/funciones.php';
    incluirTemplate('header', $inicio = false);
?>

    <main class="contenedor seccion contenido-centrado texto-entrada">
        <h2>Terraza en el techo de tu casa</h2>

        <picture>
            <source srcset="build/img/blog1.avif" type="image/avif">
            <source srcset="build/img/blog1.webp" type="image/webp">
            <img loading="lazy" width="200" heigth="300" src="build/img/blog1.jpg" alt="Casa 1">
        </picture>

        <p>Escrito el: <span>20/10/2022</span> por <span>Admin</span></p>

        <div class="resumen-propiedad">


            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Quasi explicabo maiores error quis delectus id
                non inventore! Veniam sed impedit esse necessitatibus, quam consectetur tenetur amet a voluptatem
                doloribus fugiat?
                Dolore cumque inventore itaque in ducimus blanditiis sit neque ut commodi sequi, voluptate molestias
                laudantium est voluptas quos a autem porro omnis nobis? Tempore, distinctio tempora illum animi
                aspernatur non?
                Fugit mollitia totam minima architecto optio reiciendis sequi dignissimos expedita nesciunt? Distinctio
                at dolorum ipsum omnis quam quidem facilis itaque magni doloremque, cupiditate nisi voluptas
                voluptatibus quisquam sed, corporis nam.
                Sit soluta repellat dolorem nostrum ipsa similique quam cum. Quis, magnam odio esse libero ut doloremque
                qui a ab rerum voluptatum quam hic iste dolor ipsa, itaque similique, aperiam exercitationem?
                quae, in, ipsam hic? Aperiam ab asperiores fuga saepe nihil praesentium.
            </p>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Quasi explicabo maiores error quis delectus id
                non inventore! Veniam sed impedit esse necessitatibus, quam consectetur tenetur amet a voluptatem
                doloribus fugiat?
                Dolore cumque inventore itaque in ducimus blanditiis sit neque ut commodi sequi, voluptate molestias
                laudantium est voluptas quos a autem porro omnis nobis? Tempore, distinctio tempora illum animi
                aspernatur non?iores fuga saepe nihil praesentium.
            </p>
        </div>
    </main>

<?php
    incluirTemplate('footer');
?>