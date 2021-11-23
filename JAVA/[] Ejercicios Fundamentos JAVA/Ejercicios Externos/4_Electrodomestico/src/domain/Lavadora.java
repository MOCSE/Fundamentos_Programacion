
package domain;

public class Lavadora extends Electrodomestico{
    
    //Atributos
    private int carga;
    
    //Constantes
    private final static int CARGA_DEFECTO = 5;
    
    //Constructores
        //Un constructor por defecto.
        public Lavadora() {
            this.precioBase = PRECIOBASE_DEFECTO;
            this.peso = PESO_DEFECTO;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.carga = CARGA_DEFECTO;
        }
        
        //Un constructor con el precio y peso. El resto por defecto.
        public Lavadora(double precioBase, double peso) {
            this.precioBase = precioBase;
            this.peso = peso;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.carga = CARGA_DEFECTO;
        }
        
        //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
        public Lavadora(double precioBase, int carga, char consumoEnergetico, String color, double peso) {
            super(precioBase, peso, consumoEnergetico, color);
            this.carga = carga;
        }
        
    //Metodos
    public int getCarga() {
        return carga;
    }
    
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double precio_extra = super.precioFinal();
  
        //Añadimos el código necesario
        if (this.carga > 30)
            precio_extra += 50;

        return precio_extra;
    }
        
}
