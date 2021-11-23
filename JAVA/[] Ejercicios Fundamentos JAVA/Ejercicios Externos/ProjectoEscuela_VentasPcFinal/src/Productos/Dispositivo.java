package Productos;

public class Dispositivo  extends  Producto{
    //Atributos
    private String nombre;
    private String color;
    private String tipo;

    //Constructor
    public Dispositivo(){
        super();
        this.nombre = "NA";
        this.color = "NC";
    }
    public Dispositivo(String marca, String modelo, float precio, String nombre,String color,String tipo){
        super(marca,modelo,precio);
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }

    //Metodos
    @Override
    public String toString(){
        if(this.tipo == null)
            return super.toString() + ", Nombre: "+ this.nombre+ ", Color: "+this.color;
        else
            return tipo +" || "+ super.toString() + ", Nombre: "+ this.nombre+ ", Color: "+this.color;
    }
}
