
package datastreamexample;


import java.io.FileInputStream;  
import java.io.IOException;
public class DataStreamExample {  
         public static void main(String args[]){    
              try{    
                FileInputStream fin=new FileInputStream("D:\\testout.txt");    
                //int i=fin.read();  
                int i =0;
                 while((i=fin.read())!=-1){    
                System.out.print((char)i);    
                 }
                  System.out.println("");
                fin.close();    
              }catch(IOException e){System.out.println(e);}    
        }    
}  