package Ejercicio01_LetrasYNumeros;


public class Ejercicio1 {
    public static void main(String[] args) {
        HilosNumeros h1 = new HilosNumeros(1);
        HilosNumeros h2 = new HilosNumeros(2);
        
        //Crear 2 hilos
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        
        //Iniciar los hilos, cada uno hara su ejecucion
        //Los hilos van a su bola, el primero que llega es el que se ejecuta
        t1.start();
        t2.start();
    }
    
}
