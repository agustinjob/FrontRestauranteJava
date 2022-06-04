/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.modelos.Categoria;
import com.job.modelos.Producto;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.job.ambiente.Enviroment;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author agus_
 */
public class ContenedorProductos extends javax.swing.JPanel {

    List<Producto> lista;
    Producto seleccionado;

    public ContenedorProductos() {
        initComponents();
    }

    public void llenarCombo() {
        String catGeneral = (String) comboCategoriaGeneral.getSelectedItem();
        comboCategoriaEspecifica.removeAllItems();
        ResponseDatos<Categoria> res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias-cate/" + catGeneral, null, "GET");
        Categoria vacio = new Categoria();
        vacio.setId("0");
        //   comboCategoriaEspecifica.addItem(vacio);
        for (Categoria c : res.getDatos()) {
            comboCategoriaEspecifica.addItem(c);
        }
    }

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void llenarTabla(int tipo) {
        limpiarTabla();
        ResponseDatos res;
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        if (tipo == 1) {
            res = ConsumoApi.productos(Enviroment.local + "/v1/productos", null, "GET");
        } else {
            String busqueda = txfBusqueda.getText();
            busqueda = busqueda.equalsIgnoreCase("") ? "*" : busqueda;
            res = ConsumoApi.productos(Enviroment.local + "/v1/productos/nombre/" + busqueda.replace(" ", "%20"), null, "GET");
        }
        lista = res.getDatos();
        String datos[] = new String[5];
        for (Producto u : lista) {
            datos[0] = u.getId();
            datos[1] = u.getNombre();
            datos[2] = u.getPrecio() + "";
            datos[3] = u.getCategoriaGeneral();
            datos[4] = u.getCategoriaEspecifica();

            model.addRow(datos);
        }
    }

    public void limpiarFormulario() {
        txfNombre.setText("");
        txfId.setText("");
        txfPrecio.setText("");
        comboCategoriaEspecifica.setEnabled(false);
        seleccionado = null;
        btnGuardar.setText("GUARDAR");
    }

