package Sistema;

import Objetos.Boleta;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class ServicioCliente extends javax.swing.JFrame {

    public ServicioCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        try {
            Image imag = ImageIO.read(new File(".\\src\\Imagenes\\monitor.png"));
            this.setIconImage(imag);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    Boleta boleta = new Boleta();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Imagen = new javax.swing.JLabel();
        ConsultaServicioBtn = new javax.swing.JButton();
        ServicioCliente = new javax.swing.JLabel();
        ContrataServicioBtn = new javax.swing.JButton();
        RetiraEquipoBtn = new javax.swing.JButton();
        AtenderCliente = new javax.swing.JLabel();
        FichaTxt = new javax.swing.JTextField();
        AtenderBtn = new javax.swing.JButton();
        Ficha = new javax.swing.JLabel();
        CerrarSesionBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pantalla de inicio.jpg"))); // NOI18N
        Imagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Imagen.setFocusable(false);

        ConsultaServicioBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConsultaServicioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question2.png"))); // NOI18N
        ConsultaServicioBtn.setText("Consulta de Servicios");
        ConsultaServicioBtn.setVerifyInputWhenFocusTarget(false);
        ConsultaServicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaServicioBtnActionPerformed(evt);
            }
        });

        ServicioCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ServicioCliente.setText("Servicio al Cliente");

        ContrataServicioBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ContrataServicioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transfer.png"))); // NOI18N
        ContrataServicioBtn.setText("Contratacion de Servicios");
        ContrataServicioBtn.setVerifyInputWhenFocusTarget(false);
        ContrataServicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrataServicioBtnActionPerformed(evt);
            }
        });

        RetiraEquipoBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RetiraEquipoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transfer2.png"))); // NOI18N
        RetiraEquipoBtn.setText("Retirar Equipo");
        RetiraEquipoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiraEquipoBtnActionPerformed(evt);
            }
        });

        AtenderCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AtenderCliente.setText("Atender cliente:");

        FichaTxt.setEditable(false);

        AtenderBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AtenderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next-user-hand-drawn-interface-symbol.png"))); // NOI18N
        AtenderBtn.setText("Atender siguiente");
        AtenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenderBtnActionPerformed(evt);
            }
        });

        Ficha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ficha.setText("Ficha:");

        CerrarSesionBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CerrarSesionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        CerrarSesionBtn.setText("Cerrar Sesion");
        CerrarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ContrataServicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RetiraEquipoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ServicioCliente))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CerrarSesionBtn))
                            .addComponent(ConsultaServicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AtenderCliente)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(FichaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AtenderBtn)
                        .addGap(18, 18, 18)))
                .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ServicioCliente)
                .addGap(18, 18, 18)
                .addComponent(ConsultaServicioBtn)
                .addGap(28, 28, 28)
                .addComponent(ContrataServicioBtn)
                .addGap(34, 34, 34)
                .addComponent(RetiraEquipoBtn)
                .addGap(30, 30, 30)
                .addComponent(AtenderCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AtenderBtn)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FichaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ficha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesionBtn)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultaServicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaServicioBtnActionPerformed
        ConsultaServicio cs = new ConsultaServicio();
        cs.show();
        this.dispose();
    }//GEN-LAST:event_ConsultaServicioBtnActionPerformed

    private void ContrataServicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrataServicioBtnActionPerformed
        ContrataServicio cts = new ContrataServicio();
        cts.show();
        this.dispose();
    }//GEN-LAST:event_ContrataServicioBtnActionPerformed

    private void RetiraEquipoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiraEquipoBtnActionPerformed
        RetiraEquipo re = new RetiraEquipo();
        re.show();
        this.dispose();
    }//GEN-LAST:event_RetiraEquipoBtnActionPerformed

    private void CerrarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionBtnActionPerformed
        Inicio in = new Inicio();
        in.show();
        this.dispose();
    }//GEN-LAST:event_CerrarSesionBtnActionPerformed

    private void AtenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderBtnActionPerformed
          
          boleta.setNumeroTiquete(boleta.getNumeroTiquete()+1);
          FichaTxt.setText(Integer.toString(boleta.getNumeroTiquete()));
    }//GEN-LAST:event_AtenderBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicioCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtenderBtn;
    private javax.swing.JLabel AtenderCliente;
    private javax.swing.JButton CerrarSesionBtn;
    private javax.swing.JButton ConsultaServicioBtn;
    private javax.swing.JButton ContrataServicioBtn;
    private javax.swing.JLabel Ficha;
    private javax.swing.JTextField FichaTxt;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton RetiraEquipoBtn;
    private javax.swing.JLabel ServicioCliente;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
