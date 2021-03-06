/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classe;

import java.awt.Font;

/**
 *
 * @author pc
 */
public class TelaGenio extends javax.swing.JFrame {

    /** Creates new form TelaGenio */
    public TelaGenio() { //Construtor
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5</strong>. Tente advinhar!!!</html>");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPalpite = new javax.swing.JButton();
        txtVal = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/speech-bubble-145977_960_7204.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 170));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setText("Valor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        btnPalpite.setBackground(new java.awt.Color(0, 51, 255));
        btnPalpite.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnPalpite.setForeground(new java.awt.Color(255, 255, 255));
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, -1));

        txtVal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Akinator+-+Blog+do+Nel12.jpg.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        double n = 1 + Math.random() * (6-1);
        int valor = (int)n;
        
        int num = Integer.parseInt(txtVal.getValue().toString());
        
        String f1 = "<html>ACERTOU</html>";
        String f2 = "<html>ERROU! Eu pensei no n??mero " + valor + "</html>";
        
        String res = (valor == num)?f1:f2;
        
        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblFrase.setText(res);
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables

}
