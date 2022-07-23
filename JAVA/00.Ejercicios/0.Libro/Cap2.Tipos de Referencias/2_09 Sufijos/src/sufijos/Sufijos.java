package sufijos;

public class Sufijos {

    public static void main(String[] args) {
        System.out.println(sufijo("Oscar", "scar"));
    }
    
    public static boolean sufijo(String cadena, String sufijo){
        int validaciones = 0;
        int longCadena = cadena.length();
        int longSubijo = sufijo.length();
        int Diferencia = longCadena-longSubijo;
        
        for (int i = sufijo.length()-1; i >= 0; i--) {
            System.out.println(cadena.charAt(i+Diferencia) + "=" + sufijo.charAt(i));
            if(cadena.charAt(i+Diferencia) == sufijo.charAt(i))
                validaciones++;
        }
        return validaciones == sufijo.length();
    }
    
}
