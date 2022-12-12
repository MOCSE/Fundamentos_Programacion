package HilosSincronizados;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo4 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print("K\n");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
