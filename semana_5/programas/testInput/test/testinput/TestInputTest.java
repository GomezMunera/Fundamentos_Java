
package testinput;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Scanner;

import org.junit.*;

public class TestInputTest {
    Scanner scanner;
    
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;
    
    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {
        final String testString = "Hello!";
        provideInput(testString);

        TestInput.main(new String[0]);
        scanner = new Scanner(System.in);

        assertEquals(testString, getOutput());
    }
            
        @Test
        public void menor(){
            final String testNum = "4";
            provideInput(testNum);
            
            TestInput.menor();
            
            assertEquals("El número es menor que 5", getOutput());  
        }
        
            /*
    @Test 
        public void tesp(){
        String data = "Hello, World!\r\n";
        InputStream stdin = System.in;
        try {
          System.setIn(new ByteArrayInputStream(data.getBytes()));
          Scanner scanner = new Scanner(System.in);
          System.out.println(scanner.nextLine());
        } finally {
          System.setIn(stdin);
          
          assertEquals(data, testOut.toString());
        }
    }*/
    
}
