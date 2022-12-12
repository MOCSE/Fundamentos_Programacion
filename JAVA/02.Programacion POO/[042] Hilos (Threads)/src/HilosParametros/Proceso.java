package HilosParametros;

public class Proceso extends Thread{

    private int num_int;
    
    public Proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < num_int; i++) {
            System.out.println(i + " | " + this.getName());
        }
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
    }
    
}
