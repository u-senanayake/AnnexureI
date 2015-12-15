/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUDIT;

/**
 *
 * @author Udayanga
 */
import MINI.mini;
import annexurei.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DBHelpAudit {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addAudit(AuditDB ad){
        try{
            String sql="insert into audit(id,audit_1,audit_2,audit_3,audit_4,audit_5,audit_6,audit_7,audit_8,audit_9,audit_10)values(?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2, ad.getAudit_1());
            pst.setInt(3,ad.getAudit_2());
            pst.setInt(4,ad.getAudit_3());
            pst.setInt(5,ad.getAudit_4());
            pst.setInt(6,ad.getAudit_5());
            pst.setInt(7,ad.getAudit_6());
            pst.setInt(8,ad.getAudit_7());
            pst.setInt(9,ad.getAudit_8());
            pst.setInt(10,ad.getAudit_9());
            pst.setInt(11,ad.getAudit_10());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to AUDIT");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save AUDIT");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addAudit_6(AuditDB ad){
        try{
            String sql="insert into audit_6(id,audit_1,audit_2,audit_3,audit_4,audit_5,audit_6,audit_7,audit_8,audit_9,audit_10)values(?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2, ad.getAudit_1());
            pst.setInt(3,ad.getAudit_2());
            pst.setInt(4,ad.getAudit_3());
            pst.setInt(5,ad.getAudit_4());
            pst.setInt(6,ad.getAudit_5());
            pst.setInt(7,ad.getAudit_6());
            pst.setInt(8,ad.getAudit_7());
            pst.setInt(9,ad.getAudit_8());
            pst.setInt(10,ad.getAudit_9());
            pst.setInt(11,ad.getAudit_10());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to AUDIT");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save AUDIT");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addAudit_12(AuditDB ad){
        try{
            String sql="insert into audit_12(id,audit_1,audit_2,audit_3,audit_4,audit_5,audit_6,audit_7,audit_8,audit_9,audit_10)values(?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2, ad.getAudit_1());
            pst.setInt(3,ad.getAudit_2());
            pst.setInt(4,ad.getAudit_3());
            pst.setInt(5,ad.getAudit_4());
            pst.setInt(6,ad.getAudit_5());
            pst.setInt(7,ad.getAudit_6());
            pst.setInt(8,ad.getAudit_7());
            pst.setInt(9,ad.getAudit_8());
            pst.setInt(10,ad.getAudit_9());
            pst.setInt(11,ad.getAudit_10());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to AUDIT");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save AUDIT");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
