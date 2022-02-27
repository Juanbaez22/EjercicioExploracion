
package ejercicioexploracion;

/**
 *
 * @author JuanBaez
 */
public class VentanaOperacion extends javax.swing.JFrame {

    EjercicioExploracion Datos = new  EjercicioExploracion();
   
    double num1;
   double num2;
   
    public VentanaOperacion() {
        initComponents();
    }
    public void entrada (){
        num1 = Double.parseDouble (Num1.getText());
        num2 = Double.parseDouble (Num2.getText());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btnsuma = new javax.swing.JButton();
        Btnresta = new javax.swing.JButton();
        Btnmultiplicacion = new javax.swing.JButton();
        Btndivision = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Fresultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero 1:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("OPERACIONES BASICAS");

        jLabel3.setText("Numero 2:");

        Btnsuma.setText("+");
        Btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsumaActionPerformed(evt);
            }
        });

        Btnresta.setText("-");
        Btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnrestaActionPerformed(evt);
            }
        });

        Btnmultiplicacion.setText("*");

        Btndivision.setText("/");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Resultado:");

        Fresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FresultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(Num1))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnsuma)
                                .addGap(31, 31, 31)
                                .addComponent(Btnresta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnmultiplicacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btndivision)))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnsuma)
                    .addComponent(Btnresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Btnmultiplicacion)
                    .addComponent(Btndivision))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Fresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsumaActionPerformed
        entrada ();
        Datos.Suma(num1, num2);
        Fresultado.setText(String.valueOf(Datos.resultado));
    }//GEN-LAST:event_BtnsumaActionPerformed

    private void BtnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnrestaActionPerformed
        entrada ();
        Datos.Resta(num1, num2);
       Fresultado.setText(String.valueOf(Datos.resultado));
    }//GEN-LAST:event_BtnrestaActionPerformed

    private void FresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FresultadoActionPerformed

 
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
            java.util.logging.Logger.getLogger(VentanaOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOperacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndivision;
    private javax.swing.JButton Btnmultiplicacion;
    private javax.swing.JButton Btnresta;
    private javax.swing.JButton Btnsuma;
    private javax.swing.JTextField Fresultado;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
