/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.modelos.Configuracion;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Impresion;
import java.awt.Color;
import java.util.ArrayList;
import com.job.response.ResponseDatos;
import com.job.utilidades.Utilidades;
import com.job.ambiente.Enviroment;
import java.util.List;

/**
 *
 * @author agus_
 */
public class ContenedorConfiguracion extends javax.swing.JPanel {

    public ContenedorConfiguracion() {
        initComponents();

    }

    public void llenarCombo() {

        Impresion ej = new Impresion();
        ArrayList<String> p = new ArrayList();
        p = ej.nombreImpresoras();
        int i = 0;
        comboImpresora.removeAllItems();
        while (i < p.size()) {
            comboImpresora.addItem(p.get(i));
            i++;
        }

    }

    public void inicializarDatos() {
        ResponseDatos<Configuracion> res = ConsumoApi.configuracion(Enviroment.local + "/v1/configuracion", null, "GET");
        Configuracion con = res.getDatos().get(0);
        String nombre = con.getNombre() == null ? "" : con.getNombre();
        String direccion = con.getDireccion() == null ? "" : con.getDireccion();
        String rfc = con.getRfc();
        String impresora = con.getImpresora() == null ? "" : con.getImpresora();
        lblTextNombre.setText("El nombre del establecimiento es: " + nombre);
        lblTextDireccion.setText("con dirección en: " + direccion);
        lblTextRFC.setText("con RFC: " + rfc);
        lblTextImpresora.setText("La impresora que está ocupando para imprimir es: " + impresora);

        txfNombre.setText(nombre);
        txfDireccion.setText(direccion);
        txfRFC.setText(rfc);
        comboImpresora.setSelectedItem(impresora);

    }

    public final void llenarIconos() {
        lblIconConfiguracion.setIcon(Iconos.configuracion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIconConfiguracion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txfNombre = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txfDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        lblTextNombre = new javax.swing.JLabel();
        lblTextDireccion = new javax.swing.JLabel();
        lblTextRFC = new javax.swing.JLabel();
        lblTextImpresora = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txfRFC = new javax.swing.JTextField();
        lblNombre3 = new javax.swing.JLabel();
        comboImpresora = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("CONFIGURACIÓN");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Dirección:");
        lblNombre1.setToolTipText("");

        txfDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfDireccion.setBorder(null);

        btnGuardar.setBackground(new java.awt.Color(153, 153, 255));
        btnGuardar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.setPreferredSize(new java.awt.Dimension(250, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(245, 244, 250));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("CONSULTAR DATOS");

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        lblTextNombre.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextNombre.setForeground(new java.awt.Color(0, 0, 153));
        lblTextNombre.setText("El nombre del establecimiento es ###############################");

        lblTextDireccion.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextDireccion.setForeground(new java.awt.Color(0, 0, 153));
        lblTextDireccion.setText("con dirección en ###########################################");

        lblTextRFC.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextRFC.setForeground(new java.awt.Color(0, 0, 153));
        lblTextRFC.setText("con RFC ##################");

        lblTextImpresora.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextImpresora.setForeground(new java.awt.Color(0, 0, 153));
        lblTextImpresora.setText("La impresora que está ocupando para imprimir es #################");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 568, Short.MAX_VALUE)
                        .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTextImpresora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                            .addComponent(lblTextRFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(lblTextNombre)
                .addGap(18, 18, 18)
                .addComponent(lblTextDireccion)
                .addGap(27, 27, 27)
                .addComponent(lblTextRFC)
                .addGap(127, 127, 127)
                .addComponent(lblTextImpresora)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("RFC:");
        lblNombre2.setToolTipText("");

        txfRFC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfRFC.setBorder(null);

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre3.setText("Impresora:");
        lblNombre3.setToolTipText("");

        comboImpresora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboImpresora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Administrador", "Empleado" }));
        comboImpresora.setBorder(null);

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 255));
        btnLimpiar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(null);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(250, 35));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(888, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)))
                .addGap(30, 30, 30)
                .addComponent(lblNombre)
                .addGap(45, 45, 45)
                .addComponent(lblNombre1)
                .addGap(49, 49, 49)
                .addComponent(lblNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre3)
                .addGap(8, 8, 8)
                .addComponent(comboImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!revisarVacios()) {
            Configuracion con = new Configuracion();
            con.setDireccion(txfDireccion.getText());
            con.setImpresora(comboImpresora.getSelectedItem() + "");
            con.setNombre(txfNombre.getText());
            con.setRfc(txfRFC.getText());
            ResponseDatos<Configuracion> res = ConsumoApi.configuracion(Enviroment.local + "/v1/configuracion", con, "PUT");

            Utilidades.mensajePorTiempo(res.getMensaje());
            if (res.getRealizado() == true) {
                limpiarDatos();
                inicializarDatos();
            }
        } else {
            Utilidades.mensajePorTiempo("No puede haber campos vacios, por favor registra todos los datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //    exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.red);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //     exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Estructura.catalogos.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public void limpiarDatos() {
        txfNombre.setText("");
        txfDireccion.setText("");
        txfRFC.setText("");
        comboImpresora.setSelectedItem("");
    }

    public boolean revisarVacios() {

        List<String> datos = new ArrayList<>();
        datos.add(txfNombre.getText());
        datos.add(txfDireccion.getText());
        datos.add(txfRFC.getText());
        datos.add(comboImpresora.getSelectedItem() + "");

        return Utilidades.hayVacios(datos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboImpresora;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblIconConfiguracion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblTextDireccion;
    private javax.swing.JLabel lblTextImpresora;
    private javax.swing.JLabel lblTextNombre;
    private javax.swing.JLabel lblTextRFC;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfRFC;
    // End of variables declaration//GEN-END:variables
}
