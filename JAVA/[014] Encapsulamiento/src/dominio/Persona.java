/* Encapsulamiento:

Esta característica nos permite aislar los datos de nuestros objetos del
acceso de otros objetos externos, y de esta manera restringir el acceso
directo a los atributos o métodos que no deseemos permitir, ya que el
estado de un objeto está generalmente oculto.
*/

package dominio;

public class Persona {
    
    //Atributos privados
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //get & set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //en vez de usar get en los tipos boolean se usa is
    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    //Metodo toString
    public String toString(){
        return "Persona [ nombre: " + nombre +
               ", Sueldo:  " + sueldo +
               ", Eliminado: " + eliminado + " ]";
    }
    
    
}
