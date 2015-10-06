package PruebasUnitarias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador1
 */
public class Numeros {
    public int multiplicar(int a, int b, int c)
    {
        return a*b*c;
    }
    public int factorial(int num)
    {   
        int fact = 1;
        for (int i = num; i >=1; i--)
        {
            fact = fact * i;
        }
        return fact;
    }
    
    public static void main(String [] args)
    {
        Numeros n = new Numeros();
        System.out.println(n.factorial(2));
    }
}
