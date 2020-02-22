
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;
import Business.Airline;
import Business.AirlineDirectory;
import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Fleet;
import Business.FleetDirectory;
import Business.FlightDetailsDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class LoginAirliner extends javax.swing.JPanel {

    /**
     * Creates new form LoginAirliner
     */
    
    JPanel CardSequenceJPanel;
    AirlineDirectory airDuct;
    FleetDirectory fleetDirectory;
    Airliner airliner;
    AirlinerDirectory airlinerDirectory;
    FlightDetailsDirectory flightDetailsDirectory;
    public LoginAirliner(JPanel rp, AirlineDirectory ad, FleetDirectory fleetDirectory, AirlinerDirectory airlinerDirectory, FlightDetailsDirectory flightDetailsDirectory) {
        initComponents();
        this.CardSequenceJPanel=rp;
        this. airDuct=ad;
       this.airliner=airliner;
       this.airlinerDirectory = airlinerDirectory;
        this.fleetDirectory=fleetDirectory;
        this.flightDetailsDirectory = flightDetailsDirectory;
        airlinecombobox.removeAllItems();
       for (Airliner a : airlinerDirectory.getAirlinerDirectory()) {
           airlinecombobox.addItem(a.getAirlineName());
       }
      
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
        btnGo = new javax.swing.JButton();
        airlinecombobox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(242, 225, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Airline Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        btnGo.setBackground(new java.awt.Color(255, 255, 255));
        btnGo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnGo.setText("GO");
        btnGo.setBorder(new javax.swing.border.MatteBorder(null));
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 191, 71));

        airlinecombobox.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N
        airlinecombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        airlinecombobox.setBorder(new javax.swing.border.MatteBorder(null));
        airlinecombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinecomboboxActionPerformed(evt);
            }
        });
        add(airlinecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 379, 71));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        String airlinerName = (String)airlinecombobox.getSelectedItem();
        Airliner airliner = airlinerDirectory.getAirliner(airlinerName);
        LoginFleet fleetchooser = new LoginFleet(CardSequenceJPanel, airDuct, airliner, fleetDirectory,flightDetailsDirectory);
        CardSequenceJPanel.add(fleetchooser);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
  
    }//GEN-LAST:event_btnGoActionPerformed

    private void airlinecomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinecomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinecomboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinecombobox;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
