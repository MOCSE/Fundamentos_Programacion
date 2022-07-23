package masunosenfila;

public class MasUnosEnFila {
    public static void main(String[] args) {
        int[][] matriz = {{1,0,1,0,1},{1,1,1,0,0},{1,1,1,1,1},{1,0,0,0,0}};
        
        System.out.println("Fila Con mas unos: " + matrizUnos(matriz));
    }
    
    public static int matrizUnos(int[][] matriz){
        int unoMax = 0,uno=0, indexMax = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if(matriz[i][j] == 1)
                    uno++;
            }
            System.out.println();
            if(uno > unoMax){
                indexMax = i;
                unoMax = uno;
            }
            uno=0;
        }
        return indexMax;
    }
}
