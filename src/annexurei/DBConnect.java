/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annexurei;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Udayanga
 */
public class  DBConnect  {
    Connection conn=null;
    public static Connection Connect(){

        try{
           String host="jdbc:mysql://localhost:3306/annexurei_1";
           String uName="root";
           String uPass="root";
           Connection conn=DriverManager.getConnection(host, uName, uPass);
 
          
            return conn;
        }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage()); 
           return null;}
    
//    try{
//        Class.forName("org.sqlite.JDBC");
//        Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\Projects\\Java program\\AnnexureI\\annexurei.sqlite");
//        return conn;
//    }
//    catch(Exception ex){
//        JOptionPane.showMessageDialog(null, ex.getMessage());
//    }
//    return null;
    
    }
    
}
