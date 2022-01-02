
package pkg010.laboratoriocaja;

public class Caja {
    
    //Atributos
    double ancho;
    double alto;
    double profundo;
    
    //Constructores
    public Caja(){ //Constructor Vacio
    }
    
    public Caja(double ancho, double alto, double profundo){ //Constructor con argumentos
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //Metodos
    public void volumen(){
        float res = (float) (this.ancho * this.alto * this.profundo);
        System.out.println("Resultado = " + res + " Unidades Cubicas");
    }
}
