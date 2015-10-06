/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrador1
 */
public class TestInputAndOutputTest {
    
   
    @Test
    public void testLeer() throws Exception {
        TestInputAndOutput clasePrueba = new TestInputAndOutput();
        byte[] datos = "esta es una simulación de lectura de archivos ".getBytes();
        
        InputStream is = new ByteArrayInputStream(datos);
        
        clasePrueba.leer(is);
        
        assertEquals("Cadea Leída", "esta", clasePrueba.lista.get(0));
        assertEquals("Cadea Leída", "es", clasePrueba.lista.get(1));
        assertEquals("Cadea Leída", "una", clasePrueba.lista.get(2));        
        assertEquals("Cadea Leída", "simulación", clasePrueba.lista.get(3));
        assertEquals("Cadea Leída", "de", clasePrueba.lista.get(4));
        assertEquals("Cadea Leída", "lectura", clasePrueba.lista.get(5));
        assertEquals("Cadea Leída", "de", clasePrueba.lista.get(6));
        assertEquals("Cadea Leída", "archivos", clasePrueba.lista.get(7));
        
    }
        

    @Test
    public void testEscribir() throws IOException {
        TestInputAndOutput clasePrueba = new TestInputAndOutput();
        clasePrueba.lista.add("este");
        clasePrueba.lista.add("es");
        clasePrueba.lista.add("un");
        clasePrueba.lista.add("ejemplo");
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        clasePrueba.escribir(baos);
        
        assertEquals("texto leído", "este es un ejemplo ", baos.toString());
        
    }
    
}
