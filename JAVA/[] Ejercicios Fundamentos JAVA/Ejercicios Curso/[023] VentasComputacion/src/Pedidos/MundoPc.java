
package Pedidos;

import Productos_EntradaSalida.*;


public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Hyperex",13);
        Teclado tecladoGamer = new Teclado("bluetooth", "Hyperex");
        Raton ratonGamer = new Raton("bluetooth", "Hyperex");
        Computadora computadoraGamer = new Computadora("Computadora Hyperex", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
