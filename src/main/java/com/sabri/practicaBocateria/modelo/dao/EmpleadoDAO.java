/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.modelo.dao;

import com.sabri.practicaBocateria.modelo.entidades.Empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 */
public class EmpleadoDAO {

    public Empleado selectResultados() {
        Empleado empleado = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                empleado = new Empleado(rs.getString(1), rs.getString(2), rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return empleado;
    }

}
