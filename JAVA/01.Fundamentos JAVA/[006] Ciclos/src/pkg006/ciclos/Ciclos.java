
package pkg006.ciclos;

class Ciclos {

    public static void main(String[] args) {
        
        //While(condicion) || Se ejecuta siempre y cuando se cumpla la condicion
        System.out.println("Ciclo While");
        
        var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }
        
        
        //Do - While(condicion) || Se ejecuta al menos 1 vez y depues se ejecuta siempre y cuando se cumpla la condicion
        System.out.println("\nCiclo Do - While");
        
        contador = 0;
        do {
           System.out.println("contador = " + contador);
           contador++;
        } while (contador < 0);
        
        
        //For (<varible_contador> ; condicion ; incremento )|| Ciclo con condiciones y banderas
        System.out.println("\nCiclo For");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("contador = " + i);
        }
        
        
        //break y continue || Romper y continuar ciclos
        System.out.println("\nBreak y Continue");
        
            //break
            for (int i = 1; i < 10; i++) //imprimiendo primer numero par
                if(i % 2 == 0){
                    System.out.println("primero numero par (break) = " + i);
                    break;
                }
            
            //continue
            for (int i = 1; i < 10; i++){ //imprimiendo numeros pares
                if(i % 2 != 0)
                    continue; //ir a la siguiente iteracion
                System.out.println("par (continue) = " + i);
            }
        
           
        //<Label>: || Labels - Etiquetas - Es util para ciclos anidados || 
        System.out.println("\nLabels (Etiquetas)");
        
        inicio:
        for (int i = 1; i < 10; i++){
                if(i % 2 != 0)
                    continue inicio; //ir a la linea de codigo de la etiqueta
                System.out.println("par (continue) = " + i);
            }
    }  
}
