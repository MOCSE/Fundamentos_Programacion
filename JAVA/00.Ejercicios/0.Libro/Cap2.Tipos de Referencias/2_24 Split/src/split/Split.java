package split;

public class Split {
    public static void main(String[] args) {
        String str = "this is a test";
        
        String [] arr = str.split("\\s");
        
        for (String string : arr) {
            System.out.println(string);
        }
    }
    
}
