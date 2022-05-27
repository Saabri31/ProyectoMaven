/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.ejercicios.encuesta.modelo.dao;

import com.sabri.ejercicios.encuesta.modelo.entities.Encuesta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 *
 * CRUD (insert, select, update, delete)
 *
 */
public class EncuestaDAO {

    public int updateRespuesta(boolean si, boolean no, boolean ns) {
        int resultado = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlUpdate = "";
            if (si) {

                sqlUpdate = "UPDATE encuesta SET si=si+1";
            } else if (no) {

                sqlUpdate = "UPDATE encuesta SET no=no+1";
            } else if (ns) {

                sqlUpdate = "UPDATE encuesta SET ns=ns+1";
            }

            PreparedStatement ps = con.prepareCall(sqlUpdate);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Update", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return resultado;
    }

    public Encuesta selectResultados() {
        Encuesta encuesta = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM encuesta";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                encuesta = new Encuesta(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return encuesta;
    }

    public int insertRespuesta(boolean si, boolean no, boolean ns) {
        int resultado = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlInsert = "";
            if (si) {
                sqlInsert = "INSERT INTO encuesta (si) VALUES(1)";
            } else if (no) {
                sqlInsert = "INSERT INTO encuesta (no) VALUES(1)";
            } else if (ns) {
                sqlInsert = "INSERT INTO encuesta (ns) VALUES(1)";
            }

            PreparedStatement ps = con.prepareCall(sqlInsert);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return resultado;
    }

    public String mostrarTodos() {
        System.out.println("Hola?");
        Encuesta encuesta = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM encuesta";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            
            if (rs.next()) {
                encuesta = new Encuesta(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
            }
            rs.close();
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        return encuesta.toString();
    }
}
