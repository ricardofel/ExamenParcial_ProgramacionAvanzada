package vista;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Cliente;
import modelo.Celular;

import logica.LogicaCliente;
import logica.LogicaCelular;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IngresarCliente extends javax.swing.JFrame {
    public IngresarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoApellidosCliente = new javax.swing.JTextField();
        campoNombresCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        campoMegasCelular = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoSaldoCelular = new javax.swing.JTextField();
        insertarClienteCelular = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("INGRESA LOS DATOS DEL CLIENTE:");

        jLabel3.setText("CEDULA");

        jLabel4.setText("APELLIDOS");

        jLabel5.setText("NOMBRES");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("INGRESA LOS DATOS DE SU CELULAR:");

        jLabel7.setText("NUMERO");

        jLabel8.setText("SALDO");

        jLabel9.setText("ESTADO");

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

        insertarClienteCelular.setBackground(new java.awt.Color(51, 153, 255));
        insertarClienteCelular.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        insertarClienteCelular.setText("INSERTAR DATOS");
        insertarClienteCelular.setFocusPainted(false);
        insertarClienteCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarClienteCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombresCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(campoCedula)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
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
                                    .addComponent(campoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(campoEstado)
                                    .addComponent(campoSaldoCelular)
                                    .addComponent(campoMegasCelular, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(insertarClienteCelular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(insertarClienteCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void insertarClienteCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarClienteCelularActionPerformed
        // Crear un objeto de tipo Cliente
        Cliente nuevoCliente = new Cliente();

        // Crear un objeto de tipo Logica Cliente
        LogicaCliente objLogicaClie = new LogicaCliente();

        // Crear un objeto de tipo Logica Celular
        LogicaCelular objLogCelular = new LogicaCelular();

        // Obtener los datos ingresados
        
        // Datos cliente
        String cedulaClie = campoCedula.getText();
        String nombresClie = campoNombresCliente.getText();
        String apellidosClie = campoApellidosCliente.getText();

        // Datos celular
        String numeroCelular = campoNumero.getText();
        String estadoCelular = campoEstado.getText();
        String saldoCelular = campoSaldoCelular.getText();
        String megasCelular = campoMegasCelular.getText();

        // Cargar el objeto Cliente
        nuevoCliente.setCedula(cedulaClie);
        nuevoCliente.setNombres(nombresClie);
        nuevoCliente.setApellidos(apellidosClie);

        // REALIZAR LA INSERCION DE DATOS
        try {
            // Insertar cliente
            objLogicaClie.InsertarCliente(nuevoCliente);

            // Obtener el ID del cliente recien insertado
            // (No lo sabemos porque es atributo autoincrementado en la DB)
            objLogicaClie.BuscarMaximo(nuevoCliente);

            // Crear y cargar objeto celular
            Celular nuevoCel = new Celular();
            nuevoCel.setNumero(numeroCelular);
            nuevoCel.setEstado(Integer.parseInt(estadoCelular));
            nuevoCel.setSaldo(Integer.parseInt(saldoCelular));
            nuevoCel.setMegas(Integer.parseInt(megasCelular));
            
            // Metemos el obbjeto celular en una lista
            ArrayList<Celular> listaCelulares = new ArrayList<>();
            listaCelulares.add(nuevoCel);
            
            // Asignamos el celular al cliente
            nuevoCliente.setCelulares(listaCelulares);

            // Insertamos el celular (la data va en el objeto cliente)
            objLogCelular.insertarCelular(nuevoCliente);

            // Mostrar mensaje si se logro insertar los datos
            JOptionPane.showMessageDialog(this, "DATOS INGRESADOS CON EXITO");

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "NO SE PUDIERON INGRESAR LOS DATOS: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insertarClienteCelularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApellidosCliente;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoMegasCelular;
    private javax.swing.JTextField campoNombresCliente;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoSaldoCelular;
    private javax.swing.JButton insertarClienteCelular;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}