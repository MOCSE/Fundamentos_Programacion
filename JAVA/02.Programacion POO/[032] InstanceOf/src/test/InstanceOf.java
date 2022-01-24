
//InstanceOf || Determinar el tipo de referencia en tiempo de ejecucion que apunta una variable
//              Convertir un tipo de dato

package test;

import domain.*;

public class InstanceOf {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 5000); //Tipo Empleado
        System.out.print("empleado -> Empleado || ");
        determinarTipo(empleado);
        
        
        empleado = new Gerente("Karla", 10000, "Contabilidad"); //Tipo Gerente
        System.out.print("empleado -> Gerente  || ");
        determinarTipo(empleado);
        
        //Se determina del mas generico al mas especifico
        System.out.println();
        determinarTipoEspecifico(empleado);
    }
    
    //InstanceOf - Se usa normalmente para preguntar
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){                //empleado esta apuntando a Gerente?
            System.out.println("Es de tipo Gerente");
            
            //Conversion de objectos
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if (empleado instanceof Empleado)          //empleado esta apuntando a Empleado?
            System.out.println("Es de tipo Empleado");
        else if (empleado instanceof Object)            //empleado esta apuntando a Object?
            System.out.println("Es de tipo Object");
    }
    
    public static void determinarTipoEspecifico(Empleado empleado){
        if(empleado instanceof Gerente)                 //empleado esta apuntando a Gerente?
            System.out.println("Es de tipo Gerente");
        if (empleado instanceof Empleado)          //empleado esta apuntando a Empleado?
            System.out.println("Es de tipo Empleado");
        if (empleado instanceof Object)            //empleado esta apuntando a Object?
            System.out.println("Es de tipo Object");
    }
        
}
    
