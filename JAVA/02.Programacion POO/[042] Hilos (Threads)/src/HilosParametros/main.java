package HilosParametros;
public class main {

    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        
        hilo1.ValorDeLaCondicion(10);
        hilo2.ValorDeLaCondicion(10);
        
        hilo1.start();
        hilo2.start();
    }
    
}
