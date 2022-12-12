package HilosEstados;

import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

    public static void main(String[] args) {
        
        // new() | Estado Del Hilo Creado pero no Ejecutado (Estado Nuevo)
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        // start() | Ejecuta el Hilo llamando al método run() (Estado Ejecutable)
        hilo1.start();
        
        // sleep (ms) | (Estado Bloqueado) El hilo se encuentra en ejecuion pero existe una tarea o actividad del mismo hilo que lo impide
        try {
            hilo1.sleep(5000); //5000ms -> 3 segundos
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        hilo2.start();
        
        // stop() | (Estado finalizado) Matar el hilo
        hilo1.stop();
    }
    
}
