
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class document extends javax.swing.JInternalFrame {

    /**
     * Creates new form document
     */
    public document() {
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
        cbbc = new javax.swing.JCheckBox();
        txt_bc = new javax.swing.JTextField();
        cbsl = new javax.swing.JCheckBox();
        txt_sc = new javax.swing.JTextField();
        cbnic = new javax.swing.JCheckBox();
        txt_nic = new javax.swing.JTextField();
        cbo1 = new javax.swing.JCheckBox();
        txt_o1 = new javax.swing.JTextField();
        cbo2 = new javax.swing.JCheckBox();
        txt_o2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        cbo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbo1.setText("Other");

        cbo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cbo2.setText("Other");

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jButton1.setText("Save");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(117, 117, 117)
                                .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbsl)
                                    .addComponent(cbnic)
                                    .addComponent(cbo1)
                                    .addComponent(cbo2))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_o2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_o1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_bc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nic, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(txt_sc)))))))
                .addGap(97, 318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2))
                            .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbc)
                            .addComponent(txt_bc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbsl)
                            .addComponent(txt_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbnic)
                        .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo1)
                    .addComponent(txt_o1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo2)
                    .addComponent(txt_o2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setBounds(30, 2, 818, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
            
            String sql="insert into document(child_id,bc_no,nic_no,leaving,other1,other2) values (?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,txt_cid.getText());
            pst.setString(2,txt_bc.getText());
            pst.setString(3,txt_nic.getText());
            pst.setString(4,txt_sc.getText());
            pst.setString(5,txt_o1.getText());
            pst.setString(6,txt_o2.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Submited");
             clearp();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbbc;
    private javax.swing.JCheckBox cbnic;
    private javax.swing.JCheckBox cbo1;
    private javax.swing.JCheckBox cbo2;
    private javax.swing.JCheckBox cbsl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_bc;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_o1;
    private javax.swing.JTextField txt_o2;
    private javax.swing.JTextField txt_sc;
    // End of variables declaration//GEN-END:variables
}