/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mocks;

/**
 *
 * @author administrador1
 */
public class Banco {

    private String nombreBanco;

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }    
    
    public Banco() {
        nombreBanco = "Patito";
    }

    public Banco(String nombre) {
        nombreBanco = nombre;
    }
    
    public String getPersona(int num_cuenta)
    {
        return null;
    }
}
