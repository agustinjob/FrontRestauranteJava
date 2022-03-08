/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.restjob;

import com.job.comedor.EstructuraComedor;
import com.job.turno.Turno;
import com.job.utilidades.Iconos;
import java.awt.Dimension;


/**
 *
 * @author agus_
 */
public class Principal extends javax.swing.JPanel {

  Turno turno= new Turno(); 
  EstructuraComedor estructuraComedor=new EstructuraComedor();
  
    public Principal() {
       initComponents();
       llenarIconos();
       
    }

     public final void llenarIconos(){
    lblComedor.setIcon(Iconos.comedor);
    lblAbrirTurno.setIcon(Iconos.abrirTurnoNormal);
    lblCerrarTurno.setIcon(Iconos.cerrarTurnoNormal);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrarTurno = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCerrarTurno = new javax.swing.JLabel();
        abrirTurno = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblAbrirTurno = new javax.swing.JLabel();
        comedor = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblComedor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarTurno.setBackground(new java.awt.Color(102, 255, 0));
        cerrarTurno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CERRAR TURNO");
        cerrarTurno.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblCerrarTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarTurno.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\pr-cerrarturno.png")); // NOI18N
        lblCerrarTurno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCerrarTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCerrarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarTurnoMouseClicked(evt);
            }
        });
        cerrarTurno.add(lblCerrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(cerrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 120, 100));

        abrirTurno.setBackground(new java.awt.Color(0, 0, 204));
        abrirTurno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ABRIR TURNO");
        abrirTurno.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblAbrirTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirTurno.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\pr-abrirturno.png")); // NOI18N
        lblAbrirTurno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAbrirTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAbrirTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirTurnoMouseClicked(evt);
            }
        });
        abrirTurno.add(lblAbrirTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(abrirTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 100));

        comedor.setBackground(new java.awt.Color(255, 204, 204));
        comedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMEDOR");
        comedor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblComedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComedor.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\pr-comedor.png")); // NOI18N
        lblComedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblComedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComedorMouseClicked(evt);
            }
        });
        comedor.add(lblComedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(comedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void lblComedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComedorMouseClicked
        estructuraComedor.setVisible(true);
    }//GEN-LAST:event_lblComedorMouseClicked

    private void lblAbrirTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirTurnoMouseClicked
        turno.asignar("abrir");
        turno.setVisible(true);
    }//GEN-LAST:event_lblAbrirTurnoMouseClicked

    private void lblCerrarTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarTurnoMouseClicked
       turno.asignar("cerrar");
        turno.setVisible(true);
    }//GEN-LAST:event_lblCerrarTurnoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abrirTurno;
    private javax.swing.JPanel cerrarTurno;
    private javax.swing.JPanel comedor;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAbrirTurno;
    private javax.swing.JLabel lblCerrarTurno;
    private javax.swing.JLabel lblComedor;
    // End of variables declaration//GEN-END:variables
}
