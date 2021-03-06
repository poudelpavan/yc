/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.server.ui;

/**
 *
 * @author Pavan Poudel
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
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

        lbl_others_amt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lbl_prepaid_amt = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_total_amt = new javax.swing.JLabel();
        lbl_time_amt = new javax.swing.JLabel();
        lbl_traffic_amt = new javax.swing.JLabel();
        jlabel9 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_tax = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_customer = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_paid = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 380));
        setPreferredSize(new java.awt.Dimension(360, 440));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_others_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_others_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_others_amt.setText("-- amount --");
        getContentPane().add(lbl_others_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 270, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Customer:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, -1));

        lbl_prepaid_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_prepaid_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_prepaid_amt.setText("-- amount --");
        getContentPane().add(lbl_prepaid_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, -1));

        jlabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel7.setText("Time :");
        getContentPane().add(jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, -1));

        jlabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel6.setText("Traffic :");
        getContentPane().add(jlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 270, -1));

        lbl_total_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_total_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total_amt.setText("-- amount --");
        getContentPane().add(lbl_total_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 80, -1));

        lbl_time_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_time_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_time_amt.setText("-- amount --");
        getContentPane().add(lbl_time_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 80, -1));

        lbl_traffic_amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_traffic_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_traffic_amt.setText("-- amount --");
        getContentPane().add(lbl_traffic_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, -1));

        jlabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel9.setText("Others :");
        getContentPane().add(jlabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, -1));

        lbl_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total.setText("-- amount --");
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, -1));

        jlabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel11.setText("Total");
        getContentPane().add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, -1));

        jlabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel12.setText("Tax");
        getContentPane().add(jlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 270, 10));

        lbl_tax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tax.setText("-- amount --");
        getContentPane().add(lbl_tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Change:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, -1));

        txt_customer.setEditable(false);
        txt_customer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_customer.setText("YC (Demo PC)");
        getContentPane().add(txt_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setText("0.00");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 100, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("0.00");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Pre-paid :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Received Amount:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 120, -1));

        btn_paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_paid.setText("Paid");
        btn_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paidActionPerformed(evt);
            }
        });
        getContentPane().add(btn_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 80, 30));

        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ok.setText("Ok");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paidActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_paidActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_paid;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JLabel jlabel9;
    public javax.swing.JLabel lbl_others_amt;
    public javax.swing.JLabel lbl_prepaid_amt;
    public javax.swing.JLabel lbl_tax;
    public javax.swing.JLabel lbl_time_amt;
    public javax.swing.JLabel lbl_total;
    public javax.swing.JLabel lbl_total_amt;
    public javax.swing.JLabel lbl_traffic_amt;
    private javax.swing.JTextField txt_customer;
    // End of variables declaration//GEN-END:variables
}
