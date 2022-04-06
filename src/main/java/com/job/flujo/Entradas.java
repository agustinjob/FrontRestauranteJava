/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.flujo;

import com.job.modelos.Configuracion;
import com.job.modelos.Datos;
import com.job.modelos.Gastos;
import com.job.modelos.ImprimirGastos;
import com.job.rest.consumo.ConsumoApi;
import com.job.response.ResponseDatos;
import com.job.utilidades.Utilidades;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import com.job.ambiente.Enviroment;

/**
 *
 * @author agus_
 */
public class Entradas extends javax.swing.JFrame {

    int ocultar = 0;
    public static String tipoEntrada;
    Gastos gasto = new Gastos();

    public Entradas() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(520, 205);

    }

    public void enfocarCampo() {
        txfMonto.requestFocus();
    }

    public void limpiarFormulario() {
        txfMonto.setText("");
        txfConcepto.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnguardaref = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerEntradas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntradas = new javax.swing.JTable();
        lblDescripcionTabla = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txfMonto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txfConcepto = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(255, 102, 0));

        lblTitulo.setBackground(new java.awt.Color(0, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("ENTRADAS DE EFECTIVO");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        panelBotones.setBackground(new java.awt.Color(255, 102, 0));
        panelBotones.setPreferredSize(new java.awt.Dimension(200, 250));

        btnguardaref.setBackground(new java.awt.Color(255, 204, 0));
        btnguardaref.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnguardaref.setForeground(new java.awt.Color(255, 255, 255));
        btnguardaref.setText("GUARDAR");
        btnguardaref.setBorder(null);
        btnguardaref.setPreferredSize(new java.awt.Dimension(150, 35));
        btnguardaref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarefActionPerformed(evt);
            }
        });
        btnguardaref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnguardarefKeyPressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 204, 0));
        btnSalir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 35));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVerEntradas.setBackground(new java.awt.Color(255, 204, 0));
        btnVerEntradas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnVerEntradas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEntradas.setText("MOSTRAR");
        btnVerEntradas.setBorder(null);
        btnVerEntradas.setPreferredSize(new java.awt.Dimension(150, 35));
        btnVerEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEntradasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardaref, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnguardaref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVerEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jPanel1.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 160, 460));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Detalle:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntradas.setPreferredSize(new java.awt.Dimension(225, 215));
        jScrollPane1.setViewportView(tablaEntradas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 350, 240));

        lblDescripcionTabla.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblDescripcionTabla.setText("Entradas realizadas en el turno");
        jPanel1.add(lblDescripcionTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        txfMonto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMonto.setBorder(null);
        jPanel1.add(txfMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 20));

        txfConcepto.setColumns(20);
        txfConcepto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txfConcepto.setRows(5);
        txfConcepto.setBorder(null);
        jScrollPane2.setViewportView(txfConcepto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 320, 70));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarefActionPerformed

        gasto.setTipo(tipoEntrada);
        gasto.setMonto(Float.parseFloat(txfMonto.getText()));
        gasto.setConcepto(txfConcepto.getText());
        gasto.setIdTurno(Datos.turno.getIdTurno());
        ResponseDatos<Gastos> res = ConsumoApi.gastos(Enviroment.local+"/v1/gastos", gasto, "POST");
        Utilidades.mensajePorTiempo(res.getMensaje());
        if (res.getRealizado() == true) {
            if (tipoEntrada.equalsIgnoreCase("Salidas")) {
                ImprimirGastos imp= new ImprimirGastos();
                imp.setImporte(gasto.getMonto()+"");
                imp.setTipo("GASTOS");
                
              ResponseDatos<Configuracion> rescon=ConsumoApi.configuracion(Enviroment.local+"/v1/configuracion-imprimir-gastos", imp, "POST");  
            }
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnguardarefActionPerformed

    public void actualizarTabla() {
        limpiarTabla();
        ResponseDatos<Gastos> res = ConsumoApi.gastos(Enviroment.local+"/v1/gastos/" + Datos.turno.getIdTurno() + "/" + tipoEntrada, gasto, "GET");
        DefaultTableModel modelo = (DefaultTableModel) tablaEntradas.getModel();
        String dat[] = new String[2];
        for (Gastos g : res.getDatos()) {
            dat[0] = g.getConcepto();
            dat[1] = g.getMonto() + "";
            modelo.addRow(dat);

        }
    }

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEntradas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    private void btnguardarefKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarefKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_btnguardarefKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        enfocarCampo();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEntradasActionPerformed
        if (ocultar == 0) {
            actualizarTabla();

            btnVerEntradas.setText("OCULTAR");
            this.setSize(520, 465);

            ocultar = 1;
        } else {
            btnVerEntradas.setText("MOSTRAR");
            this.setSize(520, 205);

            ocultar = 0;

        }
    }//GEN-LAST:event_btnVerEntradasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerEntradas;
    private javax.swing.JButton btnguardaref;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCantidad;
    public javax.swing.JLabel lblDescripcionTabla;
    public javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaEntradas;
    private javax.swing.JTextArea txfConcepto;
    private javax.swing.JTextField txfMonto;
    // End of variables declaration//GEN-END:variables
}
