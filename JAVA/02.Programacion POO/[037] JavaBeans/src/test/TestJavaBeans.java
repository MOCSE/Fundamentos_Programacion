/*Un JavaBean es una clase pura de Java, la cual sigue ciertas reglas mínimas para poder llamarse JavaBean.

La idea es que estas clases puedan ser utilizadas por otras clases sin necesidad de conocer a detalle el contenido de la clase. Por
ello es que debe cumplir con ciertas reglas, ya que los frameworks o tecnologías u otras clases utilizarán nuestros JavaBeans, y por
lo tanto ya deben cumplir con ciertas características para ser utilizadas.

    -Debe tener un constructor vacío
    -Los atributos deben ser privados
    -Cada propiedad debe tener su método get/set
    -Implementará la interface Serializable del paquete java.io.
*/

package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        
        //Asi utilizan las tecnologias/frameworks en Java
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona Nombre: " + persona.getNombre());
        System.out.println("Persona Apellido: " + persona.getApellido());
    }
}
