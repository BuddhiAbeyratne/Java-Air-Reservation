/*
 * To change this license header, choose License Headers in Project Properties.+
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Admin;
import javax.swing.JDesktopPane;
import Classes.Passenger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dima
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form login1
     */
    public Login() {
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

        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(920, 720));
        getContentPane().setLayout(null);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(629, 419, 79, 23);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(629, 315, 190, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Admin Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(546, 223, 189, 57);

        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(498, 320, 90, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Customer Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(118, 197, 278, 109);

        jLabel1.setText("Passport ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(55, 320, 110, 14);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 360, 100, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(192, 315, 190, 20);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Login");
        jButton1.setToolTipText("Click To Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(182, 419, 90, 23);

        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(495, 360, 90, 14);

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(303, 419, 79, 23);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(192, 357, 190, 20);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(629, 357, 190, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/air-new-login.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1110, 740);

        setBounds(-5, -35, 1104, 762);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JDesktopPane desktopPane = getDesktopPane();
        String user = jTextField3.getText();
        String pass = new String(jPasswordField2.getPassword());
        Admin a = new Admin();

        if (a.adminLogin(user, pass)) {
            Adminlogin al = new Adminlogin();
            desktopPane.add(al);
            al.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: Username or password incorrect");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDesktopPane desktopPane = getDesktopPane();
        String user = jTextField1.getText();
        String pass = new String(jPasswordField1.getPassword());
        Passenger cus = new Passenger();
        if (cus.passengerLogin(user, pass)) {
            Customerlogin cr = new Customerlogin(user);
            desktopPane.add(cr);
            cr.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: Username or password incorrect");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDesktopPane desktopPane = getDesktopPane();
        Custormerregister cr = new Custormerregister();
        desktopPane.add(cr);
        cr.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
