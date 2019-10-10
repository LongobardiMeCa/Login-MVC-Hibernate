/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model.persistencia;

import java.io.Serializable;

/**
 *
 * @author Carlos Longobardi
 */
public class Marca implements Serializable{
    private long id_Marca;
    private String descrip_Marca;

    public Marca(long id_Marca, String descrip_Marca) {
        this.id_Marca = id_Marca;
        this.descrip_Marca = descrip_Marca;
    }

    public long getId_Marca() {
        return id_Marca;
    }

    public void setId_Marca(long id_Marca) {
        this.id_Marca = id_Marca;
    }

    public String getDescrip_Marca() {
        return descrip_Marca;
    }

    public void setDescrip_Marca(String descrip_Marca) {
        this.descrip_Marca = descrip_Marca;
    }
    
    
}
