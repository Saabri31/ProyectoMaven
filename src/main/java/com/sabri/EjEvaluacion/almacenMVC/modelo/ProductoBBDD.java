/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.EjEvaluacion.almacenMVC.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author todbolsa
 */
public class ProductoBBDD {

    public ArrayList<Producto> selectProductos(TipoProducto tipo) {
        ArrayList l = null;
        try (Connection con = ConexionBBDD.conectarBBDD()) {
            l = new ArrayList();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM productos WHERE tipo=?");
            ps.setInt(1, tipo.getIdTipo());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("idProducto");
                String tipo2 = rs.getString("tipo");
                String desc = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");
                Producto p = new Producto(codigo, desc, precio, cantidad);
                l.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoProductoBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
}
