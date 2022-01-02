
/* 
   #Clase: es una plantilla de la cual se puede crear objetos
   #Paquete: Folder donde se clasifican las clases    

        Clase Persona
        -Atributos: Nombre, Edad, Peso
        -Metodos: ModificarEdad, ModificarNombre, IngresarPeso
    
    #Objeto: Es una instancia de una clase
*/

package pkg008.clasesyobjetos;


public class Prueba {

    public static void main(String[] args) {
        
        //Creacion de Objetos (Se asgina asdsasen memoria) || Clase <variable> = new Constructor();
        Persona persona1 = new Persona();
        
        //Modificacion de atributos
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //Accede al metodo de los atributos
        persona1.desplegarInformacion();
        
        //Referencia de Memoria del Objeto [Memoria RAM]
        Persona persona2 = new Persona();
        System.out.println("persona1 (memoria) = " + persona1);
        System.out.println("persona2 (memoria) = " + persona2);
        
        //Acede al metodo sin atributos || Se asigna por defecto el valor: null
        persona2.desplegarInformacion();
        
    }
    
}
