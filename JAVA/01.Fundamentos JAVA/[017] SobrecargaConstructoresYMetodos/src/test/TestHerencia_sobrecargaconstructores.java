
package test;

import domain_sobrecargaconstructores.Cliente;
import domain_sobrecargaconstructores.Empleado_sobrecargaconstructores;
import domain_sobrecargaconstructores.PersonaPadre_sobrecargaconstructores;
import java.util.Date;

public class TestHerencia_sobrecargaconstructores {
    public static void main(String[] args) {

        //Herencia de Persona -> Empleado (Con sobrecarga)
        Empleado_sobrecargaconstructores empleado1 = new Empleado_sobrecargaconstructores("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);
        
     
        //SobreCarga Constructores
        PersonaPadre_sobrecargaconstructores persona1 = new PersonaPadre_sobrecargaconstructores();
        PersonaPadre_sobrecargaconstructores persona2 = new PersonaPadre_sobrecargaconstructores("nombre");
        PersonaPadre_sobrecargaconstructores persona3 = new PersonaPadre_sobrecargaconstructores("nombre", 'G', 0, "direccion");
    }
}
