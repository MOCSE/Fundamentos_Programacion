<?php

function conectarDB() : mysqli{
    $hostname = "localhost";
    $user = "root";
    $pass = "1234";
    $database = "bienesraices_crud";

    $db = mysqli_connect($hostname, $user , $pass, $database);
    mysqli_query($db, "SET NAMES 'utf8'"); //Esta instrucción permite guardar eñes y acentos en la BD ;)

    if(!$db){
        echo "ERROR: No se pudo conectar DB";
        exit;
    }

    return $db;
}
