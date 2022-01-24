
//Polimorfismo || Multiples comportamientos dependiendo a donde este apuntando la referencia de memoria
    //Polimorfismo es la habilidad de ejecutar métodos sintácticamente iguales en tipos distintos

package test;

import domain.*;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("Empleado: " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        //System.out.println("\nGerente:  " + gerente.obtenerDetalles());
        imprimir(empleado);
    }
    
    //Polimorfismo || Se ejecuta en referencia a que valor entre al metodo
    public static void imprimir(Empleado empleado){ //Referencia/clase mas generica (mas ruca)
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
