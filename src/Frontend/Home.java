/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import javax.swing.JPanel;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultmanagement = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        feesmanagement = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        studentManagemnt = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        StudentManagement = new javax.swing.JLabel();
        teachermanagement = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        classmanagement = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("School Management");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("E Learning");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/navigation.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 100));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logout");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 70, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        resultmanagement.setBackground(java.awt.SystemColor.controlHighlight);
        resultmanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultmanagementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultmanagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultmanagementMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Report Card");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Report Card.png"))); // NOI18N

        javax.swing.GroupLayout resultmanagementLayout = new javax.swing.GroupLayout(resultmanagement);
        resultmanagement.setLayout(resultmanagementLayout);
        resultmanagementLayout.setHorizontalGroup(
            resultmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultmanagementLayout.createSequentialGroup()
                .addGroup(resultmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultmanagementLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel22))
                    .addGroup(resultmanagementLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        resultmanagementLayout.setVerticalGroup(
            resultmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultmanagementLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        jPanel1.add(resultmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 140, 120));

        feesmanagement.setBackground(java.awt.SystemColor.controlHighlight);
        feesmanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feesmanagementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feesmanagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feesmanagementMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                feesmanagementMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Fees Management");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/fees (2).png"))); // NOI18N

        javax.swing.GroupLayout feesmanagementLayout = new javax.swing.GroupLayout(feesmanagement);
        feesmanagement.setLayout(feesmanagementLayout);
        feesmanagementLayout.setHorizontalGroup(
            feesmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feesmanagementLayout.createSequentialGroup()
                .addGroup(feesmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feesmanagementLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(feesmanagementLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel17)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        feesmanagementLayout.setVerticalGroup(
            feesmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feesmanagementLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jPanel1.add(feesmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 120));

        studentManagemnt.setBackground(java.awt.SystemColor.controlHighlight);
        studentManagemnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentManagemntMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentManagemntMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentManagemntMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentManagemntMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Students");

        StudentManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/309041_users_group_people_icon.png"))); // NOI18N

        javax.swing.GroupLayout studentManagemntLayout = new javax.swing.GroupLayout(studentManagemnt);
        studentManagemnt.setLayout(studentManagemntLayout);
        studentManagemntLayout.setHorizontalGroup(
            studentManagemntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentManagemntLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(studentManagemntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentManagemntLayout.createSequentialGroup()
                        .addComponent(StudentManagement)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(studentManagemntLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        studentManagemntLayout.setVerticalGroup(
            studentManagemntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentManagemntLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(StudentManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );

        jPanel1.add(studentManagemnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 140, 120));

        teachermanagement.setBackground(java.awt.SystemColor.controlHighlight);
        teachermanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachermanagementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teachermanagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teachermanagementMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Teacher");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/3289566_assistant_educator_professor_showing_teacher_icon.png"))); // NOI18N

        javax.swing.GroupLayout teachermanagementLayout = new javax.swing.GroupLayout(teachermanagement);
        teachermanagement.setLayout(teachermanagementLayout);
        teachermanagementLayout.setHorizontalGroup(
            teachermanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachermanagementLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(teachermanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel7))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        teachermanagementLayout.setVerticalGroup(
            teachermanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachermanagementLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );

        jPanel1.add(teachermanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 140, 120));

        classmanagement.setBackground(java.awt.SystemColor.controlHighlight);
        classmanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classmanagementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classmanagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classmanagementMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Classes");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/3671792_list_icon.png"))); // NOI18N

        javax.swing.GroupLayout classmanagementLayout = new javax.swing.GroupLayout(classmanagement);
        classmanagement.setLayout(classmanagementLayout);
        classmanagementLayout.setHorizontalGroup(
            classmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classmanagementLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(classmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21))
                .addGap(44, 44, 44))
        );
        classmanagementLayout.setVerticalGroup(
            classmanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classmanagementLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(29, 29, 29))
        );

        jPanel1.add(classmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classmanagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classmanagementMouseExited
        // TODO add your handling code here:
        resetColor(classmanagement);
    }//GEN-LAST:event_classmanagementMouseExited

    private void classmanagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classmanagementMouseEntered
        // TODO add your handling code here:
        setColor(classmanagement);
    }//GEN-LAST:event_classmanagementMouseEntered

    private void teachermanagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachermanagementMouseExited
        // TODO add your handling code here:
        resetColor(teachermanagement);
    }//GEN-LAST:event_teachermanagementMouseExited

    private void teachermanagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachermanagementMouseEntered
        // TODO add your handling code here
        setColor(teachermanagement);
    }//GEN-LAST:event_teachermanagementMouseEntered

    private void studentManagemntMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentManagemntMousePressed
        // TODO add your handling code here:
        //just a sample.
        Home std = new Home();
        std.setVisible(true);
    }//GEN-LAST:event_studentManagemntMousePressed

    private void studentManagemntMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentManagemntMouseExited
        // TODO add your handling code here:
        resetColor(studentManagemnt);
    }//GEN-LAST:event_studentManagemntMouseExited

    private void studentManagemntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentManagemntMouseEntered
        // TODO add your handling code here:
        setColor(studentManagemnt);
    }//GEN-LAST:event_studentManagemntMouseEntered

    private void feesmanagementMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesmanagementMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesmanagementMousePressed

    private void feesmanagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesmanagementMouseExited
        // TODO add your handling code here:
        resetColor(feesmanagement);
    }//GEN-LAST:event_feesmanagementMouseExited

    private void feesmanagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesmanagementMouseEntered
        // TODO add your handling code here:
        setColor(feesmanagement);
    }//GEN-LAST:event_feesmanagementMouseEntered

    private void resultmanagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultmanagementMouseExited
        // TODO add your handling code here:
        resetColor(resultmanagement);
    }//GEN-LAST:event_resultmanagementMouseExited

    private void resultmanagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultmanagementMouseEntered
        // TODO add your handling code here:
        setColor(resultmanagement);
    }//GEN-LAST:event_resultmanagementMouseEntered

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void studentManagemntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentManagemntMouseClicked
        // TODO add your handling code here:
        Students std = new Students();
        std.show();
        dispose();
    }//GEN-LAST:event_studentManagemntMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void feesmanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesmanagementMouseClicked
        // TODO add your handling code here:
        FeesManagement feesManagement = new FeesManagement();
        feesManagement.show();
        dispose();
    }//GEN-LAST:event_feesmanagementMouseClicked

    private void teachermanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachermanagementMouseClicked
        // TODO add your handling code here:
        Teacher teacher = new Teacher();
        teacher.show();
        dispose();
    }//GEN-LAST:event_teachermanagementMouseClicked

    private void classmanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classmanagementMouseClicked
        // TODO add your handling code here:
        ClassManagement manageclass = new ClassManagement();
        manageclass.show();
        dispose();
    }//GEN-LAST:event_classmanagementMouseClicked

    private void resultmanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultmanagementMouseClicked
        // TODO add your handling code here:
        ResultManagement manageresult = new ResultManagement();
        manageresult.show();
        dispose();
    }//GEN-LAST:event_resultmanagementMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
     
    
    
    
    int xx,xy; public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
 }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudentManagement;
    private javax.swing.JPanel classmanagement;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel feesmanagement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel resultmanagement;
    private javax.swing.JPanel studentManagemnt;
    private javax.swing.JPanel teachermanagement;
    // End of variables declaration//GEN-END:variables
}
