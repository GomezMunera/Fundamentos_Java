
package calculadora.controlador;

import calculadora.modelo.CalculadoraModelo;
import calculadora.vista.*;


public class Main {
    
    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        //vista2 vista = new vista2();
        CalculadoraModelo modelo = new CalculadoraModelo();
        
        CalculadoraControlador cont = new CalculadoraControlador(vista,modelo);
        //calculadorControlador2 cont = new calculadorControlador2(vista,modelo);
        cont.iniciar();
    }
    
}
