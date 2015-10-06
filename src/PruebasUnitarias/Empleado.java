/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

/**
 *
 * @author administrador1
 */
public class Empleado {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setNombre(String id)
    {
        this.nombre = id;
    }
    
    
    public void setDireccion(String id)
    {
        this.direccion = id;
    }
    
    public void setTelefono(int id)
    {
        this.telefono = id;
    }
    
    public void print()
    {
        System.out.println("Nombre: " + nombre);
    }
}
