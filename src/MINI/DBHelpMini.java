/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINI;

import AUDIT.AuditDB;
import javax.swing.JOptionPane;
import annexurei.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Udayanga
 */
public class DBHelpMini {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addMini(mini m){
        try{
            String sql="insert into mini(alcohol_dependence_current,alcohol_abuse_current,psychotic_disoeder_current,psychotic_disoeder_lifetime,id)values(?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,m.getAlcohol_dependence_current());
            pst.setString(2,m.getAlcohol_abuse_current());
            pst.setString(3, m.getPsychotic_disoeder_current());
            pst.setString(4,m.getPsychotic_disoeder_lifetime());
            pst.setString(5,m.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MINI");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MINI");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void updateMini(mini ad){
        String id=ad.getId();
        try{
            
                    String sql="update mini set alcohol_dependence_current=?,alcohol_abuse_current=?,psychotic_disoeder_current=?,psychotic_disoeder_lifetime=? where id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, ad.getAlcohol_dependence_current());
                    pst.setString(2,ad.getAlcohol_abuse_current());
                    pst.setString(3,ad.getPsychotic_disoeder_current());
                    pst.setString(4,ad.getPsychotic_disoeder_lifetime());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "MINI Table Updated");
                    }
                    catch(SQLException | HeadlessException exp){
                        JOptionPane.showMessageDialog(null, exp.getMessage());      
                    }
    }
    }
    

