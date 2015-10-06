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
public class NumerosTest {
    int a;
    int b;
    int c;
    
    public NumerosTest(int a, int b, int c)
    {
        this.a = a; this.b = b; this.c = c;
    }
    
    @Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]{{1,2,3}, {18,22,31}, {11,12,123}};
        return Arrays.asList(data);
    }
    
    @Test
    public void testMultiplicacion()
    {
        Numeros n = new Numeros();
        System.out.println("a: " + a + "  b: " + b + "  c: " + c );
        assertEquals("multiplicación: ", a*b*c, n.multiplicar(a, b, c));
    }
}
