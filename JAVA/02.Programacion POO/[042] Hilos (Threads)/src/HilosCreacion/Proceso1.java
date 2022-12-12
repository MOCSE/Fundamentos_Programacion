package HilosCreacion;

//Manera 1
public class Proceso1 extends Thread{
    
    //Obligatorio poner el run()
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Proceso 1");
        }
    }
    
}
