/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.practicaExamen.ficheros.frases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author macarena
 */
public class Frases extends javax.swing.JFrame {

    /**
     * Creates new form Frases
     */
    private DefaultListModel<String> modeloLista = new DefaultListModel();

    public Frases() {
        initComponents();
        setTitle("Gestión de frases");
        this.listaFrases.setModel(modeloLista);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFrase = new javax.swing.JLabel();
        cajaFrase = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFrases = new javax.swing.JList<>();
        botonAniadir = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGrabar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFrase.setText("Frase:");

        jScrollPane1.setViewportView(listaFrases);

        botonAniadir.setText("+");
        botonAniadir.setToolTipText("");
        botonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAniadirActionPerformed(evt);
            }
        });

        botonEliminar.setText("-");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGrabar.setText("Grabar frases");
        botonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrabarActionPerformed(evt);
            }
        });

        botonCargar.setText("Cargar frases");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFrase)
                        .addGap(18, 18, 18)
                        .addComponent(cajaFrase)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGrabar)
                    .addComponent(botonCargar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(botonAniadir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFrase)
                    .addComponent(cajaFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAniadir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCargar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAniadirActionPerformed
        String frase = this.cajaFrase.getText();
        if (!frase.isEmpty())
            this.modeloLista.addElement(frase);
        else
            JOptionPane.showMessageDialog(null, "No has introducido frase", "Aviso", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_botonAniadirActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (modeloLista.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay ninguna frase en la lista", "Aviso", JOptionPane.WARNING_MESSAGE);
        else {
            List<String> listaSeleccionada = listaFrases.getSelectedValuesList();
            if (listaSeleccionada.size() == 0) {
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna frase", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                for (String frase : listaSeleccionada) {
                    this.modeloLista.removeElement(frase);
                }
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        File fichero = seleccionarFichero(Operativa.LECTURA);
        if (fichero != null) {
            leerFrases(fichero);
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado el fichero con las frases a leer", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        this.listaFrases.clearSelection();

    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabarActionPerformed
        if (!modeloLista.isEmpty()) {
            File fichero = seleccionarFichero(Operativa.ESCRITURA);
            if (fichero != null) {
                grabarFrases(fichero);
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado el fichero donde grabar las frases", "Aviso", JOptionPane.WARNING_MESSAGE);
                this.listaFrases.clearSelection();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada. Lista de frases vacía", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonGrabarActionPerformed

    private void leerFrases(File fichero) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(fichero));) {

            String frase = "";
            int cont = 0;
            while ((frase = br.readLine()) != null) {
                modeloLista.addElement(frase);
                cont++;
            }

            JOptionPane.showMessageDialog(null, "Se han cargado en la lista " + cont + " frases", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    private void grabarFrases(File fichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));) {
//            for (String frase : (Iterable<String>) modeloLista) {
//                bw.write(frase);
//                bw.newLine();
//            }
            for (int i = 0; i < modeloLista.size(); i++) {
                bw.write(modeloLista.get(i));
                bw.newLine();
            }

            JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private File seleccionarFichero(Operativa operacion) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setMultiSelectionEnabled(false);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros de texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        jfc.setAcceptAllFileFilterUsed(false);

        int resp = 0;
        if (operacion == Operativa.LECTURA) {
            jfc.setDialogTitle("Selecciona el fichero fuente con las frases");
            resp = jfc.showOpenDialog(null);
        } else if (operacion == Operativa.ESCRITURA) {
            jfc.setDialogTitle("Selecciona el fichero donde grabar las frases");
            resp = jfc.showSaveDialog(null);
        }
        if (resp == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile();
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAniadir;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGrabar;
    private javax.swing.JTextField cajaFrase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFrase;
    private javax.swing.JList<String> listaFrases;
    // End of variables declaration//GEN-END:variables
}