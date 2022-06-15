/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion.ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author examen3
 */
public class ClienteDAO {

    public static void updateCliente(Movimiento movimiento) {
        String updateSQL = "";
        try (Connection con = ConexionBD.conexionBD()) {
            if (movimiento.getOperacion().equals("A")) {
                if (existCliente(movimiento)) {
                    System.out.println("El cliente especificado ya se encuentra en la Base de Datos");
                    System.out.println("HOLAHOLAFUNCIONO PARA EL MOVIMIENTO " + movimiento.getId_movimiento());
                    System.out.println("--------------------------------------------");
                    Fichero.insertarLinea(movimiento);
                } else {
                    updateSQL = "INSERT INTO clientes values(?,?)";
                    PreparedStatement ps = con.prepareStatement(updateSQL);
                    ps.setString(1, movimiento.getCif());
                    ps.setString(2, movimiento.getNombre());
                    ps.executeUpdate();
                    System.out.println("Cliente UPDATEADO " + movimiento.getCif());
                    System.out.println("--------------------------------------------");
                }
            }
            if (movimiento.getOperacion().equals("B")) {
                if (!existCliente(movimiento)) {
                    System.out.println("El cliente especificado no se encuentra en la Base de Datos");
                    System.out.println("HOLAHOLAFUNCIONO PARA EL MOVIMIENTO " + movimiento.getId_movimiento());
                    System.out.println("--------------------------------------------");
                    Fichero.insertarLinea(movimiento);
                } else {
                    updateSQL = "DELETE FROM clientes where CIF_cliente like '" + movimiento.getCif() + "'";
                    Statement st = con.createStatement();
                    st.executeUpdate(updateSQL);
                    System.out.println("Cliente DELETEADO " + movimiento.getCif());
                    System.out.println("--------------------------------------------");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean existCliente(Movimiento movimiento) {
        String selectSQL = "SELECT * FROM clientes where CIF_cliente like '" + movimiento.getCif() + "'";
        try (Connection con = ConexionBD.conexionBD()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovimientosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
