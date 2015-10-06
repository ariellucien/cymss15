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
public class MaxArraySizeException extends Exception{
    public MaxArraySizeException(String message)
    {        
        super(message);
    }
    
    public MaxArraySizeException(Throwable causa)
    {
        super(causa);
    }
}
