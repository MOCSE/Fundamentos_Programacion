package CajaFuerte;


public class TestCajaFuerte {
    public static void main(String[] args) {
        try {
            CajaFuerte caja1 = new CajaFuerte(123);
            caja1.open(123);
            caja1.open(111);
            caja1.changeCombo(123, 999);
            caja1.changeCombo(991, 111);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
