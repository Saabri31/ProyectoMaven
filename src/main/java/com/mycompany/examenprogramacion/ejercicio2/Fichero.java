/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion.ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sabri
 */
public class Fichero {

    private String fechaHora;
    private String operacion;
    private String CIF;
    private static File file = new File("D:\\incidencias.txt");

    public Fichero(Movimiento mov) {
        this.fechaHora = String.valueOf(LocalDateTime.now());
        this.operacion = mov.getOperacion();
        this.CIF = mov.getCif();
    }

    public static void insertarLinea(Movimiento mov) {
        Fichero incidencia = new Fichero(mov);
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
            br.newLine();
            br.write(incidencia.toString());
            System.out.println(incidencia.toString());
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Fecha/Hora= " + fechaHora + " - Operacion= " + operacion + " - CIF= " + CIF;
    }
}
