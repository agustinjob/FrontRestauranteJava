/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import static com.job.comedor.EstructuraComedor.idCuentaSeleccionada;
import com.job.modelos.Cuenta;
import com.job.modelos.Producto;
import com.job.modelos.ProductoCuenta;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.job.ambiente.Enviroment;

/**
 *
 * @author agus_
 */
public class DividirCuenta extends javax.swing.JFrame {

    List<ProductoCuenta> productos;
    Cuenta cuentaSeleccionada;

    public DividirCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        deshabilitarCols();
        txfCuenta.setText(EstructuraComedor.nombreCuentaSeleccionada);

        /*
        .getColumnModel().getColumn(4).setMaxWidth(0);
        .getColumnModel().getColumn(4).setMinWidth(0);
        .getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        .getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
         */
        llenarTabla();
    }

    public final void deshabilitarCols() {
        tablaProductos.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(5).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tablaProductos.getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(6).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        tablaProductos.getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(7).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);

        tablaCuenta1.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta1.getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta1.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta1.getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta1.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta1.getColumnModel().getColumn(5).setMinWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta1.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);

        tablaCuenta2.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta2.getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta2.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta2.getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta2.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta2.getColumnModel().getColumn(5).setMinWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta2.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);

        tablaCuenta3.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta3.getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta3.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta3.getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta3.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta3.getColumnModel().getColumn(5).setMinWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta3.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);

        tablaCuenta4.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta4.getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuenta4.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta4.getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuenta4.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta4.getColumnModel().getColumn(5).setMinWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaCuenta4.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfCuenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuenta2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCuenta4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCuenta1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCuenta3 = new javax.swing.JTable();
        btnC4 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txfTotal1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfTotal2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfTotal3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfTotal4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("DIVIDIR CUENTA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cuenta origen:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txfCuenta.setBackground(new java.awt.Color(235, 230, 249));
        txfCuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txfCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCuenta.setBorder(null);
        txfCuenta.setEnabled(false);
        jPanel1.add(txfCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, -1));

        tablaCuenta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Descripción", "Precio", "id", "general", "especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuenta2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaCuenta2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 320, 180));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mov", "Cant.", "Cant. a mover", "Descripción", "Precio", "id", "general", "especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, true
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
        jScrollPane3.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(30);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(125);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaProductos.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 420, 460));

        tablaCuenta4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Descripción", "Precio", "id", "general", "especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuenta4.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tablaCuenta4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 320, 180));

        tablaCuenta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Descripción", "Precio", "id", "general", "especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuenta1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tablaCuenta1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 320, 180));

        tablaCuenta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Descripción", "Precio", "id", "general", "especifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuenta3.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(tablaCuenta3);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 320, 180));

        btnC4.setBackground(new java.awt.Color(255, 0, 255));
        btnC4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("SELECCIONAR NUEVA CUENTA 4");
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, -1));

        btnC1.setBackground(new java.awt.Color(0, 0, 255));
        btnC1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("SELECCIONAR NUEVA CUENTA 1");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        btnC2.setBackground(new java.awt.Color(102, 255, 102));
        btnC2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("SELECCIONAR NUEVA CUENTA 2");
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        btnC3.setBackground(new java.awt.Color(0, 204, 153));
        btnC3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("ELECCIONAR NUEVA CUENTA 3");
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 260, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Total: $");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        txfTotal1.setBackground(new java.awt.Color(235, 230, 249));
        txfTotal1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txfTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotal1.setText("0");
        txfTotal1.setBorder(null);
        txfTotal1.setEnabled(false);
        jPanel1.add(txfTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 60, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Total: $");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 290, -1, -1));

        txfTotal2.setBackground(new java.awt.Color(235, 230, 249));
        txfTotal2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txfTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotal2.setText("0");
        txfTotal2.setBorder(null);
        txfTotal2.setEnabled(false);
        jPanel1.add(txfTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Total: $");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));

        txfTotal3.setBackground(new java.awt.Color(235, 230, 249));
        txfTotal3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txfTotal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotal3.setText("0");
        txfTotal3.setBorder(null);
        txfTotal3.setEnabled(false);
        jPanel1.add(txfTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 60, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Total: $");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, -1, -1));

        txfTotal4.setBackground(new java.awt.Color(235, 230, 249));
        txfTotal4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txfTotal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotal4.setText("0");
        txfTotal4.setBorder(null);
        txfTotal4.setEnabled(false);
        jPanel1.add(txfTotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 530, 60, -1));

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ACEPTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CANCELAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo1.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\co-dividircuenta.png")); // NOI18N
        jPanel1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        moverDatos(tablaCuenta1);
        obtenerImporte(tablaCuenta1, 1);
        btnC1.setEnabled(false);

    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        moverDatos(tablaCuenta2);
        obtenerImporte(tablaCuenta2, 2);
        btnC2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        moverDatos(tablaCuenta3);
        obtenerImporte(tablaCuenta3, 3);
        btnC3.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        moverDatos(tablaCuenta4);
        obtenerImporte(tablaCuenta4, 4);
        btnC4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnC4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String letras[] = {"-A", "-B", "-C", "-D"};
        int indiceLetra = 0;
        Boolean bandera = true;
        if (tablaCuenta1.getRowCount() > 0) {
            bandera = regresarCuentaNueva(tablaCuenta1, letras[indiceLetra]);
            indiceLetra++;
            if (bandera == false) {
                Utilidades.mensajePorTiempo("Ocurrio un error, por favor verifica los datos de las cuentas creadas");
            }
        }
        if (tablaCuenta2.getRowCount() > 0) {
            bandera = regresarCuentaNueva(tablaCuenta2, letras[indiceLetra]);
            indiceLetra++;
            if (bandera == false) {
                Utilidades.mensajePorTiempo("Ocurrio un error, por favor verifica los datos de las cuentas creadas");
            }
        }
        if (tablaCuenta3.getRowCount() > 0) {
            bandera = regresarCuentaNueva(tablaCuenta3, letras[indiceLetra]);
            indiceLetra++;
            if (bandera == false) {
                Utilidades.mensajePorTiempo("Ocurrio un error, por favor verifica los datos de las cuentas creadas");
            }
        }
        if (tablaCuenta4.getRowCount() > 0) {
            bandera = regresarCuentaNueva(tablaCuenta4, letras[indiceLetra]);
            indiceLetra++;
            if (bandera == false) {
                Utilidades.mensajePorTiempo("Ocurrio un error, por favor verifica los datos de las cuentas creadas");
            }
        }
        bandera = regresarCuentOrigen();
        if (bandera == false) {
            Utilidades.mensajePorTiempo("Ocurrio un error, por favor verifica los datos de las cuentas creadas");
        } else {
            Utilidades.mensajePorTiempo("Operación realizada satisfactoriamente");

            EstructuraComedor.actualizarTabla(1);
            EstructuraComedor.limpiarInformacionCuenta();
            EstructuraComedor.limpiarTablaProductos();
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public Boolean regresarCuentaNueva(JTable ncuenta, String letra) {
        DefaultTableModel model = (DefaultTableModel) ncuenta.getModel();
        Cuenta cuenta = new Cuenta();

        List<ProductoCuenta> prodTrans = new ArrayList<>();

        int i = 0;
        float importe = 0f;
        float total = 0f;
        while (i < model.getRowCount()) {
            int cantidad = Integer.parseInt(model.getValueAt(i, 0) + "");
            float precio = Float.parseFloat(model.getValueAt(i, 2) + "");
            importe = cantidad * precio;
            String descripcion = model.getValueAt(i, 1) + "";
            String id = model.getValueAt(i, 3) + "";
            String general = model.getValueAt(i, 4) + "";
            String especifica = model.getValueAt(i, 5) + "";
            ProductoCuenta p = new ProductoCuenta();
            p.setCantidad(cantidad);
            p.setCatEspecifica(especifica);
            p.setCatGeneral(general);
            p.setCosto(precio);
            p.setEstatus("Registrado");
            p.setId(id);
            p.setNombre(descripcion);
            p.setImporte(importe);
            total = total + importe;
            prodTrans.add(p);

            i++;
        }
// ver despues lo del descuento aquí se debe de aplicar en el monto final
     
        cuenta.setEstatus("abierta");
        
        cuenta.setIdMesero(cuentaSeleccionada.getIdMesero());
        cuenta.setNombreMesero(cuentaSeleccionada.getNombreMesero());
        cuenta.setIdTurno(cuentaSeleccionada.getIdTurno());
        cuenta.setMesa(cuentaSeleccionada.getNombreCuenta());
        cuenta.setPersonas(cuentaSeleccionada.getPersonas());
        cuenta.setProductos(prodTrans);
        cuenta.setDescuento(cuentaSeleccionada.getDescuento());
        cuenta.setMontoTotalDescuento(0);// por lo mientras en lo que hago lo del descuento
        cuenta.setNombreCuenta(cuentaSeleccionada.getNombreCuenta() + letra);
        cuenta.setIva(total * .138F);
        cuenta.setMontoSubtotal(total - (total * .138F));
        cuenta.setMontoTotal(total);
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local+"/v1/cuentas", cuenta, "POST");
        return res.getRealizado();
    }

    public Boolean regresarCuentOrigen() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();

        List<ProductoCuenta> prodTrans = new ArrayList<>();

        int i = 0;
        float importe = 0f;
        float total = 0f;
        while (i < model.getRowCount()) {
            int cantidad = Integer.parseInt(model.getValueAt(i, 1) + "");
            float precio = Float.parseFloat(model.getValueAt(i, 4) + "");
            importe = cantidad * precio;
            String descripcion = model.getValueAt(i, 3) + "";
            String id = model.getValueAt(i, 5) + "";
            String general = model.getValueAt(i, 6) + "";
            String especifica = model.getValueAt(i, 7) + "";
            ProductoCuenta p = new ProductoCuenta();
            p.setCantidad(cantidad);
            p.setCatEspecifica(especifica);
            p.setCatGeneral(general);
            p.setCosto(precio);
            p.setEstatus("Registrado");
            p.setId(id);
            p.setNombre(descripcion);
            p.setImporte(importe);
            prodTrans.add(p);
            total = total + importe;

            i++;
        }
// ver despues lo del descuento aquí se debe de aplicar en el monto final
        cuentaSeleccionada.setProductos(prodTrans);
        cuentaSeleccionada.setApertura(null);
        ResponseDatos<Producto> res = ConsumoApi.productos(Enviroment.local+"/v1/cuentas-cambiar/6", cuentaSeleccionada, "PUT");

        return res.getRealizado();
    }

    public void obtenerImporte(JTable ncuenta, int opcion) {
        DefaultTableModel model = (DefaultTableModel) ncuenta.getModel();
        int i = 0;
        float total = 0f;
        while (i < model.getRowCount()) {
            int cantidad = Integer.parseInt(model.getValueAt(i, 0) + "");
            float precio = Float.parseFloat(model.getValueAt(i, 2) + "");
            total = total + (cantidad * precio);
            i++;
        }
        switch (opcion) {
            case 1:
                txfTotal1.setText(total + "");
                break;
            case 2:
                txfTotal2.setText(total + "");
                break;
            case 3:
                txfTotal3.setText(total + "");
                break;
            case 4:
                txfTotal4.setText(total + "");
                break;
        }

    }

    public final void llenarTabla() {
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local+"/v1/cuentas/" + idCuentaSeleccionada, null, "GET");
        cuentaSeleccionada = res.getDatos().get(0);
        productos = cuentaSeleccionada.getProductos();
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        int i = 0;
        String dats[] = new String[8];
        if (productos != null) {
            for (ProductoCuenta p : productos) {
                dats[0] = (i + 1) + "";
                dats[1] = p.getCantidad() + "";
                dats[2] = "0";
                dats[3] = p.getNombre();
                dats[4] = p.getCosto() + "";
                dats[5] = p.getId();
                dats[6] = p.getCatGeneral();
                dats[7] = p.getCatEspecifica();
                model.addRow(dats);
                i++;
            }
        }

    }

    public void moverDatos(JTable ncuenta) {
        DefaultTableModel model = (DefaultTableModel) ncuenta.getModel();
        DefaultTableModel modelProductos = (DefaultTableModel) tablaProductos.getModel();

        int i = 0;
        try {
            List<String> remover = new ArrayList<>();
            String dat[] = new String[6];
            while (i < modelProductos.getRowCount()) {
                if (modelProductos.getRowCount() == 1) {
                    Utilidades.mensajePorTiempo("No se puede quedar sin ningún producto la cuenta principal");
                } else {
                    int cantidadMover = Integer.parseInt(modelProductos.getValueAt(i, 2) + "");
                    int cantidad = Integer.parseInt(modelProductos.getValueAt(i, 1) + "");
                    String nombre = modelProductos.getValueAt(i, 3) + "";

                    if (cantidadMover != 0) {
                        if (cantidadMover > cantidad) {
                            Utilidades.mensajePorTiempo("La cantidad a mover no puede ser mayor a la cantidad que se tiene registrada del producto: " + nombre);
                        } else {
                            dat[0] = modelProductos.getValueAt(i, 2) + "";
                            dat[1] = modelProductos.getValueAt(i, 3) + "";
                            dat[2] = modelProductos.getValueAt(i, 4) + "";
                            dat[3] = modelProductos.getValueAt(i, 5) + "";
                            dat[4] = modelProductos.getValueAt(i, 6) + "";
                            dat[5] = modelProductos.getValueAt(i, 7) + "";
                            String mov = modelProductos.getValueAt(i, 0) + "";
                            if (cantidadMover < cantidad) {
                                int nuevCanti = cantidad - cantidadMover;
                                modelProductos.setValueAt(nuevCanti + "", i, 1);

                            } else if (cantidadMover == cantidad) {
                                remover.add(mov);
                                //modelProductos.removeRow(i);
                            }
                            model.addRow(dat);
                        }
                    }

                }
                i++;

            }

            for (String r : remover) {
                int c = 0;
                while (modelProductos.getRowCount() > c) {
                    String mov = modelProductos.getValueAt(c, 0) + "";
                    if (mov.equalsIgnoreCase(r)) {
                        modelProductos.removeRow(c);
                        break;
                    }
                    c++;
                }
            }
            int t=0;
            while (modelProductos.getRowCount() > t) {
                modelProductos.setValueAt("0", t, 2);
                t++;
            }
        } catch (NumberFormatException n) {
            Utilidades.mensajePorTiempo("Revisa tu información ingresada, todos los datos deben de ser númericos");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTable tablaCuenta1;
    private javax.swing.JTable tablaCuenta2;
    private javax.swing.JTable tablaCuenta3;
    private javax.swing.JTable tablaCuenta4;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txfCuenta;
    private javax.swing.JTextField txfTotal1;
    private javax.swing.JTextField txfTotal2;
    private javax.swing.JTextField txfTotal3;
    private javax.swing.JTextField txfTotal4;
    // End of variables declaration//GEN-END:variables
}
