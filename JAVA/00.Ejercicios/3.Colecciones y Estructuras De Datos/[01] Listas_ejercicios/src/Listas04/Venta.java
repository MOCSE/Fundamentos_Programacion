package Listas04;

import java.util.Scanner;

public class Venta {

    private String nombreMes;
    private int numeroVentas;

    public Venta() {
        setNombreMes();
        setNumVentas();
        System.out.println("Se ha añadido con exito### " + toString());
    }

    public void setNombreMes() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Mes: ");
        nombreMes = teclado.nextLine();
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public Integer getNumVentas() {
        return numeroVentas;
    }

    public void setNumVentas() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de ventas producidas en " + nombreMes + ": ");
        numeroVentas = teclado.nextInt();
    }

    @Override
    public String toString() {
        return "Mes: " +nombreMes+ " || " + "Produccion: " +numeroVentas;
    }
    
    
}
