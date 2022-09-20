package Numeros;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroRacional {
    private List<Double> listaNumeros = new ArrayList<>();
    
    public void leerArchivoNumeros(){
        String nameFile = "C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\00.Ejercicios\\0.Libro\\3_20 LecturaNumerosClase\\src\\Numeros\\numeros_1.txt";
        ManejoArchivos file = new ManejoArchivos();
        
        this.listaNumeros = file.guardarArchivoDouble(nameFile);
        this.listaNumeros = this.listaNumeros.stream().distinct().collect(Collectors.toList());

        this.listaNumeros.forEach(System.out::println);
        System.out.println("Cantidad leida (Sin repetir): " + this.listaNumeros.size());
    }
    
    public BigDecimal sumar(){
        BigDecimal suma = new BigDecimal(0);
        for (Double listaNumero : this.listaNumeros) {
            suma = suma.add(BigDecimal.valueOf(listaNumero));
        }
        return suma;
    }
    
    public BigDecimal mediaAritmetica(){
        BigDecimal promedio = sumar();
        return promedio.divide(BigDecimal.valueOf(this.listaNumeros.size()));
    }
    
    
}
