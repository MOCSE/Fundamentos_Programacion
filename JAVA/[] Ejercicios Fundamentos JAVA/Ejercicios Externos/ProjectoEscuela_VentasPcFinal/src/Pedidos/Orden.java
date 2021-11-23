package Pedidos;
import  Pedidos.*;
import Productos.Computadora;
import Productos.Producto;

import java.util.ArrayList;

public class Orden {
    //Atributos
    private final int idOrden;
    private static int contadorOrdenes = 0;
    private static boolean verEliminar = false;
    private ArrayList<Producto> Productos;
    private double precioTotal = 0;
    private int index;


    //Metodos
    public Orden(){
        this.precioTotal  =0;
        this.Productos = new ArrayList<Producto>();
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarProducto(Producto producto){
        this.Productos.add(producto);
        verEliminar = false;
    }

    public void eliminarProducto(int numero){
        this.Productos.remove(numero);
        System.out.println("\nSe ha eliminado el producto " + numero);
        verEliminar = true;
    }

    public void mostrarOrden(){
        if(verEliminar == false)
            System.out.println("\n-----------------\nOrden ID: MC-"+ this.idOrden+"\n-----------------");
        if(verEliminar == true)
            System.out.println("\n-----------------\nOrden ID: MC-"+ this.idOrden+" [Actualizada]\n-----------------");
        
        this.index = 0;
        this.precioTotal  =0;
        for (Producto aux: Productos ) {
            index++;
            System.out.println(this.index + ".- "+ aux);
            this.precioTotal +=aux.getPrecio();
        }
        System.out.println("Numero total de articulos ordenados: "+ this.Productos.size());
        System.out.println("Monto total del pedido: $"+ this.precioTotal);
    }
}
