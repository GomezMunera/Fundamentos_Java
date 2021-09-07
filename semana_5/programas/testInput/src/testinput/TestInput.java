
package testinput;
import java.util.Scanner;

public class TestInput {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.next());
        
        scanner.close();
    }
    
    public static void menor(){
        Scanner scanner = new Scanner(System.in);      
        if(scanner.nextInt()>5){
            System.out.print("El número es mayor que 5");
            scanner.close(); 
        }else{
            System.out.print("El número es menor que 5");
            scanner.close(); 
        }
    }
    
    
}
