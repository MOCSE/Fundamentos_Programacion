
package domain;

public class Rectangulo extends  FiguraGeometrica{

    
    //Constructor Heredado
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    //Abstract
    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName()); // this.getClass().getSimpleName() || Obtener nombre de la clase.
    }
    
    
}
