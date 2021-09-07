/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testempleado;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String numero, nombre;
        double pago;
        int horas;
        EmpleadoTiempoParcial emp;
        // obtiene los detalles desde el usuario
        System.out.print("Número del empleado? ");
        numero = keyboardString.nextLine();
        System.out.print("Nombre del Empleado? ");
        nombre = keyboardString.nextLine();
        System.out.print("Pago por Horas? ");
        pago = keyboard.nextDouble();
        System.out.print("Horas trabajadas esta semana? ");
        horas = keyboard.nextInt();
        // Crea un nuevo empleado de tiempo parcial
        emp = new EmpleadoTiempoParcial(numero, nombre, pago);
        // Muestra los detalles del empleado
        System.out.println();
        // métodos heredados de la clase Empleado
        System.out.println(emp.getName());
        System.out.println(emp.getNumber());
        System.out.println(emp.calculateWeeklyPay(horas));
        }
}
