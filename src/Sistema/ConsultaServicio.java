package Sistema;

import Mantenimientos.ManteniminetoServicio;
import Objetos.Servicio;
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
public class ConsultaServicio extends javax.swing.JFrame {

    public ConsultaServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
         try {
            Image imag = ImageIO.read(new File(".\\src\\Imagenes\\monitor.png"));
            this.setIconImage(imag);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    private void generaTableServicio(List lista){
         String[] columnas = {"Codigo del Servico", "Tipo de Servicio",  "Costo del Servico",  "Nombre del Servicio"};
            DefaultTableModel modelo = new DefaultTableModel(){public boolean isCellEditable(int row, int column){return false;}};
            modelo.setColumnIdentifiers(columnas); 
            tblServicios.setModel(modelo);
            ManteniminetoServicio ms = ManteniminetoServicio.getInstancia();
            ArrayList listaServicios = (ArrayList) lista;
            
            if (listaServicios.size()>0 && listaServicios!= null) {
                Servicio serv = null;
                Object fila[] = new Object[4];
                    for (int i = 0; i < listaServicios.size(); i++) {
                    serv = (Servicio) listaServicios.get(i);
                   
                        fila[0] = serv.getIdServicio();
                        fila[1] = serv.getTipoServicio();
                        fila[2] = serv.getCosto();
                        fila[3] = serv.getNombreServicio();
                    modelo.addRow(fila);
                }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NombreServicio = new javax.swing.JLabel();
        NombreServicioTxt = new javax.swing.JTextField();
        Resultados = new javax.swing.JLabel();
        todosBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        ConsultarServicio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        NombreServicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreServicio.setForeground(new java.awt.Color(255, 255, 255));
        NombreServicio.setText("Nombre del Servicio:");

        NombreServicioTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NombreServicioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreServicioTxtActionPerformed(evt);
            }
        });
        NombreServicioTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreServicioTxtKeyReleased(evt);
            }
        });

        Resultados.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Resultados.setForeground(new java.awt.Color(255, 255, 255));
        Resultados.setText("Resultados:");

        todosBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        todosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        todosBtn.setText("Mostrar todos");
        todosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosBtnActionPerformed(evt);
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

        ConsultarServicio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ConsultarServicio.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarServicio.setText("Consultar Servicios");

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblServicios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(ConsultarServicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(VolverBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreServicio)
                        .addGap(18, 18, 18)
                        .addComponent(NombreServicioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Resultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultarServicio)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreServicio)
                    .addComponent(NombreServicioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(todosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Resultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VolverBtn)
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

    private void NombreServicioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreServicioTxtActionPerformed
        
    }//GEN-LAST:event_NombreServicioTxtActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        ServicioCliente sc = new ServicioCliente();
        sc.show();
        this.dispose();
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void todosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosBtnActionPerformed
        try {
            ManteniminetoServicio ms = ManteniminetoServicio.getInstancia();
            generaTableServicio(ms.listarServicio());
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_todosBtnActionPerformed

    private void NombreServicioTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreServicioTxtKeyReleased
        try {
            ManteniminetoServicio ms = ManteniminetoServicio.getInstancia();
            generaTableServicio(ms.listarServicioNombre(NombreServicioTxt.getText()));
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_NombreServicioTxtKeyReleased

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
            java.util.logging.Logger.getLogger(ConsultaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConsultarServicio;
    private javax.swing.JLabel NombreServicio;
    private javax.swing.JTextField NombreServicioTxt;
    private javax.swing.JLabel Resultados;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblServicios;
    private javax.swing.JButton todosBtn;
    // End of variables declaration//GEN-END:variables
}
