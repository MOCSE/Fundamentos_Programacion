package LambdaComoRetornoDeMetodos;

public class LambdaComoRetornoDeMetodos {
    
    public static void main(String[] args) {
        System.out.println(create().calcular(2, 2));
    }
    
    private static CalculadoraLong create(){
        return (x,y) -> x / y;
    }
}
