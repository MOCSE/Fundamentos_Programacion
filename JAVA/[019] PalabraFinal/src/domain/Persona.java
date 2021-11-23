
package domain;

//final (clases) || no se puede heredar a otras clases
public final class Persona {
    
    public final static int MI_CONSTANTE = 10;  //Constantes || van en mayusculas
    
    private String nombre;
    
    
    //final (metodos) || No se puede sobrescribir el metodo en un metodo de una clase hija ( en caso de que si se pueda heredar)
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
