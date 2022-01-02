package mx.com.gm.ventas;


public class Producto {
    
    //Atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    

    //Constructor
    private Producto() {
        idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //LLamar a constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    //Metodos
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
