/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Java");
        
        int a = 3, b = 2,c;
        
        System.out.println(a*b);
        
        c = 10;
        
        System.out.println("variable c: "+c);
        
        for(int i=0;i<6;i++){
            System.out.println(i);
        }       
        // %d    indica que es de tipo entero
        System.out.printf("El valor es %d %n", 12);
        
        boolean verdad = true;
        
        String mensaje = "Hola Java";
        
        System.out.printf("imprimiendo la variable '%S' y un número de %B%n",
                mensaje,verdad);
        
        float r = (float) 12.3698;
        
        System.out.printf("El valor es %.2f %n", r);
        System.out.printf("El nuevo valor es %.2f \n", 12.3698);
        
        //CarÃ¡cter unicode
        System.out.println("\u2605");
        
        // imprimiendo un isoceles
        System.out.println( "       /\\ " ); // line 1
        System.out.println( "      /  \\" ); // line 2
        System.out.println( "     /    \\"); // line 3
        System.out.println( "    /      \\" ); // line 4
        System.out.println( "   /        \\" ); // line 5
        System.out.println( "  /          \\" ); // line 6
        System.out.println( " /____________\\" ); // line 7
        
        //Usando la librerÃ­a calendar
        Calendar cal = Calendar.getInstance();
        System.out.printf("El mes actual es: %TB \n",cal);
        
        String fmt = "%-30s %-20s %-20s %n";
  
        System.out.printf(fmt, "Libros", "Autor", "Precio");
        System.out.printf(fmt, "-----", "------", "-----");
        System.out.printf(fmt, "Matematicas", "Navathe", "80.000");
        System.out.printf(fmt, "Algoritmos", "Cormen", "92.250");
        System.out.printf(fmt, "IntroducciÃ³n al cÃ¡lculo", "Rajib Mall", "75.000");
        
        // post y pre incremento/decremento
        int x, y, z, w;
        x = 10;
        y = 3;
        z = x * y--;
        System.out.println(y);
        w = --x * --y;
        System.out.println(w);
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        
        // entrada por teclado
        Scanner entrada = new Scanner(System.in);
        /*      
        int num1,num2,num3;
        System.out.print("Ingrese número 1: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese número 2: ");
        num2 = entrada.nextInt();
        
        System.out.print("Ingrese número 3: ");
        num3 = entrada.nextInt();
        
        System.out.println("El resultado de multiplicar es: "+num1*num2*num3);
        */
      
        String mensaje2;
        System.out.print("Ingrese texto: ");
        mensaje2 = entrada.nextLine();
        System.out.println("el texto es: "+mensaje2);
        /*
        int numcas = Integer.parseInt("4140");
        System.out.println("casteo: "+ numcas/2);
        
        int numerico = (int) 5.6;
        System.out.println("entero: "+ numerico);
        
        
        int numc = 8;
        
        String tex = "otro";
        
        if("texto".equals(tex)){
            System.out.println("valore igual");
        }else if("otro".equals(tex)){
            System.out.println("otro");
        }
*/
       float tel;
        tel = 3235884610f;
        System.out.println(String.format("%.0f", tel));
        
    }
    
}
