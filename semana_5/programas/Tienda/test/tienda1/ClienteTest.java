/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda1;

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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente("Juan");
        String expResult = "Juan";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Cliente.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprar method, of class Cliente.
     */
    @Test
    public void testComprar_0args() {
        System.out.println("comprar");
        Cliente instance = new Cliente();
        instance.comprar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProd method, of class Cliente.
     */
    @Test
    public void testAgregarProd() {
        System.out.println("agregarProd");
        Cliente instance = new Cliente();
        instance.agregarProd();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprar method, of class Cliente.
     */
    @Test
    public void testComprar_ProductoArr() {
        System.out.println("comprar");
        Producto[] lista = null;
        Cliente instance = new Cliente();
        Factura expResult = null;
        Factura result = instance.comprar(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprarCredito method, of class Cliente.
     */
    @Test
    public void testComprarCredito() {
        System.out.println("comprarCredito");
        Producto[] lista = null;
        Cliente instance = new Cliente();
        Factura expResult = null;
        Factura result = instance.comprarCredito(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PagarCredito method, of class Cliente.
     */
    @Test
    public void testPagarCredito() {
        System.out.println("PagarCredito");
        double pago = 0.0;
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.PagarCredito(pago);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
