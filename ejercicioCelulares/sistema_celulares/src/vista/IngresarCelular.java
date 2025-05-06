package vista;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Cliente;
import modelo.Celular;
import logica.LogicaCliente;
import logica.LogicaCelular;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IngresarCelular extends javax.swing.JFrame {
    public IngresarCelular() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoCedulaCliente = new javax.swing.JTextField();
        botonValidarCliente = new javax.swing.JButton();
        campoNumero = new javax.swing.JTextField();
        campoMegasCelular = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoSaldoCelular = new javax.swing.JTextField();
        botonInsertarCelular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        regresar.setBackground(new java.awt.Color(0, 0, 255));
        regresar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("REGRESAR");
        regresar.setFocusPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("CEDULA DEL CLIENTE:");

        botonValidarCliente.setBackground(new java.awt.Color(0, 0, 255));
        botonValidarCliente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botonValidarCliente.setText("VALIDAR");
        botonValidarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarClienteActionPerformed(evt);
            }
        });

        campoMegasCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMegasCelularActionPerformed(evt);
            }
        });

        jLabel10.setText("MEGAS");

        campoSaldoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSaldoCelularActionPerformed(evt);
            }
        });

        botonInsertarCelular.setBackground(new java.awt.Color(51, 153, 255));
        botonInsertarCelular.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botonInsertarCelular.setText("INSERTAR DATOS");
        botonInsertarCelular.setFocusPainted(false);
        botonInsertarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarCelularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("INGRESA LOS DATOS DEL CELULAR:");

        jLabel7.setText("NUMERO");

        jLabel8.setText("SALDO");

        jLabel9.setText("ESTADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNumero)
                                    .addComponent(campoEstado)
                                    .addComponent(campoSaldoCelular)
                                    .addComponent(campoMegasCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonValidarCliente)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonInsertarCelular)
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonValidarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSaldoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMegasCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(botonInsertarCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar)
                .addContainerGap())
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        MenuInicio inicio = new MenuInicio();
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void campoMegasCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMegasCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMegasCelularActionPerformed

    private void campoSaldoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSaldoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSaldoCelularActionPerformed

    private void botonInsertarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarCelularActionPerformed
        // Crear un objeto de tipo cliente
        Cliente cliente = new Cliente();
        
        // Tomar el dato ingresado para la validacion
        String cedula = campoCedulaCliente.getText();
        cliente.setCedula(cedula);
        
        // Crear un objeto de tipo logica cliente:
        LogicaCliente objLogCliente = new LogicaCliente();
        
        try {
            // Validar que exista
            if(objLogCliente.ValidarCliente(cliente)){
                // Traer el id necesario para insertar la FK en Celular
                objLogCliente.TraerID(cliente);
                
                // Agarrar los datos de los campos del celular
                String numero = campoNumero.getText();
                int estado = Integer.parseInt(campoEstado.getText());
                int saldo = Integer.parseInt(campoSaldoCelular.getText());
                int megas = Integer.parseInt(campoMegasCelular.getText());
                
                // Crear un objeto de tipo celular
                Celular nuevoCel = new Celular();
                
                // Cargar el objeto
                nuevoCel.setNumero(numero);
                nuevoCel.setEstado(estado);
                nuevoCel.setSaldo(saldo);
                nuevoCel.setMegas(megas);
                
                // Meter el objeto en un arraylist
                ArrayList<Celular> celulares = new ArrayList<>();
                celulares.add(nuevoCel);
                
                // Asignar la lista al atributo de cliente
                cliente.setCelulares(celulares);
                
                // Crear un objeto de tipo logica celular
                LogicaCelular logCel = new LogicaCelular();
                
                // Insertar Celular
                logCel.insertarCelular(cliente);
                
                // Enviar un mensaje de que se inserto con exito
                JOptionPane.showMessageDialog(this, "DATOS INSERTADOS CON EXITO");
                
            }else{
                JOptionPane.showMessageDialog(this, "Cliente con cedula: "+cliente.getCedula()+" NO EXISTE");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "NO SE PUDIERON INGRESAR LOS DATOS: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botonInsertarCelularActionPerformed

    private void botonValidarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarClienteActionPerformed
        // Crear un objeto de tipo cliente
        Cliente cliente = new Cliente();
        
        // Tomar el dato ingresado para la validacion
        String cedula = campoCedulaCliente.getText();
        cliente.setCedula(cedula);
        
        // Crear un objeto de tipo logica cliente:
        LogicaCliente objLogCliente = new LogicaCliente();
        
        try {
            if(objLogCliente.ValidarCliente(cliente)){
                JOptionPane.showMessageDialog(this, "Cliente con cedula: "+cliente.getCedula()+" EXISTE");
            }else{
                JOptionPane.showMessageDialog(this, "Cliente con cedula: "+cliente.getCedula()+" NO EXISTE");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "SURGIO UN PROBLEMA AL CONSULTAR EL DATO: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botonValidarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertarCelular;
    private javax.swing.JButton botonValidarCliente;
    private javax.swing.JTextField campoCedulaCliente;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoMegasCelular;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoSaldoCelular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}