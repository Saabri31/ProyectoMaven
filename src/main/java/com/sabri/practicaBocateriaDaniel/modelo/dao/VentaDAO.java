/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.practicaBocateriaDaniel.modelo.dao;

import com.sabri.practicaBocateriaDaniel.modelo.entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author danip
 *
 * CRUD (insert, select, update, delete)
 *
 */
// public static int contador;
public class VentaDAO {

    public int insertVenta(int id, LocalDateTime fechaHora, String empleado, HashMap<String, Integer> productos, int total) {
        int venta = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlInsert = "INSERT INTO transacciones(id,Fecha/Hora,Empleado,Productos,total) VALUES(id,fechaHora,empleado,prodcutos,total)";
            PreparedStatement ps = con.prepareCall(sqlInsert);
            venta = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        return venta;
    }

    //int id,LocalDateTime fechaHora, String empleado, HashMap<String, Integer> productos,double total
    public Venta selectVenta() {
        Venta venta = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM transacciones";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                venta = new (rs.getInt(1), rs.getDate(2), rs.getString(3), rs.get(4), rs.getInt(5));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        venta.imprimirTicket();
        return venta;
    }

    public String mostrarVentasAcumuladasMes() {
        System.out.println("Hola?");
        Venta venta = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM encuesta";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);

            if (rs.next()) {
                venta = new Venta(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.get(4), rs.getInt(5));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        return venta.toString();
    }

}
