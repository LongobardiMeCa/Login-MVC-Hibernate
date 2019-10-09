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
public class Presentacion {
    private long id_Present;
    private String descrip_Present;

    public Presentacion(long id_Present, String descrip_Present) {
        this.id_Present = id_Present;
        this.descrip_Present = descrip_Present;
    }

    public long getId_Present() {
        return id_Present;
    }

    public void setId_Present(long id_Present) {
        this.id_Present = id_Present;
    }

    public String getDescrip_Present() {
        return descrip_Present;
    }

    public void setDescrip_Present(String descrip_Present) {
        this.descrip_Present = descrip_Present;
    }
    
}
