package tareaEj_SalaDeEmergencia;

import ColasDePrioridad.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class SalaEmergenciasApp {
    
    public static Doctor[] obtenerProductos(){
        Doctor[] doctores = {
          new Doctor("Elisa", "IPN", "Disponible"),
          new Doctor("Karla", "UNAM", "Disponible"),
          new Doctor("Oscar", "IPN", "Disponible")
        };
        return doctores;
    }
    
    
    public static void main(String[] args) {
        //Se debe implementar la interface "comparable" o nos da error
        Queue<Patient> attentionPriority = new PriorityQueue();
        
        List<Doctor> doctores = new ArrayList<>(Arrays.asList(obtenerProductos()));
        doctores.forEach(System.out::println);
        
        Scanner teclado = new Scanner(System.in);
        int number = 1;

        do {
            System.out.println("\n1.- Ingresar Paciente");
            System.out.println("2.- Iniciar Despliegue De la Cola De Prioridad");
            number = teclado.nextInt();
            
            switch(number){
                case 1: 
                    attentionPriority.add(ingresarPaciente()); 
                    vizualizarPacientes(attentionPriority);
                    attentionPriority = asignarDoctores(doctores,attentionPriority);
                    break; 
                case 2: 
                    System.out.println("NO");
                    break;
            }
            
        } while (number == 1);
    }
    
    public static Patient ingresarPaciente(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar Nombre del paciente: ");
        String nombre = teclado.next();
        System.out.print("Ingresar Presion del paciente: ");
        int presion = teclado.nextInt();
        System.out.print("Ingresar Temperatura del paciente: ");
        double temperatura = teclado.nextDouble();
        System.out.print("Ingresar la Gravedad del paciente: ");
            System.out.print("\n  1.- Gravedad Menor\n  2.- Gravedad Moderada\n"
                    + "  3.- Gravedad Severa\n  4.- Gravedad Muy Severa\n");
        int gravedadAUX = teclado.nextInt();
        
        Gravity gravedad = Gravity.MINOR;
        switch(gravedadAUX){
            case 1 : gravedad = Gravity.MINOR; break;
            case 2 : gravedad = Gravity.MODERATE; break;
            case 3 : gravedad = Gravity.SEVERE; break;
            case 4 : gravedad = Gravity.VERY_SEVERE; break;
            default: System.out.println("ERROR AL INGRESAR GRAVEDAD\n");
        }
        return new Patient(nombre,presion,temperatura,gravedad);
    }
    
    public static void vizualizarPacientes(Queue<Patient> attentionPriority){
                
        System.out.println("\n##Cola Actual: ##\n");
        
        //Iterar con Iterator
        Iterator<Patient> paciente = attentionPriority.iterator();
        while(paciente.hasNext()){
            System.out.println(paciente.next().toString());
        }
        
        System.out.println("");
    }
    
    public static Queue<Patient> asignarDoctores(List <Doctor> doctores,Queue<Patient> attentionPriority){
        
        //Filtrar doctores disponibles
        List<Doctor> doctoresDisponibles = new ArrayList<>();
        int i = 0;
        while( i < doctores.size() ){
            if(doctores.get(i).getEstado().compareToIgnoreCase("Disponible") == 0){
                doctoresDisponibles.add(doctores.get(i));  
            }
            i++;
        }
        //Numero Random
        Random random = new Random();
        int min = 0;
	int max = 10;
	
	int value = random.nextInt(max + min) + min;
        
        int index = 0;      
        if(!doctoresDisponibles.isEmpty() == true){
            boolean encontrado = false;
                
            while(encontrado == false) {
                if(doctores.get(index).getEstado().compareToIgnoreCase("Disponible") == 0){
                    doctores.get(index).setEstado("Ocupado");
                    Patient paciente = attentionPriority.poll();
                    System.out.println("Se esta atendiendo a: \n" + doctores.get(index) + " -> " + paciente.getNombre());
                    encontrado = true;
                    index = 0;
                }
                else 
                    index++;
            }
        }
        else{
              System.out.println("Todos los doctores ocupados:)");
              if (value < 4){
                    min = 0;
                    max = 2;
                    value = random.nextInt(max + min) + min;
                    doctores.get(value).setEstado("Disponible");
                    System.out.println("Se ha desocupado" + doctores.get(value));
              }
            }
        
        return attentionPriority;
    }
}
      
    


