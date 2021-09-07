/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturas;
import java.util.Scanner;
/**
 *
 * @author johna
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String[] args) {
        // TEMPERATURAS ENTRADAS DIRECTAMENTE
        Scanner teclado = new Scanner(System.in);
        // Creando un arreglo
        double[] temperatura;
        
        // temperaturas por día
        temperatura = new double[7];
        
        for (int i = 0; i < temperatura.length; i++)
        {
            System.out.println("Entre la máxima temperatura por día " + (i+1));
            temperatura[i] = teclado.nextDouble();
        }
        // display temperatures
        System.out.println(); // blank line
        System.out.println("***1TEMPERATURAS ENTRADAS***");
        System.out.println(); // blank line
        for (int i = 0; i < temperatura.length; i++)
        {
            System.out.println("day "+(i+1)+" "+ temperatura[i]);
        }
    }*/
    
    /*
    // TEMPERATURAS USANDO MÉTODOS
    public static void main(String[] args)
    {
        double[] temperature;
        temperature = new double[7];
        enterTemps(temperature); // call method
        displayTemps(temperature); // call method
    }
    // method to enter temperatures
    static void enterTemps(double[] temperatureIn)
    {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < temperatureIn.length; i++)
        {
            System.out.println("enter max temperature for day " + (i+1));
            temperatureIn[i] = keyboard.nextDouble();
        }
        
    }
    // method to display temperatures
    static void displayTemps(double[] temperatureIn)
    {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++)
        {
            System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
        }
    }*/
    
    
    //TEMPERATURAS USANDO MÉTODOS CON RETORNO DE ARREGLO
    public static void main(String[] args)
    {
        double[] temperature;
        temperature = enterTemps(); // call method
        displayTemps(temperature); // call method
    }
    // method to enter temperatures
    static double[] enterTemps()
    {
        Scanner keyboard = new Scanner(System.in);
        double[] temperatureOut = new double[7];
        for (int i = 0; i < temperatureOut.length; i++)
        {
            System.out.println("enter max temperature for day " + (i+1));
            temperatureOut[i] = keyboard.nextDouble();
        }
        return temperatureOut;
    }
    // method to display temperatures
    static void displayTemps(double... temperatureIn)
    {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for (double item : temperatureIn)
        {
            System.out.println(item + " ");
        }
    }
    
}
