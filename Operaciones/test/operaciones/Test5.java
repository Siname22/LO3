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
public class Test5 {
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
    
}
