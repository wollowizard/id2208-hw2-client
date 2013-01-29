/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import pck.AuthenticationException_Exception;
import pck.Flight;
import pck.FlightsList;

/**
 *
 * @author Gerard
 */
public class ItineraryPanel extends javax.swing.JPanel {

    private List<FlightsList> itinerary = null;
    private ClientFrame frame;

    /**
     * Creates new form ItineraryPanel
     */
    public ItineraryPanel(ClientFrame frame) {
        initComponents();
        this.frame = frame;
        frame.pack();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        departureTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        destinationTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itineraryList = new javax.swing.JList();
        selectFlightsButton = new javax.swing.JButton();

        jLabel1.setText("Flight Book Service");

        jLabel4.setText("Authentication");

        jLabel2.setText("Departure:");

        departureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Destnation:");

        destinationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Flight Book Service");

        jLabel6.setText("Itinerary search");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(itineraryList);

        selectFlightsButton.setText("Select flights");
        selectFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFlightsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destinationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(departureTextField))
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectFlightsButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(departureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(SearchButton))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectFlightsButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void departureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureTextFieldActionPerformed

    private void destinationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTextFieldActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        try {
            // TODO add your handling code here:
            String from = departureTextField.getText();
            String to = destinationTextField.getText();
            itinerary = Controller.getItinerary(from, to, Controller.tokenId);
            DefaultListModel model = new DefaultListModel();
            itineraryList.setModel(model);
            for (FlightsList f : itinerary) {
                String x = "";
                
                for (Flight f1 : f.getList()) {
                    x += f1.getFrom() + " - " + f1.getTo() + "   ";
                }
                model.addElement(x);
            }

        } catch (AuthenticationException_Exception ex) {
            Logger.getLogger(ItineraryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void selectFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFlightsButtonActionPerformed
        // TODO add your handling code here:
        Integer i = itineraryList.getSelectedIndex();
        if (itinerary != null && i>=0) {
            
            FlightsList selected = itinerary.get(i);
            //frame.setContentPane(new PricePanel(frame, selected));
            frame.validate();
            
            System.out.println(selected.getId());
        }


    }//GEN-LAST:event_selectFlightsButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField departureTextField;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JList itineraryList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectFlightsButton;
    // End of variables declaration//GEN-END:variables
}
