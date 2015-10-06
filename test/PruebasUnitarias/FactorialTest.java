/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author administrador1
 */
@RunWith(Parameterized.class)
public class FactorialTest {
    int expected;
    int actual;
            
    public FactorialTest(int actual, int expected) 
    {
        this.expected = expected;
        this.actual = actual;
    }
                
    @Parameters
    public static Collection<Object[]> data()
    {
        Object[][] a = new Object[][]{{1,1},{2,2},{3,6},{4,24},{5,120},{6,720},{7,5040},{8,40320},{9,362880},{10,3628800}};
        return Arrays.asList(a);
    }
    /**
     * Test of multiplicar method, of class Numeros.
     */
    @Test
    public void testMultiplicar()
    {
        Numeros n = new Numeros();
        System.out.println("valor: " + actual + " resultado esperado: " + expected);
        assertEquals("factorial ", expected, n.factorial(actual));
    }
    
}
