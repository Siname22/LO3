/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumarPar method, of class Operaciones.
     */
    @Test
    public void testSumarPar() {
        System.out.println("testSumarPar");
        int a = 4;
        int b = 6;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);

    }
    @Test
    public void test2SumarPar() {
        System.out.println("test2SumarPar");
        int a = 4;
        int b = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);

    }
    @Test
    public void test3SumarPar() {
        System.out.println("test3SumarPar");
        int a = -6;
        int b = -4;
        Operaciones instance = new Operaciones();
        int expResult = -10;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);

    }
    @Test    
    public void test4SumarPar() {
        System.out.println("test4SumarPar");
        int a = 4;
        int b = 4;
        Operaciones instance = new Operaciones();
        int expResult = 8;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);

    }
    
    
    
    /**
     * Test of mayor method, of class Operaciones.
     */
    @Test
    public void testMayor() {
        System.out.println("testMayor");
        int a = 4;
        int b = 0;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);

    }
    @Test
    public void test2Mayor() {
        System.out.println("test2Mayor");
        int a = 0;
        int b = 4;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);

    }
    @Test
    public void test3Mayor() {
        System.out.println("test3Mayor");
        int a = 0;
        int b = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
                
    }    
    
    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Test
    public void testSumarVector() {
        System.out.println("testSumarVector");
        int[] numeros = {1,2,3,4,5};
        Operaciones instance = new Operaciones();
        int expResult = 15;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);

    }
}
