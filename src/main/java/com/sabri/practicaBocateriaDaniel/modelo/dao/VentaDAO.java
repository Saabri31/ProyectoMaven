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
}
