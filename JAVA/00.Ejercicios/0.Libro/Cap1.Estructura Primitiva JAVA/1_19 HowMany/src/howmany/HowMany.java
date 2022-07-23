package howmany;

public class HowMany {

    public static void main(String[] args) {
        
        // Modificar parametros jiji
        problemaCACA(120,5);
        
    }
    
    public static void problemaCACA(int howMany, int lineLength){
        for (int i = 0; i <= howMany; i++) {
            System.out.print("[");
            String number = String.valueOf(i);
            
            if(number.length() < lineLength){
               System.out.print(number.substring(0, number.length())); 
            }
            else{
               System.out.print(number.substring(0, lineLength));
            }
            
            System.out.print("] ");
        }
    }
}
