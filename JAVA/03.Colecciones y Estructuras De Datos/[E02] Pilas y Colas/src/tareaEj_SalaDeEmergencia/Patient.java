package tareaEj_SalaDeEmergencia;

//Implementar la interface comparable

import ColasDePrioridad.*;
//Implementar la interface comparable
public class Patient implements Comparable<Patient> {

    private String nombre;
    private int presion;
    private double temperatura;
    private Gravity gravity;

    public Patient(String nombre, int presion, double temperatura, Gravity gravity) {
        this.nombre = nombre;
        this.presion = presion;
        this.temperatura = temperatura;
        this.gravity = gravity;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Comparar los objetos de los pacientes
    @Override
    public int compareTo(Patient patient) {
        int currentLevel = this.gravity.getLevel();
        int compareLevel = patient.gravity.getLevel();
        
        //Mayor valor -> mayor prioridad
            return  compareLevel - currentLevel;
        
        //Menor valor -> mayor prioridad
        //  return  currentLevel - compareLevel; 
    }

    @Override
    public String toString() {
        return "Patient{" + "nombre=" + nombre + ", | gravity=" + gravity + '}';
    }

    
}
