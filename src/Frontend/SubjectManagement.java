/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.Color;
import javax.swing.BorderFactory;
import Backend.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aqibm
 */
public class SubjectManagement extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
   ClassBean classnames = new ClassBean();
   TeacherBean teachernames = new TeacherBean();
   ArrayList<ClassBean> getAllClasses = new ArrayList<>();
   ArrayList<TeacherBean> getAllTeachers = new ArrayList<>();
   ArrayList<SubjectBean> getAllSubjects = new ArrayList<>();
   SubjectBean allsubject = new SubjectBean();
    public SubjectManagement() {
        initComponents();
        setLocationRelativeTo(null);
        getAllClasses = classnames.getAllClasses();
        getAllTeachers = teachernames.getAllTeachers();
        for(int i=0;i<getAllClasses.size();i++){
            classnames= getAllClasses.get(i);
            allclasses.addItem(classnames.getClassName());
        }
        for(int i=0;i<getAllTeachers.size();i++){
            teachernames= getAllTeachers.get(i);
            allteachers.addItem(teachernames.getFirstname());
        }
        showsubjects();
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
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subjectname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        allclasses = new javax.swing.JComboBox();
        AddSubject = new javax.swing.JButton();
        ViewSubject = new javax.swing.JButton();
        updateSubject = new javax.swing.JButton();
        DeleteSubject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Subject_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        allteachers = new javax.swing.JComboBox();
        subjectcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subject Management");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/back.png"))); // NOI18N
        jLabel9.setText("Back");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Subject Name");

        subjectname.setBorder(BorderFactory.createLineBorder(Color.decode("#e0dad7"),1,true)
        );
        subjectname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Class");

        allclasses.setBorder(BorderFactory.createLineBorder(Color.decode("#e0dad7"),1,true));

        AddSubject.setBackground(new java.awt.Color(255, 102, 51));
        AddSubject.setForeground(new java.awt.Color(255, 255, 255));
        AddSubject.setText("ADD");
        AddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectActionPerformed(evt);
            }
        });

        ViewSubject.setBackground(new java.awt.Color(255, 102, 51));
        ViewSubject.setForeground(new java.awt.Color(255, 255, 255));
        ViewSubject.setText("View");
        ViewSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSubjectActionPerformed(evt);
            }
        });

        updateSubject.setBackground(new java.awt.Color(255, 102, 51));
        updateSubject.setForeground(new java.awt.Color(255, 255, 255));
        updateSubject.setText("UPDATE");

        DeleteSubject.setBackground(new java.awt.Color(255, 102, 51));
        DeleteSubject.setForeground(new java.awt.Color(255, 255, 255));
        DeleteSubject.setText("DELETE");

        Subject_table.setBorder(BorderFactory.createLineBorder(Color.decode("#e0dad7"),1,true));
        Subject_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SubjectID", "Subject Name", "Subject Teacher", "Class Of Subject", "Subject Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Subject_table);
        Subject_table.getTableHeader().setOpaque(false);
        Subject_table.getTableHeader().setBackground(Color.decode("#ff6633"));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Teacher");

        allteachers.setBorder(BorderFactory.createLineBorder(Color.decode("#e0dad7"),1,true));

        subjectcode.setBorder(BorderFactory.createLineBorder(Color.decode("#e0dad7"),1,true)
        );
        subjectcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectcodeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Subject Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(subjectname)
                                .addComponent(allclasses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allteachers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(subjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(allclasses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(allteachers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewSubjectActionPerformed

    private void subjectnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectnameActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        ClassManagement classScreen = new ClassManagement();
        classScreen.show();
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void subjectcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectcodeActionPerformed

    private void AddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectActionPerformed
        // TODO add your handling code here:
        int index = allclasses.getSelectedIndex();
        classnames = getAllClasses.get(index);
        int classid = classnames.getClassID();
        int teacherindex = allteachers.getSelectedIndex();
        teachernames = getAllTeachers.get(teacherindex);
        int teacherid = teachernames.getTeacherId();
        String SubjectName = subjectname.getText();
        String SubjectCode = subjectcode.getText();
        String message = allsubject.addSubject(SubjectName, SubjectCode, classid, teacherid);
        JOptionPane.showMessageDialog(this,message);
        showsubjects();
    }//GEN-LAST:event_AddSubjectActionPerformed
    public void showsubjects(){
        getAllSubjects = allsubject.getallSubjects();
        Object[] rowdata = new Object[5];
        DefaultTableModel model = (DefaultTableModel)Subject_table.getModel();
        for(int i=0;i<getAllSubjects.size();i++){
            allsubject = getAllSubjects.get(i);
            rowdata[0] = allsubject.getSubjectId();
            rowdata[1] = allsubject.getSubjectName();
            rowdata[2] = allsubject.getSubjectCode();
            rowdata[3] = allsubject.getClassName();
            rowdata[4] = allsubject.getTeacherName();
            model.addRow(rowdata);
        }
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
            java.util.logging.Logger.getLogger(SubjectManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubject;
    private javax.swing.JButton DeleteSubject;
    private javax.swing.JTable Subject_table;
    private javax.swing.JButton ViewSubject;
    private javax.swing.JComboBox allclasses;
    private javax.swing.JComboBox allteachers;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField subjectcode;
    private javax.swing.JTextField subjectname;
    private javax.swing.JButton updateSubject;
    // End of variables declaration//GEN-END:variables
}
