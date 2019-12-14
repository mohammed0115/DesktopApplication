/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mano
 */
public class Insert_patiant extends javax.swing.JFrame {
    private java.sql.ResultSet ResultSet;
    private java.sql.Connection Connection;
    private java.sql.Statement Statement;

    /**
     * Creates new form In_patiant
     */
    public Insert_patiant() {
        initComponents();
        this.age.setText("00");
    }

   public int gender(String  sex)
   
   {
   int i=0;
    try {
     Connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root", "");
            Statement =Connection.createStatement();
            ResultSet=Statement.executeQuery("SELECT * FROM `sex` WHERE `name`='"+sex+"'  ");
          
         
         
           while(ResultSet.next())
           {
          // this.cID.removeAllItems();
         i= ResultSet.getInt("id");
              
          
           }
  
  
            // TODO add your handling code here:
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex.getMessage() );
        }
       
       
   
   return i;
   }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        patienttype = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        patientname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        phoneres = new javax.swing.JTextField();
        phonemob = new javax.swing.JTextField();
        SaveEmployee = new javax.swing.JButton();
        UpdateEmployee = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        FirstEmployee1 = new javax.swing.JButton();
        nextEmployee1 = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        lastEmployee2 = new javax.swing.JButton();
        ResetEmploye = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("patient Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("age ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("mobile");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male","Female" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("gender");

        patienttype.setBackground(new java.awt.Color(51, 51, 51));
        patienttype.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        patienttype.setForeground(new java.awt.Color(51, 0, 0));
        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"In-Patient", "Out-Patient" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("patient type");

        SaveEmployee.setBackground(new java.awt.Color(51, 51, 51));
        SaveEmployee.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        SaveEmployee.setForeground(new java.awt.Color(51, 0, 0));
        SaveEmployee.setText("save");
        SaveEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEmployeeActionPerformed(evt);
            }
        });

        UpdateEmployee.setBackground(new java.awt.Color(51, 51, 51));
        UpdateEmployee.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        UpdateEmployee.setForeground(new java.awt.Color(51, 0, 0));
        UpdateEmployee.setText("update");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 0, 0));
        jButton7.setText("delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        FirstEmployee1.setBackground(new java.awt.Color(51, 51, 51));
        FirstEmployee1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        FirstEmployee1.setForeground(new java.awt.Color(51, 0, 0));
        FirstEmployee1.setText("first");
        FirstEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstEmployee1ActionPerformed(evt);
            }
        });

        nextEmployee1.setBackground(new java.awt.Color(51, 51, 51));
        nextEmployee1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        nextEmployee1.setForeground(new java.awt.Color(51, 0, 0));
        nextEmployee1.setText("second");
        nextEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextEmployee1ActionPerformed(evt);
            }
        });

        previous.setBackground(new java.awt.Color(51, 51, 51));
        previous.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        previous.setForeground(new java.awt.Color(51, 0, 0));
        previous.setText("prevous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        lastEmployee2.setBackground(new java.awt.Color(51, 51, 51));
        lastEmployee2.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lastEmployee2.setForeground(new java.awt.Color(51, 0, 0));
        lastEmployee2.setText("last");
        lastEmployee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastEmployee2ActionPerformed(evt);
            }
        });

        ResetEmploye.setBackground(new java.awt.Color(51, 51, 51));
        ResetEmploye.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        ResetEmploye.setForeground(new java.awt.Color(51, 0, 0));
        ResetEmploye.setText("reset");
        ResetEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetEmployeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(ResetEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lastEmployee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nextEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FirstEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patienttype, 0, 195, Short.MAX_VALUE)
                            .addComponent(patientname)
                            .addComponent(address)
                            .addComponent(age)
                            .addComponent(phoneres)
                            .addComponent(phonemob))))
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(256, 256, 256)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(patientname, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(phoneres, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonemob, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patienttype, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(previous, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastEmployee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetEmploye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEmployeeActionPerformed
        /*
         *
         */

        try {
      
      
      
      
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root", "");
            Statement statement = (Statement) connection.createStatement();
            int x=0;
      if(patienttype.getSelectedItem().toString().equals("Out-Patient")){x=1;}
      else x=2;
                     statement.execute("INSERT INTO `hospital`.`patientinfo` (`pid`, `patientname`, `age`, `gender`, `address`, `phoneres`, `phonemob`,`patienttype`) "
                             + "VALUES (NULL, '"+patientname.getText()+"', '"+age.getText()+"', '"+this.gender(this.gender.getSelectedItem().toString())+"', '"+address.getText().trim()+"', "
                             + "'"+phoneres.getText()+"', '"+phonemob.getText()+"', '"+x+"');");
            
            
            this.patientname.setText(" ");
            this.age.setText("00");
            this.address.setText("   ");
            this.phoneres.setText("  ");
            this.phonemob.setText("   ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"  45");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SaveEmployeeActionPerformed

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed

        try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root", "");
            Statement statement = (Statement) connection.createStatement();
            statement.execute("UPDATE `patientinfo` SET  "
                    + "`age`= '" + this.age.getText() + "', "
                    + "`address`='" + address + "',`patienttype`='" + this.patienttype.getSelectedItem() + "',"
                    + "`phoneres`='" + this.phoneres.getText() + "',`gender`='" + this.gender.getSelectedItem() + "',`phonemob`='" + this.phonemob.getText() + "'"
                    + "where `patientname`='" + this.patientname.getText() + "'");

            this.patientname.setText(" ");
            this.age.setText("00");
            this.address.setText("   ");
            this.phoneres.setText("  ");
            this.phonemob.setText("   ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root", "");
            Statement statement = (Statement) connection.createStatement();
           statement.execute("DELETE FROM `patientinfo` WHERE `patientname`='" + this.patientname.getText() + "';");
         JOptionPane.showMessageDialog(rootPane, "successfully deleted");
         
         
          this.patientname.setText(" ");
            this.age.setText("00");
            this.address.setText("   ");
            this.phoneres.setText("  ");
            this.phonemob.setText("   ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void FirstEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstEmployee1ActionPerformed

        try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root", "");
            Statement statement = (Statement) connection.createStatement();
            ResultSet = statement.executeQuery("SELECT `pid`, `patientname`, `age`, `gender`, `address`, `phoneres`, `phonemob`, `patienttype` FROM `patientinfo` WHERE 1");

            if (ResultSet.first()) {
                this.patientname.setText(ResultSet.getString("patientname"));
                this.age.setText(ResultSet.getString("age"));
                this.address.setText(ResultSet.getString("address"));
                this.gender.setSelectedItem(ResultSet.getObject("gender"));
                this.patienttype.setSelectedItem(ResultSet.getObject("patienttype"));
                this.address.setText(ResultSet.getString("address"));
              
                this.phonemob.setText(ResultSet.getString("phonemob"));
                this.phoneres.setText(ResultSet.getString("phoneres"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_FirstEmployee1ActionPerformed

    private void nextEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextEmployee1ActionPerformed

        try {

            if (ResultSet.next()) {
                this.patientname.setText(ResultSet.getString("patientname"));
                this.age.setText(ResultSet.getString("age"));
                this.address.setText(ResultSet.getString("address"));
                this.gender.setSelectedItem(ResultSet.getObject("gender"));
                this.patienttype.setSelectedItem(ResultSet.getObject("patienttype"));
                this.address.setText(ResultSet.getString("address"));
              
                this.phonemob.setText(ResultSet.getString("phonemob"));
                this.phoneres.setText(ResultSet.getString("phoneres"));
            } else {
                ResultSet.first();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_nextEmployee1ActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed

        try {

            if (ResultSet.previous()) {
                this.patientname.setText(ResultSet.getString("patientname"));
                this.age.setText(ResultSet.getString("age"));
                this.address.setText(ResultSet.getString("address"));
                this.gender.setSelectedItem(ResultSet.getObject("gender"));
                this.patienttype.setSelectedItem(ResultSet.getObject("patienttype"));
                this.address.setText(ResultSet.getString("address"));
              
                this.phonemob.setText(ResultSet.getString("phonemob"));
                this.phoneres.setText(ResultSet.getString("phoneres"));
            } else {
                ResultSet.last();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_previousActionPerformed

    private void lastEmployee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastEmployee2ActionPerformed

        try {

        if (ResultSet.last()) {
                this.patientname.setText(ResultSet.getString("patientname"));
                this.age.setText(ResultSet.getString("age"));
                this.address.setText(ResultSet.getString("address"));
                this.gender.setSelectedItem(ResultSet.getObject("gender"));
                this.patienttype.setSelectedItem(ResultSet.getObject("patienttype"));
                this.address.setText(ResultSet.getString("address"));
              
                this.phonemob.setText(ResultSet.getString("phonemob"));
                this.phoneres.setText(ResultSet.getString("phoneres"));
            } else {
                ResultSet.first();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lastEmployee2ActionPerformed

    private void ResetEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetEmployeActionPerformed
            this.patientname.setText(" ");
            this.age.setText("00");
            this.address.setText("   ");
            this.phoneres.setText("  ");
            this.phonemob.setText("   ");
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetEmployeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insert_patiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_patiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_patiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_patiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Insert_patiant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FirstEmployee1;
    private javax.swing.JButton ResetEmploye;
    private javax.swing.JButton SaveEmployee;
    private javax.swing.JButton UpdateEmployee;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lastEmployee2;
    private javax.swing.JButton nextEmployee1;
    private javax.swing.JTextField patientname;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phonemob;
    private javax.swing.JTextField phoneres;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
