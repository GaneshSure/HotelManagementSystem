/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Savita
 */
public class BookingCancel extends javax.swing.JFrame {

    /**
     * Creates new form BookingCancel
     */
    public BookingCancel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Room_No = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        Back2 = new javax.swing.JMenu();
        Home = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 780));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setText("Booking Cancellation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 200, 340, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Room No.     :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 330, 120, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Booking Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 420, 170, 40);

        Room_No.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Room_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_NoActionPerformed(evt);
            }
        });
        getContentPane().add(Room_No);
        Room_No.setBounds(650, 320, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/Vastu-for-room-size.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);

        Back2.setText("Back");
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });
        jMenuBar3.add(Back2);

        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenuBar3.add(Home);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenuBar3.add(Exit);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int Room = Integer.parseInt(Room_No.getText());
        PreparedStatement ps;
        Connection conn;
        try{
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","1234");
            ps=conn.prepareStatement("DELETE FROM reservation  WHERE Room_No = '"+Room+"'");   
            ps.executeUpdate();
            ps=conn.prepareStatement("UPDATE room SET  Booking = 'Unbooked' WHERE Room_No = '"+Room+"'");   
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Cancelled...!!");
            ps.close();
            conn.close();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
        // TODO add your handling code here:
        new RoomProcessing().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back2MouseClicked

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Back2ActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        HomeMenu HM = new HomeMenu();
        HM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_HomeActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ExitActionPerformed

    private void Room_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room_NoActionPerformed

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
            java.util.logging.Logger.getLogger(BookingCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingCancel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Back2;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenu Home;
    private javax.swing.JTextField Room_No;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}