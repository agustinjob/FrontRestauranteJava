/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.restjob;

import com.job.catalogos.EstructuraCatalogos;
import com.job.consulta.EstructuraConsulta;
import com.job.flujo.Entradas;
import com.job.modelos.Datos;
import com.job.modelos.Turno;
import com.job.rest.consumo.ConsumoApi;
import com.job.response.ResponseDatos;

/**
 *
 * @author agus_
 */
public class Estructura extends javax.swing.JFrame {

    public static Principal principal = new Principal();
    public static EstructuraCatalogos catalogos = new EstructuraCatalogos();
    public static EstructuraConsulta consultas = new EstructuraConsulta();
    public static SolicitudPassword solicitud= new SolicitudPassword();   
    public static Entradas entradas = new Entradas();

    public Estructura() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        contenedor.add(principal);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemUsuarios = new javax.swing.JMenuItem();
        itemMeseros = new javax.swing.JMenuItem();
        itemProductos = new javax.swing.JMenuItem();
        itemMesas = new javax.swing.JMenuItem();
        itemCategorias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.BorderLayout());

        jMenu1.setText("Catálogos");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemUsuarios.setText("Usuarios");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(itemUsuarios);

        itemMeseros.setText("Meseros");
        itemMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMeserosActionPerformed(evt);
            }
        });
        jMenu1.add(itemMeseros);

        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(itemProductos);

        itemMesas.setText("Mesas");
        itemMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMesasActionPerformed(evt);
            }
        });
        jMenu1.add(itemMesas);

        itemCategorias.setText("Categorías");
        itemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(itemCategorias);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem4.setText("Propinas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Flujo");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem2.setText("Entradas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Salidas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        catalogos.asignar("usuarios");
        
        catalogos.setVisible(true);
     
    }//GEN-LAST:event_itemUsuariosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        entradas.lblTitulo.setText("ENTRADAS DE EFECTIVO");
        entradas.lblDescripcionTabla.setText("Entradas realizadas en el turno");
        entradas.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itemMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMeserosActionPerformed
        catalogos.asignar("meseros");
        catalogos.setVisible(true);
   
    }//GEN-LAST:event_itemMeserosActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        catalogos.asignar("productos");
        catalogos.setVisible(true);
        
    }//GEN-LAST:event_itemProductosActionPerformed

    private void itemMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMesasActionPerformed
        catalogos.asignar("mesas");
        catalogos.setVisible(true);
       
    }//GEN-LAST:event_itemMesasActionPerformed

    private void itemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCategoriasActionPerformed
         catalogos.asignar("categorias");
        catalogos.setVisible(true);
  
    }//GEN-LAST:event_itemCategoriasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        solicitud.setVisible(true);
        solicitud.tipo="entradas";
        if(solicitud.datosCorrectos==true){
            
        solicitud.dispose();
        entradas.lblTitulo.setText("ENTRADAS DE EFECTIVO");
        entradas.lblDescripcionTabla.setText("Entradas realizadas en el turno");
        entradas.setVisible(true);  
        }
            
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       consultas.asignar("propinas");
       consultas.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

 

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
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estructura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem itemCategorias;
    private javax.swing.JMenuItem itemMesas;
    private javax.swing.JMenuItem itemMeseros;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
