/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.restjob;

import static com.job.comedor.EstructuraComedor.tablaProductos;
import com.job.comedor.Pagar;
import com.job.modelos.Cuenta;
import com.job.modelos.Datos;
import com.job.modelos.Fechas;
import com.job.modelos.ProductoCuenta;
import com.job.modelos.Turno;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agus_
 */
public class ConsultarCuentas extends javax.swing.JFrame {
    
    static int tipo = 1;
    public static String idCuentaSeleccionada;
    public static Cuenta cu;
    
    public ConsultarCuentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();
        
        fechaI.setVisible(false);
        fechaF.setVisible(false);
        lblAl.setVisible(false);
        comboTipo.setVisible(false);
        comboTurno.setVisible(false);
        tablaCuentas.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuentas.getColumnModel().getColumn(3).setMinWidth(0);
        tablaCuentas.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaCuentas.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        
    }
    
    public final void llenarIconos() {
        /*  lblIconoAbrirCuenta.setIcon(Iconos.abrirCuenta);
        lblIconoCancelarProducto.setIcon(Iconos.cancelarProducto);
        lblIconoCerrar.setIcon(Iconos.cerrar);
        lblIconoImprimir.setIcon(Iconos.imprimir);*/
        lblIcono.setIcon(Iconos.comedor);
        lblIcono.setIcon(Iconos.consultarCuentasSmall);
        btnReabrirCuenta.setIcon(Iconos.reabrirCuenta);
        btnImprimir.setIcon(Iconos.imprimir);
        btnPagarCuenta.setIcon(Iconos.visa);
        btnCerrar.setIcon(Iconos.cerrar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCuentas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        comboTurno = new javax.swing.JComboBox<Turno>();
        comboArchivo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fechaI = new com.toedter.calendar.JDateChooser();
        fechaF = new com.toedter.calendar.JDateChooser();
        lblAl = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        panelMonto = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        txfSubtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        txfDescuento = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txfImpuesto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        txfTotal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnReabrirCuenta = new javax.swing.JButton();
        btnPagarCuenta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        panelInformacion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txfCuenta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txfArea = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txfFolio = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txfMesa = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txfMesero = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txfOrden = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txfPersonas = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txfApertura = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txfCierre = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCuentas.setBackground(new java.awt.Color(255, 255, 255));
        panelCuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio cuenta", "Fecha cierre", "Cuenta/Mesa", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.setColumnSelectionAllowed(true);
        tablaCuentas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaCuentasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCuentas);
        tablaCuentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaCuentas.getColumnModel().getColumnCount() > 0) {
            tablaCuentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaCuentas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaCuentas.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        panelCuentas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 390, 570));

        comboTurno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTurno.setModel(new javax.swing.DefaultComboBoxModel<Turno>());
        panelCuentas.add(comboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, -1));

        comboArchivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboArchivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno actual", "Turnos cerrados" }));
        comboArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArchivoActionPerformed(evt);
            }
        });
        panelCuentas.add(comboArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Archivo:");
        panelCuentas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fechaI.setBackground(new java.awt.Color(255, 255, 255));
        panelCuentas.add(fechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        fechaF.setBackground(new java.awt.Color(255, 255, 255));
        panelCuentas.add(fechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 30));

        lblAl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAl.setText("al");
        panelCuentas.add(lblAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        comboTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Turno", "Periodo" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        panelCuentas.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelCuentas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 30));

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, 690));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("CONSULTA DE CUENTAS");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        jPanel1.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        panelMonto.setBackground(new java.awt.Color(204, 204, 204));
        panelMonto.setLayout(new java.awt.GridLayout(4, 1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfSubtotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfSubtotal.setText("0.0");
        txfSubtotal.setBorder(null);
        txfSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSubtotalActionPerformed(evt);
            }
        });
        jPanel15.add(txfSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Subtotal:     $");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfDescuento.setText("0.0");
        txfDescuento.setBorder(null);
        jPanel16.add(txfDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        lblDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescuento.setText("Descuento: $");
        jPanel16.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfImpuesto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfImpuesto.setText("0.0");
        txfImpuesto.setBorder(null);
        jPanel17.add(txfImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Impuesto:    $");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel17);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfTotal.setText("0.0");
        txfTotal.setBorder(null);
        jPanel20.add(txfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 94, -1));

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

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setLayout(new java.awt.GridLayout(1, 4, 4, 4));

        btnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimir.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        panelOpciones.add(btnImprimir);

        btnReabrirCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btnReabrirCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnReabrirCuenta.setText("REABRIR CUENTA");
        btnReabrirCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReabrirCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReabrirCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReabrirCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnReabrirCuenta);

        btnPagarCuenta.setBackground(new java.awt.Color(0, 255, 204));
        btnPagarCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnPagarCuenta.setText("FORMA DE PAGO");
        btnPagarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnPagarCuenta);

        btnCerrar.setBackground(new java.awt.Color(153, 0, 51));
        btnCerrar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCerrar);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 70, 630, 70));

        panelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        panelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CUENTA:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCuenta.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ÁREA:");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfArea.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FOLIO:");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfFolio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfFolio.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("MESA:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfMesa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfMesa.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("MESERO:");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfMesero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfMesero.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ORDEN:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfOrden.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfOrden.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("PERSONA:");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfPersonas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfPersonas.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("APERTURA:");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfApertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfApertura.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("CIERRE:");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfCierre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfCierre.setBorder(null);

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(txfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21)
                        .addGap(12, 12, 12)
                        .addComponent(txfCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(7, 7, 7)
                                .addComponent(txfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel16)
                                .addGap(4, 4, 4)
                                .addComponent(txfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel18)))
                        .addGap(14, 14, 14)
                        .addComponent(txfOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 760, 120));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 760, 260));

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

    private void txfSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSubtotalActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        cu.setApertura(null);
        cu.setCierre(null);
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas-cambiar/5", cu, "PUT");
        Utilidades.mensajePorTiempo(res.getMensaje());
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnReabrirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReabrirCuentaActionPerformed
        Estructura.solicitud.setTipo("reabrircuenta");
        Estructura.solicitud.setCuenta(cu,"consulta");
        Estructura.solicitud.setVisible(true);
    }//GEN-LAST:event_btnReabrirCuentaActionPerformed

    private void btnPagarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCuentaActionPerformed
        Pagar pagar = new Pagar(idCuentaSeleccionada, "consultar");
        pagar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarCuentaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        mostrarFuncionalidades();
    }//GEN-LAST:event_comboTipoActionPerformed

    private void comboArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArchivoActionPerformed
        mostrarTipoBusquedas();

    }//GEN-LAST:event_comboArchivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarTablaConsultar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaCuentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentasMouseReleased
        int row = tablaCuentas.getSelectedRow();
        
        if (row != -1) {
            idCuentaSeleccionada = (String) tablaCuentas.getValueAt(row, 3);
            llenarInformacionCuenta();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCuentasMouseReleased
    public static void limpiarTablaConsultar() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCuentas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    public static void actualizarTablaConsultar() {
        limpiarTablaConsultar();
        DefaultTableModel modelo = (DefaultTableModel) tablaCuentas.getModel();
        ResponseDatos<Cuenta> res = new ResponseDatos<>();
        
        switch (tipo) {
            case 1: // turno actual
                res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas/" + Datos.turno.getIdTurno() + "/cerrada", null, "GET");
                break;
            case 2: // todos los cerrados // tipo 1 en la API
                res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas-consultar/1/" + Datos.turno.getIdTurno(), null, "GET");
                break;
            case 3:                
                Turno selec = (Turno) comboTurno.getSelectedItem();
                res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas/" + selec.getIdTurno() + "/cerrada", null, "GET");
                break;
            case 4:
                ///cuentas-lapsotiempo/{estatus}
                Fechas fec= new Fechas();
                String fi=Utilidades.getFechaStringCompleto(fechaI.getDate()).substring(0,10)+" 00:00:00.000";
                String ff=Utilidades.getFechaStringCompleto(fechaF.getDate()).substring(0,10)+" 00:00:00.000";
                fec.setFechaI(fi);
                fec.setFechaF(ff);
                
                 res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas-lapsotiempo/cerrada", fec, "POST");
                break;
        }
        
        Object O[] = null;
        int i = 0;
        if (res.getDatos() != null) {
            if (!res.getDatos().isEmpty()) {
                for (Cuenta c : res.getDatos()) {
                    //   if (c.getIdCuenta().equals(idCuentaSeleccionada)) {
                    //  llenarInformacionCuenta();
                    // }
                    modelo.addRow(O);
                    modelo.setValueAt(c.getFolio(), i, 0);
                    modelo.setValueAt(Utilidades.getFechaStringCompleto(c.getCierre()), i, 1);
                    modelo.setValueAt(c.getNombreCuenta() + "/" + c.getMesa(), i, 2);
                    modelo.setValueAt(c.getIdCuenta(), i, 3);
                    i++;
                }
            } else {
                Utilidades.mensajePorTiempo("No hay datos en los criterios seleccionados");
            }
        }
    }
    
    public void llenarComboTurno() {
        comboTurno.removeAllItems();
        ResponseDatos<Turno> res = ConsumoApi.turnos("http://localhost:8082/v1/turnos-estatus/cerrado", this, "GET");
        for (Turno t : res.getDatos()) {
            comboTurno.addItem(t);
        }
        
    }
    
    public static void llenarInformacionCuenta() {
        
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas/" + idCuentaSeleccionada, null, "GET");
        cu = res.getDatos().get(0);
        txfArea.setText("Comedor");
        txfCierre.setText(cu.getCierre() == null ? "" : Utilidades.getFechaStringCompleto(cu.getCierre()));
        txfApertura.setText(Utilidades.getFechaStringCompleto(cu.getApertura()));
        txfCuenta.setText(cu.getNombreCuenta());
        txfFolio.setText(cu.getFolio() + "");
        txfMesa.setText(cu.getMesa());
        txfMesero.setText(cu.getNombreMesero());
        txfOrden.setText(cu.getOrden() + "");
        txfPersonas.setText(cu.getPersonas() + "");
        txfTotal.setText(cu.getMontoTotal() + "");
        txfSubtotal.setText(cu.getMontoSubtotal() + "");
        if (cu.getDescuento() != 0) {
            int longit = ((int) cu.getDescuento() + "").length();
            String cad = "";
            switch (longit) {
                case 1:
                    cad = "Desc. " + (int) cu.getDescuento() + "%    $";
                    break;
                case 2:
                    cad = "Desc. " + (int) cu.getDescuento() + "%  $";
                    break;
                case 3:
                    cad = "Desc. " + (int) cu.getDescuento() + "% $";
                    break;
                default:
                    break;
            }
            lblDescuento.setText(cad);
        } else {
            lblDescuento.setText("Desc. %      $");
        }
        
        txfImpuesto.setText(cu.getIva() + "");
        txfDescuento.setText(cu.getMontoTotalDescuento() + "");
        llenarTablaProductos(cu.getProductos());
        
    }
    
    public static void llenarTablaProductos(List<ProductoCuenta> productos) {
        limpiarTablaProductos();
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        int i = 0;
        String dats[] = new String[5];
        if (productos != null) {
            for (ProductoCuenta p : productos) {
                
                dats[0] = (i + 1) + "";
                dats[1] = p.getNombre();
                dats[2] = p.getCantidad() + "";
                dats[3] = p.getCosto() + "";
                dats[4] = p.getImporte() + "";
                model.addRow(dats);
                i++;
            }
        }
        
    }
    
    public static void limpiarTablaProductos() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
    
    public void mostrarTipoBusquedas() {
        String funcionalidad = (String) comboArchivo.getSelectedItem();
        if (funcionalidad.equalsIgnoreCase("Turnos cerrados")) {
            tipo = 2;
            comboTipo.setVisible(true);
        } else {
            tipo = 1;
            comboTipo.setVisible(false);
        }
    }
    
    public void mostrarFuncionalidades() {
        String funcionalidad = (String) comboTipo.getSelectedItem();
        
        switch (funcionalidad) {
            case "Todos":
                comboTurno.setVisible(false);
                fechaI.setVisible(false);
                fechaF.setVisible(false);
                lblAl.setVisible(false);
                tipo = 2;
                break;
            
            case "Turno":
                llenarComboTurno();
                comboTurno.setVisible(true);
                fechaI.setVisible(false);
                fechaF.setVisible(false);
                lblAl.setVisible(false);
                tipo = 3;
                break;
            
            case "Periodo":
                comboTurno.setVisible(false);
                fechaI.setVisible(true);
                fechaF.setVisible(true);
                lblAl.setVisible(true);
                tipo = 4;
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCerrar;
    private static javax.swing.JButton btnImprimir;
    private static javax.swing.JButton btnPagarCuenta;
    private static javax.swing.JButton btnReabrirCuenta;
    private javax.swing.JComboBox<String> comboArchivo;
    private javax.swing.JComboBox<String> comboTipo;
    private static javax.swing.JComboBox<Turno> comboTurno;
    private javax.swing.JLabel exitTxt;
    private static com.toedter.calendar.JDateChooser fechaF;
    private static com.toedter.calendar.JDateChooser fechaI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAl;
    private static javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelMonto;
    private javax.swing.JPanel panelOpciones;
    private static javax.swing.JTable tablaCuentas;
    public static javax.swing.JTable tablaProductos;
    private static javax.swing.JTextField txfApertura;
    private static javax.swing.JTextField txfArea;
    private static javax.swing.JTextField txfCierre;
    private static javax.swing.JTextField txfCuenta;
    private static javax.swing.JTextField txfDescuento;
    private static javax.swing.JTextField txfFolio;
    private static javax.swing.JTextField txfImpuesto;
    private static javax.swing.JTextField txfMesa;
    private static javax.swing.JTextField txfMesero;
    private static javax.swing.JTextField txfOrden;
    private static javax.swing.JTextField txfPersonas;
    private static javax.swing.JTextField txfSubtotal;
    private static javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
