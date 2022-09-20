package tests;

import java.math.BigDecimal;



public class Tests {

    public static void main(String[] args) {
        double number = 0.1;
        
        for (int i = 0; i < 10; i++) {
            number += 0.1;
            System.out.println(i + " | " + number);
        }
        
        System.out.println("//////////");
        
        BigDecimal number2 = new BigDecimal(0.1);
        

        number2.add(number2).add(number2).add(number2);
        System.out.println(number2);
    }

}
