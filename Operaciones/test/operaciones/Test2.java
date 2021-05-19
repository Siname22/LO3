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
public class Test2 {
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
}
