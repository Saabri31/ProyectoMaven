/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.EjEvaluacion.almacenMVC.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author todbolsa
 */
public class ConexionBBDD {

    public static String host = "localhost";
    public static String database = "almacen";
    public static String puerto = "3306";
    public static String user = "root";
    public static String passwd = "";
    public static String url = "jdbc:mysql://" + host + ":" + puerto + "/" + database;

    public static Connection con;

    public static Connection conectarBBDD() {
        try {
            con = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
