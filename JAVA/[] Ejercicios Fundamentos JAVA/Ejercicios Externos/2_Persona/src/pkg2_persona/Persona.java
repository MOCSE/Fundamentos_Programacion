
package pkg2_persona;

public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    
    //Constantes
    private static final char SEXO_DEFAULT = 'H';
    private static final int PESO_BAJO  = -1;
    private static final int PESO_IDEAL = 0;
    private static final int PESO_ALTO  = 1;
    
    //Constructores
    public Persona() { //Constructor por defecto
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) { //Constructor con el nombre, edad y sexo, el resto por defecto.
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) { //Constructor con todos los atributos como parámetro.
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    //Metodos privados
    private char comprobarSexo(char sexo){
        if(sexo == 'M')
            return 'M';
        else
            return SEXO_DEFAULT;
    }
    
    private String generaDNI(){
        //Generar numero de 8 digitos
        int numeroDNI = (int)(Math.random()*(100000000-10000000)+10000000);
        
        //Generar letra
        final int divisor = 23;
        int res = numeroDNI - (numeroDNI / divisor * divisor);
        
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        return Integer.toString(numeroDNI) + letras[res];
    }
    
    //Metodos publicos
    public boolean esMayorDeEdad(){
        if(this.edad >= 18)
            return true;
        else
            return false;
    }
    
    public int calcularIMC(){
        
        double res = this.peso/(Math.pow(this.altura, 2));
        if(res < 20)
            return PESO_BAJO;
        else if(res >= 20 && res <= 25)
            return PESO_IDEAL;
        else if(res > 25)
            return PESO_ALTO;
        else
            return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
