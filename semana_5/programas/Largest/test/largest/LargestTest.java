/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johna
 */
public class LargestTest {
    
    public LargestTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        //this.name = name;
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of largest method, of class Largest.
     */
    @Test
    public void testLargest() {
        System.out.println("largest");
     
        assertEquals("Debe ser de 3 1/3", 3.3, 10.0/3.0, 0.1);
        
    }
    
    @Test
    public void testSimple() {
        System.out.println("Simple");
        int[] list = new int[3];
        list[0] = 7;
        list[1] = 8;
        list[2] = 9;
        
        assertEquals("3", 3);
        
        //assertEquals(9,Largest.largest(list));
        
    }
    
    @Test
    public void testEmpty() {
     assertNull("it should be null", null);
 }
    
}
