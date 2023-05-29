
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
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
public class editdoc extends javax.swing.JInternalFrame {

    /**
     * Creates new form editdoc
     */
    public editdoc() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI bui=(BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        filltbd();
    }

    
    public void filltbd(){
            
            DefaultTableModel df=new DefaultTableModel();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from document";
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
                    v.add(rs.getString("bc_no"));
                    v.add(rs.getString("nic_no"));
                    v.add(rs.getString("leaving"));
                    v.add(rs.getString("other1"));
                    v.add(rs.getString("other2"));
             
                    
                    
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
        cbbc = new javax.swing.JCheckBox();
        txt_bc = new javax.swing.JTextField();
        cbsl = new javax.swing.JCheckBox();
        txt_sc = new javax.swing.JTextField();
        cbnic = new javax.swing.JCheckBox();
        txt_nic = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_o1 = new javax.swing.JTextField();
        cbo1 = new javax.swing.JCheckBox();
        cbo2 = new javax.swing.JCheckBox();
        txt_o2 = new javax.swing.JTextField();
        txt_search = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Document Information");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Child ID");

        txt_cid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N

        cbbc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbbc.setText("Birth Certificate");

        cbsl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbsl.setText("School leaving");

        cbnic.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbnic.setText("NIC");
        cbnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnicActionPerformed(evt);
            }
        });

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

        cbo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbo1.setText("Other");

        cbo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbo2.setText("Other");

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

        table.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "B.C No", "NIC No", "School leaving", "Other 1", "Other 2"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addGap(41, 41, 41)
                                            .addComponent(jButton1)
                                            .addGap(39, 39, 39)
                                            .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbbc)
                                                .addComponent(cbsl)
                                                .addComponent(cbnic))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_bc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(139, 139, 139)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cbo2)
                                                        .addComponent(cbo1))
                                                    .addGap(48, 48, 48)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_o1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_o2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(243, 243, 243)
                                                    .addComponent(jLabel11)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbo1)
                        .addComponent(txt_o1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo2)
                            .addComponent(txt_o2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbc)
                            .addComponent(txt_bc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsl)
                    .addComponent(txt_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnic)
                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel11)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(30, 2, 818, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void cbnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnicActionPerformed

    public void clearp(){
        
       txt_cid.setText("");
       txt_bc.setText("");
       txt_nic.setText("");
       txt_sc.setText("");
       txt_o1.setText("");
       txt_o2.setText("");
       cbbc.setSelected(false);
       cbsl.setSelected(false);
       cbnic.setSelected(false);
       cbo1.setSelected(false);
       cbo2.setSelected(false);
     
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         clearp();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed

        /*  DefaultTableModel df=new DefaultTableModel();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from document";
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
                    v.add(rs.getString("bc_no"));
                    v.add(rs.getString("nic_no"));
                    v.add(rs.getString("leaving"));
                    v.add(rs.getString("other1"));
                    v.add(rs.getString("other2"));
             
                    
                    
                }
                df.addRow(v);
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
        String sql="select * from document where child_id="+select;
        
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        
        if(rs.next()){
            txt_cid.setText(rs.getString("child_id"));
            txt_bc.setText(rs.getString("bc_no"));
           
            if(txt_bc.getText()==""){
                
            cbbc.setSelected(false);
            }
            else{
                 cbbc.setSelected(true);
            }
            
            txt_sc.setText(rs.getString("leaving"));
            
            if(txt_sc.getText()==""){
                
                cbsl.setSelected(false);
            }
            else{
                
                 cbsl.setSelected(true);
            }
            txt_nic.setText(rs.getString("nic_no"));
            if(txt_nic.getText()==""){
                
                cbnic.setSelected(false);
            }
            else{
                 cbnic.setSelected(true);
            }
            txt_o1.setText(rs.getString("other1"));
            if(txt_o1.getText()==""){
                 cbo1.setSelected(false);
            }
            else{
                 cbo1.setSelected(true);
            }
            txt_o2.setText(rs.getString("other2"));
            if(txt_o1.getText()==""){
                 cbo2.setSelected(false);
            }
            else{
                 cbo2.setSelected(true);
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
            
            String sql="update document set bc_no=? ,nic_no=? ,leaving=? ,other1=? ,other2=? where child_id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
           
            pst.setString(1,txt_bc.getText());
            pst.setString(2,txt_nic.getText());
            pst.setString(3,txt_sc.getText());
            pst.setString(4,txt_o1.getText());
            pst.setString(5,txt_o2.getText());
            
            pst.setString(6,txt_cid.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="delete from document where child_id=? ";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, txt_cid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Record Deleted");
             clearp();
             filltbd();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        String name=txt_search.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) table.getModel();
         int r=table.getRowCount();
         while(r-->0){
             
             dtm.removeRow(r);
             
                   
         }
  try{
       ResultSet rs=dbhelperdoc.getData(name);
       while(rs.next()){
           java.util.Vector v=new  java.util.Vector();
           v.add(rs.getString("child_id"));
           v.add(rs.getString("Bc_no"));
           v.add(rs.getString("nic_no"));
           v.add(rs.getString("leaving"));
           v.add(rs.getString("other1"));
           v.add(rs.getString("other2"));
           
           
           dtm.addRow(v);
           
       }
     }
  catch(Exception ex){
      
      JOptionPane.showMessageDialog(null,ex);
  }
        
        /* String ts=txt_search.getText();
               
            try{
            String sql="select * from document where child_id like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)table.getModel();
            
            
            if(rs.next()){
                
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_searchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbbc;
    private javax.swing.JCheckBox cbnic;
    private javax.swing.JCheckBox cbo1;
    private javax.swing.JCheckBox cbo2;
    private javax.swing.JCheckBox cbsl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_bc;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_o1;
    private javax.swing.JTextField txt_o2;
    private javax.swing.JTextField txt_sc;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
