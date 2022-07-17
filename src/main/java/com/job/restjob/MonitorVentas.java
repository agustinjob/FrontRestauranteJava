/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.restjob;

import com.job.modelos.Cuenta;
import com.job.modelos.CuentasVentas;
import com.job.modelos.Datos;
import com.job.modelos.Turno;
import com.job.modelos.VentasResponse;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import static com.job.restjob.ConsultarCuentas.idCuentaSeleccionada;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.text.DecimalFormat;
import com.job.ambiente.Enviroment;


public class MonitorVentas extends javax.swing.JFrame {

    int tipoBusqueda = 1;

    public MonitorVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();
        comboTurno.setVisible(false);
        fecha.setVisible(false);
        lblIntrucciones.setVisible(false);
        comboTurno.setEnabled(false);
        btnBuscar.setVisible(false);

    }

    public final void llenarIconos() {
        btnActualizar.setIcon(Iconos.actualizar);
        btnCerrar.setIcon(Iconos.cerrar);
        lblIcono.setIcon(Iconos.monitorSmall);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblIntrucciones = new javax.swing.JLabel();
        comboTurno = new javax.swing.JComboBox<Turno>();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txfBebidas = new javax.swing.JTextField();
        txfBebidasPorcentaje = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txfAlimentos = new javax.swing.JTextField();
        txfAlimentosPorcentaje = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txfOtros = new javax.swing.JTextField();
        txfOtrosPorcentaje = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txfVentaTotal = new javax.swing.JTextField();
        panelCuentas = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txfCuentasAbiertas = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txfCuentasCerradas = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txfCuentasPendientes = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txfImpuestos = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txfDescuentos = new javax.swing.JTextField();
        lblIcono = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        comboTurnoOpcion = new javax.swing.JComboBox<>();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txfBebidasPen = new javax.swing.JTextField();
        txfBebidasPorcentajePen = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txfAlimentosPen = new javax.swing.JTextField();
        txfAlimentosPorcentajePen = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txfOtrosPen = new javax.swing.JTextField();
        txfOtrosPorcentajePen = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txfVentaTotalPen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txfBebidasAbi = new javax.swing.JTextField();
        txfBebidasPorcentajeAbi = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txfAlimentosAbi = new javax.swing.JTextField();
        txfAlimentosPorcentajeAbi = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txfOtrosAbi = new javax.swing.JTextField();
        txfOtrosPorcentajeAbi = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txfVentaTotalAbi = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txfImpuestosPen = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txfDescuentosPen = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txfImpuestosAbi = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txfDescuentosAbi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 120, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 110, -1));

        lblIntrucciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIntrucciones.setText("Selecciona una fecha para obtener todos los turnos que coincidan");
        jPanel1.add(lblIntrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jPanel1.add(comboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 80, 250, 30));

        jPanel2.setBackground(new java.awt.Color(235, 230, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuentas Cerradas - Venta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jPanel7.setBackground(new java.awt.Color(235, 230, 249));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Bebidas");

        txfBebidas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfBebidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfBebidasPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBebidasPorcentaje.setText("%");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txfBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfBebidasPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBebidasPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(235, 230, 249));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Alimentos");

        txfAlimentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfAlimentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfAlimentosPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlimentosPorcentaje.setText("%");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(txfAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfAlimentosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfAlimentosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(235, 230, 249));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Otros");

        txfOtros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfOtros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfOtrosPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOtrosPorcentaje.setText("%");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfOtrosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfOtrosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(235, 230, 249));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Venta total");

        txfVentaTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfVentaTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txfVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel10);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 300, 170));

        panelCuentas.setBackground(new java.awt.Color(235, 230, 249));
        panelCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panelCuentas.setLayout(new java.awt.GridLayout(3, 1));

        jPanel14.setBackground(new java.awt.Color(235, 230, 249));

        jPanel19.setBackground(new java.awt.Color(235, 230, 249));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText("Cuentas abiertas");

        txfCuentasAbiertas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(txfCuentasAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txfCuentasAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCuentas.add(jPanel14);

        jPanel17.setBackground(new java.awt.Color(235, 230, 249));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("Cuentas cerradas");

        txfCuentasCerradas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(txfCuentasCerradas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txfCuentasCerradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelCuentas.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(235, 230, 249));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText("Cuentas pendientes");

        txfCuentasPendientes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(txfCuentasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txfCuentasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelCuentas.add(jPanel18);

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 250, 120));

        jPanel4.setBackground(new java.awt.Color(235, 230, 249));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Cuentas Cerradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        jPanel15.setBackground(new java.awt.Color(235, 230, 249));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Impuestos");

        txfImpuestos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txfImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txfImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(235, 230, 249));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Descuentos");

        txfDescuentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txfDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(jPanel16);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 300, 140));

        lblIcono.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(0, 0, 153));
        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 30));

        lblTitulo4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo4.setText("MONITOR DE VENTAS");
        jPanel1.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        comboTurnoOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno actual", "Mostrar todos los turnos" }));
        comboTurnoOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurnoOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(comboTurnoOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 189, 30));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Turno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(51, 255, 51));
        btnBuscar.setText("Buscar Turnos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(235, 230, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuentas Pendientes- Venta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(4, 0));

        jPanel11.setBackground(new java.awt.Color(235, 230, 249));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Bebidas");

        txfBebidasPen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfBebidasPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfBebidasPorcentajePen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBebidasPorcentajePen.setText("%");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txfBebidasPen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfBebidasPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txfBebidasPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBebidasPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(235, 230, 249));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Alimentos");

        txfAlimentosPen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfAlimentosPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfAlimentosPorcentajePen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlimentosPorcentajePen.setText("%");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txfAlimentosPen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfAlimentosPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txfAlimentosPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfAlimentosPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(235, 230, 249));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 204));
        jLabel17.setText("Otros");

        txfOtrosPen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfOtrosPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfOtrosPorcentajePen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOtrosPorcentajePen.setText("%");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txfOtrosPen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfOtrosPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txfOtrosPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfOtrosPorcentajePen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel13);

        jPanel20.setBackground(new java.awt.Color(235, 230, 249));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 204));
        jLabel18.setText("Venta total");

        txfVentaTotalPen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfVentaTotalPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txfVentaTotalPen, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txfVentaTotalPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel20);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 300, 170));

        jPanel5.setBackground(new java.awt.Color(235, 230, 249));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuentas Abiertas- Venta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(4, 0));

        jPanel21.setBackground(new java.awt.Color(235, 230, 249));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 204));
        jLabel19.setText("Bebidas");

        txfBebidasAbi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfBebidasAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfBebidasPorcentajeAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBebidasPorcentajeAbi.setText("%");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txfBebidasAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfBebidasPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txfBebidasAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBebidasPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(235, 230, 249));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 204));
        jLabel20.setText("Alimentos");

        txfAlimentosAbi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfAlimentosAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfAlimentosPorcentajeAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlimentosPorcentajeAbi.setText("%");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txfAlimentosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfAlimentosPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txfAlimentosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfAlimentosPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(235, 230, 249));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 204));
        jLabel21.setText("Otros");

        txfOtrosAbi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfOtrosAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfOtrosPorcentajeAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOtrosPorcentajeAbi.setText("%");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txfOtrosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfOtrosPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txfOtrosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfOtrosPorcentajeAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(235, 230, 249));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 204));
        jLabel22.setText("Venta total");

        txfVentaTotalAbi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfVentaTotalAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txfVentaTotalAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txfVentaTotalAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel24);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, 170));

        jPanel6.setBackground(new java.awt.Color(235, 230, 249));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Cuentas Pendientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(3, 1));

        jPanel25.setBackground(new java.awt.Color(235, 230, 249));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Impuestos");

        txfImpuestosPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(txfImpuestosPen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txfImpuestosPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(235, 230, 249));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("Descuentos");

        txfDescuentosPen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfDescuentosPen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txfDescuentosPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.add(jPanel26);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 300, 140));

        jPanel27.setBackground(new java.awt.Color(235, 230, 249));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Cuentas Abiertas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel27.setLayout(new java.awt.GridLayout(3, 1));

        jPanel28.setBackground(new java.awt.Color(235, 230, 249));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setText("Impuestos");

        txfImpuestosAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(txfImpuestosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txfImpuestosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel27.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(235, 230, 249));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("Descuentos");

        txfDescuentosAbi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfDescuentosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txfDescuentosAbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel27.add(jPanel29);

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 140));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboTurnoOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurnoOpcionActionPerformed
        String opcionTurno = (String) comboTurnoOpcion.getSelectedItem();
        if (opcionTurno.equalsIgnoreCase("Turno actual")) {
            tipoBusqueda = 1;
            fecha.setVisible(false);
            lblIntrucciones.setVisible(false);
            comboTurno.setEnabled(false);
            comboTurno.setVisible(false);
            btnBuscar.setVisible(false);
        } else {
            tipoBusqueda = 2;
            fecha.setVisible(true);
            lblIntrucciones.setVisible(true);
            comboTurno.setEnabled(false);
            comboTurno.setVisible(true);
            btnBuscar.setVisible(true);
        }
    }//GEN-LAST:event_comboTurnoOpcionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        realizarBusqueda();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     // /turnos-dia/{fecha}
      String f=Utilidades.getFechaStringCompleto(fecha.getDate());
       ResponseDatos<Turno> res = ConsumoApi.turnos(Enviroment.local+"/v1/turnos-dia/"+f.replace(" ", "%20").substring(0,10), this, "GET");
       comboTurno.setEnabled(true);
       comboTurno.removeAllItems();
       
         for (Turno t : res.getDatos()) {
            comboTurno.addItem(t);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void realizarBusqueda() {
       
        CuentasVentas cv = new CuentasVentas();
        String idTurno;
        if (tipoBusqueda == 1) {
            idTurno = Datos.turno.getIdTurno();
        } else {
        Turno t=(Turno) comboTurno.getSelectedItem();
        idTurno= t.getIdTurno();
        }
        System.out.print("ID TURNO "+ idTurno);
        cv.setIdTurno(idTurno);
        VentasResponse res = ConsumoApi.ventas(Enviroment.local+"/v1/cuentas-ventas", cv, "POST");
        
        txfBebidas.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getBebidas()));
        txfAlimentos.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getAlimentos()));
        txfOtros.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getOtros())+"");
        txfBebidasPorcentaje.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeBebidas())+"%");
        txfAlimentosPorcentaje.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeAlimentos())+"%");
        txfOtrosPorcentaje.setText(Utilidades.formatoDecimaDosDigitos(res.getProcentajeOtros())+"%");
        txfImpuestos.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getImpuestos())+"");
        txfDescuentos.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getDescuentos())+"");
        
        // cuentas abiertas
        
        txfBebidasAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getBebidasAbi()));
        txfAlimentosAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getAlimentosAbi()));
        txfOtrosAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getOtrosAbi())+"");
        txfBebidasPorcentajeAbi.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeBebidasAbi())+"%");
        txfAlimentosPorcentajeAbi.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeAlimentosAbi())+"%");
        txfOtrosPorcentajeAbi.setText(Utilidades.formatoDecimaDosDigitos(res.getProcentajeOtrosAbi())+"%");
        txfImpuestosAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getImpuestosAbi())+"");
        txfDescuentosAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getDescuentosAbi())+"");
        
        
        // cuentas pendientes
        
        txfBebidasPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getBebidasPen()));
        txfAlimentosPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getAlimentosPen()));
        txfOtrosPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getOtrosPen())+"");
        txfBebidasPorcentajePen.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeBebidasPen())+"%");
        txfAlimentosPorcentajePen.setText(Utilidades.formatoDecimaDosDigitos(res.getPorcentajeAlimentosPen())+"%");
        txfOtrosPorcentajePen.setText(Utilidades.formatoDecimaDosDigitos(res.getProcentajeOtrosPen())+"%");
        txfImpuestosPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getImpuestosPen())+"");
        txfDescuentosPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getDescuentosPen())+"");
        
        
        txfCuentasAbiertas.setText(res.getCuentasAbiertas()+"");
        txfCuentasCerradas.setText(res.getCuentasCerradas()+"");
        txfCuentasPendientes.setText(res.getCuentasPendientes()+"");
        txfVentaTotal.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getVentaTotal())+"");
        txfVentaTotalAbi.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getVentaTotalAbi())+"");
        txfVentaTotalPen.setText("$"+Utilidades.formatoDecimaDosDigitos(res.getVentaTotalPen())+"");
     //   /cuentas-ventas

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<Turno> comboTurno;
    private javax.swing.JComboBox<String> comboTurnoOpcion;
    private static com.toedter.calendar.JDateChooser fecha;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIntrucciones;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JTextField txfAlimentos;
    private javax.swing.JTextField txfAlimentosAbi;
    private javax.swing.JTextField txfAlimentosPen;
    private javax.swing.JTextField txfAlimentosPorcentaje;
    private javax.swing.JTextField txfAlimentosPorcentajeAbi;
    private javax.swing.JTextField txfAlimentosPorcentajePen;
    private javax.swing.JTextField txfBebidas;
    private javax.swing.JTextField txfBebidasAbi;
    private javax.swing.JTextField txfBebidasPen;
    private javax.swing.JTextField txfBebidasPorcentaje;
    private javax.swing.JTextField txfBebidasPorcentajeAbi;
    private javax.swing.JTextField txfBebidasPorcentajePen;
    private javax.swing.JTextField txfCuentasAbiertas;
    private javax.swing.JTextField txfCuentasCerradas;
    private javax.swing.JTextField txfCuentasPendientes;
    private javax.swing.JTextField txfDescuentos;
    private javax.swing.JTextField txfDescuentosAbi;
    private javax.swing.JTextField txfDescuentosPen;
    private javax.swing.JTextField txfImpuestos;
    private javax.swing.JTextField txfImpuestosAbi;
    private javax.swing.JTextField txfImpuestosPen;
    private javax.swing.JTextField txfOtros;
    private javax.swing.JTextField txfOtrosAbi;
    private javax.swing.JTextField txfOtrosPen;
    private javax.swing.JTextField txfOtrosPorcentaje;
    private javax.swing.JTextField txfOtrosPorcentajeAbi;
    private javax.swing.JTextField txfOtrosPorcentajePen;
    private javax.swing.JTextField txfVentaTotal;
    private javax.swing.JTextField txfVentaTotalAbi;
    private javax.swing.JTextField txfVentaTotalPen;
    // End of variables declaration//GEN-END:variables
}
