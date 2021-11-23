package Productos;

public class Mouse extends Dispositivo{
    //Atributos
    private int dpi;
    private String sensor;

    //Constructores
    public Mouse(){
        super();
        this.dpi = 16000;
        this.sensor = "Logitech";
    }
    public  Mouse(String marca, String modelo, float precio, String nombre,String color,int dpi,String sensor){
        super(marca,modelo,precio,nombre,color,null);
        this.dpi = dpi;
        this.sensor = sensor;
    }

    //Metodos
    @Override
    public String toString(){
        return "Mouse || " + super.toString() + ", DPI: "+ this.dpi + ", Sensor: "+this.sensor;
    }

}
