
package Metodo_equals;

import Metodo_HashCode.*;
import java.util.HashMap;
import java.util.Map;

public class UserApp {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        System.out.println("Apuntando a diferentes referencias: " + obj1.equals(obj2));
        obj1 = obj2;
        System.out.println("Apuntando a la misma referencia: " + obj1.equals(obj2));
        
        
        Student student1 = new Student(1,"javier","1234");
        Student student2 = new Student(1,"javier","1234");
        
        System.out.println("Son iguales con el metodo sobreescrito de equals: " 
                + student1.equals(student2));
    }
}
