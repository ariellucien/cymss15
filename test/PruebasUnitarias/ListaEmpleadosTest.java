/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrador1
 */
public class ListaEmpleadosTest {
    
    public ListaEmpleadosTest() {
    }
    
    @Test(expected=NegativeArraySizeException.class)
    public void testCreacionListaNegativa()
    {
        try 
        {
            System.out.println("Prueba la creación de lista de empleados con número negativo");
            ListaEmpleados l = new ListaEmpleados(-100);
        } catch (MaxArraySizeException ex) 
        {            
        }
    }
    
    @Test
    public void creacionListaEmpleadosExcepciones()
    {
        try
        {
            ListaEmpleados listaNegativa = new ListaEmpleados(10001);
            ListaEmpleados listaMaxSize = new ListaEmpleados(-900);        
            fail("no se lanzaron las excepciones");
        }
        catch(Exception e)
        {
            System.out.println("le excepcion: " + e.toString());
        }
    }
    
    /**
     * Test of add method, of class ListaEmpleados.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Empleado e = new Empleado();
        e.setId(1);
        e.setNombre("Chuy");
        e.setTelefono(123213);
        e.setDireccion("calle des Poblada");        
        ListaEmpleados instance = new ListaEmpleados();
        int contadorInicial = instance.getSize();
        instance.add(e);
        assertEquals(contadorInicial+1, instance.getSize());                                
    }

    /**
     * Test of get method, of class ListaEmpleados.
     */
    @Test
    public void testGet() {
        System.out.println("Prueba método que devuelve un empleado de la lista");        
        
        ListaEmpleados instance = new ListaEmpleados();
        
        Empleado e = new Empleado();
        e.setId(1);
        e.setNombre("Chuy");
        e.setTelefono(123213);
        e.setDireccion("calle des Poblada"); 
        
        Empleado e2 = new Empleado();
        e2.setId(1);
        e2.setNombre("Chawi");
        e2.setTelefono(123213);
        e2.setDireccion("calle des Poblada"); 
        
        instance.add(e);
        instance.add(e2);
        
        int pos = instance.getSize()-1;
        Empleado obtenido = instance.get(pos);
        assertSame("no son objetos iguales", e2, obtenido);
        
    }

    /**
     * Test of imprimir method, of class ListaEmpleados.
     */
    @Test(timeout=10000)
    public void testImprimir() {
        ListaEmpleados lista = new ListaEmpleados();
        lista.imprimir();
    }

    /**
     * Test of clone method, of class ListaEmpleados.
     */
    @Test
    public void testClone() throws Exception {
        ListaEmpleados l = new ListaEmpleados();
        
        Empleado e2 = new Empleado();
        e2.setId(1);
        e2.setNombre("Chawi");
        e2.setTelefono(123213);
        e2.setDireccion("calle des Poblada"); 
        
        l.add(e2);
        
        ListaEmpleados copia = (ListaEmpleados)l.clone();
        for(int i=0; i<copia.getSize(); i++)
            assertEquals("los objetos no son iguales", l.get(i), copia.get(i));
    }  
}
