/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.ejercicios.desc;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macarena
 */
public class DESC extends javax.swing.JFrame {

    private DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
    private DefaultTableModel modeloTabla;
    private final String[] nombresColumnas = {"Columna", "Tipo", "Permite nulos"};
    public static String urlBD;
    public static Connection con;

    public DESC() {
        initComponents();
        setFrame();
        cargarEsquema();
    }

    private void setFrame() {
        this.setTitle("Ejercicio Swing - DESC");
        urlBD = "jdbc:mysql://localhost:3306"; //url base

        modeloCombo.addElement(new String());
        this.comboBD.setModel(modeloCombo);

        this.tablaMetadatos.setEnabled(false);
        modeloTabla = new DefaultTableModel(null, nombresColumnas);
        this.tablaMetadatos.setModel(modeloTabla);

        this.comboBD.setMaximumRowCount(20);
        this.setPreferredSize(new Dimension(700, 500));
        this.setMinimumSize(new Dimension(700, 500));

        this.jScrollPane2.setPreferredSize(new Dimension(0, 150));
        this.jScrollPane2.setMinimumSize(new Dimension(0, 150));
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void cargarEsquema() {
        try {
            con = DriverManager.getConnection(urlBD, "root", "");

            DatabaseMetaData meta = con.getMetaData();
            ResultSet rs = meta.getCatalogs();
            while (rs.next()) {
                modeloCombo.addElement(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cargarTablas(String bd) {
        try {
            urlBD += "/" + bd;
            con = DriverManager.getConnection(urlBD, "root", "");

            DatabaseMetaData meta = con.getMetaData();
            ResultSet rs = meta.getTables(bd, null, null, null);
            while (rs.next()) {
                //System.out.println(rs.getString(3));
                MiBoton boton = new MiBoton(rs.getString(3));
                this.panelTablas.add(boton);
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //metadatos tabla
                        modeloTabla.setDataVector(null, nombresColumnas);
                        metadatosTabla(boton.getActionCommand());
                    }
                });
            }
            this.panelTablas.updateUI();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void metadatosTabla(String tabla) {
        try {
            con = DriverManager.getConnection(urlBD, "root", "");

            String SQLMeta = "SELECT * FROM " + tabla;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLMeta);
            ResultSetMetaData rsmd = rs.getMetaData();

            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                String nombreColumna = rsmd.getColumnName(i);
                String tipoDatos = rsmd.getColumnTypeName(i);
                int nulo = rsmd.isNullable(i);
                String sNulo = "";
                if (nulo == ResultSetMetaData.columnNullable) {
                    sNulo = "SI";
                } else if (nulo == ResultSetMetaData.columnNoNulls) {
                    sNulo = "NO";
                }
                modeloTabla.addRow(new String[]{nombreColumna, tipoDatos, sNulo});
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DESC.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        jSplitPane1 = new javax.swing.JSplitPane();
        panelBD = new javax.swing.JPanel();
        comboBD = new javax.swing.JComboBox<>();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelTablas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMetadatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBDItemStateChanged(evt);
            }
        });
        panelBD.add(comboBD);

        jSplitPane1.setLeftComponent(panelBD);

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        panelTablas.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane2.setViewportView(panelTablas);

        jSplitPane2.setTopComponent(jScrollPane2);

        tablaMetadatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaMetadatos);

        jSplitPane2.setRightComponent(jScrollPane3);

        jSplitPane1.setRightComponent(jSplitPane2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBDItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //cambio la selección
            //limpio el panel de tablas
            this.panelTablas.removeAll();
            this.panelTablas.updateUI();
            //y la tabla con los metadatos
            modeloTabla.setDataVector(null, nombresColumnas);
            if (this.comboBD.getSelectedIndex() != 0) { //selecciono una bd
                urlBD = "jdbc:mysql://localhost:3306"; //parto de la url base
                String bd = this.comboBD.getSelectedItem().toString();
                cargarTablas(bd);
            }
        }

    }//GEN-LAST:event_comboBDItemStateChanged

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
            java.util.logging.Logger.getLogger(DESC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DESC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DESC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DESC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DESC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBD;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel panelBD;
    private javax.swing.JPanel panelTablas;
    private javax.swing.JTable tablaMetadatos;
    // End of variables declaration//GEN-END:variables
}
