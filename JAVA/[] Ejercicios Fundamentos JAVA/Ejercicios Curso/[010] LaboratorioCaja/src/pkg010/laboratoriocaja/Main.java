package pkg010.laboratoriocaja;

public class Main {

    public static void main(String[] args) {
        
        //Objeto con constructor vacio
        Caja caja1 = new Caja();
        caja1.alto = 3;
        caja1.ancho = 2;
        caja1.profundo = 6;
        caja1.volumen();
        
        //Objeto con constructor y argumentos
        Caja caja2 = new Caja(3.24 , 2.8, 6.5);
        caja2.volumen();
    }
    
}
