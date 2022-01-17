package Listas05_ListaDeObjetos;

import java.util.Scanner;

public class Enero {

    Integer numeroDiaMes;
    String diaSemana;
    Double temperaturaMedia;

    public Enero() {
        rellenarDia();
        rellenarDiaSemana();
        rellenarTemperaturaMedia();
    }

    public void rellenarDia() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Semana: ");
        numeroDiaMes = teclado.nextInt();
    }

    public void rellenarDiaSemana() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dia de la semana: ");
        diaSemana = teclado.nextLine();
    }

    public void rellenarTemperaturaMedia() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Temperatura Media: ");
        temperaturaMedia = teclado.nextDouble();
    }

    public Integer getNumeroDiaMes() {
        return numeroDiaMes;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Enero{" + "Semana=" + numeroDiaMes + ", diaSemana=" + diaSemana + ", temperaturaMedia=" + temperaturaMedia + '}';
    }
}
