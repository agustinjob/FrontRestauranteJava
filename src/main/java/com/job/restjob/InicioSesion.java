package com.job.restjob;

import com.job.modelos.Datos;
import com.job.modelos.Usuario;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.Iconos;
import com.job.utilidades.Utilidades;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import com.job.ambiente.Enviroment;

public class InicioSesion extends javax.swing.JFrame {

    Date d = new Date();

    public InicioSesion() {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Inicio de sesión");
        ImageIcon iniciar = new ImageIcon("iconos/check.png");
        ImageIcon salir = new ImageIcon("iconos/cancelar.png");
        btnSalir.setIcon(salir);
        btnIniciar.setIcon(iniciar);
        AutoCompleteDecorator.decorate(comboUsuario, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
        llenarIconos();
        llenarCombo();

    }

    public final void llenarIconos() {
        lblIconInicio.setIcon(Iconos.inicioSesion);
    }

    public void llenarCombo() {
        ResponseDatos<Usuario> res = ConsumoApi.usuarios(Enviroment.local+"/v1/usuarios", null, "GET");
        System.out.println(Enviroment.local+"/v1/usuarios");
        comboUsuario.removeAllItems();
        Usuario vacio = new Usuario();
        vacio.setIdUsuario("");
        comboUsuario.addItem(vacio);
        List<Usuario> lista = res.getDatos();
        for (Usuario u : lista) {
            comboUsuario.addItem(u);
        }

    }

    public boolean revisarDatosInicioSesion() {

        Usuario seleccionado = (Usuario) comboUsuario.getSelectedItem();
        if (seleccionado.getIdUsuario().equals("")) {
            Utilidades.mensajePorTiempo("Por favor ingresa los datos solicitados");
        } else {
            String pass = new String(password.getPassword());
            if (seleccionado.getPassword().equals(pass)) {
                Datos.usuario = seleccionado;
                return true;
            }
        }

        return false;

    }

    public void login() {
        if (revisarDatosInicioSesion()) {
            Estructura e = new Estructura();
            e.setVisible(true);
            this.dispose();
        } else {
            Utilidades.mensajePorTiempo("Los datos ingresados son incorrectos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        labelc = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        comboUsuario = new javax.swing.JComboBox<Usuario>();
        lblIconInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(595, 280));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("INICIO DE SESIÓN");

        jLabel2.setText("Por favor ingresa tu nombre de usuario y contraseña");

        label1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        label1.setText("USUARIO:");
        label1.setPreferredSize(new java.awt.Dimension(130, 35));

        labelc.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        labelc.setText("CONTRASEÑA:");
        labelc.setPreferredSize(new java.awt.Dimension(130, 35));

        password.setPreferredSize(new java.awt.Dimension(170, 35));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(153, 153, 255));
        btnIniciar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(null);
        btnIniciar.setPreferredSize(new java.awt.Dimension(250, 35));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setPreferredSize(new java.awt.Dimension(250, 35));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        comboUsuario.setEditable(true);
        comboUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuarioActionPerformed(evt);
            }
        });
        comboUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUsuarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(lblIconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblIconInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 575, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed


    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        login();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        login();
    }//GEN-LAST:event_formKeyPressed

    private void comboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUsuarioActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

    private void comboUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_comboUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Usuario> comboUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelc;
    private javax.swing.JLabel lblIconInicio;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
