package operacionesmatriz;

public class OperacionesMatriz {
    public static void main(String[] args) {
        double[] array = {10.0,1.2,13.5,11.2,10.5,22.33,11.2,11.2,1.3,1.2,1.3,1.3,1.3};
        
        System.out.println("La suma es: " + sumaArray(array));
        System.out.println("La media es: " + mediaArray(array));
        System.out.println("La moda es: " + modaArray(array));
    }
    
    public static double sumaArray(double[] array){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
       return suma;
    }
    
    public static double mediaArray(double[] array){
        double promedio = sumaArray(array);
        promedio = promedio / array.length;
        return promedio;
    }
    
    public static double modaArray(double[] array){
        int repeticiones = 0, repeticionesMax = 0;
        double modaMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j])
                    repeticiones++;
            }
            if(repeticiones > repeticionesMax){
               modaMax = array[i];
               repeticionesMax = repeticiones;
            }
            repeticiones=0;
        }
        return modaMax;
    }
}
