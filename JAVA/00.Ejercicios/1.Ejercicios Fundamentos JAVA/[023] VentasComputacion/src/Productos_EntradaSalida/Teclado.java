package Productos_EntradaSalida;

public class Teclado extends DispositivoEntrada{
    
    //Atributos
    private final int idTeclado;
    private static int contadorTeclados;
    
    //Constructor -> Herencia
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + "}," + super.toString() + "}";
    }
    
}
