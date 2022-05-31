/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateriaDaniel.controlador;

import com.sabri.practicaBocateria.vista.GUIPrincipal;
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
        
    }
}
