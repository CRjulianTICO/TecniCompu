package Sistema;

import Mantenimientos.MantenimientoFactura;
import Objetos.Cliente;
import Objetos.ClienteServicio;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class RetiraEquipo extends javax.swing.JFrame {

    String factura = "";

    public RetiraEquipo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        try {
            Image imag = ImageIO.read(new File(".\\src\\Imagenes\\monitor.png"));
            this.setIconImage(imag);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        NumeroBoleta = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        FacturarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        RetirarEquipo = new javax.swing.JLabel();
        ConsultarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServiciosContratados = new javax.swing.JTable();
        NumeroBoleta1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRefrescaTodos = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        NumeroBoleta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NumeroBoleta.setForeground(new java.awt.Color(255, 255, 255));
        NumeroBoleta.setText("Numero de Cedula del Cliente:");

        txtCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        FacturarBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FacturarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        FacturarBtn.setText("Facturar");
        FacturarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarBtnActionPerformed(evt);
            }
        });

        VolverBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VolverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maps-and-flags.png"))); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        RetirarEquipo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        RetirarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        RetirarEquipo.setText("Retirar Equipo");

        ConsultarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConsultarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        ConsultarBtn.setText("Consultar estado");
        ConsultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBtnActionPerformed(evt);
            }
        });

        tblServiciosContratados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblServiciosContratados);

        NumeroBoleta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NumeroBoleta1.setForeground(new java.awt.Color(255, 255, 255));
        NumeroBoleta1.setText("Codigo de Servicio:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnRefrescaTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file.png"))); // NOI18N
        btnRefrescaTodos.setText("Ver todos");
        btnRefrescaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescaTodosActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok-button.png"))); // NOI18N
        btnFinalizar.setText("Poner como Listo/Completado");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RetirarEquipo)
                .addGap(345, 345, 345))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NumeroBoleta1)
                                    .addComponent(NumeroBoleta))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ConsultarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFinalizar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(txtCodigo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FacturarBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VolverBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescaTodos))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RetirarEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroBoleta)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroBoleta1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FacturarBtn))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarBtn)
                    .addComponent(btnFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VolverBtn)
                    .addComponent(btnRefrescaTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generaTableClienteServicio(List lista) {
        String[] columnas = {"Codigo Servicio", "Cedula", "Marca", "Modelo", "Tipo", "Estado", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.setColumnIdentifiers(columnas);
        tblServiciosContratados.setModel(modelo);
        ArrayList listaServicios = (ArrayList) lista;

        if (listaServicios.size() > 0 && listaServicios != null) {
            ClienteServicio cls;
            Object fila[] = new Object[7];
            for (int i = 0; i < listaServicios.size(); i++) {
                cls = (ClienteServicio) listaServicios.get(i);

                fila[0] = cls.getIdServicio();
                fila[1] = cls.getIdCliente();
                fila[2] = cls.getMarca();
                fila[3] = cls.getModelo();
                fila[4] = cls.getTipo();
                fila[5] = cls.getEstado();
                fila[6] = cls.getCosto();
                modelo.addRow(fila);
            }
        }
    }


    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        ServicioCliente sc = new ServicioCliente();
        sc.show();
        this.dispose();
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void ConsultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBtnActionPerformed

        try {
            if (txtCedula.getText().isEmpty() || txtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos solicitados");
            } else {
                MantenimientoFactura mf = MantenimientoFactura.getInstancia();
                generaTableClienteServicio(mf.listarServicioContratadoEsp(txtCedula.getText(), Integer.parseInt(txtCodigo.getText())));
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(rootPane, "Debe insertar unicamente numeros");
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_ConsultarBtnActionPerformed

    private void btnRefrescaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescaTodosActionPerformed

        try {
            MantenimientoFactura mf = MantenimientoFactura.getInstancia();
            generaTableClienteServicio(mf.listarClienteServicio());
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(rootPane, "Debe insertar unicamente numeros");
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_btnRefrescaTodosActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       try {
            if (txtCedula.getText().isEmpty() || txtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos solicitados");
            } else {
                MantenimientoFactura mf = MantenimientoFactura.getInstancia();
                mf.listo(txtCedula.getText(), Integer.parseInt(txtCodigo.getText()));
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(rootPane, "Debe insertar unicamente numeros");
            System.out.println(""+ne);
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void FacturarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarBtnActionPerformed
      try {
            if (txtCedula.getText().isEmpty() || txtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos solicitados");
            } else {
                MantenimientoFactura mf = MantenimientoFactura.getInstancia();
                mf.facturado(txtCedula.getText(), Integer.parseInt(txtCodigo.getText()));
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(rootPane, "Debe insertar unicamente numeros");
            System.out.println(""+ne);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_FacturarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RetiraEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetiraEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetiraEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetiraEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetiraEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarBtn;
    private javax.swing.JButton FacturarBtn;
    private javax.swing.JLabel NumeroBoleta;
    private javax.swing.JLabel NumeroBoleta1;
    private javax.swing.JLabel RetirarEquipo;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRefrescaTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblServiciosContratados;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
