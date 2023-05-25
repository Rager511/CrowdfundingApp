/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package managmentsystem.crowdfundingproject;


public class adminpage extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
       public adminpage() {
        initComponents();
    }
    public adminpage(String text) {
        initComponents();
        jLabel1.setText(text);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view_project = new javax.swing.JButton();
        add_project = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        delete_project1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateproject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view_project.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view_project.setText("VIEW PROJECT");
        view_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_projectActionPerformed(evt);
            }
        });

        add_project.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add_project.setText("ADD PROJECT");
        add_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_projectActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        delete_project1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete_project1.setText("DELETE PROJECT");
        delete_project1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_project1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YOU ARE LOGGED IN WITH THIS EMAIL");

        updateproject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateproject.setText("UPDATE PROJECT");
        updateproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateprojectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateproject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_project)
                        .addGap(28, 28, 28)
                        .addComponent(view_project)
                        .addGap(18, 18, 18)
                        .addComponent(delete_project1)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_project)
                    .addComponent(add_project)
                    .addComponent(delete_project1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(updateproject))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_projectActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new viewlist().setVisible(true);
    }//GEN-LAST:event_view_projectActionPerformed

    private void add_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_projectActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addproject().setVisible(true);
    }//GEN-LAST:event_add_projectActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void delete_project1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_project1ActionPerformed

        setVisible(false);
        new deleteproject().setVisible(true);

    }//GEN-LAST:event_delete_project1ActionPerformed

    private void updateprojectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateprojectActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateproject().setVisible(true);
    }//GEN-LAST:event_updateprojectActionPerformed

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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
  
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_project;
    private javax.swing.JButton delete_project1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton updateproject;
    private javax.swing.JButton view_project;
    // End of variables declaration//GEN-END:variables
}