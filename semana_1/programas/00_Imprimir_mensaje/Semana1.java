
package semana.pkg1;

import java.util.Calendar;
import java.util.Scanner;


public class Semana1 {

    public static void main(String[] args) {
    
        // Para mirar la completación de los comandos se usa: ctrl + espacio
        // Para hacer zoom: alt + scroll
        // Comentar líneas seleccionadas: ctrl + shift + c
        // correr el programa: f6
        // debug: ctrl + f5
        
        // Imprimir un mensaje por consola        
        System.out.print("hola");
        System.out.println("hola");
        
        // imprimir con formato
        // %.2f  indica que es formato float o double y con 2 decimales
        // %n    indica un cambio de linea, es lo mismo que \n
        System.out.printf("El valor es %.2f %n", 12.3698);
        System.out.printf("El nuevo valor es %.2f \n", 12.3698);
        
        // %d    indica que es de tipo entero
        System.out.printf("El valor es %d %n", 12);
        
        // Imprimir mas de una variable
        double n = 1.25036;
        int x = 10;
        System.out.printf("n = %.2f x = %d %n", n, x);
        
        //Carácter unicode
        System.out.println("\u2605");
        
        //Usando la librería calendar
        Calendar cal = Calendar.getInstance();
        System.out.printf("El mes actual es: %TB \n",cal);
        
        String fmt = "%-30s %-20s %-20s %n";
  
        System.out.printf(fmt, "Libros", "Autor", "Precio");
        System.out.printf(fmt, "-----", "------", "-----");
        System.out.printf(fmt, "Matematicas", "Navathe", "80.000");
        System.out.printf(fmt, "Algoritmos", "Cormen", "92.250");
        System.out.printf(fmt, "Introducción al cálculo", "Rajib Mall", "75.000");
        
        
//        String fmt2 = "%-20s%-20s%-40s%n";
//  
//        System.out.printf("%n %n %n");
//        System.out.format(fmt2, "Books", "Author", "Price");
//        System.out.format(fmt2, "-----", "------", "-----");
//        System.out.format(fmt2, "DBMS", "Navathe", "800");
//        System.out.format(fmt2, "Algorithm", "Cormen", "925");
//        System.out.format(fmt2, "Operating System", "Rajib Mall", "750");
        
        for(int i=0; i<10; i++){
        
                System.out.println(i);
                if(i==5){
                    System.out.println("Llegaste a la mitad");
                }else if(i==7){
                    System.out.println("llegamos al 7");
                }else{
                    System.out.println("llegamos al final");
                }
        
        }//fin for
        
        String nombre1="hola";
        int k=0;
        while(!"fin".equals(nombre1)){ //NOMBRE!="FIN"
            k++;
            System.out.println("+");
            
            if(k>4){
                nombre1="fin";
                System.out.println("-----");
            }
        }
        
        int t=0;
        do{
            System.out.println("Hola");
            t++;
            
        }while(t<10);
        
        
        String nombre= "Alejo";
        
        switch(nombre){
            case "Alejo":
                System.out.println("Polas");
                break;
                
            case "Juan":
                System.out.println("Como");         
                break;
        }//fin case
        
        String s;
        Scanner texto = new Scanner(System.in);
        
        System.out.print("Introduzca texto: ");
        s = texto.next();
        System.out.println(s);
        
        int num;
        Scanner numb = new Scanner(System.in);
        
        System.out.print("Introduzca Numero: ");
        num = numb.nextInt();
        System.out.println(num);
        
        int entero1=0,
            entero2=1,
            entero3=2;
        System.out.println(entero1);
    }
    
}
