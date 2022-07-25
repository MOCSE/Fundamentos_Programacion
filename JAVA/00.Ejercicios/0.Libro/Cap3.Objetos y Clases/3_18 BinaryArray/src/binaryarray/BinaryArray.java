package binaryarray;

import java.util.Arrays;

public class BinaryArray {
    private boolean[] array;
    private String cadena;

    public BinaryArray(String cadena) throws IllegalArgumentException{
        boolean validacion = true, exit = true;
        int i = 0;
        int tam = cadena.length();
        this.array = new boolean[tam];
        this.cadena = cadena;
        
        while(exit && i < tam){
            char chr = cadena.charAt(i);
            switch (chr) {
                case 'F' -> {
                    this.array[i] = false;
                    i++;
                }
                case 'T' -> {
                    this.array[i] = true;
                    i++;
                }
                default -> {
                    validacion = false;
                    exit = false;
                }
            }
        }
        
        if(!validacion)
            throw new IllegalArgumentException("Error: La cadena contiene caracteres no validos");
        
    }

    public boolean getArray(int index) {
        return array[index];
    }

    public void setArray(boolean variable, int index) {
        this.array[index] = variable;
    }

    @Override
    public String toString() {
        return "BinaryArray{" + "array=" + Arrays.toString(array) + ", cadena=" + cadena + '}';
    }
    
    
    
}
