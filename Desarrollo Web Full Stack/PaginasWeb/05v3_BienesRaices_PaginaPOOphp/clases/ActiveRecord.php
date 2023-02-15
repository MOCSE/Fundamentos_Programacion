<?php

namespace App;

class ActiveRecord
{

    // BASE DE DATOS
    protected static $db;
    protected static $columnasDB = [];
    protected static $tabla = "";


    // ERRORES
    protected static $errores = [];



    // Definir la conexion a la BD
    public static function setDB($database)
    {
        self::$db = $database;
    }

    // Iterar Sobre $columnasDB (Mapear) || Identificar y unir los atributos de la BD
    public function atributos()
    {
        $atributos = [];
        foreach (static::$columnasDB as $columna) {
            if ($columna === 'id')
                continue;
            $atributos[$columna] = $this->$columna; // Agarra los datos directo de POST
        }
        return $atributos;
    }

    // Funcion para Sanitizar Datos
    public function sanitizarAtributos()
    {
        $atributos = $this->atributos();
        $sanitizado = [];

        foreach ($atributos as $key => $value) {
            $sanitizado[$key] = self::$db->escape_string($value);
        }

        return $sanitizado;
    }

    //Validacion
    public static function getErrores()
    {
        return static::$errores;
    }

    //Funcion de validacion de datos
    public function validar()
    {
        static::$errores = [];
        return static::$errores;
    }

    // Subida de imagenes
    public function setImagen($imagen)
    {
        //Eliminar imagen previa
        if (!is_null($this->id)) {
            $this->borrarImagen();
        }

        // Asignar al atributo de imagen el nombre de la imagen
        if ($imagen) {
            $this->imagen = $imagen;
        }
    }

    // Eliminar Archivo
    public function borrarImagen()
    {
        //Comprobar si existe el archivo
        $existeArchivo = file_exists(CARPETA_IMAGENES . $this->imagen);
        if ($existeArchivo) {
            unlink(CARPETA_IMAGENES . $this->imagen);
        }
    }


    //Funcion para Crear y guardar Propiedad en BD
    public function crear()
    {

        //Sanitizar datos
        $atributos = $this->sanitizarAtributos();

        //Creando query
        $keys = join(', ', array_keys($atributos));
        $values = join("', '", array_values($atributos));
        $query = "INSERT INTO " . static::$tabla . " ($keys) VALUES ('$values')";

        //Insertar en la base de datos
        $resultado = self::$db->query($query);

        //Mensaje de exito o error
        if ($resultado) {
            //Redireccionar usuario.
            header('Location: /admin/index.php?resultado=1');
        }
    }

    //Funcion para Actualizar Propiedad en BD
    public function actualizar()
    {
        //Sanitizar datos
        $atributos = $this->sanitizarAtributos();

        $valoress = [];
        foreach ($atributos as $key => $value) {
            $valores[] = "{$key}='{$value}'";
        }

        $values = join(', ', $valores);
        $id = self::$db->escape_string($this->id);
        $query = "UPDATE " . static::$tabla . " SET $values WHERE id='$id' LIMIT 1";

        $resultado = self::$db->query($query);

        //Mensaje de exito o error
        if ($resultado) {
            //Redireccionar usuario.
            header('Location: /admin/index.php?resultado=2');
        }
    }

    //Funcion para ver si se debe actualizar o crear
    public function guardar()
    {
        if (!is_null($this->id)) {
            // Actualizar
            $this->actualizar();
        } else {
            // Creando un nuevo registro
            $this->crear();
        }
    }

    public function eliminar()
    {
        //Eliminar propiedad
        $id = self::$db->escape_string($this->id);
        $query = "DELETE FROM " . static::$tabla . " WHERE id = $id LIMIT 1";
        

        $resultado = self::$db->query($query);
        if ($resultado) {
            $this->borrarImagen();
            header("Location: index.php?resultado=3");
        }
    }

    //Funciones para Listar todas los registros
    public static function all()
    {
        $query = "SELECT * FROM " . static::$tabla;
        $resultado = self::consultarSQL($query);
        return $resultado;
    }

    //Buscar una propiedad por ID
    public static function find($id)
    {
        $query = "SELECT * FROM " . static::$tabla . " WHERE id = '$id'";
        $resultado = self::consultarSQL($query);
        return array_shift($resultado);
    }

    public static function consultarSQL($query)
    {
        //Consultar BD
        $resultado = self::$db->query($query);

        //Iterar resultados convirtiendo de arreglo a objeto
        $array = [];
        while ($registro = $resultado->fetch_assoc()) {
            $array[] = static::crearObjeto($registro);
        }

        //Liberar Memoria
        $resultado->free();

        //Retornar resultados
        return $array;
    }

    protected static function crearObjeto($registro)
    {
        $objeto = new static ();

        //Comprobando cada iteracion y mapea para convertir a objeto
        foreach ($registro as $key => $value) {
            if (property_exists($objeto, $key)) {
                $objeto->$key = $value;
            }
        }

        return $objeto;
    }

    //Sincronizar objeto en memoria con los cambios realizados por el usuario
    public function sinconizar($args = [])
    {
        foreach ($args as $key => $value) {
            if (property_exists($this, $key) && !is_null($value)) {
                $this->$key = $value;
            }
        }
        return $this;
    }
}