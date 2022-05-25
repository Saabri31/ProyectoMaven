/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.ejercicios.encuesta.controlador;

import com.sabri.ejercicios.encuesta.vista.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author todbolsa
 */
public class Controlador implements ActionListener {

    private GUIPrincipal vistaPrincipal;

    public Controlador(GUIPrincipal vista) {
        this.vistaPrincipal = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Votar")) {
            //Insercion en bd
        } else if (e.getActionCommand().equals("Cancelar")) {
            //Cierre de ventana
            vistaPrincipal.dispose();
        }
    }

}
