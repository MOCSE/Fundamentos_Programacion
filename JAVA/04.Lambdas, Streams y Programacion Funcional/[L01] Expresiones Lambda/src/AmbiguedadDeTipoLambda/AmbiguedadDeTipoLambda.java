package AmbiguedadDeTipoLambda;

public class AmbiguedadDeTipoLambda {

    public static void main(String[] args) {
       
        //Evitar ambiguedades
        engine((long x,long y) -> x + y ); 
        
        engine((CalculadoraLong)(x,y) -> x + y );
        
        CalculadoraInt calInt = (x,y) -> x + y;
        engine(calInt);
        
    }
    
    
    //Metodos sobrecargados
    public static void engine(CalculadoraInt cal){
        
    }
    
    public static void engine(CalculadoraLong cal){
        
    }
}
