/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author johna
 */
public class CuentaBanco {
    String nombreCuenta, numeroCuenta;
    double saldo;
      
    public CuentaBanco(){
        this.numeroCuenta = "";
        this.nombreCuenta = "";
        this.saldo = 0;
    }
   
    public CuentaBanco(String numeroCuenta, String nombreCuenta){
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.saldo = 0;
    }
    
    String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    
    String getNombreCuenta(){
        return this.nombreCuenta;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    void deposito(double n){
        this.saldo += n;
    }
    
    boolean retiro(double n){
        if(n>this.saldo){
            return false;
        }else{
            this.saldo -= n;
            return true;
        }
    }
    
}
