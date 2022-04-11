package InterfaceBiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;


public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listEmp, BiPredicate<Integer, String> eval){
        List<Empleado> listaNueva = new ArrayList<>();
        for (Empleado empleado : listEmp) {
            if (eval.test(empleado.getEdad(), empleado.getDepartamento())) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}
