package Productos;

import javax.swing.*;

public class Computadora extends  Producto{
    private String procesador;
    private float memoria;
    private float ram;

    public Computadora() {
        super();
        this.procesador = "NA";
        this.memoria = 0;
        this.ram = 0;
    }
    public Computadora(String marca, String modelo, float precio,String procesador, float memoria, float ram) {
        super(marca,modelo,precio);
        this.procesador = procesador;
        this.memoria = memoria;
        this.ram = ram;
    }

    //Metodos
    @Override
    public String toString(){
        return "Computadora || " + super.toString() + ", Procesador: "+ this.procesador+ ", Memoria: "+this.memoria+"GB"+ ", RAM: "+this.ram +"GB";
    }



}
