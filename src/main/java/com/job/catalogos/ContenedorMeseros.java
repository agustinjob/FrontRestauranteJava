/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.catalogos;

import com.job.modelos.Mesero;
import com.job.modelos.Usuario;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agus_
 */
public class ContenedorMeseros extends javax.swing.JPanel {

    List<Mesero> lista;
    Mesero seleccionado;

    public ContenedorMeseros() {
        initComponents();
        llenarIconos();
    }

    public final void llenarIconos() {
        lblIconMeseros.setIcon(Iconos.mesero);
    }
    
      public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaMeseros.getModel();
        
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
      
      public void llenarTabla(int tipo) {
        limpiarTabla();
        ResponseDatos res;
        DefaultTableModel model = (DefaultTableModel) tablaMeseros.getModel();
         if (tipo == 1) {
            res = ConsumoApi.meseros("http://localhost:8082/v1/meseros", null, "GET");
        } else {
            String busqueda = txfBusqueda.getText();
            busqueda = busqueda.equalsIgnoreCase("") ? "*" : busqueda;
            res = ConsumoApi.meseros("http://localhost:8082/v1/meseros/nombre/" + busqueda.replace(" ", "%20"), null, "GET");

        }
        lista = res.getDatos();
        String datos[] = new String[3];
        for (Mesero u : lista) {
            datos[0] = u.getId();
            datos[1] = u.getNombre();
            datos[2] = u.getCelular();

            model.addRow(datos);
        }
    }
      
      public void limpiarFormulario() {
        txfNombre.setText("");
        txfCelular.setText("");
        txfId.setText("");
        seleccionado = null;
        btnGuardar.setText("GUARDAR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblIconMeseros = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txfNombre = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txfCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMeseros = new javax.swing.JTable();
        exitTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        todos = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNombre2 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("MESEROS");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setToolTipText("");

        txfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfNombre.setBorder(null);

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre1.setText("Celular:");
        lblNombre1.setToolTipText("");

        txfCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCelular.setBorder(null);

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
        txfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBusquedaKeyTyped(evt);
            }
        });

        tablaMeseros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tablaMeseros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaMeseros.setGridColor(new java.awt.Color(255, 255, 255));
        tablaMeseros.setPreferredSize(null);
        tablaMeseros.setShowGrid(false);
        tablaMeseros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMeserosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMeseros);
        tablaMeseros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        jLabel1.setText("Ingresa el nombre del mesero a buscar");

        todos.setBackground(new java.awt.Color(204, 102, 0));
        todos.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        todos.setForeground(new java.awt.Color(255, 255, 255));
        todos.setText("TODOS");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
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
                                .addComponent(todos)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(todos)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

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

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre2.setText("ID:");
        lblNombre2.setToolTipText("");

        txfId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfId.setBorder(null);
        txfId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)
                    .addComponent(lblIconMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 940, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre2)
                .addGap(8, 8, 8)
                .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addGap(8, 8, 8)
                .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNombre1)
                .addGap(8, 8, 8)
                .addComponent(txfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel4))
                        .addComponent(lblIconMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 522, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      if (btnGuardar.getText().equals("MODIFICAR")) {
            seleccionado.setNombre(txfNombre.getText());
            seleccionado.setCelular(txfCelular.getText());
            ResponseDatos<Mesero> res = ConsumoApi.meseros("http://localhost:8082/v1/meseros", seleccionado, "PUT");
            Utilidades.mensajePorTiempo(res.getMensaje());
           
        } else {
            seleccionado = new Mesero();
            seleccionado.setNombre(txfNombre.getText());
            seleccionado.setCelular(txfCelular.getText());     
            ResponseDatos<Mesero> res = ConsumoApi.meseros("http://localhost:8082/v1/meseros", seleccionado, "POST");
            Utilidades.mensajePorTiempo(res.getMensaje());
           
        }
         limpiarFormulario();
            llenarTabla(1);
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tablaMeserosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMeserosMouseClicked
              int row = tablaMeseros.getSelectedRow();
        if (row != -1) {
            String id = (String) tablaMeseros.getValueAt(row, 0);
            
            for (Mesero u : lista) {
                if (u.getId().equals(id)) {
                    seleccionado = u;
                    break;
                }
            }
            txfNombre.setText(seleccionado.getNombre());
            txfCelular.setText(seleccionado.getCelular());
            txfId.setText(seleccionado.getId());
            btnGuardar.setText("MODIFICAR");
        }
    }//GEN-LAST:event_tablaMeserosMouseClicked

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
     llenarTabla(1);
    }//GEN-LAST:event_todosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tablaMeseros.getSelectedRow();
        if (row != -1) {
        
            ResponseDatos<Mesero> res = ConsumoApi.meseros("http://localhost:8082/v1/meseros/"+seleccionado.getId(), seleccionado, "DELETE");
            Utilidades.mensajePorTiempo(res.getMensaje());
            limpiarFormulario();
            llenarTabla(1);
            
        } else {
            Utilidades.mensajePorTiempo("Por favor selecciona un mesero para eliminar sus datos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyTyped
       llenarTabla(2);
    }//GEN-LAST:event_txfBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblIconMeseros;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JTable tablaMeseros;
    private javax.swing.JButton todos;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfCelular;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
