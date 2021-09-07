
package modelo;


public class modelo {
    
        private double num1;
        private double num2;
        private double resultado;
        
    public  void setNum1(double i) {
       this.num1=i;
       
    }

    public void setnum2(double i) {
        this.num2=i;
    }

    public void multiplicar() {
        this.resultado=num1*num2;
    }
    
    public void sumar() {
        resultado=num1+num2;
    }

    public double getResultado() {
  
        return resultado;
    }
    
}
