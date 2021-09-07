/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author johna
 */
public class Inventario {
    private int size, capacity;
    private String[] names;
    private double[] price;
    
    public Inventario(int capacity){
        this.capacity = capacity;
        this.names = new String[capacity];
        this.price = new double[capacity];
        size = 0;
    }
    
    public int getCapacity(){
        return size;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void print(){
        int pos;
        for(pos=0;pos<size;pos++){
            System.out.printf("%-20d:%-20s:%.0f%n",pos,this.names[pos],this.price[pos]);
        }
    }
    
    // INGRESAR ELEMENTO
    public void add(String name, double price){
        if(this.size < this.capacity){
            this.names[this.size] = name;
            this.price[this.size++] = price;
        }else{
            System.out.println("Almacenamiento lleno");
        }
    }
    
    // QUITAR ELEMENTO
    public void remove(int index){
        if(index >=0 && index < size){
            names[index]=names[--size];
            price[index] = price[size];
        }else{
            System.out.println("No existe la posición");
        }
    }
    
    // BUSCAR ELEMENTO
    public void search(String name){
        boolean find = false;
        for(int pos=0;pos<size;pos++){
            if(names[pos].contains(name)){
                find = true;
                System.out.printf("El elemento %s se encontro en la posición %d%n",name,pos);
                break;
            }
        }
        
        if(!find){
            System.out.println("Elemento no encontrado");
        }   
    } 
}
