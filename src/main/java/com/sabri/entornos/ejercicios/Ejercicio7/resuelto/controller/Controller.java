/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.entornos.ejercicios.Ejercicio7.resuelto.controller;

import com.sabri.entornos.ejercicios.Ejercicio7.resuelto.model.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.resuelto.view.View1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author rhtuf
 */
public class Controller implements ActionListener {

    private final Sintomas modelo;
    private final View1 vista;

    public Controller(Sintomas modelo, View1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getEnviar().addActionListener(this);
    }

    public void iniciarVista() {
        vista.setTitle("TEST COVID GF");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

//   
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (vista.getFiebre().isSelected()) {
            modelo.setFiebre(modelo.getFiebre()+1);
        }

        if (vista.getTos().isSelected()) {
            modelo.setTos(modelo.getTos()+1);
        }

        if (vista.getDiarrea().isSelected()) {
            modelo.setDiarrea(modelo.getDiarrea()+1);
        }
        if (vista.getDolor().isSelected()) {
            modelo.setDolor_muscular(modelo.getDolor_muscular()+1);
        }
        if (vista.getOlfato().isSelected()) {
            modelo.setOlfato(modelo.getOlfato()+1);
        }
        JOptionPane.showMessageDialog(null, modelo.toString());
        
    }
}
