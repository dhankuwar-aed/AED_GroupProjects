/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer;
import Business.CustomerDirectory;
import Business.FlightDetails;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class CustomerDetails extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDetails
     */
    JPanel CardSequenceJPanel;
    FlightDetails flightDet;
    private CustomerDirectory custDir;
    public CustomerDetails(JPanel CardSequenceJPanel, FlightDetails fd) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.flightDet=fd;
        custDir=new CustomerDirectory();
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassport = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Customer Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 270, 35));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 230, 42));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Phone");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 230, 42));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Passport No");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));
        add(txtPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 230, 42));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Customer Fight");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });
        add(txtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 230, 42));

        btnConfirm.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnConfirm.setText("Confirm Booking");
        btnConfirm.setBorder(new javax.swing.border.MatteBorder(null));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 220, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);//points to the current object
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
         Customer c=custDir.addCustomer();
         if(!phonePatternCorrect()) {
         JOptionPane.showMessageDialog(CardSequenceJPanel, " Enter valid phone number");
        }else{      
        c.setName(txtName.getText().trim());
        c.setPhoneNumber(txtPhone.getText().trim());
        c.setPassportNumber(txtPassport.getText().trim());
         }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed
 boolean phonePatternCorrect()  {
        Pattern p= Pattern.compile("^[0-9]{10}+$");
        Matcher m = p.matcher(txtPhone.getText());
        return m.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
