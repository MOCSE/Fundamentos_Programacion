
/* static
Podemos utilizar la palabra static para interactuar con el contexto estático. Por ejemplo, si
definimos un atributo o un método como estático, lo que estamos indicando es que el atributo o
método pertenecen a la clase y no al objeto.

Por ejemplo, si creamos un atributo sin usar la palabra static, que es como normalmente los
definimos, cada que creamos un objeto se creará también una variable asociada al objeto que se
crea, pero si definimos el atributo como estático, estamos indicando que el atributo solo se crea
una vez, sin importar cuantos objetos se creen, sólo habrá una variable la cual se asocia a la clase
y no al objeto. Y si un objeto accede al valor de la variable estática leerá el mismo valor que los
demás objetos, y si un objeto modifica el valor estático, todos los demás objetos accederán al
mismo valor ya que este valor está almacenado en la clase y no en los objetos de dicha clase

Por lo tanto, los atributos o métodos marcados con la palabra static se les conoce como
miembros de clase o métodos de clase, ya que pertenecen a la clase y no a los objetos que se
crean de dicha clase.
*/
package domain;


public class Persona {


    //Atributos
    private int idPersona;
    private String nombre;
    
    //Atributo Estatico
    private static int contadorPersonas;

        
    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo || Se usa el nombre de la clase para identificar que se esta usando un Estatico
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
