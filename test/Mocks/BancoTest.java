/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mocks;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrador1
 */
public class BancoTest {       

    @Test
    public void testSetNombreBanco() {
        new MockUp<Banco>()
        {
            @Mock
            public void $init()
            {
                
            }                           
            
            @Mock
            public void $init(String name)
            {
                System.out.println("Estoy en constructo con parámetros");
            }
            
            @Mock
            public String getPersona(int numCuenta)
            {
                if(numCuenta==10) return "Dimitri Garza";
                if(numCuenta==5) return "Rodrigo Nájera";
                else 
                    return null;
            }
            
        };
    
        Banco b = new Banco();
        assertEquals("nombre banco vacío", null, b.getNombreBanco());
        Banco b2 = new Banco("cualquiera");
        assertEquals("nombre banco vacío", null, b2.getNombreBanco());
        
        assertEquals("cuenta 10", "Dimitri Garza", b.getPersona(10));
        assertEquals("cuenta 5", "Rodrigo Nájera", b.getPersona(5));
        assertEquals("valor indefinido", null, b.getPersona(15));
    }
    
    
}
