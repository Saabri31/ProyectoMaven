/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion.ejercicio2;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author examen3
 */
public class Problema2 {

    public static void main(String[] args) throws SQLException {
        ArrayList<Movimiento> movimientos = MovimientosDAO.getMovimientos();
        for (Movimiento mov : movimientos) {
            System.out.println(mov.toString());
            ClienteDAO.updateCliente(new Movimiento(mov.getId_movimiento(), mov.getCif(), mov.getNombre(), mov.getOperacion()));
        }

    }
}
