package vista;
// RICARDO FABIAN ESPINOSA LARGO
import modelo.Celular;
import modelo.Recarga;
import logica.LogicaCelular;
import logica.LogicaRecarga;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RealizarRecarga1 extends javax.swing.JFrame {
    public RealizarRecarga1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regresar2 = new javax.swing.JButton();
        botonRecarga = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        campoNumeroRecarga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoValorRecarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        regresar2.setBackground(new java.awt.Color(0, 0, 255));
        regresar2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        regresar2.setForeground(new java.awt.Color(255, 255, 255));
        regresar2.setText("REGRESAR");
        regresar2.setFocusPainted(false);
        regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar2ActionPerformed(evt);
            }
        });

        botonRecarga.setBackground(new java.awt.Color(0, 0, 255));
        botonRecarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRecarga.setForeground(new java.awt.Color(255, 255, 255));
        botonRecarga.setText("HACER RECARGA");
        botonRecarga.setFocusPainted(false);
        botonRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("NUMERO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("REALIZAR RECARGA");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("VALOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRecarga)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar2)
                        .addGap(143, 143, 143))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(33, 33, 33)
                                .addComponent(campoValorRecarga))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(campoNumeroRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(129, 129, 129))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNumeroRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoValorRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(botonRecarga)
                .addGap(49, 49, 49)
                .addComponent(regresar2)
                .addGap(20, 20, 20))
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

    private void regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar2ActionPerformed
        MenuInicio inicio = new MenuInicio();
        this.dispose();
    }//GEN-LAST:event_regresar2ActionPerformed

    private void botonRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaActionPerformed
        // Crear un objeto de tipo celular
        Celular celular = new Celular();
        
        // Cargar el numero al objeto
        celular.setNumero(campoNumeroRecarga.getText());
        
        // Crear un objeto de tipo logica celular
        LogicaCelular objLogicaCel = new LogicaCelular();
        
        // Crear un objeto de tipo logica recarga
        LogicaRecarga objLogRecarga = new LogicaRecarga();
        
        try {
            if(objLogicaCel.ValidarCelular(celular)){
                // Traer el id y el estado
                objLogicaCel.BuscarCelularxNumero(celular);
                // Validar el estado
                if(objLogicaCel.ValidarEstadoCel(celular)){
                    // Crear un objeto de tipo recarga
                    Recarga recarga = new Recarga();                 
                    // Cargar  el objeto con el valor de la recarga
                    recarga.setValor(Integer.parseInt(campoValorRecarga.getText()));
                    // Distribuir los valores de el valor 2/3 para el saldo 1/3 para megas
                    objLogRecarga.distribuirValores1(recarga);
                    // Meter la recarga dentro de su celular
                    ArrayList<Recarga> recargas = new ArrayList<>();
                    recargas.add(recarga);
                    celular.setRecargas(recargas);
                    // Insertar datos de recarga en la base de datos
                    objLogRecarga.insertarRecar(celular);
                    // Mostrar mensaje de finalizado
                    JOptionPane.showMessageDialog(this, "RECARGA COMPLETADA CON EXITO");                  
                }else{
                    JOptionPane.showMessageDialog(this, "ESTADO DEL CELULAR NO TE PERMMITE HACER RECARGAS");
                }
            }else{
                JOptionPane.showMessageDialog(this, "NUMERO DE CELULAR NO EXISTE");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RealizarRecarga1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RealizarRecarga1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRecargaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRecarga;
    private javax.swing.JTextField campoNumeroRecarga;
    private javax.swing.JTextField campoValorRecarga;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar2;
    // End of variables declaration//GEN-END:variables
}