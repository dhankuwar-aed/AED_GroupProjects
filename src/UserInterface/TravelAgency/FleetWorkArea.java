/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.Airline;
import Business.AirlineDirectory;
import Business.Airliner;
import Business.Fleet;
import Business.FleetDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @authorGirija Dhawale
 */
public class FleetWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FleetWorkArea
     */
    private JPanel CardSequenceJPanel;
    private FleetDirectory fleetDirectory;
    private Airliner airliner;
    private AirlineDirectory airlineDirectory;
    
    public FleetWorkArea(JPanel CardSequenceJPanel, Airliner airliner, FleetDirectory fleetDirectory, AirlineDirectory airlineDirectory) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.fleetDirectory=fleetDirectory;
        this.airliner=airliner;
        txtAirliner.setText(airliner.getAirlineName());
        this.airlineDirectory = airlineDirectory;
        populate();
        
    }

    
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel) tableFleet.getModel();
        dtm.setRowCount(0);
        
        for(Airline a : airlineDirectory.getAirlineDirectory()){
            if(airliner.getAirlineName().equalsIgnoreCase(a.getAirlinerName())){
                Object[] row = new Object[dtm.getColumnCount()];
        
                row[0]=a.getAirlineNo();
                row[1]=a.getAirlinerName();
                row[2]=a.getSeats();
                dtm.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableFleet = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtAirliner = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 225, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableFleet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Name", "Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFleet);
        if (tableFleet.getColumnModel().getColumnCount() > 0) {
            tableFleet.getColumnModel().getColumn(0).setResizable(false);
            tableFleet.getColumnModel().getColumn(1).setResizable(false);
            tableFleet.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 910, 300));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 50));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAdd.setText("Add ");
        btnAdd.setBorder(new javax.swing.border.MatteBorder(null));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 40));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 40));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.MatteBorder(null));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 170, 40));

        txtAirliner.setEnabled(false);
        txtAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerActionPerformed(evt);
            }
        });
        add(txtAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 240, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Airline");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Fleet Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        System.out.println(airliner);
        AddFleet addFleet =  new AddFleet(CardSequenceJPanel,airliner,fleetDirectory,airlineDirectory);
        CardSequenceJPanel.add(addFleet);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = tableFleet.getSelectedRow();
        if(selectedrow>=0){
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure?","Warning",selectionButton);
        
        if(selectionResult == JOptionPane.YES_OPTION){
            int airlineDelete = (int) tableFleet.getValueAt(selectedrow,0);
            System.out.println(airlineDelete);
            airlineDirectory.removeAirline(airlineDelete);
            populate();
//        Fleet fleet = (Fleet) tableFleet.getValueAt(selectedrow, 0);
//        fleetDirectory.deleteFleet(fleet);        
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Please Select a Row!");{
        
        }
        }
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedrow = tableFleet.getSelectedRow();
        if(selectedrow<0){
        JOptionPane.showMessageDialog(null, "Select a row");
        }
        else{
        // TODO add your handling code here:
            int a = (int) tableFleet.getValueAt(selectedrow,0);
            Airline airline = airlineDirectory.getAirline(a);
            ViewFleet var = new ViewFleet(CardSequenceJPanel,airliner, airline);
            CardSequenceJPanel.add(var);
            CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFleet;
    private javax.swing.JTextField txtAirliner;
    // End of variables declaration//GEN-END:variables
}
