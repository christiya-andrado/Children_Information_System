/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class userdefine {
  public static PreparedStatement dun,dpw,dactype;
    private static String password;
    private static String pass;
    
    static{
     try{
 
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/children_info_system","root","");
      String sql="select username,password,accounttype from login where username=? and password=? ";
          
         dun=con.prepareStatement(sql);
         dpw=con.prepareStatement(sql);
         dactype=con.prepareStatement(sql);    
       
     }
  catch(Exception ex){
      
      JOptionPane.showMessageDialog(null,ex);
  }
    }
    
      public static ResultSet getData(String name, String Password) throws SQLException{
            
            dun.setString(1,name);
            dpw.setString(2, pass);
            return dun.executeQuery();
        
            
        }
      
       public static ResultSet getData(String utype) throws SQLException{
            
            dactype.setString(3,utype);
            return dactype.executeQuery();
        
            
        }
}
