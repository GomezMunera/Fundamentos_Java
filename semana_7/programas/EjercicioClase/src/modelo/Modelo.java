
package modelo;


public class Modelo {
    
    private double numero1, numero2, resultado;
    
    public Modelo(){}

     public Modelo(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
// métodos getter y setter
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    } 
    
    public void sumar(){
        resultado = numero1+numero2;
    }
    
    public void restar(){
        resultado = numero1-numero2;
    }
    
    public void multiplicar(){
        resultado = numero1*numero2;
    }
    
}
