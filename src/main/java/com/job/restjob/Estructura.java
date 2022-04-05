/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.job.restjob;

import com.job.catalogos.EstructuraCatalogos;
import com.job.consulta.EstructuraConsulta;
import com.job.flujo.Entradas;
import com.job.modelos.Datos;
import com.job.modelos.Gastos;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.GeneradorExcel;
import com.job.utilidades.Utilidades;
import java.util.List;

/**
 *
 * @author agus_
 */
public class Estructura extends javax.swing.JFrame {

    public static Principal principal = new Principal();
    public static EstructuraCatalogos catalogos = new EstructuraCatalogos();
    public static EstructuraConsulta consultas = new EstructuraConsulta();
    public static SolicitudPassword solicitud = new SolicitudPassword();
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
        menuCatalogos = new javax.swing.JMenu();
        itemUsuarios = new javax.swing.JMenuItem();
        itemMeseros = new javax.swing.JMenuItem();
        itemProductos = new javax.swing.JMenuItem();
        itemMesas = new javax.swing.JMenuItem();
        itemCategorias = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuFlujo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuUtilidades = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.BorderLayout());

        menuCatalogos.setText("Catálogos");
        menuCatalogos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemUsuarios.setText("Usuarios");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menuCatalogos.add(itemUsuarios);

        itemMeseros.setText("Meseros");
        itemMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMeserosActionPerformed(evt);
            }
        });
        menuCatalogos.add(itemMeseros);

        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        menuCatalogos.add(itemProductos);

        itemMesas.setText("Mesas");
        itemMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMesasActionPerformed(evt);
            }
        });
        menuCatalogos.add(itemMesas);

        itemCategorias.setText("Categorías");
        itemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCategoriasActionPerformed(evt);
            }
        });
        menuCatalogos.add(itemCategorias);

        jMenuBar1.add(menuCatalogos);

        menuConsultas.setText("Consultas");
        menuConsultas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem4.setText("Propinas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem4);

        jMenuBar1.add(menuConsultas);

        menuFlujo.setText("Flujo");
        menuFlujo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem2.setText("Entradas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuFlujo.add(jMenuItem2);

        jMenuItem3.setText("Salidas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuFlujo.add(jMenuItem3);

        jMenuBar1.add(menuFlujo);

        menuUtilidades.setText("Utilidades");
        menuUtilidades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem5.setText("Configuración");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuUtilidades.add(jMenuItem5);

        jMenuBar1.add(menuUtilidades);

        jMenu1.setText("Reportes");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem6.setText("Entradas/Salidas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

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
        if (Datos.turno != null) {
            entradas.limpiarTabla();
            entradas.enfocarCampo();
            entradas.lblTitulo.setText("ENTRADAS DE EFECTIVO");
            entradas.lblDescripcionTabla.setText("Entradas realizadas en el turno");
            entradas.tipoEntrada = "Entradas";
            entradas.setVisible(true);
        } else {
            Utilidades.mensajePorTiempo("Debes tener un turno abierto para acceder a esta funcionalidad");
        }

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
        if (Datos.turno != null) {
            solicitud.setTipo("Salidas");
            solicitud.setVisible(true);
        } else {
            Utilidades.mensajePorTiempo("Debes tener un turno abierto para acceder a estas funcionalidades");
        }


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (Datos.turno != null) {
            consultas.asignar("propinas");
            consultas.setVisible(true);
        } else {
            Utilidades.mensajePorTiempo("Debes tener un turno abierto para acceder a esta funcionalidad");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        catalogos.asignar("configuracion");
        catalogos.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (Datos.turno != null) {
            ResponseDatos<Gastos> res = ConsumoApi.gastos("http://localhost:8082/v1/gastos/" + Datos.turno.getIdTurno() + "/Salidas", null, "GET");
            ResponseDatos<Gastos> res2 = ConsumoApi.gastos("http://localhost:8082/v1/gastos/" + Datos.turno.getIdTurno() + "/Entradas", null, "GET");

            List<Gastos> lista_salidas = res.getDatos();
            List<Gastos> lista_entradas = res2.getDatos();
            GeneradorExcel.writeExcelReporteMovimientos(lista_entradas, lista_salidas);
        } else {
            Utilidades.mensajePorTiempo("Debes tener un turno abierto para acceder a esta funcionalidad");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem itemCategorias;
    private javax.swing.JMenuItem itemMesas;
    private javax.swing.JMenuItem itemMeseros;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu menuCatalogos;
    public static javax.swing.JMenu menuConsultas;
    public static javax.swing.JMenu menuFlujo;
    private javax.swing.JMenu menuUtilidades;
    // End of variables declaration//GEN-END:variables
}
