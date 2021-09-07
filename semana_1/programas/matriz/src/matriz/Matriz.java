/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // una dimensión
        int[] onedim = new int[5];
        
        System.out.println("dimensión del arreglo: "+onedim.length);
        for (int count=0;count<5;count++){
           onedim[count]=count+1;
       }
       
       for (int count=0;count<5;count++){
           System.out.println("arreglo["+count+"] = "+onedim[count]);
       }
       
       String[] str
            = { "GEEKS", "FOR", "GEEKS" };
  
        System.out.println("El tamaño del "
                           + "arreglo es: "
                           + str.length);
        
        int[] array = new int[4];
  
        System.out.println("El tamaño del "
                           + "arreglo es: "
                           + array.length);
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int FILAS = entrada.nextInt();
        
        System.out.println("Ingrese el número de columnas: ");
        int COLUMNAS = entrada.nextInt();
        
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = entrada.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) { 
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz 
        mayor = menor = A[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < A.length; i++) {  //para cada fila de la matriz
            for (j = 0; j < A[i].length; j++) { //para cada columna de la matriz
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (A[i][j] < menor) {
                    menor = A[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }           
        }

        //Mostrar por pantalla el mayor elemento de la matriz,el menor y las posiciones que ocupan           
        System.out.print("El elemento mayor es: " + mayor);
        System.out.println(" esta en la posición: "+ "("+ filaMayor + "," + colMayor+")");
        System.out.print("El elemento menor es: " + menor);
        System.out.println(" esta en la posición: "+ "("+filaMenor + "," + colMenor+")");
       
    }
    
}
