/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.modelo.dao;

import com.sabri.ejercicios.encuesta.modelo.dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 */
public class ConexionBD {

    public static String host = "localhost";
    public static String database = "bocateria";
    public static String puerto = "3306";
    public static String user = "root";
    public static String passwd = "";
    public static String url = "jdbc:mysql://" + host + ":" + puerto + "/" + database;

    public static Connection con;

    public static Connection conectarBD() {
        try {
            con = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la BD", "Conexión BD", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
