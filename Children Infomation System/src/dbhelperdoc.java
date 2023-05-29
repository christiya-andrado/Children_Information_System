
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class dbhelperdoc {
    
     public static Statement st;
     public static Connection con;
      public static PreparedStatement getData;
      
      
      static{
           try {
               
          String url="jdbc:mysql://localhost:3306/children_info_system";
       
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,"root","");
        st=con.createStatement();
        getData=con.prepareStatement("select * from document where child_id like ? ");
        
        
        
        }
         catch (SQLException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      }
    
        public static ResultSet getData(String name) throws SQLException{
            
            getData.setString(1,"%"+name+"%");
            return getData.executeQuery();
                    
            
        }
    
}
