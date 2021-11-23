package Productos;

import javax.swing.*;

public class Impresora extends Dispositivo{
    //Atributos
    private String tipo;
    private String comunicacion;
    private int resolucion;

    //Construtores
    public Impresora(){
        super();
        this.tipo = "No Especificado";
        this.comunicacion = "No especificado";
        this.resolucion = 1200;
    }
    public Impresora(String marca, String modelo, float precio, String nombre,String color,String tipo, String comunicacion, int resolucion){
        super(marca,modelo,precio,nombre,color,null);
        this.tipo = tipo;
        this.comunicacion = comunicacion;
        this.resolucion = resolucion;

    }

    //Metodos
    @Override
    public String toString(){
        return "Impresora || " +super.toString() + ", Tipo:  "+ this.tipo + ", Comunicacion: "+this.comunicacion + ", Resolucion: " + this.resolucion;
    }
}
