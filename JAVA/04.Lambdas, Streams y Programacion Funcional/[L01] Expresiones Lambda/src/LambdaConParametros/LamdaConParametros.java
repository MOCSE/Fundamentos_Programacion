package LambdaConParametros;

public class LamdaConParametros {

    public static void main(String[] args) {
        
        //Referencia del metodo abstracto de la interface
        Operaciones op = (num, num2) -> System.out.println(num+num2);
        op.imprimeOperacion(15, 30);
        
        //Comunmente las lambdas se manejan con metodos
        LamdaConParametros objeto = new LamdaConParametros();
        objeto.miMetodo(op, 25, 32);
        
        //Funcionalidad Personalizada
        objeto.miMetodo((num, num2) -> System.out.println(num/num2), 250, 30);
        
    }
    
    public void miMetodo(Operaciones op, int num, int num2){
        op.imprimeOperacion(num, num2);
    }
}
