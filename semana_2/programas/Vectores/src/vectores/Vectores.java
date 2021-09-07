/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author johna
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = {1,2,3,4,5};
        
        System.out.println("tamaño: "+vector.length);
        
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
        
        System.out.println("2 posición "+vector[1]);
        
        int[] vector1;
        vector1 = new int[6];
        
        vector1[0] = 9;
        vector1[1] = 8;
        
        for(int i=2;i<vector1.length;i++){
            System.out.println(vector1[i]);
        }
        
        for(int item : vector1){
            System.out.println(item);
        }
        
        // vector String
        String[] textos = {"hola","de","nuevo"};
        
        System.out.println("tamaño texto: "+ textos.length);
        System.out.println("última: "+ textos[2]);
        
    }
    
    
    
}
