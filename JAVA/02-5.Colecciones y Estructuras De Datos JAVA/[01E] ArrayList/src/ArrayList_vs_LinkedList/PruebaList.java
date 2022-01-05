package ArrayList_vs_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class PruebaList {
    
    public static void main(String[] args) {
         List<Persona> listaarray = new ArrayList<>();             
         List<Persona> listalinked = new LinkedList<>();            
         long antes;  
         
         /*
            Tiempo invertido en insertar una persona en ArrayList (en nanosegundos):
            672648 || 507100
            Tiempo invertido en insertar una persona en LinkedList (en nanosegundos):
            11693  || 8900
         
            Al principio ArrayList      453500
            Al principio LinkedList     8700
         
            Al final ArrayList          6800   
            Al final LinkedList         4800
             
         */
         
         for(int i=0;i<1000000;i++)             
         {                 
             listaarray.add(new Persona(i,"Persona"+i,i));
             listalinked.add(new Persona(i,"Persona"+i,i));
         }   
         
         //Desplazar elementos en el indice a la derecha (busca y va directo al indice)
         System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");             
         antes = System.nanoTime();
         listaarray.add(999999, new Persona(10001,"Persona",1001)); // Inserción en posicion 0 de una persona  
         System.out.println(System.nanoTime()- antes);  
         
         //Redireccion de punteros con las listas enlazadas (va elemento por elemento, buscando el indice)
         System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");             
         antes = System.nanoTime();              
         listalinked.add(999999, new Persona(10001,"Persona",1001));  // Inserción en posicion 0 de una persona            
         System.out.println(System.nanoTime()- antes);
    }
    
    static class Persona {
        int idPersona;
        String nombre;
        int altura;
        
        public Persona(int idPersona, String nombre, int altura){
            this.idPersona = idPersona;
            this.nombre = nombre;
            this.altura = altura;
        }
    }
    
}
