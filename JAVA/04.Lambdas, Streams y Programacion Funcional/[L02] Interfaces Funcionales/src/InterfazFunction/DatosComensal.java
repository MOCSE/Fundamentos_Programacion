package InterfazFunction;

import java.util.function.Function;


public class DatosComensal {
    public static void main(String[] args) {
        
        Comensal com1 = new Comensal("Javier", 256.78, 5);
        
        String nombreComensal = (String) getDatoComensal(com1, x -> x.getNombre());
        System.out.println("El nombre del Comensal es: " + nombreComensal);
        
        int mesa = (int) getDatoComensal(com1, x -> x.getMesa());
        System.out.println("Mesa: " + mesa);
        
    }
    
    public static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> funcion){
        //apply | Aplica esta función al argumento dado.
        return funcion.apply(comensal);
    }
    
}
