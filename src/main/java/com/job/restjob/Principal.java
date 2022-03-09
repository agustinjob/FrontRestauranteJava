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
    lblCorteCaja.setIcon(Iconos.corteCaja);
    lblMonitorVentas.setIcon(Iconos.monitorVentas);
    lblConsultarCuentas.setIcon(Iconos.consultarCuentas);
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
        corteCaja = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCorteCaja = new javax.swing.JLabel();
        monitorVentas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMonitorVentas = new javax.swing.JLabel();
        consultarCuentas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblConsultarCuentas = new javax.swing.JLabel();

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

        corteCaja.setBackground(new java.awt.Color(153, 0, 0));
        corteCaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CORTE DE CAJA");
        corteCaja.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblCorteCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorteCaja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCorteCaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCorteCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCorteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCorteCajaMouseClicked(evt);
            }
        });
        corteCaja.add(lblCorteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(corteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 100));

        monitorVentas.setBackground(new java.awt.Color(0, 102, 102));
        monitorVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MONIT. VENTAS");
        monitorVentas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblMonitorVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonitorVentas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMonitorVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMonitorVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMonitorVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMonitorVentasMouseClicked(evt);
            }
        });
        monitorVentas.add(lblMonitorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(monitorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 120, 100));

        consultarCuentas.setBackground(new java.awt.Color(102, 102, 0));
        consultarCuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONS. CUENTAS");
        consultarCuentas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        lblConsultarCuentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultarCuentas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblConsultarCuentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblConsultarCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultarCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarCuentasMouseClicked(evt);
            }
        });
        consultarCuentas.add(lblConsultarCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        add(consultarCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 120, 100));
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

    private void lblCorteCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorteCajaMouseClicked
        CorteCaja corte = new CorteCaja();
        corte.setVisible(true);
    }//GEN-LAST:event_lblCorteCajaMouseClicked

    private void lblMonitorVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonitorVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMonitorVentasMouseClicked

    private void lblConsultarCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarCuentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblConsultarCuentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abrirTurno;
    private javax.swing.JPanel cerrarTurno;
    private javax.swing.JPanel comedor;
    private javax.swing.JPanel consultarCuentas;
    private javax.swing.JPanel corteCaja;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAbrirTurno;
    private javax.swing.JLabel lblCerrarTurno;
    private javax.swing.JLabel lblComedor;
    private javax.swing.JLabel lblConsultarCuentas;
    private javax.swing.JLabel lblCorteCaja;
    private javax.swing.JLabel lblMonitorVentas;
    private javax.swing.JPanel monitorVentas;
    // End of variables declaration//GEN-END:variables
}
