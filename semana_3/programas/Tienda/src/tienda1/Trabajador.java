
package tienda1;

import java.util.ArrayList;
import java.util.Scanner;


public class Trabajador extends Persona {
    
    public ArrayList<Producto> misProd = new ArrayList<>();
    public String nombre="NULO";

    public void agregarProd(){
        System.out.println("El trabajador");
        Scanner nombreP = new Scanner(System.in);
        System.out.println("Ingrese el nombre del nuevo producto: ");
        String inputP=nombreP.next();
        Producto miprod = new Producto(inputP);
        misProd.add(miprod);    
        
    }

}

