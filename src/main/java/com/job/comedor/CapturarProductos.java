/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import com.job.modelos.Categoria;
import com.job.modelos.Cuenta;
import com.job.modelos.Producto;
import com.job.modelos.ProductoCuenta;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.job.response.ResponseDatos;
import com.job.ambiente.Enviroment;

/**
 *
 * @author agus_
 */
public class CapturarProductos extends javax.swing.JFrame {

    String cateGeneral;
    String cateEspecifica;

    public CapturarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();
        modificarColumnas();

    }

    public final void modificarColumnas() {
        tablaSeleccionados.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaSeleccionados.getColumnModel().getColumn(4).setMinWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tablaSeleccionados.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaSeleccionados.getColumnModel().getColumn(5).setMinWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tablaSeleccionados.getColumnModel().getColumn(6).setMaxWidth(0);
        tablaSeleccionados.getColumnModel().getColumn(6).setMinWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaSeleccionados.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);

        tablaCategorias.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCategorias.getColumnModel().getColumn(0).setMinWidth(0);
        tablaCategorias.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCategorias.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }

    public final void llenarIconos() {
        btnTodos.setIcon(Iconos.todos);
        btnBebidas.setIcon(Iconos.bebidas);
        btnAlimentos.setIcon(Iconos.alimentos);
        btnOtros.setIcon(Iconos.otros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTodos = new javax.swing.JButton();
        btnAlimentos = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();
        txfCategoriaEspecifica = new javax.swing.JTextField();
        txfProductos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSeleccionados = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));

        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 11, 0));

        btnTodos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnTodos.setText("TODOS");
        btnTodos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTodos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos);

        btnAlimentos.setBackground(new java.awt.Color(153, 0, 153));
        btnAlimentos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnAlimentos.setText("ALIMENTOS");
        btnAlimentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlimentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentosActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlimentos);

        btnBebidas.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnBebidas.setText("BEBIDAS");
        btnBebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBebidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        jPanel2.add(btnBebidas);

        btnOtros.setBackground(new java.awt.Color(102, 0, 102));
        btnOtros.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnOtros.setText("OTROS");
        btnOtros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOtros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrosActionPerformed(evt);
            }
        });
        jPanel2.add(btnOtros);

        tablaCategorias.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tablaCategorias.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCategorias);

        txfCategoriaEspecifica.setBackground(new java.awt.Color(235, 230, 249));
        txfCategoriaEspecifica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoría a buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        txfCategoriaEspecifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCategoriaEspecificaMouseClicked(evt);
            }
        });
        txfCategoriaEspecifica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCategoriaEspecificaKeyTyped(evt);
            }
        });

        txfProductos.setBackground(new java.awt.Color(235, 230, 249));
        txfProductos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txfProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto a buscar ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        txfProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfProductosMouseClicked(evt);
            }
        });
        txfProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfProductosActionPerformed(evt);
            }
        });
        txfProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfProductosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfProductosKeyReleased(evt);
            }
        });

        tablaProductos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ACEPTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CANCELAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo1.setText("CAPTURAR PRODUCTOS");

        tablaSeleccionados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Cantidad", "Precio", "Importe", "general", "especifica", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSeleccionados.setGridColor(new java.awt.Color(255, 255, 255));
        tablaSeleccionados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaSeleccionadosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tablaSeleccionados);
        if (tablaSeleccionados.getColumnModel().getColumnCount() > 0) {
            tablaSeleccionados.getColumnModel().getColumn(0).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaSeleccionados.getColumnModel().getColumn(1).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(1).setPreferredWidth(75);
            tablaSeleccionados.getColumnModel().getColumn(2).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(3).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaSeleccionados.getColumnModel().getColumn(4).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(5).setResizable(false);
            tablaSeleccionados.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BORRAR TODO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("BORRAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Selecciona productos para registralos en la cuenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblTitulo)
                .addGap(6, 6, 6)
                .addComponent(lblTitulo1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCategoriaEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton5)
                        .addGap(17, 17, 17)
                        .addComponent(jButton6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(lblTitulo1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txfCategoriaEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EstructuraComedor.btnCapturar.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentosActionPerformed

        cateGeneral = "Alimentos";
        limpiarTextFields();
        llenarTablaCategorias(cateGeneral, 1);
    }//GEN-LAST:event_btnAlimentosActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        txfCategoriaEspecifica.setEnabled(false);
        limpiarTextFields();
        cateGeneral = null;
        cateEspecifica = null;

        llenarTabla(1, "normal");

    }//GEN-LAST:event_btnTodosActionPerformed

    private void tablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriasMouseClicked

        int row = tablaCategorias.getSelectedRow();
        if (row != -1) {
            limpiarTabla(1);
            cateEspecifica = (String) tablaCategorias.getModel().getValueAt(row, 1);
            Utilidades.mensajePorTiempo("Categoria " + cateEspecifica + " seleccionada");
            llenarTabla(2, "normal");
        }// TODO add your handling code here:
    }//GEN-LAST:event_tablaCategoriasMouseClicked

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        limpiarTextFields();
        cateGeneral = "Bebidas";
        llenarTablaCategorias(cateGeneral, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrosActionPerformed
        limpiarTextFields();
        cateGeneral = "Otros";
        llenarTablaCategorias(cateGeneral, 1);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOtrosActionPerformed

    private void txfCategoriaEspecificaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCategoriaEspecificaKeyTyped
        llenarTablaCategorias("", 2);
    }//GEN-LAST:event_txfCategoriaEspecificaKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaSeleccionados.getModel();
        if (modelo.getRowCount() <= 0) {
            Utilidades.mensajePorTiempo("No hay productos seleccionados para agregar a la cuenta");
        } else {
            guardarProductos();
        }
        EstructuraComedor.btnCapturar.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int row = tablaProductos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaSeleccionados.getModel();
        if (row != -1) {

            String id = (String) tablaProductos.getValueAt(row, 0);
            if (!buscarEnTabla(id)) {
                ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local + "/v1/productos/" + id, null, "GET");
                Producto p = res.getDatos().get(0);
                String dat[] = {p.getNombre(), "1", p.getPrecio() + "", p.getPrecio() + "", p.getCategoriaGeneral(), p.getCategoriaEspecifica(), p.getId()};
                Utilidades.mensajePorTiempoCorto("Platillo agregado, cantidad total: 1", 1000);
                modelo.addRow(dat);
            }
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    public boolean buscarEnTabla(String id) {
        DefaultTableModel modelo = (DefaultTableModel) tablaSeleccionados.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            String idProdTabla = (String) modelo.getValueAt(i, 6);
            if (idProdTabla.equalsIgnoreCase(id)) {
                int cantidad = Integer.parseInt(modelo.getValueAt(i, 1) + "");
                cantidad++;
                float precio = Float.parseFloat(modelo.getValueAt(i, 2) + "");
                modelo.setValueAt(cantidad + "", i, 1);
                modelo.setValueAt((cantidad*precio), i, 3);
                Utilidades.mensajePorTiempoCorto("Platillo sumado, cantidad total: "+cantidad, 1000);
                return true;
            }

        }
        return false;
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        limpiarTablaSeleccionados();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int row = tablaSeleccionados.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaSeleccionados.getModel();
        if (row != -1) {
            modelo.removeRow(row);
        } else {
            Utilidades.mensajePorTiempo("Selecciona un elemento, por favor");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void tablaSeleccionadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaSeleccionadosKeyPressed
        int row = tablaSeleccionados.getSelectedRow();
        DefaultTableModel md = (DefaultTableModel) tablaSeleccionados.getModel();
        try {
            if (row != -1) {
                String temp = (String) md.getValueAt(row, 1);
                float precio = Float.parseFloat((String) md.getValueAt(row, 2));
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    md.setValueAt((Integer.parseInt(temp) * precio) + "", row, 3);
                }
                if (evt.getKeyCode() == 107 || evt.getKeyCode() == 521) {
                    Integer cantidad = Integer.parseInt(temp) + 1;
                    md.setValueAt(cantidad + "", row, 1);
                    md.setValueAt((cantidad * precio) + "", row, 3);
                }

                if (evt.getKeyCode() == 109 || evt.getKeyCode() == 45) {
                    if (temp.equalsIgnoreCase("1")) {
                        Utilidades.mensajePorTiempo("No puedes tener un elemento con cantidad '0' ");
                    } else {
                        Integer cantidad = Integer.parseInt(temp) - 1;
                        md.setValueAt(cantidad + "", row, 1);
                        md.setValueAt((cantidad * precio) + "", row, 3);
                    }

                }
            } else {
                Utilidades.mensajePorTiempo("Selecciona un elemento, por favor");
            }
        } catch (NumberFormatException num) {
            Utilidades.mensajePorTiempo("Tienes que ingresar un valor númerico por favor, revisa tu información ingresada");
        }
    }//GEN-LAST:event_tablaSeleccionadosKeyPressed

    private void txfProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfProductosKeyReleased
        if (evt.getKeyCode() != 8) {
            llenarTabla(2, "keypressed");
        }
