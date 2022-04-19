/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.comedor;

import com.job.modelos.Configuracion;
import com.job.modelos.Cuenta;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.restjob.SolicitudPassword;
import com.job.utilidades.Iconos;
import com.job.modelos.Datos;
import com.job.modelos.Producto;
import com.job.modelos.ProductoCuenta;
import com.job.restjob.Estructura;
import static com.job.restjob.Estructura.solicitud;
import com.job.utilidades.Utilidades;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.job.ambiente.Enviroment;
import com.job.restjob.Principal;

/**
 *
 * @author agus_
 */
public class EstructuraComedor extends javax.swing.JFrame {

    public static String idCuentaSeleccionada;
    public static String nombreCuentaSeleccionada;
    public static Cuenta cu;
    public static int tipoCuentas = 1;
    CambiarMesero cambiarMesero = new CambiarMesero();

    public EstructuraComedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarIconos();
        tablaCuentas.getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuentas.getColumnModel().getColumn(4).setMinWidth(0);
        tablaCuentas.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCuentas.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        deshabilitarBotones();
    }

    public static final void deshabilitarBotones() {
        boolean sePuede = false;
        btnAbrirCuenta.setEnabled(true);
        idCuentaSeleccionada = "";
        nombreCuentaSeleccionada = "";
        cu = null;
        btnCancelarProducto.setEnabled(sePuede);
        btnJuntarCuentas.setEnabled(sePuede);
        btnDividirCuenta.setEnabled(sePuede);
        btnCapturar.setEnabled(sePuede);
        btnRenombrarCuenta.setEnabled(sePuede);
        btnCambiarMesero.setEnabled(sePuede);
        btnDescuento.setEnabled(sePuede);
        btnPagarCuenta.setEnabled(sePuede);
        btnReabrirCuenta.setEnabled(sePuede);
        btnPendiente.setEnabled(sePuede);
        btnImprimir.setEnabled(sePuede);

    }

    public final void llenarIconos() {
        btnAbrirCuenta.setIcon(Iconos.abrirCuenta);
        btnCancelarProducto.setIcon(Iconos.cancelarProducto);
        btnJuntarCuentas.setIcon(Iconos.juntarCuentas);
        btnDividirCuenta.setIcon(Iconos.dividirCuenta);
        btnCapturar.setIcon(Iconos.capturar);
        btnRenombrarCuenta.setIcon(Iconos.renombrarCuenta);
        btnCambiarMesero.setIcon(Iconos.cambioMesero);
        btnDescuento.setIcon(Iconos.descuento);
        btnPagarCuenta.setIcon(Iconos.pagarCuenta);
        btnImprimir.setIcon(Iconos.imprimir);
        btnReabrirCuenta.setIcon(Iconos.reabrirCuenta);
        btnPendiente.setIcon(Iconos.pendiente);
        lblIconoComedor.setIcon(Iconos.comedor);

        // lblIcono.setIcon();
        // lblIcono.setIcon();
    }

    public static void actualizarTabla(int opcion) {
        limpiarTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaCuentas.getModel();
        ResponseDatos<Cuenta> res = new ResponseDatos<>();

        if (opcion == 1) {
            tipoCuentas = 1;
            String estadoCuenta = "abierta";
            limpiarInformacionCuenta();
            res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas/" + Datos.turno.getIdTurno() + "/" + estadoCuenta, null, "GET");

        } else if (opcion == 3) {
            tipoCuentas = 3;
            limpiarInformacionCuenta();
            res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas-estatus/pendiente", null, "GET");

        } else {
            tipoCuentas = 4;
            String buscar = txfBuscarCuenta.getText().equalsIgnoreCase("") ? "*" : txfBuscarCuenta.getText();
            res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas-coincidencia/" + buscar.replace(" ", "%20") + "/nombreCuenta/" + Datos.turno.getIdTurno(), null, "GET");

        }

        Object O[] = null;
        int i = 0;
        if (res.getDatos() != null) {
            for (Cuenta c : res.getDatos()) {
                if (c.getIdCuenta().equals(idCuentaSeleccionada)) {
                    llenarInformacionCuenta();
                }
                modelo.addRow(O);
                modelo.setValueAt(c.getNombreCuenta(), i, 0);
                modelo.setValueAt(c.getOrden(), i, 1);
                modelo.setValueAt(c.getNombreMesero(), i, 2);
                modelo.setValueAt(c.getImpreso(), i, 3);
                modelo.setValueAt(c.getIdCuenta(), i, 4);
                i++;
            }
        }
    }

    public static void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCuentas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCuentas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txfBuscarCuenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblIconoComedor = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnAbrirCuenta = new javax.swing.JButton();
        btnCancelarProducto = new javax.swing.JButton();
        btnJuntarCuentas = new javax.swing.JButton();
        btnDividirCuenta = new javax.swing.JButton();
        btnRenombrarCuenta = new javax.swing.JButton();
        btnCapturar = new javax.swing.JButton();
        btnCambiarMesero = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        btnPagarCuenta = new javax.swing.JButton();
        btnReabrirCuenta = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnPendiente = new javax.swing.JButton();
        panelInformacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txfCuenta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txfArea = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txfFolio = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txfMesa = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txfMesero = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txfOrden = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txfPersonas = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txfApertura = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txfCierre = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelMonto = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        txfSubtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        txfDescuento = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txfImpuesto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        txfTotal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        btnCuentasPendientes = new javax.swing.JButton();
        cbEncuesta = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCuentas.setBackground(new java.awt.Color(255, 255, 255));
        panelCuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        panelCuentas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txfBuscarCuenta.setFont(txfBuscarCuenta.getFont().deriveFont(txfBuscarCuenta.getFont().getSize()+4f));
        txfBuscarCuenta.setBorder(null);
        txfBuscarCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarCuentaKeyReleased(evt);
            }
        });
        panelCuentas.add(txfBuscarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, -1));
        panelCuentas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, -1));

        tablaCuentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Orden", "Mesero", "Impresa", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuentasMouseClicked(evt);
            }
        });
        tablaCuentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaCuentasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCuentas);
        tablaCuentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaCuentas.getColumnModel().getColumnCount() > 0) {
            tablaCuentas.getColumnModel().getColumn(4).setResizable(false);
        }

        panelCuentas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 470));

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 540));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("SERVICIO COMEDOR");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel1.add(lblIconoComedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 48));

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setLayout(new java.awt.GridLayout(2, 6, 4, 4));

        btnAbrirCuenta.setBackground(new java.awt.Color(255, 102, 102));
        btnAbrirCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnAbrirCuenta.setText("ABRIR CUENTA");
        btnAbrirCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrirCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrirCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnAbrirCuenta);

        btnCancelarProducto.setBackground(new java.awt.Color(204, 255, 204));
        btnCancelarProducto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCancelarProducto.setText("CANCELAR PROD");
        btnCancelarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCancelarProducto);

        btnJuntarCuentas.setBackground(new java.awt.Color(102, 255, 102));
        btnJuntarCuentas.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnJuntarCuentas.setText("JUNTAR CUENTAS");
        btnJuntarCuentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJuntarCuentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJuntarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuntarCuentasActionPerformed(evt);
            }
        });
        panelOpciones.add(btnJuntarCuentas);

        btnDividirCuenta.setBackground(new java.awt.Color(255, 204, 0));
        btnDividirCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnDividirCuenta.setText("DIVIDIR CUENTA");
        btnDividirCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividirCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDividirCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnDividirCuenta);

        btnRenombrarCuenta.setBackground(new java.awt.Color(102, 102, 255));
        btnRenombrarCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnRenombrarCuenta.setText("RENOMBRAR CTA");
        btnRenombrarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenombrarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRenombrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenombrarCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnRenombrarCuenta);

        btnCapturar.setBackground(new java.awt.Color(255, 0, 255));
        btnCapturar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCapturar.setText("CAPTURAR");
        btnCapturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCapturar);

        btnCambiarMesero.setBackground(new java.awt.Color(153, 153, 255));
        btnCambiarMesero.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCambiarMesero.setText("CAMBIO MESERO");
        btnCambiarMesero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarMesero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambiarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarMeseroActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCambiarMesero);

        btnDescuento.setBackground(new java.awt.Color(153, 0, 51));
        btnDescuento.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnDescuento.setText("DESCUENTO");
        btnDescuento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDescuento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });
        panelOpciones.add(btnDescuento);

        btnPagarCuenta.setBackground(new java.awt.Color(0, 255, 204));
        btnPagarCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnPagarCuenta.setText("PAGAR CUENTA");
        btnPagarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnPagarCuenta);

        btnReabrirCuenta.setBackground(new java.awt.Color(153, 0, 153));
        btnReabrirCuenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnReabrirCuenta.setText("REABRIR CUENTA");
        btnReabrirCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReabrirCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReabrirCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReabrirCuentaActionPerformed(evt);
            }
        });
        panelOpciones.add(btnReabrirCuenta);

        btnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimir.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        panelOpciones.add(btnImprimir);

        btnPendiente.setBackground(new java.awt.Color(102, 102, 0));
        btnPendiente.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnPendiente.setText(" PENDIENTE");
        btnPendiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPendiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });
        panelOpciones.add(btnPendiente);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 10, 780, 130));

        panelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        panelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CUENTA:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfCuenta.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ÁREA:");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfArea.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FOLIO:");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfFolio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfFolio.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("MESA:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfMesa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfMesa.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("MESERO:");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfMesero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfMesero.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ORDEN:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfOrden.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfOrden.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("PERSONA:");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfPersonas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txfPersonas.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("APERTURA:");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfApertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfApertura.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("CIERRE:");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txfCierre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfCierre.setBorder(null);

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(txfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21)
                        .addGap(12, 12, 12)
                        .addComponent(txfCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(txfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformacionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel16)
                                .addGap(4, 4, 4)
                                .addComponent(txfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel18)))
                        .addGap(14, 14, 14)
                        .addComponent(txfOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(panelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 800, 120));

        tablaProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movimiento", "Descripción", "Cantidad", "Precio", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(15);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(15);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(15);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 800, 260));

        panelMonto.setBackground(new java.awt.Color(255, 255, 255));
        panelMonto.setLayout(new java.awt.GridLayout(6, 1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfSubtotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txfSubtotal.setText("0.0");
        txfSubtotal.setBorder(null);
        txfSubtotal.setEnabled(false);
        txfSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSubtotalActionPerformed(evt);
            }
        });
        jPanel15.add(txfSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 94, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Subtotal      $");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfDescuento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txfDescuento.setText("0.0");
        txfDescuento.setBorder(null);
        txfDescuento.setEnabled(false);
        jPanel16.add(txfDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 94, -1));

        lblDescuento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDescuento.setText("Desc. %      $");
        jPanel16.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfImpuesto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txfImpuesto.setText("0.0");
        txfImpuesto.setBorder(null);
        txfImpuesto.setEnabled(false);
        jPanel17.add(txfImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 94, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Impuesto     $");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        panelMonto.add(jPanel17);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txfTotal.setText("0.0");
        txfTotal.setBorder(null);
        txfTotal.setEnabled(false);
        jPanel20.add(txfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 94, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 51));
        jLabel42.setText("Total           $");
        jPanel20.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, -1));

        panelMonto.add(jPanel20);

        jPanel1.add(panelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 240, 170));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
        });
        jPanel1.add(exitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, -1));

        btnCuentasPendientes.setBackground(new java.awt.Color(255, 102, 51));
        btnCuentasPendientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCuentasPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnCuentasPendientes.setText("CUENTAS PENDIENTES");
        btnCuentasPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasPendientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuentasPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        cbEncuesta.setText("Imprimir encuesta");
        jPanel1.add(cbEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSubtotalActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Principal.btnComedor.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void tablaCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentasMouseClicked
        funcionalidadTablaCuentas();

    }//GEN-LAST:event_tablaCuentasMouseClicked
    public void funcionalidadTablaCuentas() {
        int row = tablaCuentas.getSelectedRow();

        if (row != -1) {
            idCuentaSeleccionada = (String) tablaCuentas.getValueAt(row, 4);
            nombreCuentaSeleccionada = (String) tablaCuentas.getValueAt(row, 0);

            llenarInformacionCuenta();
        }
    }
    private void btnAbrirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCuentaActionPerformed
        btnAbrirCuenta.setEnabled(false);
        AbrirCuenta abrir = new AbrirCuenta();
        abrir.llenarCombos();
        abrir.setVisible(true);
    }//GEN-LAST:event_btnAbrirCuentaActionPerformed

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
        btnCancelarProducto.setEnabled(false);
        Estructura.solicitud.setVisible(true);
        Estructura.solicitud.setTipo("cancelar_producto");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarProductoActionPerformed

    private void btnJuntarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuntarCuentasActionPerformed
        btnJuntarCuentas.setEnabled(true);
        JuntarMesas juntar = new JuntarMesas();
        juntar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnJuntarCuentasActionPerformed

    private void btnDividirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirCuentaActionPerformed
        btnDividirCuenta.setEnabled(false);
        DividirCuenta dividir = new DividirCuenta();
        dividir.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDividirCuentaActionPerformed

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        btnCapturar.setEnabled(false);
        CapturarProductos capturar = new CapturarProductos();
        capturar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnCambiarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarMeseroActionPerformed

        //if(!cambiarMesero.isShowing()){
        cambiarMesero.llenarCombo();
        cambiarMesero.setVisible(true);
        //}        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarMeseroActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        btnDescuento.setEnabled(false);
        solicitud.setTipo("descuento");
        solicitud.setCuenta(cu, "comedor");
        solicitud.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void btnPagarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCuentaActionPerformed
        btnPagarCuenta.setEnabled(false);
        Pagar pagar = new Pagar(idCuentaSeleccionada, "comedor");
        pagar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarCuentaActionPerformed

    private void btnReabrirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReabrirCuentaActionPerformed
        btnReabrirCuenta.setEnabled(false);
        solicitud.setTipo("reabrircuenta");
        solicitud.setCuenta(cu, "comedor");
        solicitud.setVisible(true);
    }//GEN-LAST:event_btnReabrirCuentaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        btnImprimir.setEnabled(false);
        cu.setApertura(null);
        cu.setCierre(null);
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas-cambiar/5", cu, "PUT");

        if (res.getRealizado()) {
            boolean enc = cbEncuesta.isSelected();
            ResponseDatos<Configuracion> res2 = ConsumoApi.configuracion(Enviroment.local + "/v1/configuracion-imprimir/" + idCuentaSeleccionada + "/1/" + enc, null, "GET");

            Utilidades.mensajePorTiempo(res2.getMensaje());
            llenarInformacionCuenta();
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnRenombrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenombrarCuentaActionPerformed
        btnRenombrarCuenta.setEnabled(false);
        RenombrarCuenta renombrar = new RenombrarCuenta(txfCuenta.getText());
        renombrar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRenombrarCuentaActionPerformed

    private void txfBuscarCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarCuentaKeyReleased
        actualizarTabla(2);
    }//GEN-LAST:event_txfBuscarCuentaKeyReleased

    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteActionPerformed
        btnPendiente.setEnabled(false);
        cu.setApertura(null);
        cu.setCierre(null);
        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas-cambiar/10", cu, "PUT");
        Utilidades.mensajePorTiempo(res.getMensaje());
        if (res.getRealizado()) {
            limpiarInformacionCuenta();
            limpiarTablaProductos();
            actualizarTabla(1);
        }

    }//GEN-LAST:event_btnPendienteActionPerformed

    private void btnCuentasPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasPendientesActionPerformed
        if (btnCuentasPendientes.getText().equalsIgnoreCase("CUENTAS PENDIENTES")) {
            actualizarTabla(3);
            limpiarInformacionCuenta();
            limpiarTablaProductos();
            txfBuscarCuenta.setEnabled(false);
            btnCuentasPendientes.setText("CUENTAS ACTUALES");

        } else {
            actualizarTabla(1);
            limpiarInformacionCuenta();
            limpiarTablaProductos();
            txfBuscarCuenta.setEnabled(true);
            btnCuentasPendientes.setText("CUENTAS PENDIENTES");
        }
    }//GEN-LAST:event_btnCuentasPendientesActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Principal.btnComedor.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void tablaCuentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCuentasKeyReleased
        if (evt.getKeyCode() == 40 || evt.getKeyCode() == 38) {
            funcionalidadTablaCuentas();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tablaCuentasKeyReleased

    public static boolean buscarEnCuentas(String busqueda, String parametro) {
        boolean seguir = true;
        DefaultTableModel modelo = (DefaultTableModel) tablaCuentas.getModel();
        int i = 0;
        while (modelo.getRowCount() > i) {
            if (busqueda.equalsIgnoreCase("nombre")) {
                String nom_cuenta = (String) modelo.getValueAt(i, 0);
                if (nom_cuenta.compareTo(parametro) == 0) {
                    Utilidades.mensajePorTiempo("Ya existe una cuenta con ese nombre, por favor ingresa otro nombre");
                    return false;
                }
            }
            i++;
        }
        return seguir;
    }

    public static void limpiarInformacionCuenta() {
        txfArea.setText("Comedor");
        txfCierre.setText("");
        txfApertura.setText("");
        txfCuenta.setText("");
        txfFolio.setText("");
        txfMesa.setText("");
        txfMesero.setText("");
        txfOrden.setText("");
        txfPersonas.setText("");
        txfTotal.setText("");
        txfSubtotal.setText("");
        txfImpuesto.setText("");
        txfDescuento.setText("");
        lblDescuento.setText("Desc. %      $");
        idCuentaSeleccionada = "";
        nombreCuentaSeleccionada = "";
        deshabilitarBotones();
    }

    public static void esModificable(boolean sePuede) {
        btnAbrirCuenta.setEnabled(sePuede);
        btnCancelarProducto.setEnabled(sePuede);
        btnJuntarCuentas.setEnabled(sePuede);
        btnDividirCuenta.setEnabled(sePuede);
        btnCapturar.setEnabled(sePuede);
        btnRenombrarCuenta.setEnabled(sePuede);
        btnCambiarMesero.setEnabled(sePuede);
        btnDescuento.setEnabled(sePuede);
        btnReabrirCuenta.setEnabled(!sePuede);
        if (btnCuentasPendientes.getText().equalsIgnoreCase("CUENTAS ACTUALES")) {
            btnCuentasPendientes.setEnabled(true);
        } else {
            btnPendiente.setEnabled(sePuede);

        }
        btnImprimir.setEnabled(true);

    }

    public static void cuentaPagada(boolean estaPagada) {
        btnPagarCuenta.setEnabled(!estaPagada);
    }

    public static void llenarInformacionCuenta() {

        ResponseDatos<Cuenta> res = ConsumoApi.cuentas(Enviroment.local + "/v1/cuentas/" + idCuentaSeleccionada, null, "GET");
        cu = res.getDatos().get(0);
        esModificable(cu.isEsModificable());
        cuentaPagada(cu.isSePago());
        txfArea.setText("Comedor");
        txfCierre.setText(cu.getCierre() == null ? "" : Utilidades.getFechaStringCompleto(cu.getCierre()));
        txfApertura.setText(Utilidades.getFechaStringCompleto(cu.getApertura()));
        txfCuenta.setText(cu.getNombreCuenta());
        txfFolio.setText(cu.getFolio() + "");
        txfMesa.setText(cu.getMesa());
        txfMesero.setText(cu.getNombreMesero());
        txfOrden.setText(cu.getOrden() + "");
        txfPersonas.setText(cu.getPersonas() + "");
        txfTotal.setText(Utilidades.formatoDecimaDosDigitos(cu.getMontoTotal()));
        txfSubtotal.setText(Utilidades.formatoDecimaDosDigitos(cu.getMontoSubtotal()));
        if (cu.getDescuento() != 0) {
            int longit = ((int) cu.getDescuento() + "").length();
            String cad = "";
            switch (longit) {
                case 1:
                    cad = "Desc. " + (int) cu.getDescuento() + "%    $";
                    break;
                case 2:
                    cad = "Desc. " + (int) cu.getDescuento() + "%  $";
                    break;
                case 3:
                    cad = "Desc. " + (int) cu.getDescuento() + "% $";
                    break;
                default:
                    break;
            }
            lblDescuento.setText(cad);
        } else {
            lblDescuento.setText("Desc. %      $");
        }

        txfImpuesto.setText(Utilidades.formatoDecimaDosDigitos(cu.getIva()));
        txfDescuento.setText(Utilidades.formatoDecimaDosDigitos(cu.getMontoTotalDescuento()));
        llenarTablaProductos(cu.getProductos());

    }

    public static void llenarTablaProductos(List<ProductoCuenta> productos) {
        limpiarTablaProductos();
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        int i = 0;
        String dats[] = new String[5];
        if (productos != null) {
            for (ProductoCuenta p : productos) {

                dats[0] = (i + 1) + "";
                dats[1] = p.getNombre();
                dats[2] = p.getCantidad() + "";
                dats[3] = p.getCosto() + "";
                dats[4] = p.getImporte() + "";
                model.addRow(dats);
                i++;
            }
        }

    }

    public static void limpiarTablaProductos() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAbrirCuenta;
    private static javax.swing.JButton btnCambiarMesero;
    public static javax.swing.JButton btnCancelarProducto;
    public static javax.swing.JButton btnCapturar;
    public static javax.swing.JButton btnCuentasPendientes;
    public static javax.swing.JButton btnDescuento;
    public static javax.swing.JButton btnDividirCuenta;
    private static javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnJuntarCuentas;
    public static javax.swing.JButton btnPagarCuenta;
    private static javax.swing.JButton btnPendiente;
    public static javax.swing.JButton btnReabrirCuenta;
    public static javax.swing.JButton btnRenombrarCuenta;
    private javax.swing.JCheckBox cbEncuesta;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private static javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblIconoComedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelMonto;
    private javax.swing.JPanel panelOpciones;
    public static javax.swing.JTable tablaCuentas;
    public static javax.swing.JTable tablaProductos;
    private static javax.swing.JTextField txfApertura;
    private static javax.swing.JTextField txfArea;
    private static javax.swing.JTextField txfBuscarCuenta;
    private static javax.swing.JTextField txfCierre;
    private static javax.swing.JTextField txfCuenta;
    private static javax.swing.JTextField txfDescuento;
    private static javax.swing.JTextField txfFolio;
    private static javax.swing.JTextField txfImpuesto;
    private static javax.swing.JTextField txfMesa;
    private static javax.swing.JTextField txfMesero;
    private static javax.swing.JTextField txfOrden;
    private static javax.swing.JTextField txfPersonas;
    private static javax.swing.JTextField txfSubtotal;
    private static javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
