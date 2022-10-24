/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import com.job.modelos.Configuracion;
import com.job.modelos.Cuenta;
import com.job.modelos.Producto;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.job.ambiente.Enviroment;
import com.job.modelos.Datos;
import java.awt.event.KeyEvent;

/**
 *
 * @author agus_
 */
public class Pagar extends javax.swing.JFrame {

    Cuenta cSeleccionada;
    String idCuentaSeleccionada;
    String modo;
    boolean funcionalidadRealizada=false;

    public Pagar(String idCuentaSeleccionada, String modo) {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();
        this.idCuentaSeleccionada = idCuentaSeleccionada;
        this.modo = modo;
        llenarInformacion();
        ;
    }

    public final void llenarIconos() {

        lblIcono.setIcon(Iconos.pagoMesero);
        lblIconoEfectivo.setIcon(Iconos.efectivo);
        lblIconoMasterCard.setIcon(Iconos.mastercard);
        lblIconoVisa.setIcon(Iconos.visa);
        lblIconoAmerican.setIcon(Iconos.americanexpress);
    }

    public final void llenarInformacion() {
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas/" + idCuentaSeleccionada, null, "GET");
        cSeleccionada = res.getDatos().get(0);
        txfConsumo.setText(cSeleccionada.getMontoTotal() + "");
        if (modo.equalsIgnoreCase("consultar")) {
            txfImpEfectivo.setText(cSeleccionada.getPagoEfectivo() + "");
            txfTotal.setText(cSeleccionada.getPagoEfectivo() + "");
            txfCambio.setText(cSeleccionada.getCambio());
            txfPropEfectivo.setText(cSeleccionada.getPropinaEfectivo() + "");
            txfImpMaster.setText(cSeleccionada.getPagoMasterCard() + "");
            txfImpVisa.setText(cSeleccionada.getPagoVisa() + "");
            txfImpAmerican.setText(cSeleccionada.getPagoAmericanExpress() + "");
            txfPropMaster.setText(cSeleccionada.getPropinaMasterCard() + "");
            txfPropVisa.setText(cSeleccionada.getPropinaVisa() + "");
            txfPropAmerican.setText(cSeleccionada.getPropinaAmericanExpress() + "");
            lblTotalImporte.setText(cSeleccionada.getPagoEfectivo() + cSeleccionada.getPagoMasterCard() + cSeleccionada.getPagoVisa() + cSeleccionada.getPagoAmericanExpress() + "");
            lblTotalPropina.setText(cSeleccionada.getPropinaEfectivo() + cSeleccionada.getPropinaMasterCard() + cSeleccionada.getPropinaVisa() + cSeleccionada.getPropinaAmericanExpress() + "");

            txfTotalEfectivo.setText(cSeleccionada.getPagoEfectivo() + cSeleccionada.getPropinaEfectivo() + "");
            txfTotalMaster.setText(cSeleccionada.getPagoMasterCard() + cSeleccionada.getPropinaMasterCard() + "");
            txfTotalVisa.setText(cSeleccionada.getPagoVisa() + cSeleccionada.getPropinaVisa() + "");
            txfTotalAmerican.setText(cSeleccionada.getPagoAmericanExpress() + cSeleccionada.getPropinaAmericanExpress() + "");
            lblTotalImporteTotal.setText(Float.parseFloat(txfTotalEfectivo.getText()) + Float.parseFloat(txfTotalMaster.getText()) + Float.parseFloat(txfTotalVisa.getText())
                    + Float.parseFloat(txfTotalAmerican.getText()) + "");
            jButton5.setVisible(false);
            txfImpEfectivo.setEnabled(false);
            txfPropEfectivo.setEnabled(false);
            txfImpMaster.setEnabled(false);
            txfImpVisa.setEnabled(false);
            txfImpAmerican.setEnabled(false);
            txfPropMaster.setEnabled(false);
            txfPropVisa.setEnabled(false);
            txfPropAmerican.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txfTotal = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txfConsumo = new javax.swing.JTextField();
        txfCambio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txfImpEfectivo = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txfPropEfectivo = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txfTotalEfectivo = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txfImpVisa = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txfPropVisa = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txfTotalVisa = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txfImpMaster = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txfPropMaster = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txfTotalMaster = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txfImpAmerican = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txfPropAmerican = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txfTotalAmerican = new javax.swing.JTextField();
        lblTotalImporteTotal = new javax.swing.JLabel();
        lblTotalImporte = new javax.swing.JLabel();
        lblTotalPropina = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblIconoAmerican = new javax.swing.JLabel();
        lblIconoEfectivo = new javax.swing.JLabel();
        lblIconoVisa = new javax.swing.JLabel();
        lblIconoMasterCard = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        txfTotal.setBackground(new java.awt.Color(235, 230, 249));
        txfTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txfTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotal.setText("0");
        txfTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL EN M.N.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        txfTotal.setEnabled(false);
        txfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 140, 70));

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ACEPTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CANCELAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        txfConsumo.setBackground(new java.awt.Color(235, 230, 249));
        txfConsumo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txfConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfConsumo.setText("0");
        txfConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSUMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txfConsumo.setEnabled(false);
        jPanel1.add(txfConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, 70));

        txfCambio.setBackground(new java.awt.Color(235, 230, 249));
        txfCambio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txfCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCambio.setText("0");
        txfCambio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMBIO EN M.N.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txfCambio.setEnabled(false);
        jPanel1.add(txfCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 140, 70));

        jPanel2.setBackground(new java.awt.Color(235, 230, 249));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clave");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripción");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EF");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel3);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EFECTIVO");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VISA");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VISA");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MC");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel7);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MASTERCARD");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel8);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AMEX");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel9);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("AMERICAN EXPRESS");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jLabel10);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 177, 310, 190));

        jPanel3.setBackground(new java.awt.Color(235, 230, 249));
        jPanel3.setLayout(new java.awt.GridLayout(5, 3));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Importe");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel3.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Propina");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel3.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Importe total");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel3.add(jLabel13);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel14.setText("$");

        txfImpEfectivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfImpEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfImpEfectivo.setBorder(null);
        txfImpEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfImpEfectivoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfImpEfectivoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfImpEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfImpEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel24.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel24.setText("$");

        txfPropEfectivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfPropEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPropEfectivo.setBorder(null);
        txfPropEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfPropEfectivoMouseClicked(evt);
            }
        });
        txfPropEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPropEfectivoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPropEfectivoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPropEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(txfPropEfectivo)
        );

        jPanel3.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(230, 230, 210));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jPanel15.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel25.setText("$");

        txfTotalEfectivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfTotalEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotalEfectivo.setText("0");
        txfTotalEfectivo.setBorder(null);
        txfTotalEfectivo.setEnabled(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTotalEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfTotalEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel26.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel26.setText("$");

        txfImpVisa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfImpVisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfImpVisa.setBorder(null);
        txfImpVisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfImpVisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfImpVisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfImpVisaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfImpVisa, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(txfImpVisa)
        );

        jPanel3.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel27.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel27.setText("$");

        txfPropVisa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfPropVisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPropVisa.setBorder(null);
        txfPropVisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPropVisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPropVisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPropVisa, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfPropVisa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(230, 230, 210));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jPanel18.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel28.setText("$");

        txfTotalVisa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfTotalVisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotalVisa.setText("0");
        txfTotalVisa.setBorder(null);
        txfTotalVisa.setEnabled(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTotalVisa, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfTotalVisa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel29.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel29.setText("$");

        txfImpMaster.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfImpMaster.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfImpMaster.setBorder(null);
        txfImpMaster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfImpMasterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfImpMasterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfImpMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfImpMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel30.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel30.setText("$");

        txfPropMaster.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfPropMaster.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPropMaster.setBorder(null);
        txfPropMaster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPropMasterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPropMasterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPropMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfPropMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(230, 230, 210));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jPanel21.setEnabled(false);

        jLabel31.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel31.setText("$");

        txfTotalMaster.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfTotalMaster.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotalMaster.setText("0");
        txfTotalMaster.setBorder(null);
        txfTotalMaster.setEnabled(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTotalMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfTotalMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel32.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel32.setText("$");

        txfImpAmerican.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfImpAmerican.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfImpAmerican.setBorder(null);
        txfImpAmerican.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfImpAmericanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfImpAmericanKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfImpAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfImpAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel33.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel33.setText("$");

        txfPropAmerican.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfPropAmerican.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPropAmerican.setBorder(null);
        txfPropAmerican.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPropAmericanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPropAmericanKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPropAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfPropAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(230, 230, 210));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jPanel24.setEnabled(false);

        jLabel34.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel34.setText("$");

        txfTotalAmerican.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txfTotalAmerican.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotalAmerican.setText("0");
        txfTotalAmerican.setBorder(null);
        txfTotalAmerican.setEnabled(false);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTotalAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfTotalAmerican, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel24);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 177, 400, 190));

        lblTotalImporteTotal.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTotalImporteTotal.setText("0.00");
        jPanel1.add(lblTotalImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        lblTotalImporte.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTotalImporte.setText("0.00");
        jPanel1.add(lblTotalImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        lblTotalPropina.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTotalPropina.setText("0.00");
        jPanel1.add(lblTotalPropina, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        lblIcono.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 60, 30));

        lblTitulo2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo2.setText("PAGAR");
        jPanel1.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));
        jPanel1.add(lblIconoAmerican, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 50, 30));

        lblIconoEfectivo.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\efectivo.png")); // NOI18N
        jPanel1.add(lblIconoEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        lblIconoVisa.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\visa.png")); // NOI18N
        jPanel1.add(lblIconoVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        lblIconoMasterCard.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\mastercard.png")); // NOI18N
        jPanel1.add(lblIconoMasterCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("$");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("$");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("$");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("$");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("$");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("$");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
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
      
        EstructuraComedor.btnPagarCuenta.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTotalActionPerformed

    }//GEN-LAST:event_txfTotalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        funcionalidad();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txfImpEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpEfectivoKeyReleased
        float importe = llenarTextField(txfImpEfectivo);
        txfTotal.setText(importe + "");
        float cambio = cSeleccionada.getMontoTotal() - importe;
        if (cambio < 0) {
            cambio = cambio * -1;
            txfCambio.setText(cambio + "");
        }
        sumarImporte();
        sumarEfectivo();
        sumarImporteTotal();        // TODO add your handling code here:
    }//GEN-LAST:event_txfImpEfectivoKeyReleased

    private void txfPropEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropEfectivoKeyReleased
        sumarPropina();
        sumarEfectivo();
        sumarImporteTotal();
    }//GEN-LAST:event_txfPropEfectivoKeyReleased

    private void txfImpVisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpVisaKeyReleased
        sumarImporte();
        sumarVisa();
        sumarImporteTotal();// TODO add your handling code here:
    }//GEN-LAST:event_txfImpVisaKeyReleased

    private void txfPropVisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropVisaKeyReleased
        sumarPropina();
        sumarVisa();
        sumarImporteTotal();// TODO add your handling code here:
    }//GEN-LAST:event_txfPropVisaKeyReleased

    private void txfImpMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpMasterKeyReleased
        sumarImporte();
        sumarMaster();// TODO add your handling code here:
    }//GEN-LAST:event_txfImpMasterKeyReleased

    private void txfPropMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropMasterKeyReleased
        sumarPropina();
        sumarMaster();
        sumarImporteTotal();// TODO add your handling code here:
    }//GEN-LAST:event_txfPropMasterKeyReleased

    private void txfImpAmericanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpAmericanKeyReleased
        sumarImporte();
        sumarAmerican();
        sumarImporteTotal();// TODO add your handling code here:
    }//GEN-LAST:event_txfImpAmericanKeyReleased

    private void txfPropAmericanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropAmericanKeyReleased
        sumarPropina();
        sumarAmerican();
        sumarImporteTotal();// TODO add your handling code here:
    }//GEN-LAST:event_txfPropAmericanKeyReleased

    private void txfPropEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPropEfectivoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPropEfectivoMouseClicked

    private void txfImpEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpEfectivoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }
    }//GEN-LAST:event_txfImpEfectivoKeyPressed

    private void txfPropEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropEfectivoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfPropEfectivoKeyPressed

    private void txfImpVisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpVisaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfImpVisaKeyTyped

    private void txfImpVisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpVisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfImpVisaKeyPressed

    private void txfPropVisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropVisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfPropVisaKeyPressed

    private void txfImpMasterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpMasterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfImpMasterKeyPressed

    private void txfPropMasterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropMasterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfPropMasterKeyPressed

    private void txfImpAmericanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImpAmericanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfImpAmericanKeyPressed

    private void txfPropAmericanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPropAmericanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcionalidad();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfPropAmericanKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(funcionalidadRealizada==false){
        EstructuraComedor.btnPagarCuenta.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
    public void funcionalidad() {
        float total = Float.parseFloat(lblTotalImporte.getText());
        float consumo = Float.parseFloat(txfConsumo.getText());
        if (total >= consumo) {
            cSeleccionada.setEstatus("cerrada");
            cSeleccionada.setApertura(null);
            cSeleccionada.setCierre(null);
            cSeleccionada.setImpreso(true);
            float pagoEfec=0f;
            if(llenarTextField(txfImpEfectivo)>consumo){
            pagoEfec=consumo;
            }else{
            pagoEfec=llenarTextField(txfImpEfectivo);
            }
            cSeleccionada.setPagoEfectivo(pagoEfec);
            
            
            cSeleccionada.setPagoVisa(llenarTextField(txfImpVisa));
            cSeleccionada.setPagoMasterCard(llenarTextField(txfImpMaster));
            cSeleccionada.setPagoAmericanExpress(llenarTextField(txfImpAmerican));
            cSeleccionada.setPropinaEfectivo(llenarTextField(txfPropEfectivo));
            cSeleccionada.setPropinaVisa(llenarTextField(txfPropVisa));
            cSeleccionada.setPropinaMasterCard(llenarTextField(txfPropMaster));
            cSeleccionada.setPropinaAmericanExpress(llenarTextField(txfPropAmerican));
            cSeleccionada.setCambio(txfCambio.getText());
            cSeleccionada.setEsModificable(false);
            cSeleccionada.setCantidadPago(llenarTextField(txfImpEfectivo));
            cSeleccionada.setNombreSupervisor(Datos.administrador.getNombre());

            ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas-cambiar/4", cSeleccionada, "PUT");
            if (res.getRealizado() == true) {
                ResponseDatos<Configuracion> res2 = ConsumoApi.configuracion(Enviroment.local + "/v1/configuracion-imprimir/" + cSeleccionada.getIdCuenta() + "/2/false", null, "GET");
                Utilidades.mensajePorTiempo(res2.getMensaje());
                EstructuraComedor.actualizarTabla(1);
                EstructuraComedor.limpiarInformacionCuenta();
                EstructuraComedor.deshabilitarBotones();
                EstructuraComedor.limpiarTablaProductos();
                EstructuraComedor.btnCuentasPendientes.setText("CUENTAS PENDIENTES");
                funcionalidadRealizada=true;
                this.dispose();
            }
        } else {
            Utilidades.mensajePorTiempo("Se tiene que cubrir todo el consumo realizado, verifica tus datos por favor");
        }
    }

    public void sumarImporte() {
        float importe = llenarTextField(txfImpEfectivo);
        float importe2 = llenarTextField(txfImpVisa);
        float importe3 = llenarTextField(txfImpMaster);
        float importe4 = llenarTextField(txfImpAmerican);
        sumar(importe, importe2, importe3, importe4, lblTotalImporte);
    }

    public void sumarPropina() {
        float importe = llenarTextField(txfPropEfectivo);
        float importe2 = llenarTextField(txfPropVisa);
        float importe3 = llenarTextField(txfPropMaster);
        float importe4 = llenarTextField(txfPropAmerican);
        sumar(importe, importe2, importe3, importe4, lblTotalPropina);
    }

    public void sumarImporteTotal() {
        float importe = llenarTextField(txfTotalEfectivo);
        float importe2 = llenarTextField(txfTotalVisa);
        float importe3 = llenarTextField(txfTotalMaster);
        float importe4 = llenarTextField(txfTotalAmerican);
        sumar(importe, importe2, importe3, importe4, lblTotalImporteTotal);
    }

    public void sumarEfectivo() {
        float importe = llenarTextField(txfImpEfectivo) + llenarTextField(txfPropEfectivo);
        txfTotalEfectivo.setText(importe + "");
    }

    public void sumarVisa() {
        float importe = llenarTextField(txfImpVisa) + llenarTextField(txfPropVisa);
        txfTotalVisa.setText(importe + "");
    }

    public void sumarMaster() {
        float importe = llenarTextField(txfImpMaster) + llenarTextField(txfPropMaster);
        txfTotalMaster.setText(importe + "");
    }

    public void sumarAmerican() {
        float importe = llenarTextField(txfImpAmerican) + llenarTextField(txfPropAmerican);
        txfTotalAmerican.setText(importe + "");
    }

    public float llenarTextField(JTextField input) {
        float iefec = 0f;
        try {
            iefec = Float.parseFloat(input.getText());

            input.setText(input.getText());
        } catch (NumberFormatException e) {

            input.setText("");
        }

        return iefec;
    }

    public void sumar(float jt1, float jt2, float jt3, float jt4, JLabel total) {
        float impTotal = jt1 + jt2 + jt3 + jt4;
        total.setText(impTotal + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIconoAmerican;
    private javax.swing.JLabel lblIconoEfectivo;
    private javax.swing.JLabel lblIconoMasterCard;
    private javax.swing.JLabel lblIconoVisa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTotalImporte;
    private javax.swing.JLabel lblTotalImporteTotal;
    private javax.swing.JLabel lblTotalPropina;
    private javax.swing.JTextField txfCambio;
    private javax.swing.JTextField txfConsumo;
    private javax.swing.JTextField txfImpAmerican;
    private javax.swing.JTextField txfImpEfectivo;
    private javax.swing.JTextField txfImpMaster;
    private javax.swing.JTextField txfImpVisa;
    private javax.swing.JTextField txfPropAmerican;
    private javax.swing.JTextField txfPropEfectivo;
    private javax.swing.JTextField txfPropMaster;
    private javax.swing.JTextField txfPropVisa;
    private javax.swing.JTextField txfTotal;
    private javax.swing.JTextField txfTotalAmerican;
    private javax.swing.JTextField txfTotalEfectivo;
    private javax.swing.JTextField txfTotalMaster;
    private javax.swing.JTextField txfTotalVisa;
    // End of variables declaration//GEN-END:variables
}
