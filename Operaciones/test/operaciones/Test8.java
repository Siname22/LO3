/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rayug
 */
public class Test7 {
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
