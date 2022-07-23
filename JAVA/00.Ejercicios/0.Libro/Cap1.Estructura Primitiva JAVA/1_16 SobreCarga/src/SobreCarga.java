
import java.util.Scanner;

public class SobreCarga {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1,n2,n3,n4,n5,number;
        System.out.print("Numeros a ingresar 4 o 5: ");
        number = teclado.nextInt();
        
        switch (number) {
            case 4:
                n1 = teclado.nextInt();
                n2 = teclado.nextInt();
                n3 = teclado.nextInt();
                n4 = teclado.nextInt();
                System.out.println("Numero Maximo: " + maximoNumeros(n1, n2, n3, n4));
                break;
            case 5:
                n1 = teclado.nextInt();
                n2 = teclado.nextInt();
                n3 = teclado.nextInt();
                n4 = teclado.nextInt();
                n5 = teclado.nextInt();
                System.out.println("Numero Maximo: " + maximoNumeros(n1, n2, n3, n4, n5));
                break;
            default:
                System.out.println("Error, Numero No Valido");
                break;
        }
        
    }
    
    public static int maximoNumeros(int n1,int n2,int n3,int n4){
        int nMaximo = n1;
        
        if(n2 > nMaximo)
            nMaximo = n2;
        if(n3 > nMaximo)
            nMaximo = n3;
        if(n4 > nMaximo)
            nMaximo = n4;
        
        return nMaximo;
    }
    
    public static int maximoNumeros(int n1,int n2,int n3,int n4,int n5){
        int nMaximo = n1;
        
        if(n2 > nMaximo)
            nMaximo = n2;
        if(n3 > nMaximo)
            nMaximo = n3;
        if(n4 > nMaximo)
            nMaximo = n4;
        if(n4 > nMaximo)
            nMaximo = n5;
        
        return nMaximo;
    }
    
}
