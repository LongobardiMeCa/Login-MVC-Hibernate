/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.demo.model.entity.Usuario;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * package com.demo.model;

import com.demo.model.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModeloUsuario extends Model {

    static String recuclave;

    static public boolean logIn(Usuario user) {
        int resultado = 0;
        conexionMySQL connect = new conexionMySQL();
        boolean bandera = false;
        try {
            Statement st;
            ResultSet result;

            String sql = "select * from usuario where email='" + user.getEmail() + "' and contraseña='" + user.getClave() + "'";
            st = connect.con.createStatement();
            result = st.executeQuery(sql);
            if (result.next()) {
                resultado = 1;

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Acceso permitido a " + user.getEmail());
                    bandera = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return bandera;

    }

    static public boolean LogUp(Usuario user) {
        boolean regis = false;
        conexionMySQL registrar = new conexionMySQL();
        Connection cc = registrar.getConnection();
        String sql = "insert into usuario(nom_user,ape_pater_user,ape_mater_user,contraseña,email)values ('" + user.getNombre() + "','" + user.getape_pater() + "','" + user.getape_mater() + "','" + user.getClave() + "','" + user.getEmail() + "')";
        try {
            PreparedStatement pst = registrar.con.prepareStatement(sql);
//            pst.setString(1,""+user.getNombre());
//            pst.setString(2,""+user.getape_pater());
//            pst.setString(3,""+user.getape_mater());
//            pst.setString(4,""+user.getClave());
//            pst.setString(5,""+user.getEmail());
            pst.execute();
            regis = true;
        } catch (Exception e) {
        }
        return regis;
    }

    static public String LogRecu(Usuario user) {
        String recuclave = "";
        conexionMySQL registrar = new conexionMySQL();
        Connection cc = registrar.getConnection();
        int resultado;
        try {
            Statement st;
            ResultSet result;
            String sql = "Select contraseña from usuario where email='" + user.getEmail() + "'";
            st = registrar.con.createStatement();
            result = st.executeQuery(sql);
            if (result.next()){
                resultado = 1;
                if (resultado == 1) {
                    recuclave = result.getString(resultado);
                } else {
                    recuclave = "Error";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return recuclave;
    }
}

 * @author whiston
 */
public class ModeloUsuario extends Model {
    
    static public boolean logIn(Usuario user){
        boolean band= false;
        Session session = null;
        try{
            
            //creamos el objeto factory de hibernate
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();

            //armamos la consulta HQL
            String HQL_QUERY ="from Usuario user where user.email = :userEmail and user.clave = :userClave";
            org.hibernate.Query query = session.createQuery(HQL_QUERY);
            //Preparar query statement
            query.setParameter("userEmail",user.getEmail());
            query.setParameter("userClave", user.getClave());
            
            System.out.println("Reading values");
            for(Iterator it=query.iterate();it.hasNext();){
                com.demo.model.persistencia.Usuario usuario = (com.demo.model.persistencia.Usuario) it.next();
                System.out.println(usuario.getEmail());
                band = true;
            }
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
        
        
        
        
        /*if(user.getEmail().compareTo("admin@gmail.com") == 0 &&
                user.getClave().compareTo("123456") == 0){
            band = true;
        }else{
            band = false;
        }*/
        
        return band;
    }
    
}
