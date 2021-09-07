/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variante2;

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
public class CuentaBancoTest {
    
    public CuentaBancoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of depositar method, of class CuentaBanco.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double c = 30.0;
        CuentaBanco instance = new CuentaBanco();
        instance.depositar(c);
        
        assertEquals(c, instance.getSaldo(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CuentaBanco.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double c = 10.0;
        CuentaBanco instance = new CuentaBanco();
        instance.retirar(c);
        
        assertEquals(0.0, instance.getSaldo(), 0.1);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class CuentaBanco.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CuentaBanco instance = new CuentaBanco();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class CuentaBanco.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 50.0;
        CuentaBanco instance = new CuentaBanco();
        instance.setSaldo(saldo);
        
        assertEquals(saldo, instance.getSaldo(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
