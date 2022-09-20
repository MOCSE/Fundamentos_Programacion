package Numeros;

public class testNumerosRacionales {
    public static void main(String[] args) {
        NumeroRacional lista = new NumeroRacional();
        lista.leerArchivoNumeros();
        System.out.println("Suma: " + lista.sumar());
        System.out.println("Media Aritmetica: " + lista.mediaAritmetica());
    }
}
