package LambdaSinParametros;

public class LambdaSinParametros {

    public static void main(String[] args) {
        
        //Referencia del metodo abstracto de la interface
        FunctionTest ft = () -> System.out.println("Hola Mundo");
        ft.saludar();
        
        //Comunmente las lambdas se manejan con metodos
        LambdaSinParametros objeto = new LambdaSinParametros();
        objeto.miMetodo(ft);
        
    }
    
    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}
