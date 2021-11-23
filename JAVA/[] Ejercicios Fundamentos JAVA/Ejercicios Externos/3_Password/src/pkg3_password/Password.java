
package pkg3_password;

import java.util.Random;


public class Password {
    
    //Atributos
    private int longitud;
    private String contraseña;
    
    //Constantes
    private static final int LONGITUD_DEFECTO = 8;
    
    //Un constructor por defecto.
    public Password() {
        this.longitud = LONGITUD_DEFECTO;
        this.contraseña = generaContraseña();
    }
    
    //Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generaContraseña();
    }
    
    //Metodos
    private String generaContraseña(){
        String password = "";
        
        Random random = new Random();
        
        for (int i = 0; i < this.longitud; i++) {
            int seleccion = random.nextInt(3);

            if(seleccion == 0){
                char minusculas = (char) (random.nextInt(26) + 'a');
                password += minusculas;
            }
            else if(seleccion == 1){
                char mayusculas = (char) (random.nextInt(26) + 'A');
                password += mayusculas;
            }
            else
                password += random.nextInt(10);  
        }
        return password;
    }
    
    public boolean esFuerte(){
        int cont_num=0;
        int cont_min=0;
        int cont_may=0;
        
        for(int i=0; i<this.contraseña.length();i++){
            if(Character.isUpperCase(this.contraseña.charAt(i)))
                cont_may++;
            if(Character.isLowerCase(this.contraseña.charAt(i)))
                cont_min++;
            cont_num = (this.contraseña.length() - (cont_may + cont_min));
        }
        
        if(cont_may > 2 && cont_min > 1 && cont_num > 5)
            return true;
        
        return false;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
