<?php

    require 'funciones.php';
    require 'config/database.php';
    require  __DIR__ . '/../vendor/autoload.php';

    //Conectar a la base de datos
    $db = conectarDB();
    $db->set_charset('utf8');  //reconocer caracteres como ñ

    use App\ActiveRecord;

    ActiveRecord::setDB($db);

?>