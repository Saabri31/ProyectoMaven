/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.modelo.dao;

import com.sabri.practicaBocateria.modelo.entidades.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 */
public class ProductoDAO {

    public Producto selectBebidas() {
        Producto producto = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM bebidas";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                producto = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return producto;
    }

    public Producto selectBocadillos() {
        Producto producto = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM bocadillos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                producto = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return producto;
    }

    public Producto selectOtros() {
        Producto producto = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM otros";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                producto = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return producto;
    }
}
