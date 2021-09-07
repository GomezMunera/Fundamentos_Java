/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero deseado de objetos: ");
        int n = teclado.nextInt();

        //ESTA LINEA TIENE QUE TENER DECLARADO EL TIPO FAMILIARES.
        // EL VECTOR ESTA CONFORMADO SOLO DE TIPOS FAMILIARES. 
        Familiares vector[] = new Familiares[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca el nombre:");
            String nombre = teclado.next();
            //NO ES NECESARIO VOLVER A DECLARAR Familiares Vector[] = .... 
            //POR QUE YA LA DECLARASTE Y LE DISTE SU TAMAÑO. 
            //LO QUE SE HACE AQUÍ ES CREAR LA INSTANCIA DE Famliares y guardarla
            // EN vector[i].

            vector[i] = new Familiares(nombre);

            // LA MANERA EN QUE LO TENIAS NO TE FUNCIONABA POR QUE INICIALIZABAS
            // CADA VEZ EL VECTOR PERO NO COMO String, SINO COMO Familiares. 
            // DICHO DE OTRA MANERA. BORRABAS LO ANTERIOR Y PONIAS ALGO NUEVO.

        }


        //ESTA LINEA SOLO ES PARA ITINERAR SOBRE TODOS LOS OBJETOS. 
        System.out.println("El modo que me gusta.");
        for (Familiares familiares : vector) {
            System.out.println(familiares);
        }

        //TAMBIEN PUEDES HACERLO ASÍ, DIRECTAMENTE SOBRE EL VECTOR:
        System.out.println("El modo refinado");
        for (int i = 0; i < vector.length; i++) {
            Familiares familiares = vector[i];
            System.out.println(familiares);
        }

        // O UN POCO MÁS INFORMAL. 
        System.out.println("El clásico");
        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i].toString());
        }*/
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero deseado de objetos: ");
        int n = teclado.nextInt();
        ArrayList<Familiares> familiares = new ArrayList<>();
        String nombre;
        for (int i = 0; i < n; i++) {
           System.out.println("Introduzca el nombre:");
           nombre = teclado.next();
           Familiares familiar = new Familiares(nombre);
           familiares.add(familiar);     
        }
        
        System.out.println("El modo que me gusta.");
        for (Familiares familiar : familiares) {
            System.out.println(familiar);
        }
    }
    
}
