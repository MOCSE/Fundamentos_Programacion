
package domain;

//Para JavaBeans Implementar la interaz Serializable || Serializacion: Convertir objetos a 0 y 1 (bits) para poder ser enviados por la red en servidores
import java.io.Serializable;

public class Persona implements Serializable{
    
    //Para JavaBeans debe contencer atributos privados
    private String nombre;
    private String apellido;
    
    //Para JavaBeans es obligatorio tener un constructor vacio y publico
    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters & Setters || Para JavaBeans se usa el encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    //Opcional Metodos Object
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
     
}
