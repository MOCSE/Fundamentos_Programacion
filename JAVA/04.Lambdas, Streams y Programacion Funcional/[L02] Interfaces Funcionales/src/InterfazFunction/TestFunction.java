package InterfazFunction;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        // Permite recibir un argumento de un tipo y devolver otro argumento de otro tipo.
        Function<Integer,String> convertidor = (x) -> Integer.toString(x);
        
        //apply | Aplica esta función al argumento dado.
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(3999).length());
    
    }

}
