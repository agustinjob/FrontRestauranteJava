/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.restjob;

import com.job.comedor.EstructuraComedor;
import com.job.modelos.Datos;
import com.job.turno.TurnoDialog;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;

/**
 *
 * @author agus_
 */
public class Principal extends javax.swing.JPanel {

    public static TurnoDialog turno = new TurnoDialog();
    EstructuraComedor estructuraComedor = new EstructuraComedor();

    public Principal() {
        initComponents();
        llenarIconos();
        turno.buscarTurno();
        lblSupervisor.setText(Datos.administrador.getNombre());

    }

    public final void llenarIconos() {

        btnComedor.setIcon(Iconos.comedor);
        btnAbrirTurno.setIcon(Iconos.abrirTurnoNormal);
        btnCerrarTurno.setIcon(Iconos.cerrarTurnoNormal);
        btnCorteCaja.setIcon(Iconos.corteCaja);
        btnMonitorVentas.setIcon(Iconos.monitorVentas);
        btnConsultarCuentas.setIcon(Iconos.consultarCuentas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnComedor = new javax.swing.JButton();
        btnAbrirTurno = new javax.swing.JButton();
        btnCerrarTurno = new javax.swing.JButton();
        btnCorteCaja = new javax.swing.JButton();
        btnMonitorVentas = new javax.swing.JButton();
        btnConsultarCuentas = new javax.swing.JButton();
        lblSupervisor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        btnComedor.setBackground(new java.awt.Color(0, 51, 255));
        btnComedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnComedor.setForeground(new java.awt.Color(255, 255, 255));
        btnComedor.setText("COMEDOR");
        btnComedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnComedor);

        btnAbrirTurno.setBackground(new java.awt.Color(0, 51, 255));
        btnAbrirTurno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAbrirTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirTurno.setText("ABRIR TURNO");
        btnAbrirTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrirTurno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrirTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrirTurno);

        btnCerrarTurno.setBackground(new java.awt.Color(0, 51, 255));
        btnCerrarTurno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCerrarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarTurno.setText("CERRAR TURNO");
        btnCerrarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarTurno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarTurno);

        btnCorteCaja.setBackground(new java.awt.Color(0, 51, 255));
        btnCorteCaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCorteCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCorteCaja.setText("CORTE CAJA");
        btnCorteCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorteCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCorteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteCajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCorteCaja);

        btnMonitorVentas.setBackground(new java.awt.Color(0, 51, 255));
        btnMonitorVentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMonitorVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnMonitorVentas.setText("MONIT. VENTAS");
        btnMonitorVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonitorVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonitorVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMonitorVentas);

        btnConsultarCuentas.setBackground(new java.awt.Color(0, 51, 255));
        btnConsultarCuentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultarCuentas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCuentas.setText("CONS. CUENTAS");
        btnConsultarCuentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarCuentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCuentas);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 120));

        lblSupervisor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisor.setText("NOMBRE DEL SUPERVISOR EN TURNO");
        add(lblSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUPERVISOR EN TURNO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentasActionPerformed
        
        if (Datos.usuario.getTipoUsuario().equalsIgnoreCase("Administrador")) {
            ConsultarCuentas consultarCuen = new ConsultarCuentas();
            consultarCuen.setVisible(true);
            btnConsultarCuentas.setEnabled(false);
        } else {
            Utilidades.mensajePorTiempo("No tienes privilegios para esta funcionalidad");
        }

    }//GEN-LAST:event_btnConsultarCuentasActionPerformed

    private void btnCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTurnoActionPerformed
        turno.asignar("cerrar");
        estructuraComedor.dispose();
        turno.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarTurnoActionPerformed

    private void btnAbrirTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTurnoActionPerformed
        turno.asignar("abrir");
        turno.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirTurnoActionPerformed

    private void btnComedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComedorActionPerformed
        btnComedor.setEnabled(false);
        EstructuraComedor.actualizarTabla(1);
        EstructuraComedor.limpiarTablaProductos();
        EstructuraComedor.deshabilitarBotones();
        EstructuraComedor.idCuentaSeleccionada = "";
        estructuraComedor.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComedorActionPerformed

    private void btnCorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteCajaActionPerformed
        if (Datos.usuario.getTipoUsuario().equalsIgnoreCase("Administrador")) {
            CorteCaja corte = new CorteCaja();
            corte.setVisible(true);
        } else {
            Utilidades.mensajePorTiempo("No tienes privilegios para esta funcionalidad");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteCajaActionPerformed

    private void btnMonitorVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorVentasActionPerformed
        if (Datos.usuario.getTipoUsuario().equalsIgnoreCase("Administrador")) {
            MonitorVentas monitor = new MonitorVentas();
            monitor.setVisible(true);
        } else {
            Utilidades.mensajePorTiempo("No tienes privilegios para esta funcionalidad");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnMonitorVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAbrirTurno;
    public static javax.swing.JButton btnCerrarTurno;
    public static javax.swing.JButton btnComedor;
    public static javax.swing.JButton btnConsultarCuentas;
    public static javax.swing.JButton btnCorteCaja;
    public static javax.swing.JButton btnMonitorVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSupervisor;
    // End of variables declaration//GEN-END:variables
}
