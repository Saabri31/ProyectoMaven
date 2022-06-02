/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateriaDaniel.modelo.dao;

import com.sabri.practicaBocateria.modelo.entidades.Empleado;
import com.sabri.practicaBocateria.modelo.entidades.Producto;
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
/* private String id;
    private String nombre;
    private int comision*/
public class EmpleadoDAO {
    
    
    
    public int insertEmpleado(String id,String nombre, int comision){
       int venta=0;
       try (Connection con = ConexionBD.conectarBD()) {
            String sqlInsert = "INSERT INTO empleados(id,Nombre,Comision) VALUES(id,nombre,comision)";
            PreparedStatement ps = con.prepareCall(sqlInsert);
            venta= ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
       
        return venta;
    }
    //int id,LocalDateTime fechaHora, String empleado, HashMap<String, Integer> productos,double total
    
    public Empleado selectEmpleado() {
        Empleado empleado = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM empleados";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
               empleado = new Empleado(rs.getString(1), rs.getString(2),rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        return empleado;
    }
    public int updateComision(int comision) {
        int resultado = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            
            String sqlUpdate = "UPDATE empleados SET Comision=comision";
            PreparedStatement ps = con.prepareCall(sqlUpdate);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Update", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return resultado;
    }
   
}
