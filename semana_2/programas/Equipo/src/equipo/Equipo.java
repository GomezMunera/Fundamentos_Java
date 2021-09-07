/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        // definición de variable
        int opc;
        
        do{
            System.out.println("1. Verde");
            System.out.println("2. Blanco");
            System.out.println("3. Rojo");
            System.out.println("4. Azul");
            System.out.println("5. Salir");

            System.out.println("Seleccione un color: ");

            opc = teclado.nextInt();
            
            /*
            if(opc<1 || opc>5){
                System.out.println("Rango no valido");
            }

            if(opc==1 || opc==2){
                System.out.println("Es de Nacional");
            }else if(opc==3 || opc==4){
                System.out.println("Es de Medellín");
            } 
*/
            switch(opc){
                case 1:
                    System.out.println("Es de Nacional");
                    break;
                case 2:
                    System.out.println("Es de Nacional");
                    break;
                case 3:
                    System.out.println("Es de Medellín");
                    break;
                case 4:
                    System.out.println("Es de Medellín");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Rango no valido");
                    break;  
            }
            System.out.println("");
        }while(opc!=5);
    }
    
}
