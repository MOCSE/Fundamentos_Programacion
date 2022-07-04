
package parejasenteros;

public class ParejasEnteros {

    public static void main(String[] args) {
        double number;
        for (int a = 1; a <= 500; a++) {
            for (int b = a+1; b <= 500; b++) {
                number = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a*b);
                
                if(number - (int)number == 0){
                    System.out.println("(" + a + "," + b + ") = " + number);
                }
            }
        }   
    }
}
