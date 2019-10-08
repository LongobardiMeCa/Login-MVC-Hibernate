/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;


public class ControllerLogin extends Controller {
    
    public ControllerLogin(){
    
    }
    
    public boolean logIn(String email, String clave){
       boolean band;
        Usuario user= new Usuario(email, clave);
        band = ModeloUsuario.logIn(user);
        return band;
    }
    
    
    public boolean logUp(String nom, String apePater, String apeMater,String email, String clave){
       boolean status=true;
//        Usuario envio = new Usuario(nom,apePater,apeMater,email,clave);
//        status=ModeloUsuario.LogUp(envio);
        return status;
    }
    
    public String RecuperarClave(String email){
        String clave="";
//        Usuario recu = new Usuario(email);
//        clave=""+ModeloUsuario.LogRecu(recu);
        return clave;
    }
    
}
