package Productos;

public class Producto {
    private String marca;
    private String modelo;
    private double precio;

    //Constructor
    Producto(){
        this.marca = "Generic";
        this.modelo = "No aviable";
        this.precio = 0;
    }
    Producto(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodos
    public double getPrecio(){
        return this.precio;
    }


    @Override
    public String toString(){
        return "Precio: $" + this.precio + "\n      Marca : "+ this.marca + ", Modelo : " + this.modelo;
    }
}
