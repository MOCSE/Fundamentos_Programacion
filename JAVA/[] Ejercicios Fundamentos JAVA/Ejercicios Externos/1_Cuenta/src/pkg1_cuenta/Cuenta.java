
package pkg1_cuenta;

public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;
    
    //Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    //Metodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad >= 0)
            this.cantidad += cantidad;
        else
            this.cantidad = 0;
    }
    
    public void retirar(double cantidad){
        if((this.cantidad - cantidad) < 0)
            this.cantidad = 0;
        else
            this.cantidad -= cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
}
