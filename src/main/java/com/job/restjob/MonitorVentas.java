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

/**
 *
 * @author agus_
 */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 120, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 110, -1));

        lblIntrucciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIntrucciones.setText("Selecciona una fecha para obtener todos los turnos que coincidan");
        jPanel1.add(lblIntrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jPanel1.add(comboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 80, 250, 30));

        jPanel2.setBackground(new java.awt.Color(235, 230, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta "));
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jPanel7.setBackground(new java.awt.Color(235, 230, 249));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Bebidas");

        txfBebidas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfBebidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfBebidasPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBebidasPorcentaje.setText("%");
        txfBebidasPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBebidasPorcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txfBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfBebidasPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        txfAlimentosPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfAlimentosPorcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txfAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfAlimentosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        txfOtrosPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfOtrosPorcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfOtrosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, 170));

        panelCuentas.setBackground(new java.awt.Color(235, 230, 249));
        panelCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de cuentas"));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
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

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 320, 170));

        jPanel4.setBackground(new java.awt.Color(235, 230, 249));
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
                .addContainerGap(71, Short.MAX_VALUE))
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
                .addComponent(txfDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 110));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfBebidasPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBebidasPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBebidasPorcentajeActionPerformed

    private void txfAlimentosPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfAlimentosPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfAlimentosPorcentajeActionPerformed

    private void txfOtrosPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfOtrosPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfOtrosPorcentajeActionPerformed

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
        DecimalFormat df = new DecimalFormat("###.##");
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
        
        txfBebidas.setText("$"+res.getBebidas()+"");
        txfAlimentos.setText("$"+res.getAlimentos()+"");
        txfOtros.setText("$"+res.getOtros()+"");
        txfBebidasPorcentaje.setText(df.format(res.getPorcentajeBebidas())+"%");
        txfAlimentosPorcentaje.setText(df.format(res.getPorcentajeAlimentos())+"%");
        txfOtrosPorcentaje.setText(df.format(res.getProcentajeOtros())+"%");
        txfImpuestos.setText("$"+res.getImpuestos()+"");
        txfDescuentos.setText("$"+res.getDescuentos()+"");
        txfCuentasAbiertas.setText(res.getCuentasAbiertas()+"");
        txfCuentasCerradas.setText(res.getCuentasCerradas()+"");
        txfCuentasPendientes.setText(res.getCuentasPendientes()+"");
        txfVentaTotal.setText("$"+res.getVentaTotal()+"");
     //   /cuentas-ventas

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<Turno> comboTurno;
    private javax.swing.JComboBox<String> comboTurnoOpcion;
    private static com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIntrucciones;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JTextField txfAlimentos;
    private javax.swing.JTextField txfAlimentosPorcentaje;
    private javax.swing.JTextField txfBebidas;
    private javax.swing.JTextField txfBebidasPorcentaje;
    private javax.swing.JTextField txfCuentasAbiertas;
    private javax.swing.JTextField txfCuentasCerradas;
    private javax.swing.JTextField txfCuentasPendientes;
    private javax.swing.JTextField txfDescuentos;
    private javax.swing.JTextField txfImpuestos;
    private javax.swing.JTextField txfOtros;
    private javax.swing.JTextField txfOtrosPorcentaje;
    private javax.swing.JTextField txfVentaTotal;
    // End of variables declaration//GEN-END:variables
}
