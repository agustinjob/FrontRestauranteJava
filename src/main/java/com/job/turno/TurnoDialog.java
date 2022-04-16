/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.turno;

import com.job.modelos.Datos;
import com.job.modelos.Turno;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.restjob.Principal;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import com.job.ambiente.Enviroment;

/**
 *
 * @author agus_
 */
public class TurnoDialog extends javax.swing.JFrame {
    
    String tipo;
    
    public TurnoDialog() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public void asignar(String tipo) {
        this.tipo = tipo;
        
        if (tipo.equalsIgnoreCase("abrir")) {
            
            lblTitulo.setText("ABRIR TURNO");
            lblIcono.setIcon(Iconos.abrirTurnoSmall);
            lblDescripcion.setText("Efectivo inicial");
            
        } else {
            
            lblTitulo.setText("CERRAR TURNO");
            lblIcono.setIcon(Iconos.cerrarTurnoSmall);
            lblDescripcion.setText("Fondo de cierre");
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txfCantidad = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnIniciar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("CERRAR TURNO");

        lblIcono.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\pr-abrirturno-small.png")); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDescripcion.setText("Fondo de cierre:");
        lblDescripcion.setToolTipText("");

        txfCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCantidad.setBorder(null);

        btnIniciar.setBackground(new java.awt.Color(204, 0, 51));
        btnIniciar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnIniciar.setText("CANCELAR");
        btnIniciar.setBorder(null);
        btnIniciar.setPreferredSize(new java.awt.Dimension(250, 35));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnIniciar1.setBackground(new java.awt.Color(153, 153, 255));
        btnIniciar1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnIniciar1.setText("ACEPTAR");
        btnIniciar1.setBorder(null);
        btnIniciar1.setPreferredSize(new java.awt.Dimension(250, 35));
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo)
                .addGap(49, 49, 49)
                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIcono)
                    .addComponent(lblTitulo))
                .addGap(18, 18, 18)
                .addComponent(lblDescripcion)
                .addGap(26, 26, 26)
                .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        try {
            String cantidad = txfCantidad.getText();
            if (tipo.equalsIgnoreCase("abrir")) {
                Turno turno = new Turno();
                turno.setEstatus("abierto");
                turno.setFondoInicial(Float.parseFloat(cantidad));
                ResponseDatos<Turno> res = ConsumoApi.turnos(Enviroment.local + "/v1/turnos", turno, "POST");
                Utilidades.mensajePorTiempo(res.getMensaje());
                Datos.turno = res.getDatos().get(0);
                desabilitar("Debe cerrar");
                
            } else {
                Turno turno = Datos.turno;
                turno.setEstatus("cerrado");
                turno.setFechaApertura(null);
                turno.setEfectivoDeclarado(Float.parseFloat(cantidad));
                ResponseDatos<Turno> res = ConsumoApi.turnos(Enviroment.local + "/v1/turnos", turno, "PUT");
                Utilidades.mensajePorTiempo(res.getMensaje());
                desabilitar("Debe abrir");
            }
            txfCantidad.setText("");
            this.dispose();
        } catch (NumberFormatException e) {
            Utilidades.mensajePorTiempo("Por favor ingresa un valor númerico");
        }
    }//GEN-LAST:event_btnIniciar1ActionPerformed
    public final void buscarTurno() {
        ResponseDatos<Turno> res = ConsumoApi.turnos(Enviroment.local + "/v1/turnos-estatus/abierto", this, "GET");
        Turno turnomo = res.getDatos().isEmpty() ? null : res.getDatos().get(0);
        Datos.turno = turnomo;
        desabilitar(turnomo == null ? "Debe abrir" : "Debe cerrar");
        
    }
    
    public void desabilitar(String tipo) {
        if (tipo.equalsIgnoreCase("Debe abrir")) {
            Principal.btnCerrarTurno.setEnabled(false);
            Principal.btnAbrirTurno.setEnabled(true);
            Principal.btnComedor.setEnabled(false);
            
        } else {
            Principal.btnCerrarTurno.setEnabled(true);
            Principal.btnAbrirTurno.setEnabled(false);
            Principal.btnComedor.setEnabled(true);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txfCantidad;
    // End of variables declaration//GEN-END:variables
}
