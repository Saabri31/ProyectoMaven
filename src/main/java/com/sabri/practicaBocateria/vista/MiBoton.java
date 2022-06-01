/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.practicaBocateria.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author macarena
 */
public class MiBoton extends JButton {

    public MiBoton(String text) {
        super(text);
        setForeground(Color.BLUE);
        setFont(new Font(null, Font.BOLD, 15));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.TOP);
        setBackground(Color.WHITE);
        setSize(new Dimension(100, 100));
    }

}
