/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author administrador1
 */
public class TestInputAndOutput {
    public List<String> lista = new ArrayList();
    
    public void leer(InputStream is) throws IOException
    {
        StringBuilder s = new StringBuilder();
        int caracter = is.read();
        while(caracter != -1)
        {
            if(caracter != ' ')
            {
                s.append((char)caracter);
            }
            else
            {
                lista.add(s.toString());
                s.delete(0, s.length());
            }
            caracter = is.read();
        }
    }
    
    public void escribir(OutputStream os) throws IOException
    {      
        for(Iterator it = lista.iterator(); it.hasNext();)
        {
            os.write(((String)it.next()).getBytes());
            os.write(' ');
        }
    }
}
