
package domain;

public class Television extends Electrodomestico{
    
    //Atributos
    private double resolucion;
    private boolean sintonizador_TDT;
    
    //Constantes
    private final static double RESOLUCION_DEFECTO = 20;
    private final boolean  SINTONIZADOR_DEFECTO = false;
    
    //Constructores
        //Un constructor por defecto.
        public Television() {
            this.precioBase = PRECIOBASE_DEFECTO;
            this.peso = PESO_DEFECTO;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.resolucion = RESOLUCION_DEFECTO;
            this.sintonizador_TDT = SINTONIZADOR_DEFECTO;
        }
        
        //Un constructor con el precio y peso. El resto por defecto.

        public Television(double precioBase, double peso) {
            this.precioBase = precioBase;
            this.peso = peso;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.resolucion = RESOLUCION_DEFECTO;
            this.sintonizador_TDT = SINTONIZADOR_DEFECTO;
        }
        
        //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
        public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean sintonizador_TDT) {
            super(precioBase, peso, consumoEnergetico, color);
            this.resolucion = resolucion;
            this.sintonizador_TDT = sintonizador_TDT;
        }

    //Metodos    
    public double getResolucion(){
        return resolucion;
    }
    
    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public double precioFinal() {
        //Invocamos el método precioFinal del método padre
        double precio_extra = super.precioFinal();
  
        //Añadimos el código necesario
        if (this.resolucion > 40)
            precio_extra += (precioBase * 0.30);
        if (this.sintonizador_TDT == true)
            precio_extra += 50;

        return precio_extra;
    }
        
}
