
package sobrecargaMetodos;


public class testOperaciones {
    public static void main(String[] args) {
        //Como los metodos son estaticos, no es necesario creear un objeto.
        
        //Metodo con double
        var resultado = Operaciones_sobrecargaMetodos.sumar(10.90, 12.56);
        System.out.println("resultado = " + resultado);
        
        //Metodo con int
        var resultado2 = Operaciones_sobrecargaMetodos.sumar(10, 9);
        System.out.println("resultado2 = " + resultado2);
    }
}
