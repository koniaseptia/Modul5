/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Windows
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editkelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editalamat = new javax.swing.JTextField();
        Buttonproses = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hasilnama = new javax.swing.JTextField();
        hasilkelas = new javax.swing.JTextField();
        hasilalamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(161, 42, 60, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(45, 77, 50, 14);

        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama);
        editnama.setBounds(120, 70, 110, 30);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(45, 115, 50, 14);

        editkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editkelasActionPerformed(evt);
            }
        });
        getContentPane().add(editkelas);
        editkelas.setBounds(120, 110, 110, 30);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(45, 153, 60, 14);
        getContentPane().add(editalamat);
        editalamat.setBounds(120, 150, 110, 30);

        Buttonproses.setText("Proses");
        Buttonproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonprosesActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonproses);
        Buttonproses.setBounds(140, 200, 80, 23);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 240, 50, 14);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 280, 40, 14);

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 320, 50, 14);

        hasilnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilnamaActionPerformed(evt);
            }
        });
        getContentPane().add(hasilnama);
        hasilnama.setBounds(120, 240, 110, 30);
        getContentPane().add(hasilkelas);
        hasilkelas.setBounds(120, 280, 110, 30);

        hasilalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilalamatActionPerformed(evt);
            }
        });
        getContentPane().add(hasilalamat);
        hasilalamat.setBounds(120, 320, 110, 30);

        setSize(new java.awt.Dimension(416, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnamaActionPerformed

    private void editkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editkelasActionPerformed

    private void ButtonprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonprosesActionPerformed
        // TODO add your handling code here:
        String nama = editnama.getText();
        hasilnama.setText(nama);
        String kelas = editkelas.getText();
        hasilkelas.setText(kelas);
        String alamat = editalamat.getText();
        hasilalamat.setText(alamat);
    }//GEN-LAST:event_ButtonprosesActionPerformed

    private void hasilnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilnamaActionPerformed

    private void hasilalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilalamatActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonproses;
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JTextField hasilalamat;
    private javax.swing.JTextField hasilkelas;
    private javax.swing.JTextField hasilnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
