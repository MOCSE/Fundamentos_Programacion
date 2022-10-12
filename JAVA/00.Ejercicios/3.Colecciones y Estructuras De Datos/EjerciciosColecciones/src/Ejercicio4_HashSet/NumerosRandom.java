package tests;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Generacion de numeros aleatorios, para uso en diversas funciones
 *
 * @author Romero Hernández Oscar David
 */
public class NumerosRandom {

    public static double getDouble(int min, int max, int decimales) {
        String dec = ".";

        for (int i = 1; i < decimales; i++) {
            dec += "#";
        }

        DecimalFormat df = new DecimalFormat(dec);

        return Double.parseDouble(df.format(Math.random() * ((max - min) + 1)) + min);
    }

    public static int getInt(int min, int max) {
        Random random = new Random();

        return random.ints(min, (max + 1)).findFirst().getAsInt();

    }

    public static double[] getArrayDoubles(int min, int max, int cantidad, int decimales) {
        double numeros[] = new double[cantidad];
        String dec = ".";

        for (int i = 1; i < decimales; i++) {
            dec += "#";
        }

        DecimalFormat df = new DecimalFormat(dec);

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = Double.parseDouble(df.format(Math.random() * ((max - min) + 1)) + min);
        }

        return numeros;
    }

    public static int[] getArrayInts(int min, int max, int cantidad) {
        int numeros[] = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.ints(min, (max + 1)).findFirst().getAsInt();
        }

        return numeros;
    }

}
