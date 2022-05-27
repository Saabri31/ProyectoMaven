/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.ejercicios.encuesta.controlador;

import com.sabri.ejercicios.encuesta.modelo.dao.EncuestaDAO;
import com.sabri.ejercicios.encuesta.vista.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
        EncuestaDAO encuestaDAO = null;
        if (e.getActionCommand().equals("Votar")) {
            //Actualización de la bd
            if (vistaPrincipal.getButtonGroup1().getSelection() == null) {
                JOptionPane.showMessageDialog(null, "Debe elegir una respuesta para votar", "Encuesta DAM", JOptionPane.ERROR_MESSAGE);
            } else {
                encuestaDAO = new EncuestaDAO();
                boolean si, no, ns;
                si = no = ns = false;
                int respuesta = 0;
                if (vistaPrincipal.getjRadioButton1().isSelected()) {
                    si = true;
                } else if (vistaPrincipal.getjRadioButton2().isSelected()) {
                    no = true;
                } else if (vistaPrincipal.getjRadioButton3().isSelected()) {
                    ns = true;
                }
                if (encuestaDAO.selectResultados() != null) {
                    respuesta = encuestaDAO.updateRespuesta(si, no, ns);
                } else {
                    respuesta = encuestaDAO.insertRespuesta(si, no, ns);
                }
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Exito", "Exito", respuesta);
                }
            }
        } else if (e.getActionCommand().equals("Cancelar")) {
            //Cierre de ventana
            vistaPrincipal.dispose();
        } else if (e.getActionCommand().equals("Mostrar")) {
            encuestaDAO.mostrarTodos();
        }
    }

}
