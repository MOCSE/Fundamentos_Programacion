
package accesodatos;

//implements || obligar a las clases los metodos de la interface especificada
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar Desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar Desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Listar Desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar Desde Oracle");
    }
    
    
    
}
