/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.ambiente.Enviroment;
import com.job.modelos.Categoria;
import com.job.modelos.Mesero;
import com.job.modelos.Usuario;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agus_
 */
public class ContenedorCategorias extends javax.swing.JPanel {

    List<Categoria> lista;
    Categoria seleccionado;

    public ContenedorCategorias() {
        initComponents();
        llenarIconos();
    }

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaCategoria.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void llenarTabla(int tipo) {
        limpiarTabla();
        ResponseDatos res;
        DefaultTableModel model = (DefaultTableModel) tablaCategoria.getModel();
        if (tipo == 1) {
            res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias", null, "GET");
        } else {
            String busqueda = txfBusqueda.getText();
            busqueda = busqueda.equalsIgnoreCase("") ? "*" : busqueda;
            res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias/nombre/" + busqueda.replace(" ", "%20"), null, "GET");

        }
        lista = res.getDatos();
        String datos[] = new String[3];
        for (Categoria u : lista) {
            datos[0] = u.getId();
            datos[1] = u.getNombre();
            datos[2] = u.getCategoria();

            model.addRow(datos);
        }
    }

    public void limpiarFormulario() {
        txfNombre.setText("");
        txfId.setText("");
        seleccionado = null;
        comboCategoria.setSelectedIndex(0);
        btnGuardar.setText("GUARDAR");
    }

    public final void llenarIconos() {
        lblIconCategorias.setIcon(Iconos.usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblIconCategorias = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        lblNombre2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        exitTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNombreKeyPressed(evt);
            }
        });
        add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 10));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("CATEGORÍAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        add(lblIconCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 80));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        comboCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Alimentos", "Bebidas", "Otros" }));
        comboCategoria.setBorder(null);
        comboCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCategoriaKeyPressed(evt);
            }
        });
        add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 280, -1));

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("Categoría general:");
        lblNombre2.setToolTipText("");
        add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, -1));

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
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBusquedaKeyTyped(evt);
            }
        });

        tablaCategoria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cat. General"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCategoria.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCategoria.setPreferredSize(null);
        tablaCategoria.setShowGrid(false);
        tablaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCategoria);
        tablaCategoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("TODOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa el nombre de la categoría a buscar");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txfBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jSeparator4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(11, 11, 11)))))
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 860, 600));

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre3.setText("ID:");
        lblNombre3.setToolTipText("");
        add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        txfId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfId.setBorder(null);
        txfId.setEnabled(false);
        add(txfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 10));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionalidad();
    }//GEN-LAST:event_btnGuardarActionPerformed
    public void funcionalidad() {
        String cateSele = (String) comboCategoria.getSelectedItem();
      
        if (!txfNombre.getText().trim().equalsIgnoreCase("") && !cateSele.trim().equalsIgnoreCase("")) {
            if (btnGuardar.getText().equals("MODIFICAR")) {
                seleccionado.setNombre(txfNombre.getText());
                seleccionado.setCategoria(comboCategoria.getSelectedItem() + "");
                ResponseDatos<Categoria> res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias", seleccionado, "PUT");
                Utilidades.mensajePorTiempo(res.getMensaje());

            } else {
                seleccionado = new Categoria();
                seleccionado.setNombre(txfNombre.getText());
                seleccionado.setCategoria(comboCategoria.getSelectedItem() + "");
                ResponseDatos<Categoria> res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias", seleccionado, "POST");
                Utilidades.mensajePorTiempo(res.getMensaje());

            }
            limpiarFormulario();
            llenarTabla(1);
        } else {
            Utilidades.mensajePorTiempo("Por favor ingresa todos los datos solicitados", 3000);
        }
    }
    private void txfBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBusquedaMouseClicked
        txfBusqueda.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txfBusquedaMouseClicked

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Estructura.catalogos.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //     exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //    exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.red);
    }//GEN-LAST:event_exitTxtMouseExited

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tablaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriaMouseClicked
        int row = tablaCategoria.getSelectedRow();
        if (row != -1) {
            String id = (String) tablaCategoria.getValueAt(row, 0);

            for (Categoria u : lista) {
                if (u.getId().equals(id)) {
                    seleccionado = u;
                    break;
                }
            }

            txfNombre.setText(seleccionado.getNombre());
            comboCategoria.setSelectedItem(seleccionado.getCategoria());
            txfId.setText(seleccionado.getId());
            btnGuardar.setText("MODIFICAR");
        }
    }//GEN-LAST:event_tablaCategoriaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tablaCategoria.getSelectedRow();
        if (row != -1) {
            ResponseDatos<Categoria> res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias/" + seleccionado.getId(), seleccionado, "DELETE");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla(1);
        } else {
            Utilidades.mensajePorTiempo("Por favor selecciona un usuario para eliminar sus datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenarTabla(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyTyped
        llenarTabla(2);
    }//GEN-LAST:event_txfBusquedaKeyTyped

    private void txfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreKeyPressed

    private void comboCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoriaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblIconCategorias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
