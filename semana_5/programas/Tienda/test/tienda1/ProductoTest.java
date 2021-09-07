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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of PonerPrecio method, of class Producto.
     */
    @Test
    public void testPonerPrecio() {
        System.out.println("PonerPrecio");
        int precio = 10;
        Producto instance = new Producto("pan");
        instance.PonerPrecio(precio);
        double resultado = instance.precio;
        assertEquals("pasa",10.0,resultado,0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CambiarLugar method, of class Producto.
     */
    @Test
    public void testCambiarLugar_String() {
        System.out.println("CambiarLugar");
        String nuevoLugar = "lugar2";
        Producto instance = new Producto("pan");
        instance.CambiarLugar(nuevoLugar);
        String resultado = instance.lugar;
        assertSame(nuevoLugar, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CambiarLugar method, of class Producto.
     */
   

    /**
     * Test of PonerIva method, of class Producto.
     */
    @Test
    public void testPonerIva() {
        System.out.println("PonerIva");
        double nIva = 0.19;
        Producto instance = new Producto("pan");
        instance.PonerIva(nIva);
        assertEquals("hola", instance.IVA, nIva, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
