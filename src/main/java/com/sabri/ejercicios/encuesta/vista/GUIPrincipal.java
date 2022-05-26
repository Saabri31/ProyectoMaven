/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sabri.ejercicios.encuesta.vista;

import com.sabri.ejercicios.encuesta.controlador.Controlador;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author todbolsa
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Encuesta
     */
    private Controlador controlador;

    public GUIPrincipal() {
        initComponents();
        setFrame();
        setControlador();
    }

    public void setFrame() {
        this.jLabel1.setText("¿Crees que vas a aprobar programación?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jRadioButton1.setText("Sí");
        this.jRadioButton2.setText("No");
        this.jRadioButton3.setText("Ns/Nc");
        this.jButton1.setText("Votar");
        this.jButton1.setActionCommand("Votar");
        this.jButton2.setText("Cancelar");
        this.jButton2.setActionCommand("Cancelar");

        this.buttonGroup1.add(jRadioButton1);
        this.buttonGroup1.add(jRadioButton2);
        this.buttonGroup1.add(jRadioButton3);

        this.jPanel1.setPreferredSize(new Dimension(0, 100));
        this.jPanel3.setPreferredSize(new Dimension(0, 300));
        this.jPanel2.setPreferredSize(new Dimension(0, 100));

//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setPreferredSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(500, 500));
        this.pack();
    }

    public void setControlador() {
        controlador = new Controlador(this);
        this.jButton1.addActionListener(controlador);
        this.jButton2.addActionListener(controlador);
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("jButton1");
        jPanel2.add(jButton1);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 10, 10));

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jRadioButton1);

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jRadioButton2);

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jRadioButton3);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
