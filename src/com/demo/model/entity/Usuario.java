package com.demo.model.entity;

public class Usuario {
    private long id;
    private String email;
    private String clave;
    private String ape_pater;
    private String ape_mater;
    private String nombre;
    private int tipo;
    private String claveRecupe;

    public Usuario(long id, String email, String clave, String ape_pater, String ape_mater, String nombre, int tipo, String claveRecupe) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.ape_pater = ape_pater;
        this.ape_mater = ape_mater;
        this.nombre = nombre;
        this.tipo = tipo;
        this.claveRecupe = claveRecupe;
    }

    public Usuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }
    public Usuario(String nom, String ape_pater,String ape_mater,String email,String clave){
        this.nombre=nom;
        this.ape_pater=ape_pater;
        this.ape_mater=ape_mater;
        this.email=email;
        this.clave=clave;
    }
    public Usuario (String email){
        this.email=email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getape_pater() {
        return ape_pater;
    }

    public void setape_pater(String ape_pater) {
        this.ape_pater = ape_pater;
    }

    public String getape_mater() {
        return ape_mater;
    }

    public void setape_mater(String ape_mater) {
        this.ape_mater = ape_mater;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getclaveRecupe() {
        return claveRecupe;
    }

    public void setclaveRecupe(String claveRecupe) {
        this.claveRecupe = claveRecupe;
    }
    
    
    
}
