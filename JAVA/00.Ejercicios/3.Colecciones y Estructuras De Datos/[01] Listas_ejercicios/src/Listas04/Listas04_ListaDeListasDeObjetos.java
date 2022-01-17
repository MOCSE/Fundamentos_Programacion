
package Listas04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Listas04_ListaDeListasDeObjetos {
    
//    Realiza un programa en el almacenes una lista de objetos de la clase VENTA cuyos atributos son 2:
//    Nombre de Mes.
//    Ventas de coches del mes.
//    Se mostrará un menú en el que se le ofrezcan al usuario las siguientes opciones:
//        1.- Introducir las ventas de coches de cada uno de los meses del año .
//        2.- Mostrar las ventas introducidas.
//        3.- Que muestre la suma total de ventas de coches del año.
//        4.- Que muestre las ventas totales de los meses que empiezan por la letra A. (Utiliza el método correspondiente de la clase String)
//        5.- Que muestre el nombre del mes con más ventas.
//        6.- Salir del programa.
//    Controlaremos que el usuario elija una opción del menú entre 1 y 6.
//    Hasta que el usuario no pulse 6 no saldremos del programa.
    
    public static void main(String[] args) {
        List<List<Venta>> listaVentas = new ArrayList<>();
        menu(listaVentas);
    }
    
    public static void menu(List<List<Venta>> listaVentas){
        int eleccion = 0;
        do {
            System.out.println("\n1.- Introducir las ventas de coches de cada uno de los meses del año");
            System.out.println("2.- Mostrar las ventas introducidas");
            System.out.println("3.- Mostrar la suma total de ventas de coches del año.");
            System.out.println("4.- Mostrar las ventas totales de los meses que empiezan por la letra A");
            System.out.println("5.- Que muestre el nombre del mes con más ventas");
            System.out.println("6.- Salir del programa.\n");
            
            Scanner scan = new Scanner(System.in);
            eleccion = scan.nextInt();
            
            switch(eleccion){
                case 1 : introducirVentas(listaVentas); break;
                case 2 : mostrarVentas(listaVentas); break;
                case 3 : mostrarSumaTotal(listaVentas); break;
                case 4 : mostrarMesesA(listaVentas); break;
                case 6 : System.exit(0); break;
                default: System.out.println("Introduzca un valor correcto");
            }
        } while (eleccion != 6);  
    }
    
    public static void introducirVentas(List<List<Venta>> listaVentas){
        String exit = "";
        int year = 0;
        List<Venta> listaYear = new ArrayList<>();
        
        System.out.println("Año: " + year + " | 'exit' para salir");
        do {
            listaYear.add(new Venta());
            
            if(listaYear.size() == 3){
                System.out.println("Año: " + (year) + " | 'exit' para salir");
                year++;
                Scanner scan = new Scanner(System.in);
                exit = scan.next();
                listaVentas.add(listaYear);
                listaYear = new ArrayList<>();
            }
        } while (!exit.equals("exit"));
        
    }
    
    public static void mostrarVentas(List<List<Venta>> listaVentas){
        ListIterator<List<Venta>> iterador = listaVentas.listIterator();
        
        while (iterador.hasNext()) {
            System.out.println("Año: " + iterador.nextIndex() + " | " + iterador.next());
        }
    }
    
    public static void mostrarSumaTotal(List<List<Venta>> listaVentas){
        int ventasTotales = 0;
        
        for (int i = 0; i < listaVentas.size(); i++) {
            for (int j = 0; j < listaVentas.get(i).size(); j++) {
                ventasTotales += listaVentas.get(i).get(j).getNumVentas();
            }
            System.out.println("Numero de ventas del año "+i+": " +ventasTotales);
            ventasTotales = 0;
        }
    }
    
    public static void mostrarMesesA(List<List<Venta>> listaVentas){
        for (int i = 0; i < listaVentas.size(); i++) {
            for (int j = 0; j < listaVentas.get(i).size(); j++) {
                String mes = listaVentas.get(i).get(j).getNombreMes();
                if (mes.startsWith("A")) {
                    System.out.println("Ventas Mes " +  mes +  " del año " + i + ": " +listaVentas.get(i).get(j).getNumVentas());
                }
            }
        }
    }
    
    public static void masVentas(List<List<Venta>> listaVentas){
        int max = 0;
        for (int i = 0; i < listaVentas.size(); i++) {
            for (int j = 0; j < listaVentas.get(i).size(); j++) {
                if(max < listaVentas.get(i).get(i).getNumVentas())
                    max = listaVentas.get(i).get(i).getNumVentas();
            }
            System.out.println("La venta mayor del año " + i + ": " + max);
            max = 0;
        }
    }
}
