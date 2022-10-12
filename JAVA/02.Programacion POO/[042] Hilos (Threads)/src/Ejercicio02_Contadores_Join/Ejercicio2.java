package Ejercicio02_Contadores_Join;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {

    public static void main(String[] args) {
        Contador c1 = new Contador("HILO A", 40);
        Contador c2 = new Contador("HILO B", 50);
        Contador c3 = new Contador("HILO C", 20);
        Contador c4 = new Contador("HILO D", 70);
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        //No sigue el codigo hasta que terminen de ejecutarse los hilos
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Fin del programa");
    }
    
}
