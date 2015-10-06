package PruebasUnitarias;

import java.util.ArrayList;
import java.util.List;
import java.lang.CloneNotSupportedException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaEmpleados implements Cloneable
{
    List<Empleado> listaEmpleados;
    
    public ListaEmpleados(int size) throws MaxArraySizeException
    {
        if(size < 0)
        {
            throw new NegativeArraySizeException();
            
        }
        if(size >= 1000)
        {
            throw new MaxArraySizeException("el tamaño máximo es 1000");
        }
    }
    
    public int getSize()
    {
        return listaEmpleados.size();
    }
    
    public ListaEmpleados()
    {
        listaEmpleados = new ArrayList<Empleado>();
    }
    
    public void add(Empleado e)
    {
        if(e == null)
            System.out.println("No se pueden agregar empleados sin datos");
        else            
            listaEmpleados.add(e);
    }
    
    public Empleado get(int i)
    {
        return listaEmpleados.get(i);
    }
    
    public void imprimir()
    {                       
        for(int i=0; i<listaEmpleados.size(); i++)
        {
            listaEmpleados.get(i).print();
        }
        
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ex) {
            
        }
    }
    
    public Object clone() throws CloneNotSupportedException
    {
        ListaEmpleados lista = new ListaEmpleados();
        for(int i=0; i<listaEmpleados.size(); i++)
        {
            lista.add(listaEmpleados.get(i));  
        }
        return lista;
    }
    
    public static void main(String[] args)
    {
        Empleado e = new Empleado();
        e.setNombre("mix");
        e.setId(10);
        e.setDireccion("puebla 22");
        e.setTelefono(12213);
        
        ListaEmpleados l = new ListaEmpleados();
        l.add(e);
        
        try
        {
            ListaEmpleados lcopia = (ListaEmpleados)l.clone();
            lcopia.add(e);
            lcopia.imprimir();
            l.imprimir();
            
        }catch(Exception ee)
        {
            System.out.println("no se pudo clonar");  
        }
    }
}