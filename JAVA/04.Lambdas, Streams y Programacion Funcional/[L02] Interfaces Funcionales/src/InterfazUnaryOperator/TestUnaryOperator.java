package InterfazUnaryOperator;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {

    public static void main(String[] args) {

        //Hace lo mismo que Function solo que solo se especifica un dato y ese es el mismo de salida
        UnaryOperator<Integer> test = x -> x + x + x;
        System.out.println(test.apply(12));

    }
}
