/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Scanner keyboard = new Scanner(System.in);
        double amount;
        boolean ok;
        CuentaBanco cuenta1 = new CuentaBanco("99786754","Susan Richards");
        System.out.print("Ingrese una cantidad a depositar: ");
        amount = keyboard.nextDouble();
        cuenta1.deposito(amount);
        System.out.println("El deposito fue hecho");
        System.out.println("Saldo = " + cuenta1.getSaldo());
        System.out.println();
        System.out.print("Ingrese una cantidad a retirar: ");
        amount = keyboard.nextDouble();
        ok = cuenta1.retiro(amount); // get the return value of the withdraw method
        if(ok)
        {
            System.out.println("Retiro realizado");
        }
        else
        {
            System.out.println("Fondos insuficientes");
        }
        System.out.println("Saldo = " + cuenta1.getSaldo());
        System.out.println();
        */
        
        
        // CREANDO UNA LISTA DE CUENTAS
        // create an array of references
        CuentaBanco[] accountList = new CuentaBanco[3];
        // create three new accounts, referenced by each element in the array
        accountList[0] = new CuentaBanco("99786754","Susan Richards");
        accountList[1] = new CuentaBanco("44567109","Delroy Jacobs");
        accountList[2] = new CuentaBanco("46376205","Sumana Khan");
        // make various deposits and withdrawals
        accountList[0].deposito(1000);
        accountList[2].deposito(150);
        accountList[0].retiro(500);
        // print details of all three accounts
        for(CuentaBanco item : accountList)
        {
            System.out.println("Número de cuenta: " + item.getNumeroCuenta());
            System.out.println("Nombre de la cuenta: " + item.getNombreCuenta());
            System.out.println("Saldo Actual: " + item.getSaldo());
            System.out.println();
        }
        
    }
    
}
