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
    private long id_Provee;
    private String descrip_Provee;

    public Proveedor(long id_Provee, String descrip_Provee) {
        this.id_Provee = id_Provee;
        this.descrip_Provee = descrip_Provee;
    }

    public long getId_Provee() {
        return id_Provee;
    }

    public void setId_Provee(long id_Provee) {
        this.id_Provee = id_Provee;
    }

    public String getDescrip_Provee() {
        return descrip_Provee;
    }

    public void setDescrip_Provee(String descrip_Provee) {
        this.descrip_Provee = descrip_Provee;
    }
    
}
