/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.controller;

import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.entities.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.view.View;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author todbolsa
 */
public class Controller {

    private final Sintomas sintomas;
    private final View vista;

    public Controller(Sintomas modelo, View vista) {
        this.sintomas = modelo;
        this.vista = vista;
//        this.vista.getEnviar().addActionListener(this);
    }

    public void iniciarVista() {
        vista.setTitle("TEST COVID GF");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {

        if (vista.getFiebre().isSelected()) {
            sintomas.setFiebre(sintomas.getFiebre() + 1);
        }

        if (vista.getTos().isSelected()) {
            sintomas.setTos(sintomas.getTos() + 1);
        }

        if (vista.getDiarrea().isSelected()) {
            sintomas.setDiarrea(sintomas.getDiarrea() + 1);
        }
        if (vista.getDolor().isSelected()) {
            sintomas.setDolor(sintomas.getDolor() + 1);
        }
        if (vista.getOlfato().isSelected()) {
            sintomas.setOlfato(sintomas.getOlfato() + 1);
        }
        JOptionPane.showMessageDialog(null, sintomas.toString());

    }

//    public void insertarSintomas() {
//        try {
//            String message = SintomasBL.alta(sintomas);
//            JOptionPane.showMessageDialog(null, message);
//        }
//    }
}
