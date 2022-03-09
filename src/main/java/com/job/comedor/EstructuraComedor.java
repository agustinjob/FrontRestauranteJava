/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import com.job.restjob.SolicitudPassword;
import com.job.utilidades.Iconos;

/**
 *
 * @author agus_
 */
public class EstructuraComedor extends javax.swing.JFrame {

    public EstructuraComedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();

    }

    public final void llenarIconos() {
        lblIconoAbrirCuenta.setIcon(Iconos.abrirCuenta);
        lblIconoCancelarProducto.setIcon(Iconos.cancelarProducto);
        lblIconoJuntarCuentas.setIcon(Iconos.juntarCuentas);
        lblIconoDividirCuenta.setIcon(Iconos.dividirCuenta);
        lblIconoCapturar.setIcon(Iconos.capturar);
        lblIconoRenombrarCuenta.setIcon(Iconos.renombrarCuenta);
        lblIconoCambiarMesero.setIcon(Iconos.cambioMesero);
        lblIconoDescuento.setIcon(Iconos.descuento);
        lblIconoPagarCuenta.setIcon(Iconos.pagarCuenta);
        lblIconoImprimir.setIcon(Iconos.imprimir);
        lblIconoReabrirCuenta.setIcon(Iconos.reabrirCuenta);
        lblIconoComedor.setIcon(Iconos.comedor);
        // lblIcono.setIcon();
        // lblIcono.setIcon();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCuentas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblIconoComedor = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIconoAbrirCuenta = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblIconoCancelarProducto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblIconoJuntarCuentas = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblIconoDividirCuenta = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblIconoRenombrarCuenta = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblIconoCapturar = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblIconoCambiarMesero = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblIconoDescuento = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblIconoPagarCuenta = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblIconoReabrirCuenta = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblIconoImprimir = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        panelInformacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelMonto = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCuentas.setBackground(new java.awt.Color(255, 255, 255));
        panelCuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        panelCuentas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+4f));
        jTextField1.setBorder(null);
        panelCuentas.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, -1));
        panelCuentas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, -1));

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cuenta", "Orden", "Mesero", "Impresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.setColumnSelectionAllowed(true);
        tablaCuentas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCuentas.setPreferredSize(new java.awt.Dimension(250, 445));
        jScrollPane1.setViewportView(tablaCuentas);

        panelCuentas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 470));

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 540));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("SERVICIO COMEDOR");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel1.add(lblIconoComedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 48));

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelOpciones.setLayout(new java.awt.GridLayout(2, 6, 4, 4));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ABRIR CUENTA");

        lblIconoAbrirCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoAbrirCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoAbrirCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoAbrirCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoAbrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        panelOpciones.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCELAR PROD");

        lblIconoCancelarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoCancelarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoCancelarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCancelarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jLabel6))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCancelarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        panelOpciones.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoJuntarCuentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIconoJuntarCuentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoJuntarCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoJuntarCuentasMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("JUNTAR CUENTAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoJuntarCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jLabel26))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoJuntarCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        panelOpciones.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoDividirCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoDividirCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoDividirCuentaMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("DIVIDIR CUENTA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoDividirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoDividirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel27)))
        );

        panelOpciones.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoRenombrarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoRenombrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoRenombrarCuentaMouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("RENOMBRAR CTA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoRenombrarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoRenombrarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel39)))
        );

        panelOpciones.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoCapturar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoCapturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoCapturarMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CAPTURAR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCapturar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCapturar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel29)))
        );

        panelOpciones.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoCambiarMesero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoCambiarMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoCambiarMeseroMouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("CAMBIAR MESERO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCambiarMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoCambiarMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel31)))
        );

        panelOpciones.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 0, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoDescuentoMouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("DESCUENTO");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel33)))
        );

        panelOpciones.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 255, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoPagarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoPagarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoPagarCuentaMouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("PAGAR CUENTA");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoPagarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoPagarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel35)))
        );

        panelOpciones.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoReabrirCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoReabrirCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoReabrirCuentaMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("REABRIR CUENTA");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoReabrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoReabrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel37)))
        );

        panelOpciones.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 0, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 102)));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIconoImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("IMPRIMIR");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIconoImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel41)))
        );

        panelOpciones.add(jPanel13);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 10, 780, 130));

        panelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        panelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CUENTA:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ÁREA:");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FOLIO:");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("MESA:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("MESERO:");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ORDEN:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("PERSONA:");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("APERTURA:");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("CIERRE:");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setBorder(null);

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21)
                        .addGap(12, 12, 12)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformacionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel16)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel18)))
                        .addGap(14, 14, 14)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(panelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 800, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Movimiento", "Descripción", "Cantidad", "Precio", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setPreferredSize(new java.awt.Dimension(375, 375));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 800, 260));

        panelMonto.setBackground(new java.awt.Color(204, 204, 204));
        panelMonto.setLayout(new java.awt.GridLayout(6, 1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setText("0.0");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Subtotal:     $");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setText("0.0");
        jTextField6.setBorder(null);
        jPanel16.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Descuento: $");
        jPanel16.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setText("0.0");
        jTextField15.setBorder(null);
        jPanel17.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Impuesto:    $");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setText("0.0");
        jTextField16.setBorder(null);
        jPanel18.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Propina:      $");
        jPanel18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField17.setText("0.0");
        jTextField17.setBorder(null);
        jPanel19.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Cargo:         $");
        jPanel19.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField18.setText("0.0");
        jTextField18.setBorder(null);
        jPanel20.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 51));
        jLabel42.setText("Total           $");
        jPanel20.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel20);

        jPanel1.add(panelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 200, 170));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
        });
        jPanel1.add(exitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void lblIconoAbrirCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoAbrirCuentaMouseClicked
        AbrirCuenta abrir = new AbrirCuenta();
        abrir.setVisible(true);
    }//GEN-LAST:event_lblIconoAbrirCuentaMouseClicked

    private void lblIconoCancelarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoCancelarProductoMouseClicked
        CancelarProducto cancelar = new CancelarProducto();
        cancelar.setVisible(true);

    }//GEN-LAST:event_lblIconoCancelarProductoMouseClicked

    private void lblIconoJuntarCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoJuntarCuentasMouseClicked
        JuntarMesas juntar = new JuntarMesas();
        juntar.setVisible(true);
    }//GEN-LAST:event_lblIconoJuntarCuentasMouseClicked

    private void lblIconoDividirCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoDividirCuentaMouseClicked
        DividirCuenta dividir = new DividirCuenta();
        dividir.setVisible(true);
    }//GEN-LAST:event_lblIconoDividirCuentaMouseClicked

    private void lblIconoRenombrarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoRenombrarCuentaMouseClicked
        RenombrarCuenta renombrar = new RenombrarCuenta();
        renombrar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lblIconoRenombrarCuentaMouseClicked

    private void lblIconoCapturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoCapturarMouseClicked
        CapturarProductos capturar = new CapturarProductos();
        capturar.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_lblIconoCapturarMouseClicked

    private void lblIconoCambiarMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoCambiarMeseroMouseClicked
        CambiarMesero cambiarMesero = new CambiarMesero();
        cambiarMesero.setVisible(true);
    }//GEN-LAST:event_lblIconoCambiarMeseroMouseClicked

    private void lblIconoDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoDescuentoMouseClicked
