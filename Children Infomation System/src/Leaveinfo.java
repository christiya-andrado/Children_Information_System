/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
public class Leaveinfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Leaveinfo
     */
    public Leaveinfo() {
        initComponents();
        
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI bui=(BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
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
        txt_cid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_edu = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_leave = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_other = new javax.swing.JTextField();
        txt_levdate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Leaving Information");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel2.setText("Child ID");

        txt_cid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txt_cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel3.setText("Full Name");

        txt_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel7.setText("Educational Qualification");

        cb_edu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_edu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the Qualification", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "O\\L Complete", "Grade 12", "A\\L Complete", "Pre-School" }));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel8.setText("Date of Leave");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel9.setText("Leaving Reason");

        cb_leave.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_leave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Leaving ", "With Parent", "With a Job", "Married", "Other" }));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_levdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_levdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_edu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_leave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_levdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton2)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_edu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_leave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_levdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        setBounds(30, 2, 818, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(cb_edu.getSelectedIndex()==0 || cb_leave.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Please Select the Related leaving status or educational qualification");
            }
            else{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="insert into leavinginfo(child_id,name,eduqualification,leaving_status,leave_date) values (?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,txt_cid.getText());
            pst.setString(2,txt_name.getText());
            
            String edu = null;
           
            if(cb_edu.getSelectedIndex()==1){
                
                edu="Grade 1";
            }
            if(cb_edu.getSelectedIndex()==2){
                
                edu="Grade 2";
            }
            if(cb_edu.getSelectedIndex()==3){
                
                edu="Grade 3";
            }
            if(cb_edu.getSelectedIndex()==4){
                
                edu="Grade 4";
            }
            if(cb_edu.getSelectedIndex()==5){
                
                edu="Grade 5";
            }
            if(cb_edu.getSelectedIndex()==6){
                
                edu="Grade 6";
            }
            if(cb_edu.getSelectedIndex()==7){
                
                edu="Grade 7";
            }
            if(cb_edu.getSelectedIndex()==8){
                
                edu="Grade 8";
            }
            if(cb_edu.getSelectedIndex()==9){
                
                edu="Grade 9";
            }
            if(cb_edu.getSelectedIndex()==10){
                
                edu="Grade 10";
            }
            if(cb_edu.getSelectedIndex()==11){
                
                edu="O/L Completed";
            }
             if(cb_edu.getSelectedIndex()==12){
                
                edu="Grade 12";
            }
              if(cb_edu.getSelectedIndex()==13){
                
                edu="A/L Completed";
            }
               if(cb_edu.getSelectedIndex()==11){
                
                edu="Pre-School";
            }
               pst.setString(3,edu);
               
               String status = null;
             
               if(cb_leave.getSelectedIndex()==1){
                   
                   status="With Parent";
               }
               if(cb_leave.getSelectedIndex()==2){
                   
                   status="With a Job";
               }
               if(cb_leave.getSelectedIndex()==3){
                   
                   status="Married";
               }
               if(cb_leave.getSelectedIndex()==4){
                   
                   status=txt_other.getText();
               }
               
            pst.setString(4,status);
           
            pst.setString(5,txt_levdate.getText());
             /* SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
              String date=sdf.format(dc_leave.getDate());
              pst.setString(3,date);*/
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Submited");
            clearl();
            }
            
                               
            } catch (Exception ex) {
                
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void clearl(){
        txt_cid.setText("");
        txt_name.setText("");
        cb_edu.setSelectedIndex(0);
        cb_leave.setSelectedIndex(0);
        txt_levdate.setText("");
        //dc_leave.setDate(null);
        txt_other.setText("");
            
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        clearl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_levdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_levdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_levdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_edu;
    private javax.swing.JComboBox cb_leave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_levdate;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_other;
    // End of variables declaration//GEN-END:variables

    private static class txt_name {

        public txt_name() {
        }
    }
}