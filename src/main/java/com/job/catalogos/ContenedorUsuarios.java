/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import com.job.modelos.Usuario;
import com.job.utilidades.Utilidades;
import java.util.List;
import com.job.response.ResponseDatos;
import com.job.utilidades.Utilidades;
import java.util.Date;

/**
 *
 * @author agus_
 */
public class ContenedorUsuarios extends javax.swing.JPanel {
    
    List<Usuario> lista;
    Usuario seleccionado;
    
    public ContenedorUsuarios() {
        initComponents();
        llenarIconos();
    }
    
    public final void llenarIconos() {
        lblIconUsuarios.setIcon(Iconos.usuarios);
    }

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
        
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void llenarTabla() {
        limpiarTabla();
        DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
        ResponseDatos res = ConsumoApi.usuarios("http://localhost:8082/v1/usuarios", null, "GET");
        lista = res.getDatos();
        String datos[] = new String[5];
        for (Usuario u : lista) {
            datos[0] = u.getIdUsuario();
            datos[1] = u.getNombre();
            datos[2] = u.getUsername();
            datos[3] = u.getPassword();
            datos[4] = u.getTipoUsuario();
            model.addRow(datos);
        }
    }
    
    public void limpiarFormulario() {
        txfNombre.setText("");
        txfUsername.setText("");
        txfPassword.setText("");
        txfId.setText("");
        seleccionado = null;
        btnGuardar.setText("GUARDAR");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconUsuarios = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre2 = new javax.swing.JLabel();
        txfPassword = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombre3 = new javax.swing.JLabel();
        comboTipoUsuario = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        exitTxt = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblNombre4 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lblIconUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 80));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, -1));

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);
        add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, 10));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Username:");
        lblNombre1.setToolTipText("");
        add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        txfUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfUsername.setBorder(null);
        add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 280, 10));

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("Tipo de usuario:");
        lblNombre2.setToolTipText("");
        add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, -1));

        txfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfPassword.setBorder(null);
        add(txfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 280, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 10));

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre3.setText("Password:");
        lblNombre3.setToolTipText("");
        add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, -1));

        comboTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Administrador", "Empleado" }));
        comboTipoUsuario.setBorder(null);
        add(comboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 280, -1));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, -1));

        jPanel1.setBackground(new java.awt.Color(245, 244, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 650));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("CONSULTAR DATOS");

        txfBusqueda.setBackground(new java.awt.Color(245, 244, 250));
        txfBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfBusqueda.setText("Ingresa el nombre del usurio a buscar");
        txfBusqueda.setBorder(null);
        txfBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfBusquedaMouseClicked(evt);
            }
        });

        tablaUsuarios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Username", "Password", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setPreferredSize(new java.awt.Dimension(817, 415));
        tablaUsuarios.setShowGrid(false);
        tablaUsuarios.getTableHeader().setResizingAllowed(false);
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        tablaUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaUsuarios.getColumnModel().getColumn(4).setPreferredWidth(50);
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

        btnEliminar.setBackground(new java.awt.Color(204, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(496, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 850, 580));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("USUARIOS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

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
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, -1));

        lblNombre4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre4.setText("ID:");
        lblNombre4.setToolTipText("");
        add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        txfId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfId.setBorder(null);
        txfId.setEnabled(false);
        add(txfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int row = tablaUsuarios.getSelectedRow();
        if (row != -1) {
            String id = (String) tablaUsuarios.getValueAt(row, 0);
            
            for (Usuario u : lista) {
                if (u.getIdUsuario().equals(id)) {
                    seleccionado = u;
                    break;
                }
            }
            txfNombre.setText(seleccionado.getNombre());
            txfUsername.setText(seleccionado.getUsername());
            txfPassword.setText(seleccionado.getPassword());
            comboTipoUsuario.setSelectedItem(seleccionado.getTipoUsuario());
            txfId.setText(seleccionado.getIdUsuario());
            btnGuardar.setText("MODIFICAR");
        }
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.getText().equals("Actualizar")) {
            seleccionado.setNombre(txfNombre.getText());
            seleccionado.setPassword(txfPassword.getText());
            seleccionado.setTipoUsuario(comboTipoUsuario.getSelectedItem() + "");
            seleccionado.setUsername(txfUsername.getText());
            seleccionado.setEstatus("vigente");
            ResponseDatos<Usuario> res = ConsumoApi.usuarios("http://localhost:8082/v1/usuarios", seleccionado, "POST");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla();
        } else {
            seleccionado = new Usuario();
            seleccionado.setNombre(txfNombre.getText());
            seleccionado.setPassword(txfPassword.getText());
            seleccionado.setTipoUsuario(comboTipoUsuario.getSelectedItem() + "");
            seleccionado.setUsername(txfUsername.getText());
            seleccionado.setEstatus("vigente");
            
            ResponseDatos<Usuario> res = ConsumoApi.usuarios("http://localhost:8082/v1/usuarios", seleccionado, "POST");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = tablaUsuarios.getSelectedRow();
        if (row != -1) {
            seleccionado.setEstatus("eliminado");
            seleccionado.setFechaRegistro(null);
            ResponseDatos<Usuario> res = ConsumoApi.usuarios("http://localhost:8082/v1/usuarios", seleccionado, "POST");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla();
            
        } else {
            Utilidades.mensajePorTiempo("Por favor selecciona un usuario para eliminar sus datos");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboTipoUsuario;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblIconUsuarios;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
