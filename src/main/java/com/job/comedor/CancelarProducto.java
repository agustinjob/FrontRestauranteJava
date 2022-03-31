/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import static com.job.comedor.EstructuraComedor.idCuentaSeleccionada;
import com.job.modelos.Cuenta;
import com.job.modelos.ProductoCuenta;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Utilidades;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agus_
 */
public class CancelarProducto extends javax.swing.JFrame {
    
    List<ProductoCuenta> productos;
    
    public CancelarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTabla();
    }
    
    public final void llenarTabla() {
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas/" + idCuentaSeleccionada, null, "GET");
        Cuenta cu = res.getDatos().get(0);
        productos = cu.getProductos();
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        int i = 0;
        String dats[] = new String[5];
        if (productos != null) {
            for (ProductoCuenta p : productos) {
                dats[0] = (i + 1) + "";
                dats[1] = p.getNombre();
                dats[2] = p.getCantidad() + "";
                dats[3] = "0";
                dats[4] = "Error de captura";
                model.addRow(dats);
                i++;
            }
        }
        
    }
    
    public void revisarDatos() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        int i = 0;
        Boolean huboModificacion = false;
        try {
            while (i < model.getRowCount()) {
                int catCap = Integer.parseInt(model.getValueAt(i, 2) + "");
                int catCan = Integer.parseInt(model.getValueAt(i, 3) + "");
                if (catCan > 0) {
                    if (catCan > catCap) {
                        Utilidades.mensajePorTiempo("La cantidad a cancelar no puede ser mayor a la cantidad capturada del producto: " + model.getValueAt(i, 1));
                    } else {
                        int totalCantidad = catCap - catCan;
                        ProductoCuenta pc = productos.get(i);
                        pc.setCantidadCancelado(catCan);
                        pc.setCantidad(totalCantidad);
                        pc.setImporte(totalCantidad * pc.getCosto());
                        pc.setMotivoCancelacion(model.getValueAt(i, 4) + "");
                        
                        if (catCap == catCan) {
                            pc.setEstatus("Cancelado");
                        } else {
                            pc.setEstatus("Parcial");
                        }
                        huboModificacion = true;
                        productos.set(i, pc);
                    }
                    
                }
                
                i++;
            }
        } catch (NumberFormatException n) {
            Utilidades.mensajePorTiempo("La información ingresada es incorrecta, por favor ingresa un valor númerico");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(235, 230, 249));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("CANCELAR PRODUCTO");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movimiento", "Descripción", "Cantidad Capturada", "Cantidad Cancelar", "Motivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setColumnSelectionAllowed(true);
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductos.getTableHeader().setResizingAllowed(false);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProductos);
        tablaProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACEPTAR");
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

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\RestJob\\src\\main\\java\\com\\job\\imagenes\\co-cancelarproducto.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 24, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        revisarDatos();
        Cuenta cu=new Cuenta();
        cu.setIdCuenta(idCuentaSeleccionada);
        cu.setProductos(productos);
         ResponseDatos<Cuenta> res = ConsumoApi.cuentas("http://localhost:8082/v1/cuentas-cambiar/6", cu, "PUT");
         Utilidades.mensajePorTiempo(res.getMensaje());
         if(res.getRealizado()){
          EstructuraComedor.llenarInformacionCuenta();
         this.dispose();
         }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
