package ColasDePrioridad;

//Implementar la interface comparable
public class Patient implements Comparable<Patient> {

    private String nombre;
    private Gravity gravity;

    public Patient(String nombre, Gravity gravity) {
        this.nombre = nombre;
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

}
