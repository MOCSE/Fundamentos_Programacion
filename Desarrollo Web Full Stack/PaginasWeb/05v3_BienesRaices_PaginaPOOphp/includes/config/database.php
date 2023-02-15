<?php

function conectarDB() : mysqli{
    $hostname = "localhost";
    $user = "root";
    $pass = "1234";
    $database = "bienesraices_crud";

    $db = new mysqli($hostname, $user , $pass, $database);
    
    if(!$db){
        echo "ERROR: No se pudo conectar DB";
        exit;
    }

    return $db;
}
