
package domain;

public class Electrodomestico {
    
    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    //Constantes
    protected final static String COLOR_DEFECTO = "Blanco";
    protected final static char CONSUMO_DEFECTO = 'F';
    protected final static double PRECIOBASE_DEFECTO = 100; //Euros
    protected final static double PESO_DEFECTO = 100;
    
    //Constructores
        //Un constructor por defecto.
        public Electrodomestico() { 
            this(PRECIOBASE_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO);
        }

        //Un constructor con el precio y peso. El resto por defecto.
        public Electrodomestico(double precioBase, double peso) { 
            this.precioBase = precioBase;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.peso = peso;
        }

        //Un constructor con todos los atributos.
        public Electrodomestico(double precioBase, double peso,  char consumoEnergetico, String color) {
            this.precioBase = precioBase;
            this.color = comprobarColor(color);
            this.consumoEnergetico = consumoEnergetico;
            this.peso = peso;
        }
    
    //Metodos
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        if(consumoEnergetico >= 65 && consumoEnergetico <= 70)
            this.consumoEnergetico = letra;
        else
            this.consumoEnergetico = CONSUMO_DEFECTO;
    }
    
    private String comprobarColor(String color){
        //Colores disponiles
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        String res = "";
    
        for (int i = 0; i < colores.length; i++) {
            if(colores[i] == color)
                res = colores[i];
            else
                res = COLOR_DEFECTO;
        }
        return res;
    }
    
    public double precioFinal(){
        double precioExtra = 0;
        
        switch(this.consumoEnergetico){
            case 'A': precioExtra += 100; break;
            case 'B': precioExtra += 80; break;
            case 'C': precioExtra += 60; break;
            case 'D': precioExtra += 50; break;
            case 'E': precioExtra += 30; break;
            case 'F': precioExtra += 10; break;
        }
        
        if(this.peso >= 0 && this.peso < 20)
            precioExtra += 10;
        else if(this.peso >= 20 && this.peso < 50)
            precioExtra += 50;
        else if(this.peso >= 50 && this.peso <= 80)
            precioExtra += 80;
        else if(this.peso > 80 )
            precioExtra += 100;
        
        return this.precioBase + precioExtra;
        
    }
    
}
