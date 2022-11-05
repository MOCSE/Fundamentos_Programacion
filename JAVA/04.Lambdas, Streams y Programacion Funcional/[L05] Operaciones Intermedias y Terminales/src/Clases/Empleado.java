package Clases;

import java.util.Arrays;
import java.util.List;

public class Empleado implements Comparable{
    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero; //ENUMERADOR
    private int edad;
    
    public static enum Genero{
        HOMBRE, MUJER
    }

    public Empleado(long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean esHombre(){
        return this.genero == Genero.HOMBRE;
    }
    
    public boolean esMujer(){
        return this.genero == Genero.MUJER;
    }
    
    public static List<Empleado> empleados(){
        Empleado emp1 = new Empleado(1, "Juan Perez", 538.00, Empleado.Genero.HOMBRE, 26);
        Empleado emp2 = new Empleado(2, "Alicia Ramirez", 600.00, Empleado.Genero.MUJER, 38);
        Empleado emp3 = new Empleado(3, "Juan Puga", 900.00, Empleado.Genero.HOMBRE, 36);
        Empleado emp4 = new Empleado(4, "Javier Velazquez", 330.00, Empleado.Genero.HOMBRE, 36);
        Empleado emp5 = new Empleado(5, "Esmeralda Lopez", 450.00, Empleado.Genero.MUJER, 38);
        Empleado emp6 = new Empleado(6, "Alvaro Mejia", 450.00, Empleado.Genero.HOMBRE, 22);
        Empleado emp7 = new Empleado(7, "Olivia Suarez", 600.00, Empleado.Genero.MUJER, 35);
        Empleado emp8 = new Empleado(8, "Oscar Perez", 450.00, Empleado.Genero.HOMBRE, 42);
        Empleado emp9 = new Empleado(9, "Lionel Messi", 652.00, Empleado.Genero.HOMBRE, 45);
        Empleado emp10 = new Empleado(10, "Ricardo Kaka", 584.00, Empleado.Genero.HOMBRE, 26);
        
        return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
    }

    @Override
    public String toString() {
        return "-> {" + "id=" + id + ", nombre=" + nombre + ", ingresos=" + ingresos + ", genero=" + genero + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public int compareTo(Object o){
        return this.getNombre().compareTo(((Empleado)o).getNombre());
    }
    
    
    
}
