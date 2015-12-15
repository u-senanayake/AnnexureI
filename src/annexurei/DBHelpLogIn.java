/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annexurei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Udayanga
 */
public class DBHelpLogIn {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public void getLogin( String user_name,String password){
        String sql="select * from user where user_name=? and password=? ";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, user_name);
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Successfull");
                Main m= new Main();
                m.setVisible(true);
                
            }
        }
        catch(Exception ex){
            
        }
    }
    
}
