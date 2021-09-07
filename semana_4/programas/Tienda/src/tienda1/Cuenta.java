
package tienda1;

public class Cuenta {
    static int cantidadCuentas;
    int ID;
    double saldo; 
    //public Cliente dueno;
    
    public Cuenta(){
        this.cantidadCuentas += 1;
        this.ID += cantidadCuentas; 
        this.saldo = 0;
    }
      
    int getcantidadCuentas(){
        return this.cantidadCuentas;
    }
    
    int getID(){
        return this.ID;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    void abono(double n){
        this.saldo += n;
    }
    
    /*
    boolean retiro(double n){
        if(n>this.saldo){
            return false;
        }else{
            this.saldo -= n;
            return true;
        }
    }*/
    
}
