/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.resource;

import com.sabri.EjEvaluacion.almacenMVC.modelo.ConexionBBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author todbolsa
 */
public class conexionBD {

    private static Connection con;
    private final static String mySqlUrl = "jdbc:mysql://localhost:3306/Covid";
    private final static String user = "root";
    private final static String passwd = "";

    public static Connection conectarBBDD() {
        try {
            con = DriverManager.getConnection(mySqlUrl, user, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
