
//Casting || Conversion de objetos

//Downcasting || Conversion de objetos de padre a hijo
//Upcasting   || Conversion de objetos de hijo a padre

package test;

import domain.*;

public class ConversionObjetos {

    public static void main(String[] args) {
        
        Empleado empleado =  new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
        
        //Conversion Objetos || Para acceder a atributos y metodos que no estan en comun entre clases padres e hijias
        
            //Downcasting 
            ((Escritor)empleado).getTipoEscritura(); 
            
            Escritor escritor = (Escritor) empleado;
            escritor.getTipoEscritura();
            
            //Upcasting
            Empleado empleado2 = (Empleado) escritor; //No es necesario hacer la conversion ya que se hace automaticamente
            empleado2.obtenerDetalles();
            
    }
    
    
        
}
    
