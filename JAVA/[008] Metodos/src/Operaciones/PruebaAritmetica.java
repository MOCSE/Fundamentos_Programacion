package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //Metodo sin retorno
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        //Metodo con retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado con retorno = " + resultado);
        
        //Metodo con argumentos
        resultado = aritmetica1.sumarConArgumentos(5,8); //Parametros
        System.out.println("Resultado con argumentos = " + resultado);
    }
    
}
