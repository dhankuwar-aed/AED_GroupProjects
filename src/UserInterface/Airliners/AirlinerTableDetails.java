/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;

import Business.Airline;
import Business.AirlineDirectory;
import Business.Airliner;
import Business.Fleet;
import Business.FleetDirectory;
import Business.FlightDetails;
import Business.FlightDetailsDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Girija Dhawale
 */
public class AirlinerTableDetails extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerTableDetails
     */
    JPanel CardSequenceJPanel;
    Airliner airliner;
    Airline airline;
    private Fleet fleet;
    private FleetDirectory fleetDirectory;
    private AirlineDirectory airlinerDirectory;
    private FlightDetailsDirectory flightDetailsDirectory;
    
    
    AirlinerTableDetails(JPanel CardSequenceJPanel, Airliner airliner, AirlineDirectory airlineDirectory, Airline airline, FleetDirectory fleetDirectory, FlightDetailsDirectory flightDetailsDirectory) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.airliner=airliner;
        this.airline=airline;
        this.fleetDirectory=fleetDirectory;
        this.flightDetailsDirectory = flightDetailsDirectory;
        txtAirlineName.setText(airliner.getAirlineName());
        populate1();
        txtAirlineName.setEnabled(false);
        
        tableAirlinerInfo.getTableHeader().setFont(new Font("TimesNewRoman",Font.BOLD,34));
    }
    
    public void populate1() {
       int rowCount = tableAirlinerInfo.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tableAirlinerInfo.getModel();
        model.setRowCount(0);
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
    
        for(FlightDetails fd : flightDetailsDirectory.getFlightDetailsDir()) {
            if(fd.getAirlineName() == airline.getAirlineName() && fd.getAirliner() == airliner.getAirlineName()){
                Object row[] = new Object[model.getColumnCount()];
                row[0] = fd.getFlightNumber();
                row[1] = fd.getDeparture();
                row[2] = fd.getArrival();
                row[3] = airline.getSeats();
                row[4] = fd.getDepartureDate();
                row[5] = fd.getArrivalDate();
                row[6] = fd.getPrice();
            
                model.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAirlineName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAirlinerInfo = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 225, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Airliner Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, 60));

        txtAirlineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlineNameActionPerformed(evt);
            }
        });
        add(txtAirlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 330, 50));

        tableAirlinerInfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableAirlinerInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Departure", "Arrival", "Seats", "Departure Date", "Arrival Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAirlinerInfo);
        if (tableAirlinerInfo.getColumnModel().getColumnCount() > 0) {
            tableAirlinerInfo.getColumnModel().getColumn(0).setResizable(false);
            tableAirlinerInfo.getColumnModel().getColumn(1).setResizable(false);
            tableAirlinerInfo.getColumnModel().getColumn(2).setResizable(false);
            tableAirlinerInfo.getColumnModel().getColumn(3).setResizable(false);
            tableAirlinerInfo.getColumnModel().getColumn(4).setResizable(false);
            tableAirlinerInfo.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 940, 390));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 60));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.MatteBorder(null));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 60));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateNewAirliner cna = new CreateNewAirliner(CardSequenceJPanel, airliner, airlinerDirectory, fleet, fleetDirectory, airline,flightDetailsDirectory);
        CardSequenceJPanel.add("CreateNewAirliner",cna);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableAirlinerInfo.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String fd = (String)tableAirlinerInfo.getValueAt(selectedRow, 0);
                flightDetailsDirectory.removeFlight(fd);
                populate1();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
         CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectRow= tableAirlinerInfo.getSelectedRow();
        if(selectRow<0)
        {
        JOptionPane.showMessageDialog(null,"Please select a row!");
        }
        else{
            System.out.println(tableAirlinerInfo.getValueAt(selectRow, 0));
            FlightDetails flightDetails = null; 
        String fd = (String) tableAirlinerInfo.getValueAt(selectRow,0);
        for(FlightDetails f: flightDetailsDirectory.getFlightDetailsDir()){
            if(f.getFlightNumber() == fd){
                flightDetails = f;
            }
        }
        
        ViewAirlinerDetails vad = new ViewAirlinerDetails(this.CardSequenceJPanel,flightDetails, airline);
        CardSequenceJPanel.add("ViewAirlinerDetails",vad);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtAirlineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlineNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAirlinerInfo;
    private javax.swing.JTextField txtAirlineName;
    // End of variables declaration//GEN-END:variables
}
