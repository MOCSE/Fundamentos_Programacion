
package sentenciasdecontrol_ej1;

import java.util.Scanner;


public class SentenciasDeControl_ej1 {

    public static void main(String[] args) {
        float calificacion;
        String nota = "Valor desconocido";
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona un valor entre 0 y 10: ");
        calificacion = Float.parseFloat(consola.nextLine());
        
        if(calificacion >= 9 && calificacion <= 10)
            nota = "A";
        else if(calificacion >= 8 && calificacion < 9)
            nota = "B";
        else if(calificacion >= 7 && calificacion < 8)
            nota = "C";
        else if(calificacion >= 6 && calificacion < 7)
            nota = "D";
        else if(calificacion >= 0 && calificacion < 6)
            nota = "F";
        else
            nota = "Valor desconocido";
        
        System.out.println("nota = " + nota);
    } 
}
