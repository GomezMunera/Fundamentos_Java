package registro;

public class Inventario {
    private int size, capacity;
    private String[] names;
    private int[] quantity;
    
    public Inventario(int capacity){
        this.capacity = capacity;
        this.names = new String[capacity];
        this.quantity = new int[capacity];
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
            System.out.printf("%-20d:%-20s:%d%n",pos,this.names[pos],this.quantity[pos]);
        }
    }
    
    // INGRESAR ELEMENTO
    public void add(String name, int quantity){
        if(this.size < this.capacity){
            this.names[this.size] = name;
            this.quantity[this.size++] = quantity;
        }else{
            System.out.println("Almacenamiento lleno");
        }
    }
    
    // QUITAR ELEMENTO
    public void remove(int index){
        if(index >=0 && index < size){
            names[index]=names[--size];
            quantity[index] = quantity[size];
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
