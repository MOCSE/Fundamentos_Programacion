package duiplicadosconjuntos;

import java.util.ArrayList;

public class DuiplicadosConjuntos {
    public static void main(String[] args) {
        int[] arrayEnteros = {10,20,2,3,4,5};
        int[][] matrizEnteros = {{12,2,23},{1,2,1},{33,9,6},{1,200,23},{9,11,2}};
        String[] arrayCadenas = {"abc", "Oscar","Programacion","resta","abc22@22323XD"};
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Cadena1XD");
        listaCadenas.add("Cadena2");
        listaCadenas.add("Cadena2");
        listaCadenas.add("sosaldsnakdnkadmak");
        
        System.out.println(hasDuplicate(arrayEnteros));
        System.out.println(hasDuplicate(matrizEnteros));
        System.out.println(hasDuplicate(arrayCadenas));
        System.out.println(hasDuplicate(listaCadenas));
    }
    
    public static boolean hasDuplicate(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j])
                    return true;
            }
        }
        return false;
    }
    
    public static boolean hasDuplicate(int[][] array){
        int base;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = i+1; k < array.length; k++) {
                    for (int l = i+1; l < array[k].length; l++) {
                        if(array[i][j] == array[k][l])
                            return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean hasDuplicate(String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j]))
                    return true;
            }
        }
        return false;
    }
    
    public static boolean hasDuplicate(ArrayList<String> array){
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i).equals(array.get(j)))
                    return true;
            }
        }
        return false;
    }
}
