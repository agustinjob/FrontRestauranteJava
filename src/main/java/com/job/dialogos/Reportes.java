/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.dialogos;

import com.job.ambiente.Enviroment;
import com.job.modelos.Datos;
import com.job.modelos.Fechas;
import com.job.modelos.ReporteCancelados;
import com.job.modelos.ReporteCategoria;
import com.job.modelos.ReporteVendidos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.GeneradorExcel;
import com.job.utilidades.Utilidades;
import java.util.Date;
import java.util.List;

/**
 *
 * @author agus_
 */
public class Reportes extends javax.swing.JFrame {

    String fechaI;
    String fechaF;
    boolean aceptado = false;
    String tipo = "";

    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        fechaIni = new com.toedter.calendar.JDateChooser();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("REPORTES");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Por favor ingresa la fecha de inicio del reporte y la fecha final.");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("A");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("De");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblTitulo1)
                        .addGap(53, 53, 53)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(lblTitulo1))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(fechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean continua = true;
        Fechas f = new Fechas();
        try {
            fechaI = Utilidades.getFechaStringCorto(fechaIni.getDate());
            fechaF = Utilidades.getFechaStringCorto(fechaFin.getDate());
            f.setFechaI(fechaI);
            f.setFechaF(fechaF);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Por favor ingresa la información solicitada", 2000);
            continua = false;
        }
        if (continua) {
            if (fechaIni.getDate().after(fechaFin.getDate())) {
                Utilidades.mensajePorTiempo("La fecha de inicio no puede ser mayor a la fecha final", 2000);
            } else {
                if (fechaIni == null || fechaFin == null) {
                    Utilidades.mensajePorTiempo("Por favor ingresa la información solicitada", 2000);
                } else {
                    if (Datos.turno != null) {
                        switch (tipo) {
                            case "cancelados":
                                List<ReporteCancelados> res = ConsumoApi.reporteCancelados(Enviroment.local + "/v1/reporte-cancelados", f, "POST");
                                if (res.size() > 0) {
                                    GeneradorExcel.writeExcelReporteProductosCancelados(res);
                                      this.dispose();
                                } else {
                                    Utilidades.mensajePorTiempo("No hay datos en ese lapso seleccionado", 2000);
                                }
                                break;
                            case "ventasxproducto": 
                                 List<ReporteVendidos> resvendidos = ConsumoApi.reporteVendidos(Enviroment.local + "/v1/reporte-vendidos", f, "POST");
                                if (resvendidos.size() > 0) {
                                    GeneradorExcel.writeExcelReporteProductosVendidos(resvendidos);
                                      this.dispose();
                                } else {
                                    Utilidades.mensajePorTiempo("No hay datos en ese lapso seleccionado", 2000);
                                }
                                break;    
                            case "ventasxcategoria": 
                                 List<ReporteCategoria> rescat = ConsumoApi.reporteCategoria(Enviroment.local + "/v1/reporte-categoria", f, "POST");
                                if (rescat.size() > 0) {
                                    GeneradorExcel.writeExcelReporteProductosCategoria(rescat);
                                      this.dispose();
                                } else {
                                    Utilidades.mensajePorTiempo("No hay datos en ese lapso seleccionado", 2000);
                                }
                                break; 
                        }

                    } else {
                        Utilidades.mensajePorTiempo("Debes tener un turno abierto para acceder a esta funcionalidad");
                    }
                  
                }

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaIni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    // End of variables declaration//GEN-END:variables
}
