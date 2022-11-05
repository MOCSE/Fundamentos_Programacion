package OperacionesReduccionMutable;

import Clases.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OperacionCollect {
    public static void main(String[] args) {
        //Crea una coleccion de un Stream | pasar De Stream a Una Coleccion
        
        //Forma 1 | Metodos Referenciados
        System.out.println("Forma 1 | Con Metodos Referenciados");
        List <String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        
        System.out.println(nombres);
        
        //Forma 2 | Clase Collectors
        System.out.println("\nForma 2 | Con Clase Collectors");
        List <String> nombres2 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        
        System.out.println(nombres2);
        
        //Forma 3 | Conjunto Ordenado
        System.out.println("\nForma 3 | A Conjunto Ordenado");
        Set <String> nombres3 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        
        System.out.println(nombres3);
        
        //Forma 4 | Mapa
        System.out.println("\nForma 4 | A Mapa");
        Map<Long,String> idNombreMapa = Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
        System.out.println(idNombreMapa);
    }
}
