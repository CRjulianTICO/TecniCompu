/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Mantenimientos.MantenimientoEmpleado;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Objetos.Empleado;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class EmpleadoJF extends javax.swing.JFrame {
    private MantenimientoEmpleado me;
  
    /**
     * Creates new form Empleado
     */
    public EmpleadoJF() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NombreEmpleadoTxt = new javax.swing.JTextField();
        CorreoEmpleadoTxt = new javax.swing.JTextField();
        CedulaEmpleadoTxt = new javax.swing.JTextField();
        CedulaEliminarTxt = new javax.swing.JTextField();
        ContrasenaEmpleadoTxt = new javax.swing.JTextField();
        TelefonoEmpleadoTxt = new javax.swing.JTextField();
        UsuarioEmpleadoTxt = new javax.swing.JTextField();
        AgregarBtn = new javax.swing.JButton();
        ConsultaEmpleadossBtn = new javax.swing.JButton();
        ModificarBtn = new javax.swing.JButton();
        EliminarBtn = new javax.swing.JButton();
        CedulaEliminar = new javax.swing.JLabel();
        AgregarModificarEmpleado = new javax.swing.JLabel();
        CedulaEmpleado = new javax.swing.JLabel();
        TelefonoEmpleado = new javax.swing.JLabel();
        CorreoEmpleado = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        Empleados = new javax.swing.JLabel();
        ListaDeEmpleados = new javax.swing.JLabel();
        EliminarEmpleado = new javax.swing.JLabel();
        Propiedades1 = new javax.swing.JLabel();
        Propiedades2 = new javax.swing.JLabel();
        Propiedades3 = new javax.swing.JLabel();
        UsuarioEmpleado = new javax.swing.JLabel();
        ContrasenaEmpleado = new javax.swing.JLabel();
        VolverBtn = new javax.swing.JButton();
        NombreEmpleado1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        cboxRol = new javax.swing.JComboBox<>();
        ContrasenaEmpleado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(953, 553));

        AgregarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        ConsultaEmpleadossBtn.setBackground(new java.awt.Color(255, 255, 255));
        ConsultaEmpleadossBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConsultaEmpleadossBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        ConsultaEmpleadossBtn.setText("Consultar empleados");
        ConsultaEmpleadossBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaEmpleadossBtnActionPerformed(evt);
            }
        });

        ModificarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ModificarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pencil-and-paper.png"))); // NOI18N
        ModificarBtn.setText("Modificar");
        ModificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBtnActionPerformed(evt);
            }
        });

        EliminarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel-button.png"))); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        CedulaEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CedulaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        CedulaEliminar.setText("Cédula del empleado a eliminar:");

        AgregarModificarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AgregarModificarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        AgregarModificarEmpleado.setText("Agregar/Modificar empleado");

        CedulaEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CedulaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        CedulaEmpleado.setText("Cédula:");

        TelefonoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TelefonoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEmpleado.setText("Teléfono:");

        CorreoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CorreoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        CorreoEmpleado.setText("Correo:");

        NombreEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("Nombre:");

        Empleados.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Empleados.setText("Empleados");

        ListaDeEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaDeEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        ListaDeEmpleados.setText("Lista de empleados:");

        EliminarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        EliminarEmpleado.setText("Eliminar empleado");

        Propiedades1.setForeground(new java.awt.Color(255, 255, 255));
        Propiedades1.setText("* Si desea modificar un empleado, en los espacios disponibles coloque la cédula del empleado que desea modificar y en la casilla correspondiente");

        Propiedades2.setForeground(new java.awt.Color(255, 255, 255));
        Propiedades2.setText("al valor que desea cambiar, el texto por el que lo va a sustituir. PARA ESTE SISTEMA SOLO SE PUEDE MODIFICAR NOMBRE, USUARIO Y CONTRASEÑA");

        Propiedades3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Propiedades3.setForeground(new java.awt.Color(255, 255, 255));
        Propiedades3.setText("*");

        UsuarioEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsuarioEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioEmpleado.setText("Usuario:");

        ContrasenaEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContrasenaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ContrasenaEmpleado.setText("Contraseña:");

        VolverBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VolverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maps-and-flags.png"))); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        NombreEmpleado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NombreEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado1.setText("Apellidos");

        jScrollPane1.setViewportView(tblEmpleados);

        cboxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "USUARIO" }));
        cboxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxRolActionPerformed(evt);
            }
        });

        ContrasenaEmpleado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContrasenaEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        ContrasenaEmpleado1.setText("Rol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 249, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CedulaEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(CedulaEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarBtn)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EliminarEmpleado)
                        .addGap(355, 355, 355))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Propiedades3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Propiedades2)
                                    .addComponent(Propiedades1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ModificarBtn)
                                        .addGap(61, 61, 61)
                                        .addComponent(AgregarBtn)
                                        .addGap(88, 88, 88)
                                        .addComponent(ConsultaEmpleadossBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AgregarModificarEmpleado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(CorreoEmpleado)
                                                    .addComponent(NombreEmpleado)
                                                    .addComponent(NombreEmpleado1)
                                                    .addComponent(CedulaEmpleado))
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(UsuarioEmpleado)
                                                .addGap(26, 26, 26)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(UsuarioEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CedulaEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CorreoEmpleadoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(NombreEmpleadoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(TelefonoEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TelefonoEmpleado)
                                        .addGap(200, 200, 200))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ContrasenaEmpleado)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ContrasenaEmpleado1)
                                                .addGap(43, 43, 43)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboxRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ContrasenaEmpleadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(ListaDeEmpleados))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(Empleados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Empleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarModificarEmpleado)
                            .addComponent(ListaDeEmpleados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreEmpleado1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CedulaEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CedulaEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoEmpleado)
                            .addComponent(TelefonoEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsuarioEmpleado)
                            .addComponent(UsuarioEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContrasenaEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContrasenaEmpleado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContrasenaEmpleado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarBtn)
                    .addComponent(AgregarBtn)
                    .addComponent(ConsultaEmpleadossBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Propiedades1)
                    .addComponent(Propiedades3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Propiedades2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaEliminar)
                    .addComponent(CedulaEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarBtn))
                .addGap(2, 2, 2)
                .addComponent(VolverBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public Object datosEmpleadoInsertar(){
        
        
        Empleado empleado =  new Empleado();
        
        if(txtApellidos.getText().isEmpty()||NombreEmpleadoTxt.getText().isEmpty()||
                CedulaEmpleadoTxt.getText().isEmpty()||CorreoEmpleadoTxt.getText().isEmpty()||
                TelefonoEmpleadoTxt.getText().isEmpty()||UsuarioEmpleadoTxt.getText().isEmpty()||
                ContrasenaEmpleadoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todo los campos");
        }else{
            empleado.setIdEmpleado(0);
            empleado.setNombre(NombreEmpleadoTxt.getText());
            empleado.setApellidos(txtApellidos.getText());
            empleado.setCedula(CedulaEmpleadoTxt.getText());
            empleado.setTelefono(Integer.parseInt(TelefonoEmpleadoTxt.getText()));
            empleado.setCorreo(CorreoEmpleadoTxt.getText());
            empleado.setEstadoEmpleado(true);            
            empleado.setUsuario(UsuarioEmpleadoTxt.getText());
            empleado.setPassword(ContrasenaEmpleadoTxt.getText());
            empleado.setIdRol(Integer.toString(cboxRol.getSelectedIndex()+1)); 
            System.out.println(""+Integer.toString(cboxRol.getSelectedIndex()));
        }
        
    return empleado;
    }
    private void limpiarCampos(){
        txtApellidos.setText("");
        NombreEmpleadoTxt.setText("");
        CedulaEmpleadoTxt.setText("");
        CorreoEmpleadoTxt.setText("");
        TelefonoEmpleadoTxt.setText("");
        UsuarioEmpleadoTxt.setText("");
        ContrasenaEmpleadoTxt.setText("");
    }
    private void getTableEmpleados(){
        String[] columnas = {"Nombre", "Apellidos",  "Cedula",  "Correo Electronico", "Telefono", "Usuario","Rol"};
            DefaultTableModel modelo = new DefaultTableModel(){public boolean isCellEditable(int row, int column){return false;}};
            modelo.setColumnIdentifiers(columnas); 
            tblEmpleados.setModel(modelo);
            
            me = MantenimientoEmpleado.getInstancia();
            ArrayList listaEmpleados;
            listaEmpleados = (ArrayList)me.listarEmpleados(); 
           
            if (listaEmpleados != null && listaEmpleados.size() > 0) {
                Empleado emp = null;

                Object[] fila = new Object[7];

                for (int i = 0; i < listaEmpleados.size(); i++) {
                    emp = (Empleado) listaEmpleados.get(i);
                   
                        fila[0] = emp.getNombre();
                        fila[1] = emp.getApellidos();
                        fila[2] = emp.getCedula();
                        fila[3] = emp.getCorreo();
                        fila[4] = emp.getTelefono();
                        fila[5] = emp.getUsuario();
                        fila[6] = emp.getIdRol();

                    modelo.addRow(fila);
                }
        } 
    }
    private Object datosEmpleadoActualiza(){
        
        Empleado empleado =  new Empleado();
        
        if(txtApellidos.getText().isEmpty()||NombreEmpleadoTxt.getText().isEmpty()||
                CedulaEmpleadoTxt.getText().isEmpty()||CorreoEmpleadoTxt.getText().isEmpty()||
                TelefonoEmpleadoTxt.getText().isEmpty()||UsuarioEmpleadoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todo los campos");
        }else{
            empleado.setIdEmpleado(0);
            empleado.setNombre(NombreEmpleadoTxt.getText());
            empleado.setApellidos(txtApellidos.getText());
            empleado.setCedula(CedulaEmpleadoTxt.getText());
            empleado.setTelefono(Integer.parseInt(TelefonoEmpleadoTxt.getText()));
            empleado.setCorreo(CorreoEmpleadoTxt.getText());
            empleado.setEstadoEmpleado(true);            
            empleado.setUsuario(UsuarioEmpleadoTxt.getText());
            empleado.setPassword("");
            empleado.setIdRol(Integer.toString(cboxRol.getSelectedIndex()+1)); 
            
        }
        
 
           return empleado;
    }
  
    private void ModificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBtnActionPerformed
        me.actualizaEmpleado(datosEmpleadoActualiza());
    }//GEN-LAST:event_ModificarBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        if (CedulaEliminarTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe de asegurarse de llenar el campo solicitado");
        }else{
            me = MantenimientoEmpleado.getInstancia();
            me.desactivarEmpleado(CedulaEliminarTxt.getText());
            CedulaEliminarTxt.setText("");
            try {
                getTableEmpleados();
            } catch (Exception e) {
                System.out.println(""+e);
            }
        }
    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void ConsultaEmpleadossBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaEmpleadossBtnActionPerformed
       try{
            getTableEmpleados();
       }catch(Exception e){
           System.out.println(""+e);
       }
    }//GEN-LAST:event_ConsultaEmpleadossBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        me = MantenimientoEmpleado.getInstancia();
        try{
            me.agregarEmpleado(datosEmpleadoInsertar());
            limpiarCampos();
        }catch(NumberFormatException num){
            JOptionPane.showMessageDialog(rootPane, "Debe asegurarse de ingresar numeros en el telefono");
        }catch(Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        Administracion ad = new Administracion();
        ad.show();
        this.dispose();
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void cboxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxRolActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JLabel AgregarModificarEmpleado;
    private javax.swing.JLabel CedulaEliminar;
    private javax.swing.JTextField CedulaEliminarTxt;
    private javax.swing.JLabel CedulaEmpleado;
    private javax.swing.JTextField CedulaEmpleadoTxt;
    private javax.swing.JButton ConsultaEmpleadossBtn;
    private javax.swing.JLabel ContrasenaEmpleado;
    private javax.swing.JLabel ContrasenaEmpleado1;
    private javax.swing.JTextField ContrasenaEmpleadoTxt;
    private javax.swing.JLabel CorreoEmpleado;
    private javax.swing.JTextField CorreoEmpleadoTxt;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JLabel EliminarEmpleado;
    private javax.swing.JLabel Empleados;
    private javax.swing.JLabel ListaDeEmpleados;
    private javax.swing.JButton ModificarBtn;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JLabel NombreEmpleado1;
    private javax.swing.JTextField NombreEmpleadoTxt;
    private javax.swing.JLabel Propiedades1;
    private javax.swing.JLabel Propiedades2;
    private javax.swing.JLabel Propiedades3;
    private javax.swing.JLabel TelefonoEmpleado;
    private javax.swing.JTextField TelefonoEmpleadoTxt;
    private javax.swing.JLabel UsuarioEmpleado;
    private javax.swing.JTextField UsuarioEmpleadoTxt;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JComboBox<String> cboxRol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellidos;
    // End of variables declaration//GEN-END:variables
}