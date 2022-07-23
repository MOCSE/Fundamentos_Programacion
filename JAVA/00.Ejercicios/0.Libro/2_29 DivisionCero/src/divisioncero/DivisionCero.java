package divisioncero;

public class DivisionCero {

    public static void main(String[] args) {
        try {
            System.out.println(division(10.0, 0.0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    
    public static double division(double n1,double n2) throws ArithmeticException{
        if(n2 == 0.0)
            throw new ArithmeticException("ERROR DIVISION ENTRE 0");
        else
            return n1/n2;
    }
    
}
