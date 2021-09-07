/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoarray;

import java.util.ArrayList;

/**
 *
 * @author johna
 */
public class BancoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an array of references
        ArrayList<CuentaBanco> accountList = new ArrayList<>();
        // create three new accounts, referenced by each element in the array
        accountList.add(new CuentaBanco("99786754","Susan Richards"));
        accountList.add(new CuentaBanco("44567109","Delroy Jacobs"));
        accountList.add(new CuentaBanco("46376205","Sumana Khan"));
        // make various deposits and withdrawals
        accountList.get(0).deposito(1000);
        accountList.get(2).deposito(150);
        accountList.get(0).retiro(500);
        // print details of all three accounts
        for(CuentaBanco item : accountList)
        {
            System.out.println("Número de cuenta " + item.getNumeroCuenta());
            System.out.println("Npmbre de la cuenta: " + item.getNombreCuenta());
            System.out.println("Saldo actual: " + item.getSaldo());
            System.out.println();
        }
    }
    
}
