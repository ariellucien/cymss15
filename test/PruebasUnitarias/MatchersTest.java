/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Matcher;
import org.hamcrest.BaseMatcher;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.endsWith;
import org.hamcrest.Description;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 *
 * @author administrador1
 */
public class MatchersTest {
    
    public static Matcher matchesEqual(final Object actual)
    {
        return new BaseMatcher()
                {
                    private Object theExpected;
                    @Override
                    public boolean matches(Object expected) {
                        theExpected = expected;
                        return actual.equals(expected);
                    }

                    @Override
                    public void describeTo(Description d) {
                        d.appendText("el valor actual es: " + actual.toString());
                    }
                };
    }
    
    
    @Test
    public void testSomeMethod()
    {
        Matchers m = new Matchers();
        
        assertThat(m.array[0], startsWith("texto"));
        assertThat(Arrays.asList(m.array), everyItem(startsWith("t")));
        assertThat(Arrays.asList(m.array), everyItem(containsString("t")));
        
        Vector<String> v = new Vector<String>();
        v.add("texto 1");
        v.add("texto 2");
        
        List<String> l = new ArrayList<String>();
        l.add("texto 1");
        l.add("texto 2");
        
        assertThat(v, hasItem("texto 2"));
        assertThat(l, hasItems("texto 1", "texto 2"));
        assertThat(Arrays.asList(m.array), hasItems("texto 5", "texto 3"));
        
        assertThat("este es un texto ejemplo", allOf(startsWith("e"), endsWith("o"), containsString("t")));
        
        assertThat("texto", matchesEqual("texto"));
        
    }
    
}
