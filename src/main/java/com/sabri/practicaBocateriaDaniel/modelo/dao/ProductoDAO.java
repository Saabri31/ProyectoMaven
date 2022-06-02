/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateriaDaniel.modelo.dao;

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
/* private int id;
    private String nombre;
    private int precio;*/
 
public class ProductoDAO {
    
    private int contador=0;
    
    public int insertProducto(String nombre, float precio){
       int venta=0;
       try (Connection con = ConexionBD.conectarBD()) {
           int id=contador++;
            String sqlInsert = "INSERT INTO productos(id,Nombre,Precio) VALUES(id,nombre,precio)";
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
    public Producto selectProducto() {
        Producto producto = null;
        try (Connection con = ConexionBD.conectarBD()) {
            String sqlSelect = "SELECT * FROM productos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
               producto = new Producto(rs.getInt(1), rs.getString(2),rs.getInt(3));
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        return producto;
    }
    public int updatePrecioProducto(double precio) {
        int resultado = 0;
        try (Connection con = ConexionBD.conectarBD()) {
            
            String sqlUpdate = "UPDATE productos SET Precio=precio";
            PreparedStatement ps = con.prepareCall(sqlUpdate);
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Update", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return resultado;
    }
    public static void deleteProducto(String nombre) {
        try (Connection con = ConexionBD.conectarBD()) { 
            PreparedStatement st = con.prepareStatement("DELETE FROM productos WHERE Nombre = nombre");  
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Update", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();  
        }
    }
    
}

    

