<?php

$hostname = "localhost";
$user = "root";
$pass = "1234";
$database = "";

$db = mysqli_connect($hostname, $user , $pass, $database);
mysqli_query($db, "SET NAMES 'utf8'"); //Esta instrucción permite guardar eñes y acentos en la BD ;)


if (!$db) {
    echo "Error: No se pudo conectar a MySQL.";
    echo "errno de depuración: " . mysqli_connect_errno();
    echo "error de depuración: " . mysqli_connect_error();
    exit;
}
else{
    echo "Conexión Correcta";
}
