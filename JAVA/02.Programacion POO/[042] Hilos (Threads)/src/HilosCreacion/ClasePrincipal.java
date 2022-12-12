package HilosCreacion;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        //Con extends Thread
        Proceso1 hilo1 = new Proceso1();
        
        //Con implements Runnable
        Thread hilo2 = new Thread(new Proceso2());
        
        hilo1.start();
        hilo2.start();
    }
    
}
