package com.demo.model.persistencia;
// Generated 26-sep-2019 11:39:24 by Hibernate Tools 4.3.1
/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {
     private Integer id;
     private String email;
     private String clave;
     private String apellidos;
     private String nombres;
     private int tipo;

    public Usuario() {
    
    }

    public Usuario(String email, String clave, String apellidos, String nombres, int tipo) {
       this.email = email;
       this.clave = clave;
       this.apellidos = apellidos;
       this.nombres = nombres;
       this.tipo = tipo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}


