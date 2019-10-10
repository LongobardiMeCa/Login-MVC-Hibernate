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
public class Zona {
    private long id_Zona;
    private String descrip_Zona;

    public Zona(long id_Zona, String descrip_Zona) {
        this.id_Zona = id_Zona;
        this.descrip_Zona = descrip_Zona;
    }

    public long getId_Zona() {
        return id_Zona;
    }

    public void setId_Zona(long id_Zona) {
        this.id_Zona = id_Zona;
    }

    public String getDescrip_Zona() {
        return descrip_Zona;
    }

    public void setDescrip_Zona(String descrip_Zona) {
        this.descrip_Zona = descrip_Zona;
    }
    
}