    public final void llenarIconos() {
        lblIconProductos.setIcon(Iconos.productos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblIconProductos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txfPrecio = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        comboCategoriaGeneral = new javax.swing.JComboBox<>();
        comboCategoriaEspecifica = new javax.swing.JComboBox<Categoria>();
        lblNombre3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        exitTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblNombre4 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("PRODUCTOS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        add(lblIconProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, 80));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 130, -1));

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNombreKeyPressed(evt);
            }
        });
        add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 280, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, 280, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, 280, 10));

        txfPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfPrecio.setBorder(null);
        txfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPrecioKeyPressed(evt);
            }
        });
        add(txfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 280, -1));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Precio:");
        lblNombre1.setToolTipText("");
        add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 228, 130, -1));

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("Categoría general:");
        lblNombre2.setToolTipText("");
        add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 180, -1));

        comboCategoriaGeneral.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCategoriaGeneral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Alimentos", "Bebidas", "Otros" }));
        comboCategoriaGeneral.setBorder(null);
        comboCategoriaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaGeneralActionPerformed(evt);
            }
        });
        comboCategoriaGeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCategoriaGeneralKeyPressed(evt);
            }
        });
        add(comboCategoriaGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 324, 280, -1));

        comboCategoriaEspecifica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCategoriaEspecifica.setModel(new javax.swing.DefaultComboBoxModel<Categoria>());
        comboCategoriaEspecifica.setBorder(null);
        comboCategoriaEspecifica.setEnabled(false);
        comboCategoriaEspecifica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCategoriaEspecificaKeyPressed(evt);
            }
        });
        add(comboCategoriaEspecifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 395, 280, -1));

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre3.setText("Categoría especifica:");
        lblNombre3.setToolTipText("");
        add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, -1, -1));

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
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, -1));

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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 410));

        tablaProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Precio", "Cat. General", "Cat. Especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductos.setMinimumSize(new java.awt.Dimension(300, 200));
        tablaProductos.setShowGrid(false);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        tablaProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
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

        jLabel1.setText("Ingresa el nombre del producto a buscar");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txfBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jSeparator4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 620));

        lblNombre4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre4.setText("ID:");
        lblNombre4.setToolTipText("");
        add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        txfId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfId.setBorder(null);
        txfId.setEnabled(false);
        add(txfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 280, 10));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionalidad();
    }//GEN-LAST:event_btnGuardarActionPerformed
    public void funcionalidad() {
        try {
            if (!revisarVacios()) {
                if (btnGuardar.getText().equals("MODIFICAR")) {
                    seleccionado.setNombre(txfNombre.getText());
                    seleccionado.setCategoriaEspecifica(comboCategoriaEspecifica.getSelectedItem() + "");
                    seleccionado.setCategoriaGeneral(comboCategoriaGeneral.getSelectedItem() + "");
                    seleccionado.setEstatus("vigente");
                    seleccionado.setPrecio(Double.parseDouble(txfPrecio.getText()));
                    ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local + "/v1/productos", seleccionado, "PUT");
                    Utilidades.mensajePorTiempo(res.getMensaje());

                } else {
                    seleccionado = new Producto();
                    seleccionado.setPrecio(Double.parseDouble(txfPrecio.getText()));
                    seleccionado.setNombre(txfNombre.getText());
                    seleccionado.setCategoriaEspecifica(comboCategoriaEspecifica.getSelectedItem() + "");
                    seleccionado.setCategoriaGeneral(comboCategoriaGeneral.getSelectedItem() + "");
                    seleccionado.setEstatus("vigente");
                    ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local + "/v1/productos", seleccionado, "POST");
                    Utilidades.mensajePorTiempo(res.getMensaje());

                }
                limpiarFormulario();
                llenarTabla(1);
            } else {
                Utilidades.mensajePorTiempo("No puede haber campos vacios, por favor registra todos los datos");
            }
        } catch (NumberFormatException n) {
            Utilidades.mensajePorTiempo("Por favor revisa tu información ingresada, el precio debe ser un valor númerico");
        }
    }
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

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //    exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.red);
    }//GEN-LAST:event_exitTxtMouseExited

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed

    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void comboCategoriaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaGeneralActionPerformed
        comboCategoriaEspecifica.setEnabled(true);
        llenarCombo();
    }//GEN-LAST:event_comboCategoriaGeneralActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tablaProductos.getSelectedRow();
        if (row != -1) {
            seleccionado.setEstatus("eliminado");
            ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local + "/v1/productos", seleccionado, "PUT");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla(1);

        } else {
            Utilidades.mensajePorTiempo("Por favor selecciona un usuario para eliminar sus datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenarTabla(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyTyped
        llenarTabla(2);
    }//GEN-LAST:event_txfBusquedaKeyTyped

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int row = tablaProductos.getSelectedRow();
        if (row != -1) {
            String id = (String) tablaProductos.getValueAt(row, 0);

            for (Producto u : lista) {
                if (u.getId().equals(id)) {
                    seleccionado = u;
                    break;
                }
            }

            txfNombre.setText(seleccionado.getNombre());
            comboCategoriaGeneral.setSelectedItem(seleccionado.getCategoriaGeneral());
            llenarCombo();
            comboCategoriaEspecifica.setSelectedItem(seleccionado.getCategoriaEspecifica());
            txfPrecio.setText(seleccionado.getPrecio() + "");
            txfId.setText(seleccionado.getId());
            btnGuardar.setText("MODIFICAR");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void txfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreKeyPressed

    private void txfPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPrecioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }   // TODO add your handling code here:
    }//GEN-LAST:event_txfPrecioKeyPressed

    private void comboCategoriaGeneralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoriaGeneralKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaGeneralKeyPressed

    private void comboCategoriaEspecificaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoriaEspecificaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaEspecificaKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
   if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarKeyPressed

    public boolean revisarVacios() {

        List<String> datos = new ArrayList<>();
        datos.add(txfNombre.getText());
        datos.add(txfPrecio.getText());
        datos.add((String) comboCategoriaGeneral.getSelectedItem());
        Categoria c = (Categoria) comboCategoriaEspecifica.getSelectedItem();
        datos.add(c.getNombre());
        return Utilidades.hayVacios(datos);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Categoria> comboCategoriaEspecifica;
    private javax.swing.JComboBox<String> comboCategoriaGeneral;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblIconProductos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
