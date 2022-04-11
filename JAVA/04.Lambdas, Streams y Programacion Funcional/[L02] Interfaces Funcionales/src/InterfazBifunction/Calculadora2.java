package InterfazBifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {
    
    public List<Double> calcular(BiFunction<Double,Double,Double> biF, List<Empleado> listaEmp, Double incremento){
        List<Double> listasSalarios = new ArrayList<>();
        for (Empleado empleado : listaEmp) {
            listasSalarios.add(biF.apply(empleado.getSalario(), incremento));
        }
        return listasSalarios;
    }
}
