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
public class CuentaBancaria {
    double saldo;
    String numeroCuenta="0";
    
    public CuentaBancaria(){
        this.saldo = 0;
        //this.numeroCuenta = "0";
    }
    
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
        //this.numeroCuenta = "0";
    }
    
    public CuentaBancaria(double saldo, String numeroCuenta){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposito(double saldo){
        this.saldo += saldo;
    }
    
    public void transferencia(CuentaBancaria origen){
        this.saldo += origen.saldo;
        origen.saldo = 0;
        System.out.println("La transferencia viene del número de cuenta "+ origen.numeroCuenta);
    }
    
    public void transferencia(CuentaBancaria origen, double valor){
        if(origen.saldo < valor){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo += valor;
            origen.saldo -= valor;
        }
    }
    
    public void transferencia(CuentaBancaria destino1, CuentaBancaria destino2){
        destino1.saldo += this.saldo/2;
        destino2.saldo += this.saldo/2;
        
        this.saldo = 0;
        
    }
    
        public void transferencia(CuentaBancaria destino1, CuentaBancaria destino2,double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }else{
            
            destino1.saldo += valor/2;
            destino2.saldo += valor/2;
        
            this.saldo -= valor; 
        }
    }
    
}