Descuento descuento = new Descuento();
descuento.setVisible(true);
    }//GEN-LAST:event_lblIconoDescuentoMouseClicked

    private void lblIconoPagarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoPagarCuentaMouseClicked
Pagar pagar = new Pagar();
pagar.setVisible(true);
    }//GEN-LAST:event_lblIconoPagarCuentaMouseClicked

    private void lblIconoReabrirCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoReabrirCuentaMouseClicked
SolicitudPassword password=new SolicitudPassword();
password.setVisible(true);
    }//GEN-LAST:event_lblIconoReabrirCuentaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstructuraComedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstructuraComedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstructuraComedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstructuraComedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstructuraComedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblIconoAbrirCuenta;
    private javax.swing.JLabel lblIconoCambiarMesero;
    private javax.swing.JLabel lblIconoCancelarProducto;
    private javax.swing.JLabel lblIconoCapturar;
    private javax.swing.JLabel lblIconoComedor;
    private javax.swing.JLabel lblIconoDescuento;
    private javax.swing.JLabel lblIconoDividirCuenta;
    private javax.swing.JLabel lblIconoImprimir;
    private javax.swing.JLabel lblIconoJuntarCuentas;
    private javax.swing.JLabel lblIconoPagarCuenta;
    private javax.swing.JLabel lblIconoReabrirCuenta;
    private javax.swing.JLabel lblIconoRenombrarCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelMonto;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tablaCuentas;
    // End of variables declaration//GEN-END:variables
}
