/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variante2;

/**
 *
 * @author johna
 */
public class CuentaBanco {
    
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;
    
    public void depositar(double c){
        saldo += c;
    }
    public void retirar(double c){
        
        if(c<saldo){
            saldo -= c;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
