/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.dao;

import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.entities.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.resource.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author todbolsa
 */
public class SintomasDAO {

    public static int insert(Sintomas s) throws SQLException {

        String query = "";
        PreparedStatement pst = null;
        Connection con = null;
        int numReg = 0;

        try {
            query = "INSERT INTO sintomas (id,fiebre,tos,diarrea,dolor,olfato)";
            query += "VALUES(?,?,?,?,?,?)";
            con = conexionBD.conectarBBDD();
            pst = con.prepareStatement(query);
            pst.setInt(1, s.getId());
            pst.setInt(2, s.getFiebre());
            pst.setInt(3, s.getTos());
            pst.setInt(4, s.getDiarrea());
            pst.setInt(5, s.getDolor());
            pst.setInt(6, s.getOlfato());
        } catch (SQLException e) {
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return numReg;
    }

    public static int update(Sintomas s) throws SQLException {

        String query = "";
        PreparedStatement pst = null;
        Connection con = null;
        int numReg = 0;

        try {
            query = "UPDATE sintomas SET fiebre=?,tos=?,diarrea=?,dolor=?,olfato=? WHERE id=?";
            query += "VALUES(?,?,?,?,?,?)";
            con = conexionBD.conectarBBDD();
            pst = con.prepareStatement(query);
            pst.setInt(1, s.getId());
            pst.setInt(2, s.getFiebre());
            pst.setInt(3, s.getTos());
            pst.setInt(4, s.getDiarrea());
            pst.setInt(5, s.getDolor());
            pst.setInt(6, s.getOlfato());
            numReg = pst.executeUpdate();
        } catch (SQLException e) {
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return numReg;
    }

    public static int select(Sintomas s) throws SQLException {

        String query = "";
        PreparedStatement pst = null;
        Connection con = null;
        int numReg = 0;

        try {
            query = "SELECT * FROM sintomas WHERE id=?";
            con = conexionBD.conectarBBDD();
            pst = con.prepareStatement(query);
            pst.setInt(1, s.getId());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
//                sintomas = new Sintomas();
            }
        } catch (SQLException e) {
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return numReg;
    }
}
