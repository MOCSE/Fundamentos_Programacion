package domain_sobrecargaconstructores;

//Toca clase extiende por defecto de la calse Object
public class PersonaPadre_sobrecargaconstructores extends Object{
    
    //Atributos || protected nos sirve para ser accedidos por clases hijas de las herencias
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //SobreCarga de Constructores
    public PersonaPadre_sobrecargaconstructores(){
        
    }
    
    public PersonaPadre_sobrecargaconstructores(String nombre) {
        this.nombre = nombre;
    }

    public PersonaPadre_sobrecargaconstructores(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
   
}
