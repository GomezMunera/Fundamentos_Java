/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johna
 */
public class CuentaBancariaTest {
    
    public CuentaBancariaTest() {
    }

    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CuentaBancaria instance = new CuentaBancaria();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeposito() {
        System.out.println("deposito");
        double saldo = 0.0;
        CuentaBancaria instance = new CuentaBancaria();
        instance.deposito(saldo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransferencia_CuentaBancaria() {
        System.out.println("transferencia");
        CuentaBancaria origen = null;
        CuentaBancaria instance = new CuentaBancaria();
        instance.transferencia(origen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransferencia_CuentaBancaria_double() {
        System.out.println("transferencia");
        CuentaBancaria origen = null;
        double valor = 0.0;
        CuentaBancaria instance = new CuentaBancaria();
        instance.transferencia(origen, valor);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransferencia_CuentaBancaria_CuentaBancaria() {
        System.out.println("transferencia");
        CuentaBancaria destino1 = null;
        CuentaBancaria destino2 = null;
        CuentaBancaria instance = new CuentaBancaria();
        instance.transferencia(destino1, destino2);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransferencia_3args() {
        System.out.println("transferencia");
        CuentaBancaria destino1 = null;
        CuentaBancaria destino2 = null;
        double valor = 0.0;
        CuentaBancaria instance = new CuentaBancaria();
        instance.transferencia(destino1, destino2, valor);
        fail("The test case is a prototype.");
    }
    
}
