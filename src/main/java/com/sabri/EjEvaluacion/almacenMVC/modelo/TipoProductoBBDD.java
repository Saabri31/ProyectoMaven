/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.EjEvaluacion.almacenMVC.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author todbolsa
 */
public class TipoProductoBBDD {

    public ArrayList cargarTipos() {
        ArrayList<TipoProducto> listaTipos = new ArrayList();
        try (Connection con = ConexionBBDD.conectarBBDD()) {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tiposproducto");
            while (rs.next()) {
                listaTipos.add(new TipoProducto(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoProductoBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTipos;
    }

}
