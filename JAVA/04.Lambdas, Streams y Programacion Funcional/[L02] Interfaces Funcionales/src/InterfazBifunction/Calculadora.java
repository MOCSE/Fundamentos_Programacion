
package InterfazBifunction;

import java.util.function.BiFunction;

public class Calculadora {

    public String calcular(BiFunction<Integer,Integer,String> biFuncion, Integer i1, Integer i2){
        return biFuncion.apply(i2, i1);
    }
}
