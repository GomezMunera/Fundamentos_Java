package arreglos;

import java.util.ArrayList;
public class Arreglos {
//public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static void main(String[] args) {
        // arreglos dinámicos con objetos
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto nombre1 = new Producto();
        nombre1.nombre = "Pan";
        
        Producto nombre2 = new Producto();
        nombre2.nombre = "Café";
        
        Producto nombre3 = new Producto();
        nombre3.nombre = "Azucar";
        

        productos.add(nombre1);
        productos.add(nombre2);
        productos.add(nombre3);
        for(Producto item:productos){
            System.out.printf("el producto es %s%n",item.getProducto());
        }
        productos.remove(0);
        System.out.println(productos.get(0));   
    }
}

       /* 
        // declaración de arreglos
        ArrayList<Integer> precio = new ArrayList<Integer>();
        precio.add(30);
        precio.add(40);
        precio.add(50);
        precio.remove(2);
        precio.add(60);
        precio.remove(0);
        precio.add(70);
        precio.set(0, Integer.SIZE);
        
        System.out.println("Precio 1: " + precio.get(1));
        System.out.println("Precio 1: " + precio.get(0));
    }   
}*/
