package clases;

import java.util.Arrays;

public class Polynomial {

    private double[] listaPolinomio;

    public Polynomial(String polinomioCadena) {

        //Filtro de cadena para mejor manejo en algoritmo
        polinomioCadena = polinomioCadena + "/";
        polinomioCadena = polinomioCadena.toUpperCase();

        //Para 0 Grados | "n"
        int gradoMax = 0, grado = 0;
        String gradofinal = "";

        //Buscar el grado mayor para obtener el tamaño del array a usar.
        for (int i = 0; i < polinomioCadena.length(); i++) {

            //Para los Grados 1 | "nX"
            if (polinomioCadena.charAt(i) == 'X' && polinomioCadena.charAt(i + 1) != '^' && gradoMax == 0) {
                gradoMax = 1;
            }

            //Para n grados | "nX^m"
            if (polinomioCadena.charAt(i) == 'X' && polinomioCadena.charAt(i + 1) == '^' && Character.isDigit(polinomioCadena.charAt(i + 2))) {
                int j = i;
                while (Character.isDigit(polinomioCadena.charAt(j + 2))) {
                    gradofinal += polinomioCadena.charAt(j + 2);
                    grado = Integer.parseInt(gradofinal);
                    j++;
                }

                System.out.println("Grado Leido " + grado);
                if (grado > gradoMax) {
                    gradoMax = grado;
                }
                gradofinal = "";
            }
        }

        //Asignacion de tamaño de array por MaxGrados
        System.out.println("Grados Maximo: " + gradoMax);
        this.listaPolinomio = new double[gradoMax + 1];
        for (int i = 0; i < gradoMax + 1; i++) {
            this.listaPolinomio[i] = 0;
        }

        //Algoritmo para guardar la cantidad en sus respectivos grados
        System.out.println("Long Array:" + listaPolinomio.length + "\n\n");
        String numero = "";
        for (int i = 0; i < polinomioCadena.length(); i++) {
            System.out.println("LEYENDO: " + polinomioCadena.charAt(i));
            //Contador de Numeros
            while (Character.isDigit(polinomioCadena.charAt(i))) {
                numero += polinomioCadena.charAt(i);
                i++;
                System.out.println("LEYENDO: " + polinomioCadena.charAt(i));
            }
            System.out.println("Numero Leido: " + numero + " | Leyendo: " + polinomioCadena.charAt(i));
            
            if(polinomioCadena.charAt(i) == 'X'){
                if (polinomioCadena.charAt(i + 1) == '^') {
                }
                else{
                    listaPolinomio[1] = Double.d;
                }
                
            }
            

            numero = "";
        }

        for (double d : listaPolinomio) {
            System.out.println("|" + d + "|");
        }

    }

}
//"X^3 - 4X^2 + 3X + 12"
