/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacidad;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Capacidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la capacidad: ");
        int capacidad = Integer.parseInt(teclado.nextLine());
        
        ArrayCapacidad arreglo = new ArrayCapacidad(capacidad);
        
        char c;
        
        do{
            System.out.print("¿Qué quiere hacer?\n"+"I:(ingresar)\nQ:(quitar)\nB:(buscar)\nP:(imprimir)\nS:(salir)\n> ");
            c = teclado.nextLine().charAt(0);
            
            switch(c){
                case 'I':
                    System.out.println("Ingrese nuevos nombres, enter para finalizar: ");
                    String nombre;
                    do
                    {
                        System.out.print("> ");
                        nombre = teclado.nextLine();
                        if(nombre.length() != 0){
                            arreglo.add(nombre);
                        }
                    }while(nombre.length() != 0);
                    break;
                    
                case 'Q':
                    System.out.print("Ingrese índice: ");
                    arreglo.remove(Integer.parseInt(teclado.nextLine()));
                    break;
                
                case 'B':
                    System.out.print("Ingrese un nombre: ");
                    arreglo.search(teclado.nextLine());
                    break;
                    
                case 'P':
                    arreglo.print();
                    break;
            }
        }while(c != 'S');
        
    }   
}
