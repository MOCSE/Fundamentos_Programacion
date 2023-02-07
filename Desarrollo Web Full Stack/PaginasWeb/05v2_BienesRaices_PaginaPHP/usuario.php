<?php 
    require 'includes/config/database.php';
    $db = conectarDB();

    $email = "correo@gmail.com";
    $password = "123";
    $passwordHash = password_hash($password, PASSWORD_DEFAULT);

    $query = "INSERT INTO usuarios(email,password) VALUES('$email','$passwordHash');";
    var_dump($passwordHash);
    
    mysqli_query($db,$query);
?>