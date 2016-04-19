/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConverter;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Jennifer
 */
public class MainWindow extends javax.swing.JFrame {

    private TemperatureConverterService convertService;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {

        initComponents();
        convertService = new TemperatureConverterService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGroupTempConversions = new javax.swing.ButtonGroup();
        lblInstructions = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        txtCelciusOutput = new javax.swing.JTextField();
        lblConvertedOutput = new javax.swing.JLabel();
        rdoFartoCel = new javax.swing.JRadioButton();
        rdoCeltoFar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        lblInstructions.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(204, 51, 0));
        lblInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions.setText("Enter temperature to be converted:");

        txtInput.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N

        btnConvert.setBackground(new java.awt.Color(255, 102, 0));
        btnConvert.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(204, 51, 0));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        txtCelciusOutput.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        txtCelciusOutput.setForeground(new java.awt.Color(255, 102, 0));

        lblConvertedOutput.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lblConvertedOutput.setForeground(new java.awt.Color(204, 51, 0));
        lblConvertedOutput.setText("Result: ");

        rdoGroupTempConversions.add(rdoFartoCel);
        rdoFartoCel.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        rdoFartoCel.setText("Fahrenheit to Celcius");
        rdoFartoCel.setToolTipText("");
        rdoFartoCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFartoCelActionPerformed(evt);
            }
        });

        rdoGroupTempConversions.add(rdoCeltoFar);
        rdoCeltoFar.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        rdoCeltoFar.setText("Celcius to Fahrenheit");

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 51, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblConvertedOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdoFartoCel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(rdoCeltoFar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelciusOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConvert, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(rdoFartoCel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvert)
                    .addComponent(rdoCeltoFar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelciusOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConvertedOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String result = null;

        String selected = getSelectedButtonText(rdoGroupTempConversions);
        try {
        if (selected.equals("Fahrenheit to Celcius")) {
            result = fahrenheitToCelcius();
        } else if (selected.equals("Celcius to Fahrenheit")) {
            result = celciusToFahrenheit();
        }
        } catch(IllegalArgumentException e){
            System.out.println("Illegal Arugment: " + e.getMessage());
            
        }
        dispose();
       new ResultWindow(result).setVisible(true);
    
        txtCelciusOutput.setText(((result)));

    }//GEN-LAST:event_btnConvertActionPerformed

    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        String text = null;

        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                text = button.getText();
                break;
            }
        }
        return text;
    }
    private void rdoFartoCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFartoCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoFartoCelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    private String fahrenheitToCelcius() {
        String tempInput = txtInput.getText();
        String result = convertService.convertFahrenheitToCelsius(tempInput);
        return result;
    }

    private String celciusToFahrenheit() {
        String tempInput = txtInput.getText();
        String result = convertService.convertCelsiustoFahrenheit(tempInput);
        return result;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblConvertedOutput;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JRadioButton rdoCeltoFar;
    private javax.swing.JRadioButton rdoFartoCel;
    private javax.swing.ButtonGroup rdoGroupTempConversions;
    private javax.swing.JTextField txtCelciusOutput;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
