
/*Las clases abstractas son aquellas que por sí mismas no se pueden identificar con algo 'concreto' (no existen como tal en el mundo real), 
pero sí poseen determinadas características que son comunes en otras clases que pueden ser creadas a partir de ellas*/

package test;

import domain.*;


public class ClaseAbstractaTest {
    public static void main(String[] args) {
        
        //No se puede crear objetos de las clases abstractas, a veces se marcan para evitar crear objetos de la clase padre.
            //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        //UpCasting
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar(); //Polimorfismo
        
    }
}
