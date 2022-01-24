
package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Product> products;
    
    public Inventory(){
        products = new LinkedList<>();
    }
    
    //Ingresar nuevo producto
    public void newProduct(int ID, String name, int existence, double price){
        Product newProduct = new Product(ID, name, existence, price);
        
        boolean success = products.add(newProduct);
        
        if(success){
            System.out.println("El producto" + name + "se añadió correctamente al inventario\n");
        } else{
            System.out.println("Ocurrió un problema al agregar el producto" + name + "al inventario\n");
        }
    }
    
    //Añadir nuevo producto
    public void addProduct(int ID){
        int productoIndex = products.indexOf(new Product(ID));
        
        Product product = products.get(productoIndex);
        int existenceTemp = product.getExistencia();
        int newExistence = existenceTemp += 1;
        product.setExistencia(newExistence);
        System.out.println("\n Se ha agregado un producto" + product.getName()+ "exitosamente\n");
    }
    
    //Actualizar Precio del producto
    public void updateProductPrice(int ID, double price){
        int productoIndex = products.indexOf(new Product(ID));
        
        Product product = products.get(productoIndex);
        product.setPrice(price);
        System.out.println("Se ha actualizado el precio correctamente\n");
    }
    
    //Eliminar producto
    public void deleteProduct(int ID){
        int productoIndex = products.indexOf(new Product(ID));
        Product deleteproduct = products.remove(productoIndex);
        
        if(deleteproduct != null){
            System.out.println("Se elimino correctamente\n");
        } else
            System.out.println("Ocurrio un error al eliminar\n");
    }
    
    //Imprimir inventario (todos los prodcutos)
    public void printProducts(){
        System.out.println("Impresion de productos en el almacen\n");
        products.forEach(System.out::println);
        System.out.println("\n\n");
  
    }
}
