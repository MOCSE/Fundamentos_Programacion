package ColasDePrioridad;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ej_SalaEmergencias {

    public static List<Patient> listOfPatients() {
        return Arrays.asList(
                new Patient("Juan", Gravity.MINOR),
                new Patient("Raquel", Gravity.SEVERE),
                new Patient("Ignacio", Gravity.MODERATE),
                new Patient("Yadira", Gravity.MODERATE),
                new Patient("Simón", Gravity.SEVERE),
                new Patient("Eugenio", Gravity.MODERATE),
                new Patient("Anastasia", Gravity.MODERATE),
                new Patient("Omar", Gravity.VERY_SEVERE),
                new Patient("Beatriz", Gravity.SEVERE),
                new Patient("Xochilt", Gravity.MINOR),
                new Patient("Román", Gravity.MINOR),
                new Patient("Rodolfo", Gravity.SEVERE),
                new Patient("Eunice", Gravity.MINOR),
                new Patient("Javier", Gravity.MINOR),
                new Patient("Jacobo", Gravity.MINOR),
                new Patient("Brenda", Gravity.SEVERE),
                new Patient("Alvaro", Gravity.VERY_SEVERE)
        );
    }

    public static void main(String[] args) {
        //Se debe implementar la interface "comparable" o nos da error
        Queue<Patient> attentionPriority = new PriorityQueue<>(listOfPatients());
        
        int numOfPatients = attentionPriority.size();
        
        for (int i = 0; i < numOfPatients; i++) {
            Patient attendingPatient = attentionPriority.poll();
            String name = attendingPatient.getNombre();
            String gravity = attendingPatient.getGravity().getDescripction();
            System.out.println("Atendiendo al paciente: " + name + " con gravedad: " + gravity+"\n");
        }
    }
}
