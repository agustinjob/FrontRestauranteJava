/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.job.consulta;

import static com.job.comedor.EstructuraComedor.cu;
import com.job.modelos.Cuenta;
import com.job.modelos.Datos;
import com.job.modelos.DatosIds;
import com.job.modelos.Mesero;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.Estructura;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ConsultarPropinas extends javax.swing.JPanel {
    
    float totalAPagar;
    
    public ConsultarPropinas() {
        initComponents();
        lblIcono.setIcon(Iconos.pagoMesero);
        llenarCombo();
    }
    
    public void llenarCombo() {
        ResponseDatos<Mesero> res2 = ConsumoApi.meseros("http://localhost:8082/v1/meseros", null, "GET");
        comboMesero.removeAll();
        for (Mesero m : res2.getDatos()) {
            comboMesero.addItem(m);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboArchivo = new javax.swing.JComboBox<>();
        comboMesero = new javax.swing.JComboBox<Mesero>();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPropinas = new javax.swing.JTable();
        txfImporteTotal = new javax.swing.JTextField();
        txfNCuentas = new javax.swing.JTextField();
        txfImporteAPagar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 230, 249));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("PAGAR PROPINA(S)");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Archivo:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mesero:");

        comboArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboArchivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno actual", "Historico" }));

        comboMesero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton5.setBackground(new java.awt.Color(204, 102, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CONSULTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tablaPropinas.setBackground(new java.awt.Color(235, 230, 249));
        tablaPropinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaPropinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha Cierre", "Orden", "Propina Efectivo", "Propina Tarjeta", "Propina Total", "Pagar propina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPropinas.setGridColor(new java.awt.Color(235, 230, 249));
        tablaPropinas.setPreferredSize(new java.awt.Dimension(525, 325));
        tablaPropinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPropinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPropinas);
        if (tablaPropinas.getColumnModel().getColumnCount() > 0) {
            tablaPropinas.getColumnModel().getColumn(0).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(1).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(2).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(3).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(4).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(5).setResizable(false);
            tablaPropinas.getColumnModel().getColumn(6).setResizable(false);
        }

        txfImporteTotal.setBackground(new java.awt.Color(235, 230, 249));
        txfImporteTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfImporteTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPORTE TOTAL  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txfNCuentas.setBackground(new java.awt.Color(235, 230, 249));
        txfNCuentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfNCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUENTAS  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txfImporteAPagar.setBackground(new java.awt.Color(235, 230, 249));
        txfImporteAPagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txfImporteAPagar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPORTE A PAGAR  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblIcono.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(0, 0, 153));
        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Selecciona una o varias cuentas a pagar las propinas del mesero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addGap(438, 438, 438)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txfNCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(txfImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(txfImporteAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 343, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitulo)
                        .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txfImporteAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Estructura.consultas.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //     exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //    exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.red);
    }//GEN-LAST:event_exitTxtMouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaPropinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPropinasMouseClicked
        int row = tablaPropinas.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaPropinas.getModel();
        if (row > -1) {
            
            boolean seleccionado = (boolean) modelo.getValueAt(row, 6);
            float monto = (float) modelo.getValueAt(row, 5);
            modelo.setValueAt(!seleccionado, row, 6);
            if (seleccionado) {
                totalAPagar = totalAPagar - monto;
                
            } else {
                totalAPagar = totalAPagar + monto;
                
            }
            
            txfImporteAPagar.setText(totalAPagar + "");
        }
    }//GEN-LAST:event_tablaPropinasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DatosIds ids = new DatosIds();
        ids.setListaIds(obtenerListaIds());
        if (ids.getListaIds().isEmpty()) {
            Utilidades.mensajePorTiempo("Por favor selecciona una o varias cuentas para pagar las propinas");
        } else {
            ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/propinas-actualizar", ids, "POST");
            Utilidades.mensajePorTiempo(res.getMensaje());
            if (res.getRealizado()) {
                limpiarTodo();
                Estructura.consultas.dispose();
            }
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiarTodo() {
        DefaultTableModel modelo = (DefaultTableModel) tablaPropinas.getModel();
        while (modelo.getColumnCount() > 0) {
            modelo.removeRow(0);
        }
        txfImporteTotal.setText("");
        txfImporteAPagar.setText("");
        txfNCuentas.setText("");
    }

    public List<String> obtenerListaIds() {
        List<String> ids = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) tablaPropinas.getModel();
        int i = 0;
        while (i < modelo.getRowCount()) {
            boolean seleccionado = (boolean) modelo.getValueAt(i, 6);
            String id = (String) modelo.getValueAt(i, 0);
            if (seleccionado) {
                ids.add(id);
            }
            i++;
        }
        return ids;
    }
    
    public void llenarTabla() {
        String tipo = (String) comboArchivo.getSelectedItem();
        Mesero m = (Mesero) comboMesero.getSelectedItem();
        if (tipo.equalsIgnoreCase("Turno actual")) {
            tipo = "Turno";
        } else {
            tipo = "Historico";
        }
        
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas-propinas/" + Datos.turno.getIdTurno() + "/" + tipo + "/" + m.getId(), null, "GET");
        DefaultTableModel modelo = (DefaultTableModel) tablaPropinas.getModel();
        Object O[] = null;
        int i = 0;
        Utilidades.mensajePorTiempo(res.getMensaje());
        float total = 0f;
        for (Cuenta c : res.getDatos()) {
            float totalEfectivo = 0;
            float totalTarjeta = 0;
            totalEfectivo = c.getPropinaEfectivo();
            totalTarjeta = c.getPropinaVisa() + c.getPropinaMasterCard() + c.getPropinaAmericanExpress();
            total = total + totalEfectivo + totalTarjeta;
            modelo.addRow(O);
            modelo.setValueAt(c.getIdCuenta(), i, 0);
            modelo.setValueAt(Utilidades.getFechaStringCompleto(c.getCierre()), i, 1);
            modelo.setValueAt(c.getOrden(), i, 2);
            modelo.setValueAt(totalEfectivo, i, 3);
            modelo.setValueAt(totalTarjeta, i, 4);
            modelo.setValueAt((totalEfectivo + totalTarjeta), i, 5);
            modelo.setValueAt(false, i, 6);
            i++;
        }
        
        txfNCuentas.setText(res.getDatos().size() + "");
        txfImporteTotal.setText(total + "");
        txfImporteAPagar.setText("0");
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboArchivo;
    private javax.swing.JComboBox<Mesero> comboMesero;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaPropinas;
    private javax.swing.JTextField txfImporteAPagar;
    private javax.swing.JTextField txfImporteTotal;
    private javax.swing.JTextField txfNCuentas;
    // End of variables declaration//GEN-END:variables
}
