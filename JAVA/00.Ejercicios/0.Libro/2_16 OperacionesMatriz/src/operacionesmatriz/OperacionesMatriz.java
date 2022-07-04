package operacionesmatriz;

public class OperacionesMatriz {

    public static void main(String[] args) {
        double[][] matrizEnteros = {{12,2,23},{1,2,1},{33,9,6},{1,200,23},{9,11,2}};
        
        System.out.println("Suma Matriz: " + suma(matrizEnteros));
        System.out.println("Promedio Matriz: " + promedio(matrizEnteros));
        System.out.println("Moda Me dio hueva xd:");
    }
    
    public static double suma(double[][] matriz){
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    public static double promedio(double[][] matriz){
        double promedio = suma(matriz)/(matriz.length * matriz[0].length);
        return promedio;
    }
    
    
}
