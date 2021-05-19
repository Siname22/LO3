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
public class Test3 {
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
}
