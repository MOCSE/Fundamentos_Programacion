
package domain_sobrecargaconstructores;

//extends || Indica la clase padre para el uso de herencia simple
public class Empleado_sobrecargaconstructores extends PersonaPadre_sobrecargaconstructores{
    
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Construstor
    public Empleado_sobrecargaconstructores(String nombre, double sueldo) {
        super(nombre); //super || indica la cantidad de argumentos que se quieren utilizar de la clase padre
        this.idEmpleado = ++Empleado_sobrecargaconstructores.contadorEmpleado;
        this.sueldo = sueldo;
    }

    //Metodos
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo).append("}");
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
  
}
