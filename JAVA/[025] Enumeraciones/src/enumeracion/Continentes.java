
package enumeracion;

//Enumeracion con atributos
public enum Continentes {
    //Enumeracion || Para agregar mas atributos (<atr1> , <atri2>)
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributos
    private final int paises;

    //Constructor
    private Continentes(int paises) {
        this.paises = paises;
    }

    //Metodos
    public int getPaises() {
        return paises;
    }
    
 
}
