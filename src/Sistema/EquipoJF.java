/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Mantenimientos.MantenimientoCliente;
import Mantenimientos.MantenimientoEquipo;
import Mantenimientos.MantenimientoMarca;
import Mantenimientos.MantenimientoTipoEquipo;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import Objetos.Servicio;
import Mantenimientos.ManteniminetoServicio;
import Objetos.Cliente;
import Objetos.EquipoInserta;
import Objetos.Marca;
import Objetos.TipoEquipo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class EquipoJF extends javax.swing.JFrame {
   
    private Servicio serv = null;
    /**
     * Creates new form Servicios
     */
    public EquipoJF() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        
        try {
            Image imag = ImageIO.read(new File(".\\src\\Imagenes\\monitor.png"));
            this.setIconImage(imag);
        } catch (IOException e) {
            System.out.println("Fallo poner icono de la aplicacion");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Servicios = new javax.swing.JLabel();
        NombreServicio = new javax.swing.JLabel();
        CedulaTxt = new javax.swing.JTextField();
        TipoServicio = new javax.swing.JLabel();
        txtCodMarca = new javax.swing.JTextField();
        PrecioServicio = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        AgregarModificarServicio = new javax.swing.JLabel();
        AgregarBtn = new javax.swing.JButton();
        ConsultaServiciosBtn = new javax.swing.JButton();
        ListaDeServicios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarcas = new javax.swing.JTable();
        PrecioServicio1 = new javax.swing.JLabel();
        txtCodTipo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        ListaDeServicios1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTipos = new javax.swing.JTable();
        btnRefrescaMarca = new javax.swing.JButton();
        btnRefrescaTipo = new javax.swing.JButton();
        ListaDeServicios3 = new javax.swing.JLabel();
        brtnAgregarTipo = new javax.swing.JButton();
        btnAgregarMarca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(953, 553));

        Servicios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setText("Equipos");

        NombreServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NombreServicio.setForeground(new java.awt.Color(255, 255, 255));
        NombreServicio.setText("Cedula del cliente");

        TipoServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TipoServicio.setForeground(new java.awt.Color(255, 255, 255));
        TipoServicio.setText("Codigo de la marca");

        PrecioServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrecioServicio.setForeground(new java.awt.Color(255, 255, 255));
        PrecioServicio.setText("Modelo:");

        AgregarModificarServicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AgregarModificarServicio.setForeground(new java.awt.Color(255, 255, 255));
        AgregarModificarServicio.setText("Agregar equipo");

        AgregarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        ConsultaServiciosBtn.setBackground(new java.awt.Color(255, 255, 255));
        ConsultaServiciosBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConsultaServiciosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        ConsultaServiciosBtn.setText("Consultar clientes");
        ConsultaServiciosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaServiciosBtnActionPerformed(evt);
            }
        });

        ListaDeServicios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaDeServicios.setForeground(new java.awt.Color(255, 255, 255));
        ListaDeServicios.setText("Lista de clientes:");

        tblMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMarcas);

        PrecioServicio1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrecioServicio1.setForeground(new java.awt.Color(255, 255, 255));
        PrecioServicio1.setText("Codigo del tipo:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblClientes);

        ListaDeServicios1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaDeServicios1.setForeground(new java.awt.Color(255, 255, 255));
        ListaDeServicios1.setText("Lista de marcas:");

        tblTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblTipos);

        btnRefrescaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file.png"))); // NOI18N
        btnRefrescaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescaMarcaActionPerformed(evt);
            }
        });

        btnRefrescaTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file.png"))); // NOI18N
        btnRefrescaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescaTipoActionPerformed(evt);
            }
        });

        ListaDeServicios3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaDeServicios3.setForeground(new java.awt.Color(255, 255, 255));
        ListaDeServicios3.setText("Lista de tipos:");

        brtnAgregarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        brtnAgregarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtnAgregarTipoActionPerformed(evt);
            }
        });

        btnAgregarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ListaDeServicios3)
                                .addGap(59, 59, 59)
                                .addComponent(btnRefrescaTipo)
                                .addGap(18, 18, 18)
                                .addComponent(brtnAgregarTipo))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ListaDeServicios1)
                                .addGap(59, 59, 59)
                                .addComponent(btnRefrescaMarca)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarMarca)))
                        .addGap(67, 67, 67)
                        .addComponent(Servicios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(CedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(PrecioServicio1)
                                                    .addComponent(PrecioServicio))
                                                .addGap(40, 40, 40))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TipoServicio)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCodTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AgregarBtn)
                                            .addComponent(txtCodMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(NombreServicio)
                                    .addComponent(AgregarModificarServicio))))
                        .addGap(78, 78, 78)
                        .addComponent(ListaDeServicios)))
                .addGap(0, 333, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConsultaServiciosBtn)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(445, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Servicios)
                        .addGap(37, 37, 37)
                        .addComponent(ListaDeServicios)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefrescaTipo)
                            .addComponent(ListaDeServicios3)
                            .addComponent(brtnAgregarTipo))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(ConsultaServiciosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ListaDeServicios1)
                            .addComponent(btnRefrescaMarca)
                            .addComponent(btnAgregarMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(AgregarModificarServicio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreServicio))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoServicio))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioServicio))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioServicio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void limpiarCampos(){
        txtCodMarca.setText("");
        CedulaTxt.setText("");
        txtModelo.setText("");
    }
    private void generaTableCliente(List lista){
         String[] columnas = {"Nombre","Apellidos","Cedula","Telefono","Correo"};
            DefaultTableModel modelo = new DefaultTableModel(){public boolean isCellEditable(int row, int column){return false;}};
            modelo.setColumnIdentifiers(columnas); 
            tblClientes.setModel(modelo);
            ArrayList listaServicios = (ArrayList) lista;
            
            if (listaServicios.size()>0 && listaServicios!= null) {
                Cliente cli = null;
                Object fila[] = new Object[5];
                    for (int i = 0; i < listaServicios.size(); i++) {
                    cli = (Cliente) listaServicios.get(i);
                   
                        fila[0] = cli.getNombre();
                        fila[1] = cli.getApellidos();
                        fila[2] = cli.getCedula();
                        fila[3] = cli.getTelefono();
                        fila[4] = cli.getCorreo();
                    modelo.addRow(fila);
                }
        }
    }
    
    private void generaTableMarca(List lista){
         String[] columnas = {"Codigo de la Marca","Marca"};
            DefaultTableModel modelo = new DefaultTableModel(){public boolean isCellEditable(int row, int column){return false;}};
            modelo.setColumnIdentifiers(columnas); 
            tblMarcas.setModel(modelo);
            ArrayList listaMarcas = (ArrayList) lista;
            
            if (listaMarcas.size()>0 && listaMarcas!= null) {
                Marca mar = null;
                Object fila[] = new Object[2];
                    for (int i = 0; i < listaMarcas.size(); i++) {
                    mar = (Marca) listaMarcas.get(i);
                   
                        fila[0] = mar.getIdMarca();
                        fila[1] = mar.getNombreMarca();
                    modelo.addRow(fila);
                }
        }
    }
    
        private void generaTableTipoEquipo(List lista){
         String[] columnas = {"Codigo del Tipo de Equipo","Tipo"};
            DefaultTableModel modelo = new DefaultTableModel(){public boolean isCellEditable(int row, int column){return false;}};
            modelo.setColumnIdentifiers(columnas); 
            tblTipos.setModel(modelo);
            ArrayList listaTipos = (ArrayList) lista;
            
            if (listaTipos.size()>0 && listaTipos!= null) {
                TipoEquipo te = null;
                Object fila[] = new Object[2];
                    for (int i = 0; i < listaTipos.size(); i++) {
                    te = (TipoEquipo) listaTipos.get(i);
                   
                        fila[0] = te.getIdTipoEquipo();
                        fila[1] = te.getTipo();
                    modelo.addRow(fila);
                }
        }
    }
    
    private void ConsultaServiciosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaServiciosBtnActionPerformed
        try {
            MantenimientoCliente mc = MantenimientoCliente.getInstancia();
            generaTableCliente(mc.listarClienteG());
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_ConsultaServiciosBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        try{
        if (CedulaTxt.getText().isEmpty()||txtCodMarca.getText().isEmpty()||txtCodTipo.getText().isEmpty()||txtModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Error \n Llene los campos solicitados");
        }else{
            MantenimientoEquipo me = MantenimientoEquipo.getInstancia();
            EquipoInserta ei = new EquipoInserta();
            ei.setCedula(CedulaTxt.getText());
            ei.setIdMarca(Integer.parseInt(txtCodMarca.getText()));
            ei.setIdTipo(Integer.parseInt(txtCodTipo.getText()));
            ei.setModelo(txtModelo.getText());
            me.insertaEquipo(ei);
            this.dispose();
        }
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(rootPane,"Donde se le piden codigos solo puede insertar numeros");
            System.out.println(""+ne);
        }catch(Exception e ){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void btnRefrescaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescaMarcaActionPerformed
        try {
            MantenimientoMarca mm = MantenimientoMarca.getInstancia();
            generaTableMarca(mm.listarMarca());
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_btnRefrescaMarcaActionPerformed

    private void btnRefrescaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescaTipoActionPerformed
        try {
            MantenimientoTipoEquipo mte = MantenimientoTipoEquipo.getInstancia();
            generaTableTipoEquipo(mte.listarMarca());
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_btnRefrescaTipoActionPerformed

    private void brtnAgregarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtnAgregarTipoActionPerformed
        TipoEquipoJF te = new TipoEquipoJF();
        te.show();
    }//GEN-LAST:event_brtnAgregarTipoActionPerformed

    private void btnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMarcaActionPerformed
        MarcaJF m = new MarcaJF();
        m.show();
    }//GEN-LAST:event_btnAgregarMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(EquipoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EquipoJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JLabel AgregarModificarServicio;
    private javax.swing.JTextField CedulaTxt;
    private javax.swing.JButton ConsultaServiciosBtn;
    private javax.swing.JLabel ListaDeServicios;
    private javax.swing.JLabel ListaDeServicios1;
    private javax.swing.JLabel ListaDeServicios3;
    private javax.swing.JLabel NombreServicio;
    private javax.swing.JLabel PrecioServicio;
    private javax.swing.JLabel PrecioServicio1;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel TipoServicio;
    private javax.swing.JButton brtnAgregarTipo;
    private javax.swing.JButton btnAgregarMarca;
    private javax.swing.JButton btnRefrescaMarca;
    private javax.swing.JButton btnRefrescaTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblMarcas;
    private javax.swing.JTable tblTipos;
    private javax.swing.JTextField txtCodMarca;
    private javax.swing.JTextField txtCodTipo;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}