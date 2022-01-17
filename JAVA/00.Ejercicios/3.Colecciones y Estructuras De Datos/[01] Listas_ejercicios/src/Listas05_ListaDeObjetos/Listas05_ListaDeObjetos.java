package Listas05_ListaDeObjetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Listas05_ListaDeObjetos {

//      Diseña un programa que almacene en una lista de objetos de la clase 
//      ENERO las temperaturas medias del mes de Enero (31 días) que introduzca 
//      un usuario. Cada objeto tendrá los siguientes atributos:
//        1. Numero correspondiente al día del mes
//        2. Día de la semana
//        3. Temperatura media
    
//        Mostrar un menú que nos permita:
//        1. Rellenar las temperaturas.
//        2. Mostrar las temperaturas.
//        3. Visualizar la temperatura media del mes.
//        4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos fueron:
//        1. El Jueves de la Semana 3 con 40 grados.
//        2. El Sábado de la Semana 4 con 40 grados.
    public static void main(String[] args) {
        List<Enero> listaEnero = new ArrayList<>();
        menu(listaEnero);
    }
    
    
    public static void menu(List<Enero> listaEnero){
        int num;
        do {
            System.out.println("1. Rellenar las temperaturas.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Día o días más calurosos del mes.");
            System.out.println("5. Salir");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            
            switch(num){
                case 1: rellenarTemperaturas(listaEnero); break;
                case 2 : visualizarTemperaturas(listaEnero); break;
                case 3 : visualizarTemperaturaMedia(listaEnero); break;
                case 4 : visualizarDiasCalurosos(listaEnero); break;
                case 5 : System.exit(0); break;
                default: System.out.println("Error: INTRODUCIR UN VALOR VALIDO");
            }
        } while (num != 5);
        
    }
    
    public static void rellenarTemperaturas(List<Enero> listaEnero){
        listaEnero.add(new Enero());
    }
    
    public static void visualizarTemperaturas(List<Enero> listaEnero){
        ListIterator<Enero> iterador =  listaEnero.listIterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.nextIndex() + "|" + iterador.next().toString());
        }    
    }
    
    public static void visualizarTemperaturaMedia(List<Enero> listaEnero){
        double temMedia = 0;
        for (int i = 0; i < listaEnero.size(); i++) {
            temMedia += listaEnero.get(i).getTemperaturaMedia();
        }
        temMedia = temMedia / listaEnero.size();
        System.out.println("Temperatura media del mes: " + temMedia + " °C");
    }
    
    public static void visualizarDiasCalurosos(List<Enero> listaEnero){
        double maxCalor = 0;
        System.out.println("El día o días más calurosos fueron:");
        for (int i = 0; i < listaEnero.size(); i++) {
            if(maxCalor < listaEnero.get(i).getTemperaturaMedia()){
                maxCalor = listaEnero.get(i).getTemperaturaMedia();
            }
        }
        
        for (int i = 0; i < listaEnero.size(); i++) {
            if(maxCalor == listaEnero.get(i).getTemperaturaMedia()){
                System.out.println("El dia " + listaEnero.get(i).getDiaSemana()
                + " De la Semana " + listaEnero.get(i).getNumeroDiaMes() + " con " 
                + listaEnero.get(i).getTemperaturaMedia() + " °C");
            }
        }
    }
}
