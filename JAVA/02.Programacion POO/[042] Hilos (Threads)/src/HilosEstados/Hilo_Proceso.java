package HilosEstados;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_Proceso extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(this.getName() + " | " + i);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
