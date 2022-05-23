/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programast10;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaqgalju
 */
public class Ejemplo1_JTable extends javax.swing.JFrame {

    /**
     * Creates new form Ejemplo1
     */
    public Ejemplo1_JTable() {

        initComponents();
        this.setTitle("Ejemplo1-JDBC");
        this.setLocationRelativeTo(null);
        Dimension d = new Dimension(500, 200);
        this.setSize(d);
        this.modelo = (DefaultTableModel) jTable1.getModel();
        mostrarTodas();
    }

    private String urlDB = "jdbc:mysql://localhost:3306/ejemplo1";
    private Connection c;
    DefaultTableModel modelo;

    private void conectarBBDD() {
        try {
            c = DriverManager.getConnection(urlDB, "root", "");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1_JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void desconectarBBDD() {
        try {
            if (c != null) {
                c.close();
                JOptionPane.showMessageDialog(null, "Conexion cerrada", "Ejemplo1", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No hay ninguna conexion abierta", "Ejemplo1", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1_JTable.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBBDD = new javax.swing.JMenu();
        itemConectar = new javax.swing.JMenuItem();
        itemDesconectar = new javax.swing.JMenuItem();
        menuPersonas = new javax.swing.JMenu();
        itemInsert = new javax.swing.JMenuItem();
        itemUpdate = new javax.swing.JMenuItem();
        itemDelete = new javax.swing.JMenuItem();
        itemBuscar = new javax.swing.JMenuItem();
        itemMostarTodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        menuBBDD.setText("BBDD");

        itemConectar.setText("Conectar");
        itemConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConectarActionPerformed(evt);
            }
        });
        menuBBDD.add(itemConectar);

        itemDesconectar.setText("Desconectar");
        itemDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDesconectarActionPerformed(evt);
            }
        });
        menuBBDD.add(itemDesconectar);

        jMenuBar1.add(menuBBDD);

        menuPersonas.setText("Personas");

