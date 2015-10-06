/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diccionario;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author administrador1
 */
public class Diccionario {
    int maxSize = 10;
    private List<Palabra> lista;
    
    public void agregar()
    {   
        if(!(lista.size() >= maxSize))           
        {
            Palabra laPalabra = new Palabra();
            System.out.println("Escibe la palabra a ingresar: ");
            Scanner s = new Scanner(System.in);        
            String palabra = s.next();
            laPalabra.setDescripcion(palabra);
            System.out.println("Escibe la definiciòn: ");
            String definicion = s.next();        
            laPalabra.setDescripcion(definicion);
            /*while(!definicion.equals("-1"))
            {

                s.reset();
                definicion = s.nextLine();
                if(definicion != "-1")
                {
                    laPalabra.significados.add(definicion);
                }
            }*/
            System.out.println("Escibe la palabra la procedencia de la palabra: ");
            laPalabra.setProcedencia(s.next());

            lista.add(laPalabra);        
        }
        else
        {
            throw new LimitExceededException();
        }
    }
          
    public static void main(String[] args) {
        Diccionario d = new Diccionario();
        d.agregar();
    }
}
