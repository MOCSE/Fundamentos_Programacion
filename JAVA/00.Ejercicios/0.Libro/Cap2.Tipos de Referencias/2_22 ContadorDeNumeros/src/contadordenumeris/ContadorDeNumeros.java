package contadordenumeris;

public class ContadorDeNumeros {

    public static void main(String[] args) {
        int[] arrayEnteros = {10,20,2,3,4,5,3,3};
        int[][] matrizEnteros = {{12,2,23},{1,2,1},{33,9,6},{1,1,23},{9,11,2}};
        
        System.out.println(howMany(arrayEnteros, '3'));
        System.out.println(howMany(matrizEnteros, '1'));
    }
    
    public static int howMany(int[] array, char number){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == Character.getNumericValue(number))
                contador++;
        }
        return contador;
    }
    
    public static int howMany(int[][] array, char number){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == Character.getNumericValue(number))
                    contador++;
            }
        }
        return contador;
    }
    
}
