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
public class Producto {
    private long id_Produc;
    private long id_Marca;
    private long id_Present;
    private long id_Provee;
    private long id_Zona;
    private String codigo;
    private String descrip_Produc;
    private double precio;
    private int stock;
    private int iva;
    private double peso;

    public Producto(long id_Produc, long id_Marca, long id_Present, long id_Provee, long id_Zona, String codigo, String descrip_Produc, double precio, int stock, int iva, double peso) {
        this.id_Produc = id_Produc;
        this.id_Marca = id_Marca;
        this.id_Present = id_Present;
        this.id_Provee = id_Provee;
        this.id_Zona = id_Zona;
        this.codigo = codigo;
        this.descrip_Produc = descrip_Produc;
        this.precio = precio;
        this.stock = stock;
        this.iva = iva;
        this.peso = peso;
    }

    public long getId_Produc() {
        return id_Produc;
    }

    public void setId_Produc(long id_Produc) {
        this.id_Produc = id_Produc;
    }

    public long getId_Marca() {
        return id_Marca;
    }

    public void setId_Marca(long id_Marca) {
        this.id_Marca = id_Marca;
    }

    public long getId_Present() {
        return id_Present;
    }

    public void setId_Present(long id_Present) {
        this.id_Present = id_Present;
    }

    public long getId_Provee() {
        return id_Provee;
    }

    public void setId_Provee(long id_Provee) {
        this.id_Provee = id_Provee;
    }

    public long getId_Zona() {
        return id_Zona;
    }

    public void setId_Zona(long id_Zona) {
        this.id_Zona = id_Zona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrip_Produc() {
        return descrip_Produc;
    }

    public void setDescrip_Produc(String descrip_Produc) {
        this.descrip_Produc = descrip_Produc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
