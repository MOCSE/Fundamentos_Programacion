package InterfazFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales_Listas {
    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(new Comensal("Javier", 123, 1),
                new Comensal("Oscar", 323, 2),
                new Comensal("Emmanuel", 1244, 3),
                new Comensal("Estefy", 4, 4),
                new Comensal("Yair", 787345, 10));
        
                
        List <Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
        System.out.println("La lista de nombres es: \n");
        for (Object nombresComensale : nombresComensales) {
            System.out.println("El nombre es: " + nombresComensale);
        }
    }
    
    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> funcion){
        List<Object> listaDatos = new ArrayList<>();
        
        for (Comensal comensal : listaCom) {
            listaDatos.add(funcion.apply(comensal));
        }
        
        return listaDatos;
    }
}
