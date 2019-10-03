/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model.entity;

/**
 *
 * @author Carlos Longobardi
 */
public class Proveedor {
    private long idProv;
    private String descripcion;

    public Proveedor(long idProv, String descripcion) {
        this.idProv = idProv;
        this.descripcion = descripcion;
    }

    public long getIdProv() {
        return idProv;
    }

    public void setIdProv(long idProv) {
        this.idProv = idProv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
