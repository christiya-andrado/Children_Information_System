
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class editlev extends javax.swing.JInternalFrame {

    /**
     * Creates new form editlev
     */
    public editlev() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI bui=(BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        filltbl();
    }
    
    
     public void filltbl(){
        DefaultTableModel df=new DefaultTableModel();
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");

            String sql="select * from leavinginfo";
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();

            int c;
            c=rss.getColumnCount();
            df=(DefaultTableModel)table.getModel();
            df.setRowCount(0);

            while(rs.next()){
                Vector v=new Vector();
                for(int a=1; a<c; a++)
                {
                    v.add(rs.getString("child_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("eduqualification"));
                    v.add(rs.getString("leaving_status"));
                    v.add(rs.getString("leave_date"));

                }
                df.addRow(v);
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
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
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_other = new javax.swing.JTextField();
        txt_lvdate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Edit Leaving Information");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Child ID");

        txt_cid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Full Name");

        txt_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Educational Qualification");

        cb_edu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cb_edu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the Qualification", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "O\\L Complete", "Grade 12", "A\\L Complete", "Pre-School" }));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Date of Leave");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setText("Leaving with");

        cb_leave.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cb_leave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Leaving ", "With Parent", "With a Job", "Married", "Other" }));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "Full Name", "Edu Qualification", "Date of Leave", "Leaving With"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("Search By");

        txt_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_otherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lvdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_edu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_leave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_edu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_lvdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_leave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(txt_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        setBounds(30, 2, 818, 649);
    }// </editor-fold>//GEN-END:initComponents

    public void clearl(){
        txt_cid.setText("");
        txt_name.setText("");
        cb_edu.setSelectedIndex(0);
        cb_leave.setSelectedIndex(0);
        txt_lvdate.setText("");
        //dc_leave.setDate(null);
        txt_other.setText("");
            
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        clearl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed

     /* String ts=txt_search.getText();
               
            try{
            String sql="select * from leavinginfo where child_id and name like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)table.getModel();
            
            
            if(rs.next()){
                
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
        
    }//GEN-LAST:event_txt_searchActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        try{
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
        int row=table.getSelectedRow();
        String select=table.getModel().getValueAt(row, 0).toString();
        String sql="select * from leavinginfo where child_id="+select;
        
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        
        if(rs.next()){
            txt_cid.setText(rs.getString("child_id"));
            txt_name.setText(rs.getString("name"));
            cb_edu.setSelectedItem(rs.getString("eduqualification"));
            
            txt_lvdate.setText(rs.getString("leave_date"));
           
            /* String date=rs.getString("leave_date");
          ((JTextField)dc_leave.getDateEditor().getUiComponent()).setText(date);*/
    
          cb_leave.setSelectedItem(rs.getString("leaving_status"));
          
               if(cb_leave.getSelectedIndex()==1 || cb_leave.getSelectedIndex()==2 || cb_leave.getSelectedIndex()==3){
                   
                  
                   cb_leave.setSelectedItem(rs.getString("leaving_status"));
                   txt_other.setText("");
               }
               
               else{
                   cb_leave.setSelectedIndex(4);
                    txt_other.setText(rs.getString("Leaving_status"));
               }
         
            
            
            
        }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_tableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="update leavinginfo set name=? ,eduqualification=? ,leaving_status=? ,leave_date=?  where child_id=? ";
            
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,txt_name.getText());
          
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
               if(cb_edu.getSelectedIndex()==14){
                
                edu="Pre-School";
            }
               pst.setString(2,edu);
               
               
               
              /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
              String date=sdf.format(dc_leave.getDate());
              pst.setString(3,date);*/
             
              
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
               
              pst.setString(3,status); 
              pst.setString(4, txt_lvdate.getText());
              pst.setString(5,txt_cid.getText());
           
          
             pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Successfully Updated");
           clearl();
            filltbl();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="delete from leavinginfo where child_id=? ";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, txt_cid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Record Deleted");
            filltbl();
            clearl();
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_otherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_otherActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        String name=txt_search.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) table.getModel();
         int r=table.getRowCount();
         while(r-->0){
             
             dtm.removeRow(r);
             
                   
         }
  try{
       ResultSet rs=dbhelperlev.getData(name);
       while(rs.next()){
           java.util.Vector v=new  java.util.Vector();
           v.add(rs.getString("child_id"));
           v.add(rs.getString("name"));
           v.add(rs.getString("eduqualification"));
           v.add(rs.getString("leaving_status"));
           v.add(rs.getString("Leave_date"));
          
           dtm.addRow(v);
           
       }
     }
  catch(Exception ex){
      
      JOptionPane.showMessageDialog(null,ex);
  }
        
        /*  String ts=txt_search.getText();
               
            try{
            String sql="select * from leavinginfo where child_id and name like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)table.getModel();
            
           if(rs.next()){ 
       
              model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
              
           }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_searchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_edu;
    private javax.swing.JComboBox cb_leave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_lvdate;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
