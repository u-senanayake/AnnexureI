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
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public void updateAudit(AuditDB ad){
        String id=ad.getId();
        try{
            
                    String sql="update audit set audit_1=?,audit_2=?,audit_3=?,audit_4=?,audit_5=?,audit_6=?,audit_7=?,audit_8=?,audit_9=?,audit_10=? where id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    pst.setInt(1, ad.getAudit_1());
                    pst.setInt(2,ad.getAudit_2());
                    pst.setInt(3,ad.getAudit_3());
                    pst.setInt(4,ad.getAudit_4());
                    pst.setInt(5,ad.getAudit_5());
                    pst.setInt(6,ad.getAudit_6());
                    pst.setInt(7,ad.getAudit_7());
                    pst.setInt(8,ad.getAudit_8());
                    pst.setInt(9,ad.getAudit_9());
                    pst.setInt(10,ad.getAudit_10());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "AUDIT Table Updated");
                    }
                    catch(SQLException | HeadlessException exp){
                        JOptionPane.showMessageDialog(null, exp.getMessage());      
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
    public void updateAudit_6(AuditDB ad){
        String id=ad.getId();
        try{
            
                    String sql="update audit_6 set audit_1=?,audit_2=?,audit_3=?,audit_4=?,audit_5=?,audit_6=?,audit_7=?,audit_8=?,audit_9=?,audit_10=? where id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    pst.setInt(1, ad.getAudit_1());
                    pst.setInt(2,ad.getAudit_2());
                    pst.setInt(3,ad.getAudit_3());
                    pst.setInt(4,ad.getAudit_4());
                    pst.setInt(5,ad.getAudit_5());
                    pst.setInt(6,ad.getAudit_6());
                    pst.setInt(7,ad.getAudit_7());
                    pst.setInt(8,ad.getAudit_8());
                    pst.setInt(9,ad.getAudit_9());
                    pst.setInt(10,ad.getAudit_10());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "AUDIT_6 Table Updated");
                    }
                    catch(SQLException | HeadlessException exp){
                        JOptionPane.showMessageDialog(null, exp.getMessage());      
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
    public void updateAudit_12(AuditDB ad){
        String id=ad.getId();
        try{
            
                    String sql="update audit_12 set audit_1=?,audit_2=?,audit_3=?,audit_4=?,audit_5=?,audit_6=?,audit_7=?,audit_8=?,audit_9=?,audit_10=? where id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    pst.setInt(1, ad.getAudit_1());
                    pst.setInt(2,ad.getAudit_2());
                    pst.setInt(3,ad.getAudit_3());
                    pst.setInt(4,ad.getAudit_4());
                    pst.setInt(5,ad.getAudit_5());
                    pst.setInt(6,ad.getAudit_6());
                    pst.setInt(7,ad.getAudit_7());
                    pst.setInt(8,ad.getAudit_8());
                    pst.setInt(9,ad.getAudit_9());
                    pst.setInt(10,ad.getAudit_10());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "AUDIT_12 Table Updated");
                    }
                    catch(SQLException | HeadlessException exp){
                        JOptionPane.showMessageDialog(null, exp.getMessage());      
                    }
    }
//    public ResultSet getAudit(int row){
//        
//        try{
//            String sql="SELECT * FROM audit";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            rst=rs;
//            }
//       catch (Exception exp){
//           JOptionPane.showMessageDialog(null, exp.getMessage());
//           System.out.println(exp.getMessage());
//       }
//        
//        return rst;
//    }
//    public ResultSet getAudit_6(int row){
//        ResultSet rst=null; 
//        try{
//            String sql="SELECT * FROM audit_6";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            rst=rs;
//            }
//       catch (Exception exp){
//           JOptionPane.showMessageDialog(null, exp.getMessage());
//           System.out.println(exp.getMessage());
//       }
//        
//        return rst;
//    }
//    public ResultSet getAudit_12(int row){
//        ResultSet rst=null; 
//        try{
//            String sql="SELECT * FROM audit_12";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            rst=rs;
//            }
//       catch (Exception exp){
//           JOptionPane.showMessageDialog(null, exp.getMessage());
//           System.out.println(exp.getMessage());
//       }
//        
//        return rst;
//    }
}
