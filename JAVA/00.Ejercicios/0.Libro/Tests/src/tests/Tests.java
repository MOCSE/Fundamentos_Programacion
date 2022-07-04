package tests;

public class Tests {

    public static void main(String[] args) {
        Persona per1 = null;
        Persona per2 = new Persona("Oscar", 20, "Tauro");
        
        
        System.out.println(per1 == per2);
        System.out.println(per1 != per2);
        System.out.println(per1.equals(per2));
        
        System.out.println(per1);
    }
    
}
