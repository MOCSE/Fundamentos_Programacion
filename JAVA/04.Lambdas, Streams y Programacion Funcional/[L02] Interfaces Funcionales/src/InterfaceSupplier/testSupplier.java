package InterfaceSupplier;

import java.util.function.Supplier;

public class testSupplier {

    public static void main(String[] args) {
        //Proveedor de recursos (Para crear objetos en el uso de streams)
        Supplier<String> i = () -> "Hola Mundo";
        System.out.println(i.get());
    }
    
}
