
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.DOMINGO);
        
        System.out.println("\nContinente numero 4: " + Continentes.AMERICA);
        System.out.println("No. de Paises del 4to Continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("\nContinente numero 1: " + Continentes.AFRICA);
        System.out.println("No. de Paises del 1er Continente: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES: System.out.println("Primer dia de la semana"); break;
            case MARTES: System.out.println("Segundo dia de la semana"); break;
            case MIERCOLES: System.out.println("Tercer dia de la semana"); break;
            case JUEVES: System.out.println("Cuarto dia de la semana"); break;
            case VIERNES: System.out.println("Quinto dia de la semana"); break;
            case SABADO: System.out.println("Sexto dia de la semana"); break;
            case DOMINGO: System.out.println("Septimo dia de la semana"); break;
            
        }
                
    }
    
}
