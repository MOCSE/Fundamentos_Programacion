
package Ejercicio01_LetrasYNumeros;

public class HilosNumeros implements Runnable{

    private int tipo;

    public HilosNumeros(int tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public void run() {
        while (true) {            
            switch (tipo){
                case 1 -> {
                    for (int i = 1; i < 30; i++) {
                        System.out.print(i+" ");
                    }
                    System.out.println("");
                }
                case 2 -> { 
                    for (char c = 'a'; c < 'z'; c++) {
                        System.out.print(c + " ");
                    }
                    System.out.println("");
                }
                    
            }
        }
    }
    
}
