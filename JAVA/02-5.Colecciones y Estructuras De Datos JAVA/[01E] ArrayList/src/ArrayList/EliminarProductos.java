
/*
 * Una tienda de ropa ha dejado de vender una serie de productos de cierta marca que tiene bien
 * identificados en una lista, sin embargo, en su base de datos siguen apareciendo
 * en las búsquedas porque no han sido eliminadas. No queremos tener que borrar una por
 * una, así que se necesita crear un programa que en base a una lista de marcas, revise
 * si esas prendas se encuentran en la base de datos y, si es el caso, que se eliminen.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Clase Productos a Eliminar
public class EliminarProductos {
    
    private static List<Producto> productos;
    
    public static Producto[] obtenerProductos(){
        Producto[] productos = {
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("H&M", "Verde", "Pay", "32L"),
          new Producto("Zara", "Gris", "Coco", "32L"),
          new Producto("Lacoste", "Verde", "Crown", "32L"),
          new Producto("Farm", "Azul", "Holos", "32L"),
          new Producto("Ho!", "Gris", "Pay", "32L"),
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("Lacoste", "Gris", "Pay", "32L")
        };
        
        return productos;
    }
    
//Clase Main
    public static void main(String[] args) {
        //Marcas no deseadas
        String [] marcas = {"H&M", "Lacoste"};
        
        //Implementando Lista de Arreglos de los productos de la BD
        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
        productos.forEach(System.out::println);
        
        //Eliminar Marcas con Metodo estatico del Iterador
        eliminarMarcasIterator(productos, Arrays.asList(marcas));
        
        //Imprimir productos con marcas eliminadas
        System.out.println("\n\nProductos sin marcas no deseadas");
        productos.forEach(System.out::println);
        
    }

//Metodos Estaticos
    private static void eliminarMarcasIterator(List<Producto> productos, List <String> marcas){
        for(ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ){
            if(marcas.contains(iterador.next().getMarca())){
                iterador.remove();
            }
        }  
    }
    
    //Paradigma funcional
    private static void eliminarMarcasStream(List<Producto> productos, List <String> marcas){
        productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }
    
//Clase Estatica
    static class Producto {
      private String marca;
      private String color;
      private String modelo;
      private String talla;
      
      
      public Producto(String marca, String color, String modelo, String talla){
          this.marca = marca;
          this.color = color;
          this.modelo = modelo;
          this.talla = talla;
      }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        @Override
        public String toString() {
            return "Producto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", talla=" + talla + '}';
        }
      
    }
    
}
