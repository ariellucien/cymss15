/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diccionario;

import java.util.List;

/**
 *
 * @author administrador1
 */
public class Palabra {
    private String descripcion;
    private String procedencia;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public List<String> significados;

    public String getDescripcion() {
        return descripcion;
    }

    public String getProcedencia() {
        return procedencia;
    }

        
}
