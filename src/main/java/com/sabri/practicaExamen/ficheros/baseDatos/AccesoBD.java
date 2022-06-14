/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen.ficheros.baseDatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author todbolsa
 */
public class AccesoBD {

    private static String url = "jdbc:mysql://" + "localhost" + ":3306/" + "jobber";

    static Connection con;

    private static void getConnection() {
        try {
            con = DriverManager.getConnection(url, "root", "");
            DatabaseMetaData dbm = con.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection conexionBD() {
        if (!hasConnection())
            getConnection();
        return con;
    }

    public static boolean hasConnection() {
        return con != null;
    }
}
