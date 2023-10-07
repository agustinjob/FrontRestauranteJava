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
import java.awt.event.KeyEvent;
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
        String cp =con.getCp();
        String regimen =con.getRegimen();
        String telefono = con.getTelefono();
        String celular = con.getCelular();
        lblTextNombre.setText("El nombre del establecimiento es: " + nombre);
        lblTextDireccion.setText("con dirección en: " + direccion);
        lblTextRFC.setText("con RFC: " + rfc);
        lblTextImpresora.setText("La impresora que está ocupando para imprimir es: " + impresora);
        lblTextCp.setText("El código postal es: " + cp);
        lblTextTelefono.setText("El número de teléfono es: "+ telefono);
        lblTextCelular.setText("El número celular es: " + celular);
        lblTextRegimen.setText("El regimen es el siguiente: " + regimen);
        txfNombre.setText(nombre);
        txfDireccion.setText(direccion);
        txfRFC.setText(rfc);
        txfCp.setText(cp);
        txfRegimen.setText(regimen);
        txfTelefono.setText(telefono);
        txfCelular.setText(celular);
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
        lblNombre2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txfRFC = new javax.swing.JTextField();
        lblNombre3 = new javax.swing.JLabel();
        comboImpresora = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        lblNombre4 = new javax.swing.JLabel();
        txfRegimen = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre5 = new javax.swing.JLabel();
        txfCp = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombre6 = new javax.swing.JLabel();
        txfTelefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombre7 = new javax.swing.JLabel();
        txfCelular = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        lblTextNombre = new javax.swing.JLabel();
        lblTextDireccion = new javax.swing.JLabel();
        lblTextRFC = new javax.swing.JLabel();
        lblTextImpresora = new javax.swing.JLabel();
        lblTextTelefono = new javax.swing.JLabel();
        lblTextCp = new javax.swing.JLabel();
        lblTextRegimen = new javax.swing.JLabel();
        lblTextCelular = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("CONFIGURACIÓN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 0, 187, 29);
        jPanel1.add(lblIconConfiguracion);
        lblIconConfiguracion.setBounds(240, 0, 80, 80);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(10, 60, 130, 22);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 110, 280, 10);

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txfNombre);
        txfNombre.setBounds(10, 90, 280, 17);

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Dirección:");
        lblNombre1.setToolTipText("");
        jPanel1.add(lblNombre1);
        lblNombre1.setBounds(10, 120, 130, 22);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 280, 10);

        txfDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfDireccion.setBorder(null);
        txfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfDireccionKeyPressed(evt);
            }
        });
        jPanel1.add(txfDireccion);
        txfDireccion.setBounds(10, 150, 280, 17);

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
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(10, 600, 120, 35);

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("RFC:");
        lblNombre2.setToolTipText("");
        jPanel1.add(lblNombre2);
        lblNombre2.setBounds(10, 190, 130, 22);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 240, 280, 10);

        txfRFC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfRFC.setBorder(null);
        txfRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfRFCKeyPressed(evt);
            }
        });
        jPanel1.add(txfRFC);
        txfRFC.setBounds(10, 220, 280, 17);

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre3.setText("Impresora:");
        lblNombre3.setToolTipText("");
        jPanel1.add(lblNombre3);
        lblNombre3.setBounds(10, 260, 180, 22);

        comboImpresora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboImpresora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Administrador", "Empleado" }));
        comboImpresora.setBorder(null);
        comboImpresora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboImpresoraKeyPressed(evt);
            }
        });
        jPanel1.add(comboImpresora);
        comboImpresora.setBounds(10, 290, 280, 23);

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
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(150, 600, 120, 35);

        lblNombre4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre4.setText("Regimen:");
        lblNombre4.setToolTipText("");
        jPanel1.add(lblNombre4);
        lblNombre4.setBounds(10, 330, 130, 22);

        txfRegimen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfRegimen.setBorder(null);
        txfRegimen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfRegimenKeyPressed(evt);
            }
        });
        jPanel1.add(txfRegimen);
        txfRegimen.setBounds(10, 360, 280, 17);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(10, 380, 280, 10);

        lblNombre5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre5.setText("CP:");
        lblNombre5.setToolTipText("");
        jPanel1.add(lblNombre5);
        lblNombre5.setBounds(10, 400, 130, 22);

        txfCp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCp.setBorder(null);
        txfCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCpKeyPressed(evt);
            }
        });
        jPanel1.add(txfCp);
        txfCp.setBounds(10, 430, 280, 17);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(10, 450, 280, 10);

        lblNombre6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre6.setText("Teléfono:");
        lblNombre6.setToolTipText("");
        jPanel1.add(lblNombre6);
        lblNombre6.setBounds(10, 460, 130, 22);

        txfTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfTelefono.setBorder(null);
        txfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfTelefonoKeyPressed(evt);
            }
        });
        jPanel1.add(txfTelefono);
        txfTelefono.setBounds(10, 490, 280, 17);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(10, 520, 280, 10);

        lblNombre7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre7.setText("Celular");
        lblNombre7.setToolTipText("");
        jPanel1.add(lblNombre7);
        lblNombre7.setBounds(10, 530, 130, 22);

        txfCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCelular.setBorder(null);
        txfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCelularKeyPressed(evt);
            }
        });
        jPanel1.add(txfCelular);
        txfCelular.setBounds(10, 560, 280, 17);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(10, 590, 280, 10);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 800));

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

        lblTextTelefono.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextTelefono.setForeground(new java.awt.Color(0, 0, 153));
        lblTextTelefono.setText("El número telefónico es #################");

        lblTextCp.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextCp.setForeground(new java.awt.Color(0, 0, 153));
        lblTextCp.setText("El código postal es #################");

        lblTextRegimen.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextRegimen.setForeground(new java.awt.Color(0, 0, 153));
        lblTextRegimen.setText("El regimen es #################");

        lblTextCelular.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        lblTextCelular.setForeground(new java.awt.Color(0, 0, 153));
        lblTextCelular.setText("El número celular es #################");

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
                            .addComponent(lblTextRFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextCp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextRegimen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(32, 32, 32)
                .addComponent(lblTextImpresora)
                .addGap(40, 40, 40)
                .addComponent(lblTextRegimen)
                .addGap(28, 28, 28)
                .addComponent(lblTextCp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTextTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTextCelular)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionalidad();
    }//GEN-LAST:event_btnGuardarActionPerformed
    public void funcionalidad() {
        if (!revisarVacios()) {
            Configuracion con = new Configuracion();
            con.setDireccion(txfDireccion.getText());
            con.setImpresora(comboImpresora.getSelectedItem() + "");
            con.setNombre(txfNombre.getText());
            con.setRfc(txfRFC.getText());
            con.setCp(txfCp.getText());
            con.setRegimen(txfRegimen.getText());
            con.setTelefono(txfTelefono.getText());
            con.setCelular(txfCelular.getText());
            ResponseDatos<Configuracion> res = ConsumoApi.configuracion(Enviroment.local + "/v1/configuracion", con, "PUT");

            Utilidades.mensajePorTiempo(res.getMensaje());
            if (res.getRealizado() == true) {
                limpiarDatos();
                inicializarDatos();
            }
        } else {
            Utilidades.mensajePorTiempo("No puede haber campos vacios, por favor registra todos los datos");
        }
    }
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

    private void txfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreKeyPressed

    private void txfDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDireccionKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccionKeyPressed

    private void txfRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfRFCKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txfRFCKeyPressed

    private void comboImpresoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboImpresoraKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_comboImpresoraKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void txfRegimenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfRegimenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfRegimenKeyPressed

    private void txfCpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCpKeyPressed

    private void txfTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefonoKeyPressed

    private void txfCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularKeyPressed
    public void limpiarDatos() {
        txfNombre.setText("");
        txfDireccion.setText("");
        txfRFC.setText("");
        comboImpresora.setSelectedItem("");
        txfRegimen.setText("");
        txfCp.setText("");
        txfTelefono.setText("");
        txfCelular.setText("");
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblIconConfiguracion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblTextCelular;
    private javax.swing.JLabel lblTextCp;
    private javax.swing.JLabel lblTextDireccion;
    private javax.swing.JLabel lblTextImpresora;
    private javax.swing.JLabel lblTextNombre;
    private javax.swing.JLabel lblTextRFC;
    private javax.swing.JLabel lblTextRegimen;
    private javax.swing.JLabel lblTextTelefono;
    private javax.swing.JTextField txfCelular;
    private javax.swing.JTextField txfCp;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfRFC;
    private javax.swing.JTextField txfRegimen;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