//Utilidades.mensajePorTiempo(evt.getKeyCode()+"");// TODO add your handling code here:
    }//GEN-LAST:event_txfProductosKeyReleased

    private void txfProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfProductosKeyPressed
        if (evt.getKeyCode() == 8)
            llenarTabla(2, "keypressed");
    }//GEN-LAST:event_txfProductosKeyPressed

    private void txfProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfProductosActionPerformed

    }//GEN-LAST:event_txfProductosActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        EstructuraComedor.btnCapturar.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txfProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfProductosMouseClicked
        txfProductos.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txfProductosMouseClicked

    private void txfCategoriaEspecificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCategoriaEspecificaMouseClicked
        txfCategoriaEspecifica.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_txfCategoriaEspecificaMouseClicked

    public void guardarProductos() {
        String id = EstructuraComedor.idCuentaSeleccionada;
        DefaultTableModel md = (DefaultTableModel) tablaSeleccionados.getModel();
        Cuenta cuenta = new Cuenta();
        cuenta.setIdCuenta(id);

        List<ProductoCuenta> prods = new ArrayList<>();

        int i = 0;
        float importe = 0.0f;
        try {
            while (i < md.getRowCount()) {
                ProductoCuenta prod = new ProductoCuenta();
                prod.setId((String) md.getValueAt(i, 6));
                prod.setCantidad(Integer.parseInt((String) md.getValueAt(i, 1)));
                prod.setCosto(Float.parseFloat((String) md.getValueAt(i, 2)));
                prod.setImporte(Float.parseFloat((String) md.getValueAt(i, 1)) * Float.parseFloat((String) md.getValueAt(i, 2)));
                prod.setCatGeneral((String) md.getValueAt(i, 4));
                prod.setCatEspecifica((String) md.getValueAt(i, 5));
                prod.setNombre((String) md.getValueAt(i, 0));
                prod.setEstatus("Registrado");
                importe = importe + prod.getImporte();

                prods.add(prod);
                i++;

            }
            //Obtención del IVA

            float ivaimporte = importe * .138F;
            cuenta.setMontoSubtotal(importe - ivaimporte);
            cuenta.setMontoTotal(importe);
            cuenta.setIva(ivaimporte);
            cuenta.setProductos(prods);
            ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local + "/v1/cuentas-cambiar/3", cuenta, "PUT");
            Utilidades.mensajePorTiempo(res.getMensaje());
            if (res.getRealizado()) {
                EstructuraComedor.llenarInformacionCuenta();
                this.dispose();
            }

        } catch (NumberFormatException e) {
            Utilidades.mensajePorTiempo("Hay datos no númericos en la tabla de productos seleccionados, por favor revisa tu información");
            System.out.println(e.getLocalizedMessage());
        }

    }

    public void limpiarTablaSeleccionados() {
        DefaultTableModel model = (DefaultTableModel) tablaSeleccionados.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void llenarTablaCategorias(String tipoCat, int tipo) {
        limpiarTabla(3);
        txfCategoriaEspecifica.setEnabled(true);
        DefaultTableModel modelCate = (DefaultTableModel) tablaCategorias.getModel();
        ResponseDatos<Categoria> res = new ResponseDatos<>();
        if (tipo == 1) {
            res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias-cate/" + tipoCat, null, "GET");
        } else {
            String busqueda = txfCategoriaEspecifica.getText();
            if (busqueda.length() > 0) {
                res = ConsumoApi.categorias(Enviroment.local + "/v1/categorias/nombre/" + busqueda.replace(" ", "%20") + "/" + cateGeneral, null, "GET");
            }
        }

        String[] dat = new String[2];
        if (res.getDatos() != null) {
            for (Categoria c : res.getDatos()) {
                dat[0] = c.getId();
                dat[1] = c.getNombre();
                modelCate.addRow(dat);
            }
        }

    }

    public void limpiarTextFields() {
        txfCategoriaEspecifica.setText("");
        txfProductos.setText("");
    }

    public void llenarTabla(int opcion, String tipo) {
        // Opcion 1 todos

        ResponseDatos<Producto> res = new ResponseDatos<>();
        if (tipo.equalsIgnoreCase("normal")) {
            if (opcion == 1) {
                limpiarTabla(3);
                res = ConsumoApi.productos(Enviroment.local + "/v1/productos", null, "GET");
            } else if (opcion == 2) {
                res = ConsumoApi.productos(Enviroment.local + "/v1/productos-cate/" + cateGeneral + "/" + cateEspecifica.replace(" ", "%20"), null, "GET");
            }   //tipo 1 es todos los productos, tipo 2 es mandando las categorias
        } else {
            limpiarTabla(1);
            String busqueda = txfProductos.getText().replace(" ", "%20");
            if (cateEspecifica == null && cateGeneral == null) {

                opcion = 1;
            } else {
                opcion = 2;
            }
            System.out.println(Enviroment.local + "/v1/productos/nombre/" + busqueda + "/" + (cateGeneral == null ? "*" : cateGeneral.replace(" ", "%20")) + "/" + (cateEspecifica == null ? "*" : cateEspecifica.replace(" ", "%20")) + "/" + opcion);

            res = ConsumoApi.productos(Enviroment.local + "/v1/productos/nombre/" + busqueda + "/" + (cateGeneral == null ? "*" : cateGeneral.replace(" ", "%20")) + "/" + (cateEspecifica == null ? "*" : cateEspecifica.replace(" ", "%20")) + "/" + opcion, null, "GET");
        }

        DefaultTableModel modelProds = (DefaultTableModel) tablaProductos.getModel();

        Object obj[] = null;
        int i = 0;
        if (res.getDatos() != null) {
            for (Producto p : res.getDatos()) {
                modelProds.addRow(obj);
                modelProds.setValueAt(p.getId(), i, 0);
                modelProds.setValueAt(p.getNombre(), i, 1);
                i++;
            }
        }
    }

    public void limpiarTabla(int limpiar) {
        if (limpiar != 2) {
            DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
        }

        if (limpiar != 1) {
            DefaultTableModel model = (DefaultTableModel) tablaCategorias.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlimentos;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTable tablaCategorias;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaSeleccionados;
    private javax.swing.JTextField txfCategoriaEspecifica;
    private javax.swing.JTextField txfProductos;
    // End of variables declaration//GEN-END:variables
}
