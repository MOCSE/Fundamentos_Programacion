package Pedidos;

import Productos.*;

public class MundoPc {
    public static void main(String[] args) {
        
        
        Producto CompuHp = new Computadora("HP","Pavilion",13400,"Intel",120,12);
        Producto ComputadoGamer = new Computadora("Hyperex","GH-123",30000,"Intel",1000,16);
        
        Producto Audifonos1 = new Dispositivo("RAYDER","Z000",120,"AudiFan","Azul","Audifono");
        Producto Audifonos2 = new Dispositivo("RAYDER_PLUS","Z000",520,"AudiFan","Negro","Audifono");
        
        Producto Impresora1 = new Impresora("Samsumg ","LaserLaser",1203,"LaserJetLa","Azul","Tinta","Wifi",334);
        
        Producto MouseLogi = new Mouse();
        
        
        //Agregacion articulos a computadoras
        
       
        Orden orden1 = new Orden();
        orden1.agregarProducto(CompuHp);
        orden1.agregarProducto(Audifonos1);
        orden1.agregarProducto(MouseLogi);
        orden1.agregarProducto(Impresora1);
        orden1.mostrarOrden();
        orden1.eliminarProducto(2);
        orden1.eliminarProducto(1);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(ComputadoGamer);
        orden2.agregarProducto(Audifonos2);
        orden2.mostrarOrden();
    }
}
