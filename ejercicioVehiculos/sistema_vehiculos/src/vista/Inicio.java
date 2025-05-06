package vista;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Propietario;
import modelo.Turno;
import modelo.Vehiculo;

import logica.LogicaPropietario;
import logica.LogicaTurno;
import logica.LogicaVehiculo;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNombrePropietario = new javax.swing.JTextField();
        campoApellidoPropietario = new javax.swing.JTextField();
        campoCedulaPropietario = new javax.swing.JTextField();
        campo_placaINS = new javax.swing.JTextField();
        campo_marcaINS = new javax.swing.JTextField();
        insertarPropietario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoCedulaPropVehiculo = new javax.swing.JTextField();
        campoPlacaInsertVehiculo = new javax.swing.JTextField();
        campoMarcaInsertar = new javax.swing.JTextField();
        insertarVehiculoSolo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoAndenAgendar = new javax.swing.JTextField();
        campoHoraAgendar = new javax.swing.JTextField();
        campoDiaAgendar = new javax.swing.JTextField();
        agendarTurno = new javax.swing.JButton();
        campoPlacaAgendar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INSERTAR PROPIETARIO CON SU VEHICULO");

        campoNombrePropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombrePropietarioActionPerformed(evt);
            }
        });

        campo_marcaINS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_marcaINSActionPerformed(evt);
            }
        });

        insertarPropietario.setBackground(new java.awt.Color(255, 255, 51));
        insertarPropietario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertarPropietario.setForeground(new java.awt.Color(0, 0, 0));
        insertarPropietario.setText("INSERTAR");
        insertarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarPropietarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("INSERTAR VEHICULO");

        insertarVehiculoSolo.setBackground(new java.awt.Color(204, 255, 51));
        insertarVehiculoSolo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertarVehiculoSolo.setForeground(new java.awt.Color(0, 0, 0));
        insertarVehiculoSolo.setText("INSERTAR");
        insertarVehiculoSolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarVehiculoSoloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("AGENDAR TURNOS");

        campoDiaAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDiaAgendarActionPerformed(evt);
            }
        });

        agendarTurno.setBackground(new java.awt.Color(255, 255, 51));
        agendarTurno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agendarTurno.setForeground(new java.awt.Color(0, 0, 0));
        agendarTurno.setText("AGENDAR");
        agendarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarTurnoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ANDEN [1-4]");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("DIA [1-5]");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("HORA[1-6] PM");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("PLACA");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("APELLIDO");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("NOMBRE");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("MARCA");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("CEDULA");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("CEDULA PROPIETARIO");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("PLACA");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("MARCA");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("PLACA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAndenAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDiaAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlacaAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoHoraAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCedulaPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoApellidoPropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_marcaINS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_placaINS, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(insertarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCedulaPropVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPlacaInsertVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoMarcaInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(insertarVehiculoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 246, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(223, 223, 223))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(agendarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_placaINS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(campoCedulaPropVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(campoApellidoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(campo_marcaINS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(campoPlacaInsertVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(campoCedulaPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(insertarPropietario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(campoMarcaInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(insertarVehiculoSolo)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoAndenAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDiaAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoHoraAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPlacaAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(agendarTurno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void campoNombrePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombrePropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombrePropietarioActionPerformed

    private void insertarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarPropietarioActionPerformed
        LogicaVehiculo objLOGvehiculo = new LogicaVehiculo();
        try {
            if (objLOGvehiculo.verifyPlaca(campo_placaINS.getText())) {
                JOptionPane.showMessageDialog(null, "Esa placa ya existe");
                return;
            }

            Propietario NUEVO_PROPIETARIO = new Propietario();
            LogicaPropietario objLogicaPROP = new LogicaPropietario();

            NUEVO_PROPIETARIO.setCedula(campoCedulaPropietario.getText());
            NUEVO_PROPIETARIO.setNombre(campoNombrePropietario.getText());
            NUEVO_PROPIETARIO.setApellido(campoApellidoPropietario.getText());

            objLogicaPROP.insertarPropietario(NUEVO_PROPIETARIO);
            objLogicaPROP.BuscarUltimo(NUEVO_PROPIETARIO);

            Vehiculo objVehiculo = new Vehiculo();
            objVehiculo.setPlaca(campo_placaINS.getText());
            objVehiculo.setMarca(campo_marcaINS.getText());
            objVehiculo.setEstado(1);
            ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
            listaVehiculos.add(objVehiculo);

            NUEVO_PROPIETARIO.setListaVehiculos(listaVehiculos);

            objLOGvehiculo.insertarVehiculo(NUEVO_PROPIETARIO);

            JOptionPane.showMessageDialog(null, "DATOS INSERTADOS CON EXITO");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_insertarPropietarioActionPerformed

    private void agendarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarTurnoActionPerformed
        try {
            // VERFICAR QUE INGRESE LOS INDICES ADECUADOS
            if (Integer.valueOf(campoAndenAgendar.getText()) < 1 
                    || Integer.valueOf(campoAndenAgendar.getText()) > 4) {
                JOptionPane.showMessageDialog(null, "ANDEN INCORECTO");
                return;
            }
            if (Integer.valueOf(campoHoraAgendar.getText()) < 1 
                    || Integer.valueOf(campoHoraAgendar.getText()) > 6) {
                JOptionPane.showMessageDialog(null, "HORA INCORRECTA");
                return;
            }
            if (Integer.valueOf(campoDiaAgendar.getText()) < 1 
                    || Integer.valueOf(campoDiaAgendar.getText()) > 5) {
                JOptionPane.showMessageDialog(null, "DIA INCORRECTO");
                return;
            }
            LogicaTurno objLOGturno = new LogicaTurno();
            
            Vehiculo objVehiculo = new Vehiculo();
            LogicaVehiculo objLOGvehiculo = new LogicaVehiculo();
            objVehiculo.setPlaca(campoPlacaAgendar.getText());
            if (objLOGvehiculo.BuscarPorNumero(objVehiculo).getIdVehiculo() == 0) {
                JOptionPane.showMessageDialog(null, "VEHICULO NO ENCONTRADO");
                return;
            }
            Turno objTurno = new Turno();
            objTurno.setDia(Integer.valueOf(campoDiaAgendar.getText()));
            objTurno.setHora(Integer.valueOf(campoHoraAgendar.getText()));
            objTurno.setAnden(Integer.valueOf(campoAndenAgendar.getText()));
            objTurno.setObjVehiculo(objVehiculo);
            
            
            if (objLOGturno.verificarTurnoDoble(objTurno)){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE AGENDAR DOS TURNOS EL MISMO DIA");
                return;
            }
            if (objLOGturno.verificarTurnoDobleAnden(objTurno)){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE AGENDAR DOS TURNOS EN EL MISMO ANDEN");
                return;
            }

            objLOGturno.insertarTurno(objTurno);
            JOptionPane.showMessageDialog(null, "TURNO AGENDADO CORRECTAMENTE");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agendarTurnoActionPerformed

    private void insertarVehiculoSoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarVehiculoSoloActionPerformed
        try {
            LogicaVehiculo objLOGvehiculo = new LogicaVehiculo();
            if (objLOGvehiculo.verifyPlaca(campoPlacaInsertVehiculo.getText())) {
                JOptionPane.showMessageDialog(null, "PLACA YA EXISTENTE");
                return;
            }
            Propietario objProp = new Propietario();
            objProp.setCedula(campoCedulaPropVehiculo.getText());

            LogicaPropietario objLOGprop = new LogicaPropietario();
            objProp = objLOGprop.BuscarPorCedula(objProp);

            if (objProp.getIdProp() == 0) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL PROPIETARIO");
                return;
            }
            Vehiculo objVehiculo = new Vehiculo();
            objVehiculo.setPlaca(campoPlacaInsertVehiculo.getText());
            objVehiculo.setMarca(campoMarcaInsertar.getText());
            objVehiculo.setEstado(1);

            ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
            listaVehiculos.add(objVehiculo);
            objProp.setListaVehiculos(listaVehiculos);

            objLOGvehiculo.CambiarVehiculosAnteriores(objProp);
            objLOGvehiculo.insertarVehiculo(objProp);

            JOptionPane.showMessageDialog(null, "VEHICULO INSERTADO CON EXITO");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insertarVehiculoSoloActionPerformed

    private void campo_marcaINSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_marcaINSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_marcaINSActionPerformed

    private void campoDiaAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDiaAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDiaAgendarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agendarTurno;
    private javax.swing.JTextField campoAndenAgendar;
    private javax.swing.JTextField campoApellidoPropietario;
    private javax.swing.JTextField campoCedulaPropVehiculo;
    private javax.swing.JTextField campoCedulaPropietario;
    private javax.swing.JTextField campoDiaAgendar;
    private javax.swing.JTextField campoHoraAgendar;
    private javax.swing.JTextField campoMarcaInsertar;
    private javax.swing.JTextField campoNombrePropietario;
    private javax.swing.JTextField campoPlacaAgendar;
    private javax.swing.JTextField campoPlacaInsertVehiculo;
    private javax.swing.JTextField campo_marcaINS;
    private javax.swing.JTextField campo_placaINS;
    private javax.swing.JButton insertarPropietario;
    private javax.swing.JButton insertarVehiculoSolo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}