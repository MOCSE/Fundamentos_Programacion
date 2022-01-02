
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona_Padre;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        
        //Herencia de Persona -> Empleado
        Empleado empleado1 = new Empleado("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        //Herencia de Persona -> Cliente
        Cliente client1 = new  Cliente (new Date(), true, "Karla", 'F', 28, "Saturno 15"); //new Date() || Imprime la fecha actual
        System.out.println("client1 = " + client1);
    }
}
