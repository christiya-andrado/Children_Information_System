/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
public class search extends javax.swing.JInternalFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI bui=(BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        filltbl();
        filltbp();
        filltbd();
        filltb();
        
        
    }

     
    public void filltb(){
        DefaultTableModel df=new DefaultTableModel();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from children";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            
            int c;
            c=rss.getColumnCount();
            df=(DefaultTableModel)ctable.getModel();
            df.setRowCount(0);
     
            while(rs.next()){
                Vector v=new Vector();
                for(int a=1; a<c; a++)
                {
                    v.add(rs.getString("child_id"));
                    v.add(rs.getString("child_name"));
                    v.add(rs.getString("gender"));
                    v.add(rs.getString("dob"));
                    v.add(rs.getString("address"));
                    v.add(rs.getString("grade"));
                    v.add(rs.getString("date_of_join"));
                    v.add(rs.getString("Year"));
                    v.add(rs.getString("image"));
                    v.add(rs.getString("remark"));
                    
                    
                }
                df.addRow(v);
            }
            
            
        }
        catch(Exception ex){
            
           JOptionPane.showMessageDialog(null,ex);
        }
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
            df=(DefaultTableModel)doctable.getModel();
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
        public void filltbp(){
             DefaultTableModel df=new DefaultTableModel();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from parent";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            
            int c;
            c=rss.getColumnCount();
            df=(DefaultTableModel)partable.getModel();
            df.setRowCount(0);
     
            while(rs.next()){
                Vector v=new Vector();
                for(int a=1; a<c; a++)
                {
                    v.add(rs.getString("child_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("relationship"));
                    v.add(rs.getString("nic"));
                    v.add(rs.getString("sourceofincome"));
                    v.add(rs.getString("contact"));
                    v.add(rs.getString("visited_date"));
                    
                    
                }
                df.addRow(v);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
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
            df=(DefaultTableModel)levtable.getModel();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pchild = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txt_child1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bprintch = new javax.swing.JButton();
        pdou = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bdocprint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_doc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pparent = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_par = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        partable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        pleave = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txt_lea = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        levtable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 225, 225));
        setBorder(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setBackground(new java.awt.Color(230, 225, 225));
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        ctable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "Child Name", "Gender", "Date of Birth", "Address", "Grade", "Date of Join", "Year", "Image", "Remark"
            }
        ));
        jScrollPane1.setViewportView(ctable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Children Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        txt_child1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txt_child1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_child1ActionPerformed(evt);
            }
        });
        txt_child1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_child1KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("Search By");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txt_child1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_child1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Search Information");

        bprintch.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bprintch.setText("Print");
        bprintch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pchildLayout = new javax.swing.GroupLayout(pchild);
        pchild.setLayout(pchildLayout);
        pchildLayout.setHorizontalGroup(
            pchildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pchildLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pchildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pchildLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pchildLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bprintch)
                .addGap(159, 159, 159))
        );
        pchildLayout.setVerticalGroup(
            pchildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pchildLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bprintch)
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Children", pchild);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText(" Search Information");

        bdocprint.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bdocprint.setText("Print");
        bdocprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdocprintActionPerformed(evt);
            }
        });

        doctable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        doctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "B.C No", "NIC No", "School leaving", "Other 1", "Other 2"
            }
        ));
        jScrollPane2.setViewportView(doctable);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Document Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        txt_doc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txt_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docActionPerformed(evt);
            }
        });
        txt_doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_docKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setText("Search By");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(txt_doc, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pdouLayout = new javax.swing.GroupLayout(pdou);
        pdou.setLayout(pdouLayout);
        pdouLayout.setHorizontalGroup(
            pdouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdouLayout.createSequentialGroup()
                .addGroup(pdouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdouLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pdouLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdouLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bdocprint)
                .addGap(133, 133, 133))
            .addGroup(pdouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pdouLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        pdouLayout.setVerticalGroup(
            pdouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdouLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(bdocprint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pdouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pdouLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(542, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Document", pdou);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parent Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        txt_par.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txt_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parActionPerformed(evt);
            }
        });
        txt_par.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_parKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setText("Search By");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText(" Search Information");

        partable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        partable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "Name", "Relationship", "NIC No", "Source of Income", "Contact", "Visited Date"
            }
        ));
        jScrollPane3.setViewportView(partable);

        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pparentLayout = new javax.swing.GroupLayout(pparent);
        pparent.setLayout(pparentLayout);
        pparentLayout.setHorizontalGroup(
            pparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pparentLayout.createSequentialGroup()
                .addGroup(pparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pparentLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pparentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pparentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pparentLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pparentLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(163, 163, 163))))
        );
        pparentLayout.setVerticalGroup(
            pparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pparentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Parent", pparent);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leaving Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        txt_lea.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txt_lea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_leaActionPerformed(evt);
            }
        });
        txt_lea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_leaKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setText("Search By");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txt_lea, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Leaved  Search Information");

        levtable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        levtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child ID", "Name", "Gender", "Edu Qualification", "Leaving Status", "Leaved Date"
            }
        ));
        jScrollPane4.setViewportView(levtable);

        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pleaveLayout = new javax.swing.GroupLayout(pleave);
        pleave.setLayout(pleaveLayout);
        pleaveLayout.setHorizontalGroup(
            pleaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pleaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(190, 190, 190))
            .addGroup(pleaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(480, 480, 480))
            .addGroup(pleaveLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pleaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pleaveLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        pleaveLayout.setVerticalGroup(
            pleaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pleaveLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(24, 24, 24))
            .addGroup(pleaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pleaveLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(526, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Leaved Children", pleave);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(30, 2, 818, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_child1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_child1ActionPerformed

         DefaultTableModel df=new DefaultTableModel();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from children";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            
            int c;
            c=rss.getColumnCount();
            df=(DefaultTableModel)ctable.getModel();
            df.setRowCount(0);
     
            while(rs.next()){
                Vector v=new Vector();
                for(int a=1; a<c; a++)
                {
                    v.add(rs.getString("child_id"));
                    v.add(rs.getString("child_name"));
                    v.add(rs.getString("gender"));
                    v.add(rs.getString("dob"));
                    v.add(rs.getString("address"));
                    v.add(rs.getString("grade"));
                    v.add(rs.getString("date_of_join"));
                    v.add(rs.getString("Year"));
                    v.add(rs.getString("image"));
                    v.add(rs.getString("remark"));
                    
                    
                }
                df.addRow(v);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_txt_child1ActionPerformed

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed

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
            df=(DefaultTableModel)doctable.getModel();
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
        
    }//GEN-LAST:event_txt_docActionPerformed

    private void txt_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parActionPerformed

        DefaultTableModel df=new DefaultTableModel();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="select * from parent";
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            
            int c;
            c=rss.getColumnCount();
            df=(DefaultTableModel)partable.getModel();
            df.setRowCount(0);
     
            while(rs.next()){
                Vector v=new Vector();
                for(int a=1; a<c; a++)
                {
                    v.add(rs.getString("child_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("relationship"));
                    v.add(rs.getString("nic"));
                    v.add(rs.getString("sourceofincome"));
                    v.add(rs.getString("contact"));
                    v.add(rs.getString("visited_date"));
                    
                    
                }
                df.addRow(v);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_txt_parActionPerformed

    private void txt_leaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_leaActionPerformed

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
            df=(DefaultTableModel)levtable.getModel();
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
        
    }//GEN-LAST:event_txt_leaActionPerformed

    private void bprintchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintchActionPerformed

         try{
        
        MessageFormat header=new MessageFormat("Children Information");
        MessageFormat fooder=new MessageFormat("Page(0, number, integer)");
               
            ctable.print(JTable.PrintMode.NORMAL,header,fooder);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_bprintchActionPerformed

    private void bdocprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdocprintActionPerformed

          try{
        
        MessageFormat header=new MessageFormat("Document Information");
        MessageFormat fooder=new MessageFormat("Page(0, number, integer)");
               
           doctable.print(JTable.PrintMode.NORMAL,header,fooder);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_bdocprintActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

         try{
        
        MessageFormat header=new MessageFormat("Parent Information");
        MessageFormat fooder=new MessageFormat("Page(0, number, integer)");
               
           partable.print(JTable.PrintMode.NORMAL,header,fooder);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         try{
        
        MessageFormat header=new MessageFormat("Leaved Children Information");
        MessageFormat fooder=new MessageFormat("Page(0, number, integer)");
               
           levtable.print(JTable.PrintMode.NORMAL,header,fooder);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_child1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_child1KeyReleased

         String name=txt_child1.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) ctable.getModel();
         int r=ctable.getRowCount();
         while(r-->0){
             
             dtm.removeRow(r);
             
                   
         }
  try{
       ResultSet rs=dbhelper.getData(name);
       while(rs.next()){
           java.util.Vector v=new  java.util.Vector();
           v.add(rs.getString("child_id"));
           v.add(rs.getString("child_name"));
           v.add(rs.getString("gender"));
           v.add(rs.getString("dob"));
           v.add(rs.getString("address"));
           v.add(rs.getString("grade"));
           v.add(rs.getString("date_of_join"));
           v.add(rs.getString("year"));
           v.add(rs.getString("image"));
           v.add(rs.getString("remark"));
           
           dtm.addRow(v);
           
       }
     }
  catch(Exception ex){
      
      JOptionPane.showMessageDialog(null,ex);
  }
        /* String ts=txt_child1.getText();
               
            try{
            String sql="select * from children where child_id and child_name like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)ctable.getModel();
            
           if(rs.next()){ 
       
              model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
              
           }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_child1KeyReleased

    private void txt_docKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_docKeyReleased

         String name=txt_doc.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) doctable.getModel();
         int r=doctable.getRowCount();
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
        
        /*String ts=txt_doc.getText();
               
            try{
            String sql="select * from document where child_id like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)doctable.getModel();
            
            
            if(rs.next()){
                
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_docKeyReleased

    private void txt_parKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_parKeyReleased

        
         String name=txt_par.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) partable.getModel();
         int r=partable.getRowCount();
         while(r-->0){
             
             dtm.removeRow(r);
             
                   
         }
  try{
       ResultSet rs=dbhelperpar.getData(name);
       while(rs.next()){
           java.util.Vector v=new  java.util.Vector();
           v.add(rs.getString("child_id"));
           v.add(rs.getString("name"));
           v.add(rs.getString("Relationship"));
           v.add(rs.getString("nic"));
           v.add(rs.getString("sourceofincome"));
           v.add(rs.getString("contact"));
           v.add(rs.getString("visited_date"));
          
           
           dtm.addRow(v);
           
       }
     }
  catch(Exception ex){
      
      JOptionPane.showMessageDialog(null,ex);
  }
        /*String ts=txt_par.getText();
               
            try{
            String sql="select * from parent where child_id like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)partable.getModel();
            
           if(rs.next()){ 
       
              model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
              
           }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_parKeyReleased

    private void txt_leaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_leaKeyReleased

        
           String name=txt_lea.getText();
        
         DefaultTableModel dtm=(DefaultTableModel) levtable.getModel();
         int r=levtable.getRowCount();
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
        /*    String ts=txt_lea.getText();
               
            try{
            String sql="select * from leavinginfo where child_id and name like '%"+ts+"%'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)levtable.getModel();
            
           if(rs.next()){ 
       
              model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
              
           }
            
        }
        catch(Exception ex){
           
            JOptionPane.showMessageDialog(null,ex);
        }*/
    }//GEN-LAST:event_txt_leaKeyReleased

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdocprint;
    private javax.swing.JButton bprintch;
    private javax.swing.JTable ctable;
    private javax.swing.JTable doctable;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable levtable;
    private javax.swing.JTable partable;
    private javax.swing.JPanel pchild;
    private javax.swing.JPanel pdou;
    private javax.swing.JPanel pleave;
    private javax.swing.JPanel pparent;
    private javax.swing.JTextField txt_child1;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_lea;
    private javax.swing.JTextField txt_par;
    // End of variables declaration//GEN-END:variables
}
