package pkg01_declaracion_variables;

public class Main {

    // variable global, necesario la palabra static
    static int entero;
    public static void main(String[] args) {
        // Declaración de variables
        // DATA_TYPE VARIABLE_NAME;
        
        // variable local
        int entero2;
        
        // multiples variables declaradas
        int entero3, entero4=25, entero5;
        
        entero = 2;
        //entero2 = 31.5;
        
        System.out.println(entero);
        System.out.println(entero4);
        
        // atributo final
        final int NUMERO = 15;
        
        //NUMERO = 99;
        
        System.out.println(NUMERO);
        System.out.println("hola\t sigue");
        
        // variables primitivas
        // representaciín del boleano
        boolean flag = true;
        System.out.println(flag);
        
        // representación del byte
        byte mybyte = 0x3f;
        System.out.println(mybyte);
        
        int a = 11, b = 10;
        //int b = a * b;
        
        int x, y, z, w;
        x = 10;
        y = 3;
        z = x * y--;
        System.out.println(y);
        w = --x * --y;
        System.out.println(w);
        System.out.println(z);
        
        // declara la cadena como un objeto S1 S2       
        String S1 = "prueba del método de cadena Java";            
 
        // El método length () de String devuelve la longitud de una cadena S1.       
        int longitud = S1.length();       
        System.out.printf("La longitud de la cadena '%s' es: %d%n", S1, longitud);  
    }
    
}
