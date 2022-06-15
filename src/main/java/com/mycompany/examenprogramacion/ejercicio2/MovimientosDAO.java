/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion.ejercicio2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author examen3
 */
public class MovimientosDAO {

    public static ArrayList getMovimientos() {
        String selectSQL = "SELECT * FROM movimientos";
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        try (Connection con = ConexionBD.conexionBD()) {
            Statement st = con.createStatement();
            try (ResultSet rs = st.executeQuery(selectSQL)) {
                while (rs.next()) {
                    movimientos.add(new Movimiento(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovimientosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movimientos;
    }

}
