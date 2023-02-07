<?php
    require '../../includes/funciones.php';
    $auth = estaAutenticado();
    if(!$auth){
        header("Location: /../../index.php");
    }

    // BASE DE DATOS
    require '../../includes/config/database.php';
    $db = conectarDB();

    //Consulta para obtener los vendedores
    $consulta = "SELECT * FROM vendedores";
    $resultado = mysqli_query($db,$consulta);

    //Arreglo con mensajes de errores
    $errores = [];

    //Variables Globales
    $titulo = "";
    $precio = "";
    $descripcion = "";
    $habitaciones = "";
    $wc = "";
    $estacionamiento = "";
    $vendedor = "";
    

    // Ejecutar codigo despues de que el usuario envia el formulario
    if($_SERVER['REQUEST_METHOD'] === 'POST'){

        // Asignar datos a variables
        $titulo = mysqli_real_escape_string($db, $_POST['titulo']);
        $precio = mysqli_real_escape_string($db, $_POST['precio']);
        $descripcion = mysqli_real_escape_string($db, $_POST['descripcion']);
        $habitaciones = mysqli_real_escape_string($db, $_POST['habitaciones']);
        $wc = mysqli_real_escape_string($db, $_POST['wc']);
        $estacionamiento = mysqli_real_escape_string($db, $_POST['estacionamiento']);
        $vendedor = mysqli_real_escape_string($db, $_POST['vendedor']);
        $creado = date("Y/m/d");

        // Asignar files hacia una variable
        $imagen = $_FILES["imagen"];

        // Validaciones
        if(!$titulo){
            $errores[] = "Debes añadir un titulo";
        }
        if(!$precio){
            $errores[] = "El precio es obligatorio";
        }
        if(strlen($descripcion) < 50){
            $errores[] = "La descripcion es obligatoria y debe ser mayor a 50 caracteres";
        }
        if(!$habitaciones){
            $errores[] = "El numero de habitaciones es obligatorio";
        }
        if(!$wc){
            $errores[] = "El numero de baños es obligatorio";
        }
        if(!$estacionamiento){
            $errores[] = "El numero de estacionamientos es obligatorio";
        }
        if(!$vendedor){
            $errores[] = "Elige un vendedor";
        }

        // Validar imagen (1mb maximo)
        $medida = 1000 * 1000;

        if(!$imagen['name']){
            $errores[] = "La imagen es obligatoria";
        }
        if($imagen['size'] > $medida || $imagen['error']){
            $errores[] = "La imagen es muy pesada";
        }


        //Revisar que el array de errores este vacio
        if(empty($errores)){

            /** SUBIDA DE ARCHIVOS (Imagenes) */

            //Crear Carpeta
            $carpetaImagenes = "../../imagenes/";
            if(!is_dir($carpetaImagenes)){
                mkdir($carpetaImagenes);
            }

            //Generar nombre unico
            $nombreImagen = md5(uniqid(rand(),true)) . ".jpg";

            //Subir Imagen
            move_uploaded_file($imagen['tmp_name'], $carpetaImagenes . $nombreImagen);
            




            /** INSERTARNDO DATOS EN LA BD*/

            //Insertar en la base de datos
            $query = "INSERT INTO propiedades 
            (titulo,precio,imagen,descripcion,habitaciones,wc,estacionamiento,creado,vendedores_Id)
            VALUES ('$titulo','$precio','$nombreImagen','$descripcion','$habitaciones','$wc','$estacionamiento','$creado','$vendedor')";

            $resultado = mysqli_query($db,$query);
            if($resultado){
                //Redireccionar usuario.
                header('Location: index.php?resultado=1');
            }
        }
    } 


    incluirTemplate('header', $inicio = false);
?>

    <main class="contenedor seccion">
        <h2>Crear</h2>

        <a href="index.php" class="boton boton-verde-inline-block">Volver</a>

        <?php foreach($errores as $error): ?>
            <div class="alerta error">
                <?php echo $error ?>
            </div>
        <?php endforeach; ?>

        <form class="formulario" method="POST" action="crear.php" enctype="multipart/form-data">
            <fieldset>
                <legend>Informacion General</legend>

                <label for="titulo">Titulo:</label>
                <input type="text" id="titulo" name="titulo" placeholder="Titulo Propiedad" value="<?php echo $titulo; ?>">

                <label for="precio">Precio:</label>
                <input type="number" id="precio" name="precio" placeholder="Precio Propiedad" value="<?php echo $precio; ?>">

                <label for="imagen">Imagen:</label>
                <input type="file" id="imagen" accept="image/jpg, image/png, image/jpeg" name="imagen">

                <label for="descripcion">Descripcion:</label>
                <textarea id="descripcion" name="descripcion"><?php echo $descripcion; ?></textarea>
            </fieldset>

            <fieldset>
                <legend>Informacion Propiedad</legend>

                <label for="habitaciones">Habitaciones:</label>
                <input type="number" id="habitaciones" name="habitaciones" placeholder="Ej: 3" min="1" min="9" value="<?php echo $habitaciones; ?>">

                <label for="wc">Baños:</label>
                <input type="number" id="wc" name="wc" placeholder="Ej: 3" min="1" min="9" value="<?php echo $wc; ?>">

                <label for="estacionamiento">Estacionamiento:</label>
                <input type="number" id="estacionamiento" name="estacionamiento" placeholder="Ej: 3" min="1" min="9" value="<?php echo $estacionamiento; ?>">
            </fieldset>

            <fieldset>
                <legend>Vendedor</legend>

                <select name="vendedor">
                    <option value="">-- Seleccione --</option>
                    <?php while($row = mysqli_fetch_assoc($resultado)): ?>
                        <option
                            <?php echo $vendedor === $row['id'] ? 'selected' : ''; ?> 
                            value="<?php echo $row['id']; ?>">
                            <?php echo $row['nombre'] . " " . $row['apellido']; ?>
                        </option>
                    <?php endwhile; ?>
                </select>
            </fieldset>

            <input type="submit" value="Crear Propiedad" class="boton boton-verde">
        </form>

    </main>
    
<?php
    incluirTemplate('footer');
?>