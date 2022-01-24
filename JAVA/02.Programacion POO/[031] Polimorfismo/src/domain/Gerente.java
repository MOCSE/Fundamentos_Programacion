
package domain;

public class Gerente extends Empleado{
    
    private String departamento;
    
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescritura del Metodo padre
    
    @Override //Notacion para indicar al compilador que esta siendo sobreescrito un metodo de la clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " Departamento: " + this.departamento;
    }
}
