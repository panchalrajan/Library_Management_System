
import classes.ConnectionProvider;
import java.sql.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author color
 */
public class Add_Student extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Add_Student() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        student_roll_no_label_ = new javax.swing.JLabel();
        student_name_label_ = new javax.swing.JLabel();
        add_student_button_ = new javax.swing.JButton();
        back_button_ = new javax.swing.JButton();
        dtuName_label_ = new javax.swing.JLabel();
        fathers_name_label_ = new javax.swing.JLabel();
        fathers_name_field_ = new javax.swing.JTextField();
        admission_year_label_ = new javax.swing.JLabel();
        admission_year_field_ = new javax.swing.JTextField();
        branch_label_ = new javax.swing.JLabel();
        student_roll_no_field_ = new javax.swing.JTextField();
        student_name_field_ = new javax.swing.JTextField();
        branch_field_ = new javax.swing.JComboBox<>();
        reset_button_ = new javax.swing.JButton();
        gender_label_ = new javax.swing.JLabel();
        gender_field_ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        student_roll_no_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_roll_no_label_.setText("STUDENT ROLL NO.");

        student_name_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_name_label_.setText("STUDENT NAME :");

        add_student_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_student_button_.setText("ADD");
        add_student_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_student_button_ActionPerformed(evt);
            }
        });

        back_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button_.setText("BACK");
        back_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_ActionPerformed(evt);
            }
        });

        dtuName_label_.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtuName_label_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dtuName_label_.setText("ADD STUDENT");

        fathers_name_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fathers_name_label_.setText("FATHER'S NAME :");

        fathers_name_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        admission_year_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        admission_year_label_.setText("ADMISSION YEAR :");

        admission_year_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        branch_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branch_label_.setText("BRANCH :");

        student_roll_no_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        student_name_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_name_field_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_field_ActionPerformed(evt);
            }
        });

        branch_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branch_field_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIVIL ", "CHEMICAL", "ELECTRICAL", "MECHANICAL ", "ENVIRONMENT", "BIOTECHNOLOGY", "COMPUTER SCIENCE", "PRODUCTION & INDUSTRIAL", "INFORMATION TECHNOLOGY", "MATHEMATICS & COMPUTATION" }));
        branch_field_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_field_ActionPerformed(evt);
            }
        });

        reset_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset_button_.setText("RESET");
        reset_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_button_ActionPerformed(evt);
            }
        });

        gender_label_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender_label_.setText("GENDER :");

        gender_field_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender_field_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtuName_label_, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_name_label_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(400, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_student_button_)
                                .addGap(25, 25, 25)
                                .addComponent(reset_button_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back_button_))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(branch_label_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(admission_year_label_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fathers_name_label_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(student_roll_no_label_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(gender_label_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(student_name_field_)
                                    .addComponent(fathers_name_field_)
                                    .addComponent(admission_year_field_)
                                    .addComponent(student_roll_no_field_)
                                    .addComponent(branch_field_, javax.swing.GroupLayout.Alignment.TRAILING, 0, 400, Short.MAX_VALUE)
                                    .addComponent(gender_field_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(dtuName_label_)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_roll_no_label_)
                    .addComponent(student_roll_no_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_name_label_)
                    .addComponent(student_name_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label_)
                    .addComponent(gender_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fathers_name_label_)
                    .addComponent(fathers_name_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admission_year_label_)
                    .addComponent(admission_year_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branch_label_)
                    .addComponent(branch_field_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_button_)
                    .addComponent(add_student_button_)
                    .addComponent(reset_button_))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_student_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_student_button_ActionPerformed
        //Add student and show conformation
        String roll_no  = student_roll_no_field_.getText();
        String student_name = student_name_field_.getText();
        String fathers_name = fathers_name_field_.getText();
        String gender = (String)gender_field_.getSelectedItem();
        String admission_year = admission_year_field_.getText();
        String branch = (String)branch_field_.getSelectedItem();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into students(ROLL_NO, STUDENT_NAME, FATHERS_NAME, GENDER, ADMISSION_YEAR, BRANCH) values('"+roll_no+"' , '"+student_name+"', '"+fathers_name+"', '"+gender+"', '"+admission_year+"', '"+branch+"')");
            JOptionPane.showInternalConfirmDialog(null, "STUDENT ADDED SUCCESSFULLY", "STUDENT ADDED",JOptionPane.PLAIN_MESSAGE);
            setVisible(false);
            new Add_Student().setVisible(true);
        } catch(Exception err) {
            JOptionPane.showInternalMessageDialog(null, err);
        }
    }//GEN-LAST:event_add_student_button_ActionPerformed

    private void back_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_ActionPerformed
        // Open Admin Page
        setVisible(false);
        new Admin_Home_Page().setVisible(true); 
        
    }//GEN-LAST:event_back_button_ActionPerformed

    private void branch_field_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_field_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branch_field_ActionPerformed

    private void student_name_field_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_field_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_field_ActionPerformed

    private void reset_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_button_ActionPerformed
        //Clear all fields
        setVisible(false);
        new Add_Student().setVisible(true);
        
    }//GEN-LAST:event_reset_button_ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_student_button_;
    private javax.swing.JTextField admission_year_field_;
    private javax.swing.JLabel admission_year_label_;
    private javax.swing.JButton back_button_;
    private javax.swing.JComboBox<String> branch_field_;
    private javax.swing.JLabel branch_label_;
    private javax.swing.JLabel dtuName_label_;
    private javax.swing.JTextField fathers_name_field_;
    private javax.swing.JLabel fathers_name_label_;
    private javax.swing.JComboBox<String> gender_field_;
    private javax.swing.JLabel gender_label_;
    private javax.swing.JButton reset_button_;
    private javax.swing.JTextField student_name_field_;
    private javax.swing.JLabel student_name_label_;
    private javax.swing.JTextField student_roll_no_field_;
    private javax.swing.JLabel student_roll_no_label_;
    // End of variables declaration//GEN-END:variables

}