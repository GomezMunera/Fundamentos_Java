/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author johna
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria cuenta_destino = new CuentaBancaria(0,"11");
        System.out.println("Saldo cuenta_destino: " + cuenta_destino.saldo);
        
        CuentaBancaria cuenta_origen = new CuentaBancaria(50,"22");
        System.out.println("Saldo cuenta_origen: " + cuenta_origen.saldo);
        
        System.out.println("");
        // llamado al método
        cuenta_destino.transferencia(cuenta_origen);
        System.out.println("Transferencia Realizada");
        System.out.println("Saldo cuenta_destino: " + cuenta_destino.saldo);
        System.out.println("Saldo cuenta_origen: " + cuenta_origen.saldo);
        System.out.println("\n");
        
        
        System.out.println("PRUEBA DEL OTRO MÉTODO");
        CuentaBancaria cuenta_or = new CuentaBancaria(100);
        CuentaBancaria cuenta_des1 = new CuentaBancaria(20);
        CuentaBancaria cuenta_des2 = new CuentaBancaria(40);
        
        cuenta_or.transferencia(cuenta_des1, cuenta_des2,80);
        
        System.out.println("Saldo cuenta_origen: " + cuenta_or.saldo);
        System.out.println("Saldo cuenta_destino 1: " + cuenta_des1.saldo);
        System.out.println("Saldo cuenta_destino 2: " + cuenta_des2.saldo);
        
        System.out.println("potencia "+Math.pow(2, 3));
    }
    
}
