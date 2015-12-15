/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TLFB;

import annexurei.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Udayanga
 */
public class DBHelpTlfb {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addTLFB(TlfbDB ad){
        try{
            String sql="insert into tlfb(id , tlfb_1,tlfb_2,tlfb_3,tlfb_4,tlfb_5,tlfb_6,tlfb_7,tlfb_8,tlfb_9,tlfb_10,tlfb_11,tlfb_12,tlfb_13,tlfb_14,tlfb_15,tlfb_16,tlfb_17,tlfb_18,tlfb_19,tlfb_20,tlfb_21,tlfb_22,tlfb_23,tlfb_24,tlfb_25,tlfb_26,tlfb_27,tlfb_28,tlfb_29,tlfb_30,tlfb_31)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getTlfb_1());
            pst.setString(3,ad.getTlfb_2());
            pst.setString(4,ad.getTlfb_3());
            pst.setString(5,ad.getTlfb_4());
            pst.setString(6,ad.getTlfb_5());
            pst.setString(7,ad.getTlfb_6());
            pst.setString(8,ad.getTlfb_7());
            pst.setString(9,ad.getTlfb_8());
            pst.setString(10,ad.getTlfb_9());
            pst.setString(11,ad.getTlfb_10());
            pst.setString(12,ad.getTlfb_11());
            pst.setString(13,ad.getTlfb_12());
            pst.setString(14,ad.getTlfb_13());
            pst.setString(15,ad.getTlfb_14());
            pst.setString(16,ad.getTlfb_15());
            pst.setString(17,ad.getTlfb_16());
            pst.setString(18,ad.getTlfb_17());
            pst.setString(19,ad.getTlfb_18());
            pst.setString(20,ad.getTlfb_19());
            pst.setString(21,ad.getTlfb_20());
            pst.setString(22,ad.getTlfb_21());
            pst.setString(23,ad.getTlfb_22());
            pst.setString(24,ad.getTlfb_23());
            pst.setString(25,ad.getTlfb_24());
            pst.setString(26,ad.getTlfb_25());
            pst.setString(27,ad.getTlfb_26());
            pst.setString(28,ad.getTlfb_27());
            pst.setString(29,ad.getTlfb_28());
            pst.setString(30,ad.getTlfb_29());
            pst.setString(31,ad.getTlfb_30());
            pst.setString(32,ad.getTlfb_31());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to TLFB");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save TLFB");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addTLFB_6(TlfbDB ad){
        try{
            String sql="insert into tlfb_6(id , tlfb_1,tlfb_2,tlfb_3,tlfb_4,tlfb_5,tlfb_6,tlfb_7,tlfb_8,tlfb_9,tlfb_10,tlfb_11,tlfb_12,tlfb_13,tlfb_14,tlfb_15,tlfb_16,tlfb_17,tlfb_18,tlfb_19,tlfb_20,tlfb_21,tlfb_22,tlfb_23,tlfb_24,tlfb_25,tlfb_26,tlfb_27,tlfb_28,tlfb_29,tlfb_30,tlfb_31)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getTlfb_1());
            pst.setString(3,ad.getTlfb_2());
            pst.setString(4,ad.getTlfb_3());
            pst.setString(5,ad.getTlfb_4());
            pst.setString(6,ad.getTlfb_5());
            pst.setString(7,ad.getTlfb_6());
            pst.setString(8,ad.getTlfb_7());
            pst.setString(9,ad.getTlfb_8());
            pst.setString(10,ad.getTlfb_9());
            pst.setString(11,ad.getTlfb_10());
            pst.setString(12,ad.getTlfb_11());
            pst.setString(13,ad.getTlfb_12());
            pst.setString(14,ad.getTlfb_13());
            pst.setString(15,ad.getTlfb_14());
            pst.setString(16,ad.getTlfb_15());
            pst.setString(17,ad.getTlfb_16());
            pst.setString(18,ad.getTlfb_17());
            pst.setString(19,ad.getTlfb_18());
            pst.setString(20,ad.getTlfb_19());
            pst.setString(21,ad.getTlfb_20());
            pst.setString(22,ad.getTlfb_21());
            pst.setString(23,ad.getTlfb_22());
            pst.setString(24,ad.getTlfb_23());
            pst.setString(25,ad.getTlfb_24());
            pst.setString(26,ad.getTlfb_25());
            pst.setString(27,ad.getTlfb_26());
            pst.setString(28,ad.getTlfb_27());
            pst.setString(29,ad.getTlfb_28());
            pst.setString(30,ad.getTlfb_29());
            pst.setString(31,ad.getTlfb_30());
            pst.setString(32,ad.getTlfb_31());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to TLFB");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save TLFB");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addTLFB_12(TlfbDB ad){
        try{
            String sql="insert into tlfb_12(id , tlfb_1,tlfb_2,tlfb_3,tlfb_4,tlfb_5,tlfb_6,tlfb_7,tlfb_8,tlfb_9,tlfb_10,tlfb_11,tlfb_12,tlfb_13,tlfb_14,tlfb_15,tlfb_16,tlfb_17,tlfb_18,tlfb_19,tlfb_20,tlfb_21,tlfb_22,tlfb_23,tlfb_24,tlfb_25,tlfb_26,tlfb_27,tlfb_28,tlfb_29,tlfb_30,tlfb_31)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getTlfb_1());
            pst.setString(3,ad.getTlfb_2());
            pst.setString(4,ad.getTlfb_3());
            pst.setString(5,ad.getTlfb_4());
            pst.setString(6,ad.getTlfb_5());
            pst.setString(7,ad.getTlfb_6());
            pst.setString(8,ad.getTlfb_7());
            pst.setString(9,ad.getTlfb_8());
            pst.setString(10,ad.getTlfb_9());
            pst.setString(11,ad.getTlfb_10());
            pst.setString(12,ad.getTlfb_11());
            pst.setString(13,ad.getTlfb_12());
            pst.setString(14,ad.getTlfb_13());
            pst.setString(15,ad.getTlfb_14());
            pst.setString(16,ad.getTlfb_15());
            pst.setString(17,ad.getTlfb_16());
            pst.setString(18,ad.getTlfb_17());
            pst.setString(19,ad.getTlfb_18());
            pst.setString(20,ad.getTlfb_19());
            pst.setString(21,ad.getTlfb_20());
            pst.setString(22,ad.getTlfb_21());
            pst.setString(23,ad.getTlfb_22());
            pst.setString(24,ad.getTlfb_23());
            pst.setString(25,ad.getTlfb_24());
            pst.setString(26,ad.getTlfb_25());
            pst.setString(27,ad.getTlfb_26());
            pst.setString(28,ad.getTlfb_27());
            pst.setString(29,ad.getTlfb_28());
            pst.setString(30,ad.getTlfb_29());
            pst.setString(31,ad.getTlfb_30());
            pst.setString(32,ad.getTlfb_31());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to TLFB");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save TLFB");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
