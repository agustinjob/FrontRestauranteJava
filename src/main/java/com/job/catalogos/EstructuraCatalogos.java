/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.catalogos;

import static com.job.restjob.Estructura.comedor;
import static com.job.restjob.Estructura.contenedor;
import static com.job.restjob.Estructura.principal;

/**
 *
 * @author agus_
 */
public class EstructuraCatalogos extends javax.swing.JFrame {

    public static ContenedorUsuarios usuarios = new ContenedorUsuarios();
    public static ContenedorMeseros meseros = new ContenedorMeseros();
    public static ContenedorMesas mesas = new ContenedorMesas();
    public static ContenedorProductos productos = new ContenedorProductos();
    public static ContenedorCategorias categorias = new ContenedorCategorias();
   

    public EstructuraCatalogos() {
        initComponents();
         setLocationRelativeTo(null);
    }

    public void asignar(String tipo) {
        switch (tipo) {
            case "usuarios":
                usuarios.setVisible(true);
                mesas.setVisible(false);
                productos.setVisible(false);
                categorias.setVisible(false);
                meseros.setVisible(false);
                contenedor.add(usuarios);
                break;
            case "meseros":
                usuarios.setVisible(false);
                mesas.setVisible(false);
                productos.setVisible(false);
                categorias.setVisible(false);
                meseros.setVisible(true);
                contenedor.add(meseros);
                break;
            case "productos":
                usuarios.setVisible(false);
                mesas.setVisible(false);
                productos.setVisible(true);
                categorias.setVisible(false);
                meseros.setVisible(false);
                contenedor.add(productos);
                break;
            case "categorias":
                usuarios.setVisible(false);
                mesas.setVisible(false);
                productos.setVisible(false);
                categorias.setVisible(true);
                meseros.setVisible(false);
                contenedor.add(categorias);
                break;
            case "mesas":
                usuarios.setVisible(false);
                mesas.setVisible(true);
                productos.setVisible(false);
                categorias.setVisible(false);
                meseros.setVisible(false);
                contenedor.add(mesas);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EstructuraCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstructuraCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstructuraCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstructuraCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstructuraCatalogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contenedor;
    // End of variables declaration//GEN-END:variables
}
