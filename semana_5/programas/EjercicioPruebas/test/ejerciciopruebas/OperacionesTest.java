/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johna
 */
public class OperacionesTest {
    Operaciones operacion;
    double num1,num2;
    
    public OperacionesTest() {
    }
    
    @Before
    public void setUp() {
        operacion = new Operaciones();
        num1 = 25.0;
        num2 = 30;
    }
    
    @After
    public void tearDown() {
        num1=0;
        num2=0;
        operacion = null;
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        double expResult = 55.0;
        double result = operacion.sumar(num1, num2);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        double expResult = -5;
        double result = operacion.restar(num1, num2);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }
    
    
    
}
