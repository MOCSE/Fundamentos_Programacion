package Ejercicio03_RelojDigital;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cronometro extends Observable implements Runnable {

    private int horas, minutos, segundos;
    private int velocidad;

    public Cronometro(int velocidad) {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.velocidad = velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    

    @Override
    public void run() {
            String tiempo = "";
            while (true) { 
                
                try {
                    tiempo = "";
                    
                    if(horas < 10){
                        tiempo += "0" + horas;
                    }
                    else{
                        tiempo += horas;
                    }
                    
                    tiempo += ":";
                    
                    if(minutos < 10){
                        tiempo += "0" + minutos;
                    }
                    else{
                        tiempo += minutos;
                    }
                    
                    tiempo += ":";
                    
                    if(segundos < 10){
                        tiempo += "0" + segundos;
                    }
                    else{
                        tiempo += segundos;
                    }
                    
                    //Obserbable
                    this.setChanged();
                    this.notifyObservers(tiempo);
                    this.clearChanged();
                    Thread.sleep(this.velocidad);
                    
                    segundos++;
                    
                    if(segundos == 60){
                        minutos++;
                        segundos = 0;
                        if(minutos ==60){
                            minutos =0;
                            horas++;
                            if(horas == 24){
                                horas = 0;
                            }
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        
    }

}
