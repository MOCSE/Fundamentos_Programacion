/*
    2.- Defina un método listTest (ArrayList al, Integer s), que requiere devolver 
    el índice de la primera aparición de s en al, o -1 si no ha aparecido s.
 */
package Ejercicio2_ArrayList;

import java.util.ArrayList;

public class mainEjercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);
        al.add(5);
        System.out.println(listTest(al, 30));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        return al.indexOf(s);
    }

}
