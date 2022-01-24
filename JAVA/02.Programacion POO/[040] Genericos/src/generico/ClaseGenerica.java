
package generico;
 
// <T> Indicar clase generica
public class ClaseGenerica<T> {
    
    //T || No se sabe que tipo es
    private T objecto;

    //Constructor generico
    public ClaseGenerica(T objecto) {
        this.objecto = objecto;
    }
    
    //Metodo generico
        //Obtener el tipo || getClass().getSimpleName()
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objecto.getClass().getSimpleName());
    }
    
}
