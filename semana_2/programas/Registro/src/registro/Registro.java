/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // preguntar
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la capacidad para el almacen: ");
        
        int capacidad = Integer.parseInt(teclado.nextLine());
        
        Inventario registro = new Inventario(capacidad);
        
        String k;
        char c;
        
        do{
            System.out.print("¿Qué quiere hacer?\n"+"I:(ingresar)\nQ:(quitar)\nB:(buscar)\nP:(imprimir)\nS:(salir)\n> ");
            k = teclado.next();
            c = k.charAt(0);
            
            switch(c){
                case 'I':
                    String nombres;
                    double precio=0;
                    do{
                        System.out.println("Ingrese nombre del producto, 'S' para salir");
                        System.out.print("> ");
                        nombres = teclado.next();
                        System.out.println("");
                        //System.out.println(nombres);
                        if(!nombres.equals("S")){
                            System.out.print("Ingrese el precio: ");
                            //System.out.print("> ");
                            precio = teclado.nextDouble();
                            //System.out.println(precio);
                        }
                        
                        if(!nombres.equals("S") && precio>0){
                            registro.add(nombres,precio);
                        }
                    }while(!nombres.equals("S"));
                    //while(nombres.length() != 0);
                    //
                    break;
                    
                case 'Q':
                    System.out.print("Ingrese índice: ");
                    registro.remove(Integer.parseInt(teclado.next()));
                    break;
                    
                case 'B':
                    System.out.print("Ingrese un nombre: ");
                    registro.search(teclado.next());
                    break;
                    
                case 'P':
                    registro.print();
                    break;
            }
        }while(c != 'S');
        
    } 
}
