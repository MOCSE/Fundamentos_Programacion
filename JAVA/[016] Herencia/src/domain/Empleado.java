
package domain;

//extends || Indica la clase padre para el uso de herencia simple
public class Empleado extends Persona_Padre{
    
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Sobrecarga de constructores

    public Empleado() {
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    //Solo se puede llamar a la vez a otro constructor o los atributos (super) de alguna clase padre
    public Empleado(String nombre, double sueldo) {
        this(); //this() || Se llama a otro constructor en este caso el vacio
        this.nombre = nombre; //No se puede llamar el constructor padre asi que se llama los atributos directamente
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
