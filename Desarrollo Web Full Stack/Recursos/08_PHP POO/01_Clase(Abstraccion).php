<?php 
declare( strict_types = 1);

include 'includes/header.php';

// Definir una clase PHP+8
class Producto {

    //Constructor
    public function __construct(public string $nombre, public int $precio, public bool $disponible)
    {
    }

    //Metodos
    public function mostrarProducto() {
        echo "El Producto es: " . $this->nombre . " y su precio es de: " . $this->precio;
    }

}

// Definir una clase PHP-7
class Producto2{
    public $nombre;
    public $precio;
    public $disponible;

    public function __construct(string $nombre, int $precio, bool $disponible)
    {
        $this->nombre = $nombre;
        $this->precio = $precio;
        $this->disponible = $disponible;
    }
}

//Instanciar Objetos y metodos
$producto = new Producto('Tablet', 200, true);
$producto->mostrarProducto();


echo "<pre>";
var_dump($producto);
echo "</pre>";

$producto2 = new Producto('Monitor Curvo', 300, true);
$producto2->mostrarProducto();

echo "<pre>";
var_dump($producto2);
echo "</pre>";

include 'includes/footer.php';