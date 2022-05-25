/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programast10.encuesta;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleRole;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;

/**
 *
 * @author vaqgalju
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        enviarButton.setEnabled(false);
        //this.setTitle(LocalDateTime.now().toString());
    }

    private String urlDB = "jdbc:mysql://localhost:3306/encuestas";
    private Connection c;

    private void conectarBBDD() {
        try {
            c = DriverManager.getConnection(urlDB, "root", "");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error BBDD");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesButtons = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        siButton = new javax.swing.JRadioButton();
        noButton = new javax.swing.JRadioButton();
        nsncButton = new javax.swing.JRadioButton();
        enviarButton = new javax.swing.JButton();
        resultadosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("¿Mascarillas si/no?");

        opcionesButtons.add(siButton);
        siButton.setText("SI");
        siButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siButtonActionPerformed(evt);
            }
        });

        opcionesButtons.add(noButton);
        noButton.setText("NO");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        opcionesButtons.add(nsncButton);
        nsncButton.setText("NS/NC");
        nsncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsncButtonActionPerformed(evt);
            }
        });

        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        resultadosButton.setText("Ver resultados");
        resultadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(enviarButton)
                        .addGap(67, 67, 67)
                        .addComponent(resultadosButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siButton)
                            .addComponent(noButton)
                            .addComponent(nsncButton))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(siButton)
                .addGap(12, 12, 12)
                .addComponent(noButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nsncButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarButton)
                    .addComponent(resultadosButton))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siButtonActionPerformed
        enviarButton.setEnabled(true);
    }//GEN-LAST:event_siButtonActionPerformed

    private int select(String opcion) throws SQLException {
        conectarBBDD();
        String select = "SELECT " + opcion + " FROM respuestas WHERE idResp=1";
        PreparedStatement ps = c.prepareStatement(select);
        ResultSet rs = ps.executeQuery();
        int valor = 0;
        while (rs.next()) {
            valor = rs.getInt(1);  
        }
        return valor;
    }

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        try {
            String respuesta = getSelectedButtonText(opcionesButtons);
            conectarBBDD();

            String respuestaBBDD = "";
            if (respuesta == "SI") {
                respuestaBBDD = "Y";
            } else if (respuesta == "NO") {
                respuestaBBDD = "N";
            } else {
                respuestaBBDD = "NS";
            }

            int valor=select(respuestaBBDD);

            String update = "UPDATE respuestas SET " + respuestaBBDD + "=" + (valor + 1) + " WHERE idResp=1";
            PreparedStatement ps = c.prepareStatement(update);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        enviarButton.setEnabled(true);
    }//GEN-LAST:event_noButtonActionPerformed

    private void nsncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsncButtonActionPerformed
        enviarButton.setEnabled(true);
    }//GEN-LAST:event_nsncButtonActionPerformed
    
    private void resultadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosButtonActionPerformed
        try {
            int sies=select("Y");
            int noes=select("N");
            int nsnc=select("NS");
            int total=sies+noes+nsnc;
            
            System.out.println("SI:" +sies);
            System.out.println("NO:" +noes);
            System.out.println("NS/NC:" +nsnc);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultadosButtonActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                System.out.println(button.getText());
                return button.getText();
            }
        }

        return null;
    }

//    private Object getSelectedButton() {
//        JRadioButton boton=null;
//        for (Object obj : opcionesButtons.getSelection().getSelectedObjects()) {
//            
//            if (obj instanceof JRadioButton) {
//                boton = (JRadioButton) obj;
//                //boton.is
//                System.out.println(boton);
//            }
//            
//        }
//        return boton;
//        /*
//        Object[] resp=opcionesButtons.getSelection().getSelectedObjects();
//        System.out.println(Arrays.deepToString(resp));
//        Object a = null;
//        //return resp[0];
//        return a;
//        */
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton noButton;
    private javax.swing.JRadioButton nsncButton;
    private javax.swing.ButtonGroup opcionesButtons;
    private javax.swing.JButton resultadosButton;
    private javax.swing.JRadioButton siButton;
    // End of variables declaration//GEN-END:variables
}