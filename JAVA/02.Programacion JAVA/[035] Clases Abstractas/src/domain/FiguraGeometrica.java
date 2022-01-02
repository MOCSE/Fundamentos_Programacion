
package domain;

//Si se agrega un metodo abstract en la clase, tambien la clase se debe definir con abstract
public abstract class FiguraGeometrica {
    
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Los metodos abstract se definen con punto y coma
    public abstract void dibujar();

    
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
