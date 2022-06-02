/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.modelo.dao;

import com.sabri.practicaBocateria.modelo.entidades.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 */
public class TicketDAO {

    public Ticket selectResultados() {
        Ticket ticket = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                ticket = new Ticket(rs.getInt(1), rs.getTimestamp(2), rs.getString(3), rs.getDouble(4));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return ticket;
    }

    //INSERT INTO `ventas` (`id_venta`, `fecha`, `empleado`, `totalVenta`) VALUES
    //(1, '2022-05-01', 'E1', '25.50'),
    public int insertRespuesta(boolean si, boolean no, boolean ns) {
        int resultado = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlInsert = "";

            sqlInsert = "INSERT INTO ventas (fecha, empleado, totalVenta) VALUES"
                    + "(fechaHora, empleado, totalVenta)";

            PreparedStatement ps = con.prepareCall(sqlInsert);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return resultado;
    }
}
