
import java.util.NoSuchElementException;
import java.util.Scanner;


public class EntradaConDelimitadores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 ints on one line: ");
        
        try{
            String oneLine = in.nextLine();
            Scanner str = new Scanner(oneLine);
            str.useDelimiter(",");
            
            int x = str.nextInt();
            int y = str.nextInt();
            
            System.out.println("Max: " + Math.max(x, y));
        }
        catch (NoSuchElementException e){
            System.err.println("Error: need two ints");
        }
        
    }
    
}
