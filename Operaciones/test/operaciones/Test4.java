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
public class Test4 {
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
}
