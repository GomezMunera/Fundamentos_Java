/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacidad;

/**
 *
 * @author johna
 */
public class ArrayCapacidad {
    
    private int tamano, capacidad;
    private String[] nombres;
    
    public ArrayCapacidad(int capacidad){
        this.capacidad = capacidad;
        nombres = new String[capacidad];
        tamano = 0;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public int getTamano(){
        return tamano;
    }
    
    // imprimir
    public void print(){
        for (int pos=0;pos < tamano; pos++){
            System.out.printf("%4d:%s%n", pos, nombres[pos]);
        }
    }
    
    //buscar, funciona también indexOf
    public void search(String name){
        boolean encontrado = false;
        for(int pos=0;pos < tamano; pos++){
            if(nombres[pos].contains(name)){
                encontrado = true;
                System.out.printf("Encontrado %s en la posición %d%n", nombres[pos],pos);
            }
        }
        
        if(!encontrado){
            System.out.println("No encontrado");
        }
    }
    
    // agregar dato
    public void add(String name){
        if(tamano < capacidad){
            nombres[tamano++] = name;
        }else{
            System.out.println("Almacenamiento lleno");
        }
    }
    
    public void remove(int index){
        if(index >=0 & index < tamano){
            nombres[index] = nombres[--tamano];
        }else{
            System.out.println("La posición especificada no existe");
        }
    }
    
}
