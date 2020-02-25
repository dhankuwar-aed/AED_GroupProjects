/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.AirlineDirectory;
import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class AddAirline extends javax.swing.JPanel {

    /**
     * Creates new form AddAirline
     */
    JPanel CardSequenceJPanel;
    AirlineDirectory airDirect;
    AirlinerDirectory airlinerDirectory;

    AddAirline(JPanel CardSequenceJPanel, AirlineDirectory airdirect, AirlinerDirectory AarlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel =CardSequenceJPanel;
        this.airDirect = airdirect;
        this.airlinerDirectory = airlinerDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddAirliner = new javax.swing.JButton();
        txtAddAirliner = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddAirliner.setBackground(new java.awt.Color(255, 255, 255));
        btnAddAirliner.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddAirliner.setText("Add ");
        btnAddAirliner.setBorder(new javax.swing.border.MatteBorder(null));
        btnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinerActionPerformed(evt);
            }
        });
        add(btnAddAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 100, 50));

        txtAddAirliner.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtAddAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 300, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Airline Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        AirlineWorkArea AirlinerWorkAreaJPanel=(AirlineWorkArea) component;
        AirlinerWorkAreaJPanel.populatetable();
        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinerActionPerformed
        // TODO add your handling code here:
        if(txtAddAirliner.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Airliner Name");
        }
        else{
            Airliner airliner = new Airliner(txtAddAirliner.getText());
            AirlinerDirectory.addAirliner(airliner);
       
         JOptionPane.showMessageDialog(null, "Airliner successfully added");
         txtAddAirliner.setText("");
        }
           
        
    }//GEN-LAST:event_btnAddAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAirliner;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAddAirliner;
    // End of variables declaration//GEN-END:variables
}
