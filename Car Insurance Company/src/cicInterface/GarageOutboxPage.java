/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

import cicSrc.Application;

/**
 *
 * @author george
 */
public class GarageOutboxPage extends javax.swing.JFrame {

    /**
     * Creates new form GarageOutboxPage
     */
    
    public static String garageOwnerName;
    public static String garageOwnerMessage;
    
    public GarageOutboxPage() {
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

        RecipientName_TextField = new javax.swing.JTextField();
        MessageToBeSent_TextArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BackToPage_Button = new javax.swing.JButton();
        RecipientList_Box = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        SendMessage_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RecipientName_TextField.setText("jTextField1");
        RecipientName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipientName_TextFieldActionPerformed(evt);
            }
        });

        MessageToBeSent_TextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageToBeSent_TextAreaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Outbox");

        BackToPage_Button.setText("Back To Page");
        BackToPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPage_ButtonActionPerformed(evt);
            }
        });

        RecipientList_Box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee Of CD", "Claimant" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("To");

        SendMessage_Button.setText("Send Message");
        SendMessage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMessage_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SendMessage_Button)
                        .addComponent(MessageToBeSent_TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecipientList_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RecipientName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BackToPage_Button)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RecipientName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecipientList_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(BackToPage_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(MessageToBeSent_TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SendMessage_Button))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecipientName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipientName_TextFieldActionPerformed
        // TODO 
    }//GEN-LAST:event_RecipientName_TextFieldActionPerformed

    private void MessageToBeSent_TextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageToBeSent_TextAreaActionPerformed
        // TODO 
    }//GEN-LAST:event_MessageToBeSent_TextAreaActionPerformed

    private void SendMessage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMessage_ButtonActionPerformed
               
        garageOwnerName=Application.garage1.name + " " + Application.garage1.surname;//we can change this once we make the personal records page
        garageOwnerMessage=this.MessageToBeSent_TextArea.getText();
        String recipientRole=(String)this.RecipientList_Box.getSelectedItem();
        switch (recipientRole){
            case "Employee Of CD":Application.MessageToCDEmployee++;
            Application.MessageFromGarage++;
            break;
            case "Claimant":Application.MessageToClaimant++;
            Application.MessageFromGarage++;
            break;
            default: break;

        }
    }//GEN-LAST:event_SendMessage_ButtonActionPerformed

    private void BackToPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPage_ButtonActionPerformed
      
        GarageOwnerPage garagePage=new GarageOwnerPage();
        garagePage.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BackToPage_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GarageOutboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GarageOutboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GarageOutboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GarageOutboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GarageOutboxPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPage_Button;
    public javax.swing.JTextField MessageToBeSent_TextArea;
    private javax.swing.JComboBox RecipientList_Box;
    public javax.swing.JTextField RecipientName_TextField;
    private javax.swing.JButton SendMessage_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
