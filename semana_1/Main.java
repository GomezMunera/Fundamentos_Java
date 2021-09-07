/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usando el  caracter de unicode
        System.out.println("\\ Quoted from Huckleberry Finn\\ ");
        System.out.println("I broke in and says:");
        System.out.println("\" They ’re in an awful peck of trouble , and\"");
        
        // imprimiendo un isoceles
        System.out.println( "       /\\ " ); // line 1
        System.out.println( "      /  \\" ); // line 2
        System.out.println( "     /    \\"); // line 3
        System.out.println( "    /      \\" ); // line 4
        System.out.println( "   /        \\" ); // line 5
        System.out.println( "  /          \\" ); // line 6
        System.out.println( " /____________\\" ); // line 7
        
        // imprimiendo string y números(int y double)
        System.out.print( "Rank number " );
        System.out.print( 1 );
        System.out.print( " in my all -time favorite NFL QB list is " );
        System.out.print( "Steve Young" );
        System.out.println( "." );
        System.out.print( "His overall quarterback rating is " );
        System.out.print( 96.8 );
        System.out.println( "." );
        
        int month = 12;
        int millisecondsInDay = 24*60*60*1000;
        long date = ((month - 1L)*30 + 15)*millisecondsInDay;
        System.out.format("%tB", date);
        System.out.println("\n");
        
    }
    
}
