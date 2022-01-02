package pkg5sentenciasdecontrol;

public class SentenciasDeControl {

    public static void main(String[] args) {

        // if(condicion) - else || No se usa llaves si solo se usa una linea de codigo
        System.out.println("## if - else ##");
        var condicion = true;

        if (condicion){ // equivalente a -> condicion == true
            System.out.println("Condicion Verdadera");
            System.out.println("Nueva Linea");
        }
        else
           System.out.println("Condicion Falsa");
        
        
        
        // else if(condicion)
            // ##Ejemplo 1##
            System.out.println("\n\n## else if ##");
            var numero = 4;
            var numeroTexto = "Numero desconocido";

            if(numero == 1)
                numeroTexto = "Numero uno";
            else if(numero == 2)
                numeroTexto = "Numero dos";
            else if(numero == 3)
                numeroTexto = "Numero tres";
            else if(numero == 4)
                numeroTexto = "Numero cuatro";
            else 
                numeroTexto = "Caso no encontrado";
            
            System.out.println("[ej1] numeroTexto = " + numeroTexto);
                
            
            // ##Ejemplo 2##
            var mes = 10;
            var estacion = "Estacion Desconocida";

            if(mes == 1 || mes == 2 || mes == 12)
                estacion = "Invierno";
            else if(mes == 3 || mes == 4 || mes == 5)
                estacion = "Primavera";
            else if(mes == 6 || mes == 7 || mes == 8)
                estacion = "Verano";
            else if(mes == 9 || mes == 10 || mes == 11)
                estacion = "Otoño";
            
            System.out.println("[ej2] estacion = " + estacion);
           
        
        
        // switch(<variable>) || Recomendada para menus
            // ##Ejemplo 1##
            System.out.println("\n\n## switch ##");
            var num = 2;
            var numTexto = "Valor desconocido";
            
            switch(num){
                case 1: numTexto = "Numero uno"; break;
                case 2: numTexto = "Numero dos"; break;
                case 3: numTexto = "Numero tres"; break;
                case 4: numTexto = "Numero cuatro"; break;
                default: numTexto = "Caso no encontrado";
            } 
            System.out.println("[ej1] numeroTexto = " + numTexto);                
            
            
            // ##Ejemplo 2##
            mes = 6;
            estacion = "Estacion Desconocida";
            switch(mes){
                case 1: case 2: case 12: estacion = "Invierno"; break;
                case 3: case 4: case 5: estacion = "Primavera"; break;
                case 6: case 7: case 8: estacion = "Verano"; break;
                case 9: case 10: case 11: estacion = "Otoño"; break;
            }
            System.out.println("[ej2] estacion = " + estacion);
    }

}
