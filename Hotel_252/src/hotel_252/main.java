/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nero
 */
public class main extends javax.swing.JFrame {

    DataBaseConnection dbCon = DataBaseConnection.getconnnection();

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y");
        currentDate.setText(dateForm.format(thisDate));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameReceptionist = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        booking = new javax.swing.JButton();
        getInfo = new javax.swing.JButton();
        CancelBook = new javax.swing.JButton();
        lockRoom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hotelName = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameReceptionist.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NameReceptionist.setText("jLabel1");

        booking.setText("BOOKING");

        getInfo.setText("GET INFO");
        getInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInfoActionPerformed(evt);
            }
        });

        CancelBook.setText("CANCLE BOOK");
        CancelBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBookActionPerformed(evt);
            }
        });

        lockRoom.setText("LOCK ROOM");
        lockRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lockRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CancelBook, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBook, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lockRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hotelName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hotelName.setText("HOTEL 252");

        currentDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        currentDate.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(NameReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(hotelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentDate)
                        .addGap(9, 9, 9))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameReceptionist)
                    .addComponent(hotelName)
                    .addComponent(currentDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Statement st = dbCon.getCon().createStatement();
            ResultSet r = st.executeQuery("SELECT * FROM room_table");
            r.last();
            //Statement pstmt = dbCon.getCon().("SELECT * FROM information_schema.KEY_COLUMN_USAGE WHERE   TABLE_SCHEMA='hotel_252'   AND TABLE_NAME='room_types'   AND REFERENCED_TABLE_NAME IS NOT NULL;");

            System.out.println(r.getRow());
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void getInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInfoActionPerformed
        GET_INFO getInfoPage = new GET_INFO();
        getInfoPage.show();
        dispose();
        //
    }//GEN-LAST:event_getInfoActionPerformed

    private void lockRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockRoomActionPerformed
        
        try {
            LockRoom R = new LockRoom();
            Statement stmt = dbCon.getCon().createStatement();
            DefaultTableModel LuckRoom = (DefaultTableModel) R.RoomTable.getModel();
            LuckRoom.setRowCount(0);
            ResultSet result = stmt.executeQuery("SELECT * FROM Room_table");

            while (result.next()) {
                
                int room_number = result.getInt("Room_No");
                String room_Type = result.getString("Room_Type");
                int state= result.getInt("State");

                ArrayList dbData = new ArrayList();
                dbData.add(room_number);
                dbData.add(room_Type);
                dbData.add(state);

                LuckRoom.addRow(dbData.toArray());
                
            }
            R.show();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(LockRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lockRoomActionPerformed

    private void CancelBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBookActionPerformed
        try {
            Cancle R = new Cancle();
            Statement stmt = dbCon.getCon().createStatement();
            DefaultTableModel CancleTable = (DefaultTableModel) R.CancleTable.getModel();
            CancleTable.setRowCount(0);
            ResultSet result = stmt.executeQuery("SELECT * FROM books");

            while (result.next()) {

                int room_number = result.getInt("Room_No");
                int book_ID = result.getInt("Book_ID");
                Date checkIn = result.getDate("Check_in");
                Date checkOut = result.getDate("Check_out");
                int customerID = result.getInt("Customer_ID");
                int paymentID = result.getInt("Payment_ID");
                int nightNo = result.getInt("No_Nights");

                ArrayList dbData = new ArrayList();
                dbData.add(room_number);
                dbData.add(book_ID);
                dbData.add(checkIn);
                dbData.add(checkOut);
                dbData.add(customerID);
                dbData.add(paymentID);
                dbData.add(nightNo);

                CancleTable.addRow(dbData.toArray());

            }
            R.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LockRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelBookActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBook;
    public javax.swing.JLabel NameReceptionist;
    private javax.swing.JButton booking;
    private javax.swing.JLabel currentDate;
    private javax.swing.JButton getInfo;
    private javax.swing.JLabel hotelName;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lockRoom;
    // End of variables declaration//GEN-END:variables
}
