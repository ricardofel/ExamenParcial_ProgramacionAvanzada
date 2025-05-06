package vista;
// RICARDO FABIAN ESPINOSA LARGO
public class MenuInicio extends javax.swing.JFrame {
    public MenuInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonRealizarRecarga1 = new javax.swing.JButton();
        botonIngresarCelular = new javax.swing.JButton();
        botonIngresarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonRealizarRecarga2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SISTEMA DE GESTION DE COMUNICACIONES");

        botonRealizarRecarga1.setBackground(new java.awt.Color(0, 102, 255));
        botonRealizarRecarga1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRealizarRecarga1.setForeground(new java.awt.Color(0, 0, 0));
        botonRealizarRecarga1.setText("REALIZAR RECARGA 1");
        botonRealizarRecarga1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRealizarRecarga1.setFocusPainted(false);
        botonRealizarRecarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarRecarga1ActionPerformed(evt);
            }
        });

        botonIngresarCelular.setBackground(new java.awt.Color(0, 102, 255));
        botonIngresarCelular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIngresarCelular.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresarCelular.setText("INGRESAR CELULAR");
        botonIngresarCelular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresarCelular.setFocusPainted(false);
        botonIngresarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarCelularActionPerformed(evt);
            }
        });

        botonIngresarCliente.setBackground(new java.awt.Color(0, 102, 255));
        botonIngresarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIngresarCliente.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresarCliente.setText("INGRESAR CLIENTE");
        botonIngresarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresarCliente.setFocusPainted(false);
        botonIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EXAMEN PARCIAL - 1 BIMESTRE  - PROGRAMACION AVANZADA");

        botonRealizarRecarga2.setBackground(new java.awt.Color(0, 102, 255));
        botonRealizarRecarga2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRealizarRecarga2.setForeground(new java.awt.Color(0, 0, 0));
        botonRealizarRecarga2.setText("REALIZAR RECARGA 2");
        botonRealizarRecarga2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRealizarRecarga2.setFocusPainted(false);
        botonRealizarRecarga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarRecarga2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRealizarRecarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresarCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRealizarRecarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(botonIngresarCliente)
                .addGap(18, 18, 18)
                .addComponent(botonIngresarCelular)
                .addGap(18, 18, 18)
                .addComponent(botonRealizarRecarga1)
                .addGap(18, 18, 18)
                .addComponent(botonRealizarRecarga2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarCelularActionPerformed
        IngresarCelular ventanaICel = new IngresarCelular();
        this.dispose();
    }//GEN-LAST:event_botonIngresarCelularActionPerformed

    private void botonRealizarRecarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarRecarga1ActionPerformed
        RealizarRecarga1 ventanaR1 = new RealizarRecarga1();
        this.dispose();
    }//GEN-LAST:event_botonRealizarRecarga1ActionPerformed

    private void botonIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarClienteActionPerformed
        IngresarCliente ventanaIC = new IngresarCliente();
        this.dispose();
    }//GEN-LAST:event_botonIngresarClienteActionPerformed

    private void botonRealizarRecarga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarRecarga2ActionPerformed
        RealizarRecarga2 ventanaR2 = new RealizarRecarga2();
        this.dispose();
    }//GEN-LAST:event_botonRealizarRecarga2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarCelular;
    private javax.swing.JButton botonIngresarCliente;
    private javax.swing.JButton botonRealizarRecarga1;
    private javax.swing.JButton botonRealizarRecarga2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
