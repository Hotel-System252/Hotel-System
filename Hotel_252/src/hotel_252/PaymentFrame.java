/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nero
 */
public class PaymentFrame extends javax.swing.JFrame {

    DataBaseConnection dbCon = DataBaseConnection.getconnnection();

    public Book book;

    /**
     * Creates new form Payment
     */
    public PaymentFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PaymentTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TotalPriceBeforeLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Payment");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Complete Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Payment Method");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Mada", "Visa", "Mastercard" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Total After Fee:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("-");

        PaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PaymentTable);
        if (PaymentTable.getColumnModel().getColumnCount() > 0) {
            PaymentTable.getColumnModel().getColumn(0).setResizable(false);
            PaymentTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Total Price: ");

        TotalPriceBeforeLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TotalPriceBeforeLabel.setText("-");

        jButton3.setText("Apply");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TotalPriceBeforeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TotalPriceBeforeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            Statement stmt = dbCon.getCon().createStatement();

            int Room_No = book.getRoom_No();
            int Book_ID = book.getBook_ID();
            int Customer_ID = book.getCustomer_ID();
            int Payment_ID;
            int Night_No = book.getNight_No();
            Date Check_In = book.getCheck_In();
            Date Check_Out = book.getCheck_Out();

            //Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(chickIn.getText());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String strDate
                    = dateFormat.format(Check_In);
            String strout = dateFormat.format(Check_Out);
            LocalDate checkInDate = LocalDate.parse(strDate, DateTimeFormatter.ISO_DATE);
            ResultSet result = stmt.executeQuery("select Payment_id from PAYMENTS");
            result.last();
            if (result.getRow() == 0) {
                Payment_ID = 1;
            } else {
                Payment_ID = (result.getInt(1)) + 1;
            }

            if (jComboBox1.getSelectedItem() == "Cash") {
                stmt.executeQuery("INSERT INTO PAYMENTS VALUES(" + Payment_ID + "," + "'Cash'," + jLabel5.getText() + ")");
                System.out.println("stmt.executeQuery(\"INSERT INTO BOOKS VALUES(\" + book.getRoom_No() + \",\" + book.getBook_ID() + \",\" + \" STR_TO_DATE('\" + strDate + \"','%Y-%m-%d') \" + \",\" + \" STR_TO_DATE('\" + strout + \"','%Y-%m-%d')  \" + \",\" + book.getCustomer_ID() + \",\" + Payment_ID + \",\" + book.getNight_No() + \")\");");
                stmt.executeQuery("INSERT INTO BOOKS VALUES(" + book.getRoom_No() + "," + book.getBook_ID() + "," + " STR_TO_DATE('" + strDate + "','%Y-%m-%d') " + "," + " STR_TO_DATE('" + strout + "','%Y-%m-%d')  " + "," + book.getCustomer_ID() + "," + Payment_ID + "," + book.getNight_No() + ")");
            } else if (jComboBox1.getSelectedItem() == "Mada") {
                stmt.executeQuery("INSERT INTO PAYMENTS VALUES(" + Payment_ID + "," + "'Mada'," + jLabel5.getText() + ")");
                stmt.executeQuery("INSERT INTO BOOKS VALUES(" + book.getRoom_No() + "," + book.getBook_ID() + "," + " STR_TO_DATE('" + strDate + "','%Y-%m-%d') " + "," + " STR_TO_DATE('" + strout + "','%Y-%m-%d')  " + "," + book.getCustomer_ID() + "," + Payment_ID + "," + book.getNight_No() + ")");
            } else if (jComboBox1.getSelectedItem() == "Visa") {
                stmt.executeQuery("INSERT INTO PAYMENTS VALUES(" + Payment_ID + "," + "'Visa'," + jLabel5.getText() + ")");
                stmt.executeQuery("INSERT INTO BOOKS VALUES(" + book.getRoom_No() + "," + book.getBook_ID() + "," + " STR_TO_DATE('" + strDate + "','%Y-%m-%d') " + "," + " STR_TO_DATE('" + strout + "','%Y-%m-%d')  " + "," + book.getCustomer_ID() + "," + Payment_ID + "," + book.getNight_No() + ")");
            } else if (jComboBox1.getSelectedItem() == "Mastercard") {
                stmt.executeQuery("INSERT INTO PAYMENTS VALUES(" + Payment_ID + "," + "'Mastercard'," + jLabel5.getText() + ")");
                stmt.executeQuery("INSERT INTO BOOKS VALUES(" + book.getRoom_No() + "," + book.getBook_ID() + "," + " STR_TO_DATE('" + strDate + "','%Y-%m-%d') " + "," + " STR_TO_DATE('" + strout + "','%Y-%m-%d')  " + "," + book.getCustomer_ID() + "," + Payment_ID + "," + book.getNight_No() + ")");
            }

        } catch (SQLException ex) {
            Logger.getLogger(LockRoomFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainFrame m = new MainFrame();
        m.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int priceAfter = 0;
        Payment payment = new Payment(book.getTotalPrice());
        if (jComboBox1.getSelectedItem() == "Cash") {
            Extra cashExtra = new CashStratgy();
            payment.setExtraStrategy(cashExtra);
            priceAfter = payment.applyExtra();
        } else if (jComboBox1.getSelectedItem() == "Mada") {
            Extra madaExtra = new MadaStratgy();
            payment.setExtraStrategy(madaExtra);
            priceAfter = payment.applyExtra();
        } else if (jComboBox1.getSelectedItem() == "Visa") {
            Extra visaExtra = new VisaStratgy();
            payment.setExtraStrategy(visaExtra);
            priceAfter = payment.applyExtra();
        } else if (jComboBox1.getSelectedItem() == "Mastercard") {
            Extra mastercardExtra = new MastercardStratgy();
            payment.setExtraStrategy(mastercardExtra);
            priceAfter = payment.applyExtra();
        }
        jLabel5.setText(String.valueOf(priceAfter));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable PaymentTable;
    public javax.swing.JLabel TotalPriceBeforeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