        itemInsert.setText("Nueva");
        itemInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInsertActionPerformed(evt);
            }
        });
        menuPersonas.add(itemInsert);

        itemUpdate.setText("Modificar");
        itemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateActionPerformed(evt);
            }
        });
        menuPersonas.add(itemUpdate);

        itemDelete.setText("Delete");
        itemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteActionPerformed(evt);
            }
        });
        menuPersonas.add(itemDelete);

        itemBuscar.setText("Buscar");
        itemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarActionPerformed(evt);
            }
        });
        menuPersonas.add(itemBuscar);

        itemMostarTodo.setText("Mostrar todas");
        itemMostarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostarTodoActionPerformed(evt);
            }
        });
        menuPersonas.add(itemMostarTodo);

        jMenuBar1.add(menuPersonas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConectarActionPerformed
        // TODO add your handling code here:
        conectarBBDD();
    }//GEN-LAST:event_itemConectarActionPerformed

    private void itemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesconectarActionPerformed
        desconectarBBDD();
    }//GEN-LAST:event_itemDesconectarActionPerformed

    private void itemInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInsertActionPerformed
        String nombre = JOptionPane.showInputDialog("Nombre");
        if (nombre == null || nombre.isEmpty()) {
            return;
        }
        String apellidos = JOptionPane.showInputDialog("Apellidos");
        if (apellidos == null || apellidos.isEmpty()) {
            return;
        }
        String Stredad = JOptionPane.showInputDialog("Edad");
        if (Stredad == null || Stredad.isEmpty()) {
            return;
        }

        try {
            int edad = Integer.parseInt(Stredad);
            String SQLInsert = "INSERT INTO personas (nombre,apellidos,edad) VALUES ('" + nombre + "','" + apellidos + "'," + edad + ")";

            conectarBBDD();
            Statement st = c.createStatement();
            int filas = st.executeUpdate(SQLInsert);
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Persona insertada", "Ejemplo1", JOptionPane.INFORMATION_MESSAGE);
                mostrarTodas();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Edad invalida", "Ejemplo1", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1_JTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_itemInsertActionPerformed

    private void itemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteActionPerformed
        String id = JOptionPane.showInputDialog("Id a borrar:");
        if (id == null || id.isEmpty()) {
            return;
        }

        try {
            conectarBBDD();
            int idPersona = Integer.parseInt(id);
            int botonPulsado = JOptionPane.showConfirmDialog(null, "Seguro?", "Delete", JOptionPane.YES_NO_OPTION);
            if (botonPulsado == JOptionPane.NO_OPTION) {
                return;
            }
            String delete = "DELETE FROM personas WHERE idPersona = ?";
            PreparedStatement ps = c.prepareStatement(delete);
            ps.setInt(1, idPersona);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Persona borrada", "Delete", JOptionPane.INFORMATION_MESSAGE);
                mostrarTodas();
            } else {
                JOptionPane.showMessageDialog(null, "Persona inexistente", "Ejemplo1", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Edad invalida", "Ejemplo1", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1_JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemDeleteActionPerformed

    private void itemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateActionPerformed
        String id = JOptionPane.showInputDialog("Id a modificar:");
        if (id == null || id.isEmpty()) {
            return;
        }
        new Update();
        try {
            conectarBBDD();
            int idPersona = Integer.parseInt(id);

            //new Update();
            // HashMap valores =new Update().enviarDatos();
            //System.out.println(valores);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_itemUpdateActionPerformed
    /*
    public String[] getTableCols(String table) throws SQLException {
        String SqlSelect="SELECT column_name FROM INFORMATION_ESCHEMA.COLUMNS WHERE TABLE_NAME= ?";
        PreparedStatement ps = c.prepareStatement(SqlSelect);
        ps.setString(1, table);
        
        ResultSet rs = ps.executeQuery();
        ArrayList<String> cols = new ArrayList<String>();
    }
     */
    private void itemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarActionPerformed
        //this.jTextArea1.setText("");

        String cadenaID = JOptionPane.showInputDialog("ID de persona a buscar:");
        if (cadenaID == null || cadenaID.isEmpty()) {
            return;
        } else {
            try {
                int ID = Integer.parseInt(cadenaID);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Numero!");
                return;
            }

            try {
                conectarBBDD();
                String SQL = "SELECT * FROM personas WHERE idPersona=?";
                PreparedStatement ps = c.prepareStatement(SQL);
                ps.setString(1, cadenaID);
                ResultSet rs = ps.executeQuery();
                String persona = "";
                if (rs.next()) {
                    modelo.setRowCount(0);
                    Vector v = new Vector();
                    v.add(rs.getInt(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getInt(4));
                    modelo.addRow(v);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error BBDD");
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_itemBuscarActionPerformed

    private void mostrarTodas() {
        try {
            modelo.setRowCount(0);
            conectarBBDD();
            String select = "SELECT * FROM personas";
            PreparedStatement ps = c.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            //String persona = "";
            while (rs.next()) {
                //Persona persona = new Persona(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getInt(4));
                modelo.addRow(v);
                //persona = rs.getInt(1) + " - " + rs.getString(3) + ", " + rs.getString(2) + " - " + rs.getInt(4) + " años.";
                //jTextArea1.append(persona + "\n");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1_JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void itemMostarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostarTodoActionPerformed
        mostrarTodas();
    }//GEN-LAST:event_itemMostarTodoActionPerformed

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
            java.util.logging.Logger.getLogger(Ejemplo1_JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo1_JTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemConectar;
    private javax.swing.JMenuItem itemDelete;
    private javax.swing.JMenuItem itemDesconectar;
    private javax.swing.JMenuItem itemInsert;
    private javax.swing.JMenuItem itemMostarTodo;
    private javax.swing.JMenuItem itemUpdate;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuBBDD;
    private javax.swing.JMenu menuPersonas;
    // End of variables declaration//GEN-END:variables
}
