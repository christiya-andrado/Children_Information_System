
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ICT-PC-1
 */
public class dbhelper {
    
    public static Statement st;
     public static Connection con;
      public static PreparedStatement getData;
      
      
      static{
           try {
               
          String url="jdbc:mysql://localhost:3306/children_info_system";
       
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,"root","");
        st=con.createStatement();
        getData=con.prepareStatement("select * from children where child_id like ?");
        
        
        
        }
         catch (SQLException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      }
    
        public static ResultSet getData(String name) throws SQLException{
            
            getData.setString(1,"%"+name+"%");
            return getData.executeQuery();
                    
            
        }
        
        
    /* static{
           try {
               
          String url="jdbc:mysql://localhost:3306/children_info_system";
       
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,"root","");
        st=con.createStatement();
        getData=con.prepareStatement("select * from document where child_id like ?");
        
        
        
        }
         catch (SQLException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      }
     
     /* static{
           try {
               
          String url="jdbc:mysql://localhost:3306/children_info_system";
       
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,"root","");
        st=con.createStatement();
        getData=con.prepareStatement("select * from leavinginfo where child_id like ?");
        
        
        
        }
         catch (SQLException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      }*/
     
}
