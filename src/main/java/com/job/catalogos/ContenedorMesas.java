/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.modelos.Mesa;
import com.job.modelos.Usuario;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.Color;
import java.util.List;
import com.job.ambiente.Enviroment;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agus_
 */
public class ContenedorMesas extends javax.swing.JPanel {

    List<Mesa> lista;
    Mesa seleccionado;

    public ContenedorMesas() {
        initComponents();
        llenarIconos();
    }

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaMesas.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void llenarTabla(int tipo) {
        limpiarTabla();
        DefaultTableModel model = (DefaultTableModel) tablaMesas.getModel();
        ResponseDatos res;
        if (tipo == 1) {
            res = ConsumoApi.mesas(Enviroment.local + "/v1/mesas", null, "GET");
        } else {
            String busqueda = txfBusqueda.getText();
            busqueda = busqueda.equalsIgnoreCase("") ? "*" : busqueda;
            res = ConsumoApi.mesas(Enviroment.local + "/v1/mesas/mesa/" + busqueda.replace(" ", "%20"), null, "GET");

        }
        lista = res.getDatos();
        String datos[] = new String[5];
        for (Mesa u : lista) {
            datos[0] = u.getId();
            datos[1] = u.getMesa();
            model.addRow(datos);
        }
    }

    public final void llenarIconos() {
        lblIconMesas.setIcon(Iconos.mesas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblIconMesas = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txfId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMesas = new javax.swing.JTable();
        exitTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        txfDescripcion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("MESAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        add(lblIconMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 80));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("ID:");
        lblNombre.setToolTipText("");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 10));

        txfId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfId.setBorder(null);
        txfId.setEnabled(false);
        add(txfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, -1));

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
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, -1));

        jPanel1.setBackground(new java.awt.Color(245, 244, 250));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("CONSULTAR DATOS");

        txfBusqueda.setBackground(new java.awt.Color(245, 244, 250));
        txfBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfBusqueda.setBorder(null);
        txfBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfBusquedaMouseClicked(evt);
            }
        });
        txfBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBusquedaActionPerformed(evt);
            }
        });
        txfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBusquedaKeyTyped(evt);
            }
        });

        tablaMesas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tablaMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaMesas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaMesas.setShowGrid(false);
        tablaMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMesas);
        tablaMesas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaMesas.getColumnModel().getColumnCount() > 0) {
            tablaMesas.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaMesas.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

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
        });

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa el nombre de la mesa a buscar");

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("TODOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txfBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jSeparator4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 850, 590));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Descripción:");
        lblNombre1.setToolTipText("");
        add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        txfDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfDescripcion.setBorder(null);
        txfDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfDescripcionKeyPressed(evt);
            }
        });
        add(txfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 10));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txfBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBusquedaMouseClicked
        txfBusqueda.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txfBusquedaMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Estructura.catalogos.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //     exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void tablaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMesasMouseClicked
        int row = tablaMesas.getSelectedRow();
        if (row != -1) {
            String id = (String) tablaMesas.getValueAt(row, 0);

            for (Mesa u : lista) {
                if (u.getId().equals(id)) {
                    this.seleccionado = u;
                    break;
                }
            }
            txfId.setText(this.seleccionado.getId());
            txfDescripcion.setText(this.seleccionado.getMesa());
            btnGuardar.setText("MODIFICAR");
        }
    }//GEN-LAST:event_tablaMesasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionalidad();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void funcionalidad() {
        if (!txfDescripcion.getText().equalsIgnoreCase("")) {
            if (btnGuardar.getText().equals("MODIFICAR")) {
                this.seleccionado.setMesa(txfDescripcion.getText());
                ResponseDatos<Mesa> res = ConsumoApi.mesas(Enviroment.local + "/v1/mesas", this.seleccionado, "POST");
                Utilidades.mensajePorTiempo(res.getMensaje());

            } else {
                seleccionado = new Mesa();
                seleccionado.setMesa(txfDescripcion.getText());
                ResponseDatos<Mesa> res = ConsumoApi.mesas(Enviroment.local + "/v1/mesas", seleccionado, "POST");
                Utilidades.mensajePorTiempo(res.getMensaje());

            }
            limpiarFormulario();
            llenarTabla(1);
        } else {
            Utilidades.mensajePorTiempo("No puede haber campos vacios, por favor registra todos los datos", 3000);
        }
    }

    public void limpiarFormulario() {
        txfId.setText("");
        txfDescripcion.setText("");
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
        btnGuardar.setText("GUARDAR");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tablaMesas.getSelectedRow();
        if (row != -1) {

            ResponseDatos<Mesa> res = ConsumoApi.mesas(Enviroment.local + "/v1/mesas/" + seleccionado.getId(), seleccionado, "DELETE");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla(1);

        } else {
            Utilidades.mensajePorTiempo("Por favor selecciona un elemento para eliminar sus datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyTyped

    }//GEN-LAST:event_txfBusquedaKeyTyped

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void txfBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyPressed
        llenarTabla(2);
    }//GEN-LAST:event_txfBusquedaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenarTabla(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void txfDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfDescripcionKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblIconMesas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTable tablaMesas;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfDescripcion;
    private javax.swing.JTextField txfId;
    // End of variables declaration//GEN-END:variables
}
