/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMQb;

import MMQb.MmqbDB;
import annexurei.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Udayanga
 */
public class DBHelpMmqb {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addMMQb(MmqbDB ad){
        try{
            String sql="insert into mmqb(id , mmqb_1,mmqb_2,mmqb_3,mmqb_4,mmqb_5,mmqb_6,mmqb_7,mmqb_8,mmqb_9,mmqb_10,mmqb_11,mmqb_12,mmqb_13,mmqb_14,mmqb_15,mmqb_16,mmqb_17,mmqb_18,mmqb_19,mmqb_20,mmqb_21,mmqb_22,mmqb_23,mmqb_24,mmqb_25,mmqb_26,mmqb_27,mmqb_28,mmqb_29,mmqb_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqb_1());
            pst.setString(3,ad.getMmqb_2());
            pst.setString(4,ad.getMmqb_3());
            pst.setString(5,ad.getMmqb_4());
            pst.setString(6,ad.getMmqb_5());
            pst.setString(7,ad.getMmqb_6());
            pst.setString(8,ad.getMmqb_7());
            pst.setString(9,ad.getMmqb_8());
            pst.setString(10,ad.getMmqb_9());
            pst.setString(11,ad.getMmqb_10());
            pst.setString(12,ad.getMmqb_11());
            pst.setString(13,ad.getMmqb_12());
            pst.setString(14,ad.getMmqb_13());
            pst.setString(15,ad.getMmqb_14());
            pst.setString(16,ad.getMmqb_15());
            pst.setString(17,ad.getMmqb_16());
            pst.setString(18,ad.getMmqb_17());
            pst.setString(19,ad.getMmqb_18());
            pst.setString(20,ad.getMmqb_19());
            pst.setString(21,ad.getMmqb_20());
            pst.setString(22,ad.getMmqb_21());
            pst.setString(23,ad.getMmqb_22());
            pst.setString(24,ad.getMmqb_23());
            pst.setString(25,ad.getMmqb_24());
            pst.setString(26,ad.getMmqb_25());
            pst.setString(27,ad.getMmqb_26());
            pst.setString(28,ad.getMmqb_27());
            pst.setString(29,ad.getMmqb_28());
            pst.setString(30,ad.getMmqb_29());
            pst.setString(31,ad.getMmqb_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQb");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQb");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addMMQb_6(MmqbDB ad){
        try{
            String sql="insert into mmqb_12(id , mmqb_1,mmqb_2,mmqb_3,mmqb_4,mmqb_5,mmqb_6,mmqb_7,mmqb_8,mmqb_9,mmqb_10,mmqb_11,mmqb_12,mmqb_13,mmqb_14,mmqb_15,mmqb_16,mmqb_17,mmqb_18,mmqb_19,mmqb_20,mmqb_21,mmqb_22,mmqb_23,mmqb_24,mmqb_25,mmqb_26,mmqb_27,mmqb_28,mmqb_29,mmqb_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqb_1());
            pst.setString(3,ad.getMmqb_2());
            pst.setString(4,ad.getMmqb_3());
            pst.setString(5,ad.getMmqb_4());
            pst.setString(6,ad.getMmqb_5());
            pst.setString(7,ad.getMmqb_6());
            pst.setString(8,ad.getMmqb_7());
            pst.setString(9,ad.getMmqb_8());
            pst.setString(10,ad.getMmqb_9());
            pst.setString(11,ad.getMmqb_10());
            pst.setString(12,ad.getMmqb_11());
            pst.setString(13,ad.getMmqb_12());
            pst.setString(14,ad.getMmqb_13());
            pst.setString(15,ad.getMmqb_14());
            pst.setString(16,ad.getMmqb_15());
            pst.setString(17,ad.getMmqb_16());
            pst.setString(18,ad.getMmqb_17());
            pst.setString(19,ad.getMmqb_18());
            pst.setString(20,ad.getMmqb_19());
            pst.setString(21,ad.getMmqb_20());
            pst.setString(22,ad.getMmqb_21());
            pst.setString(23,ad.getMmqb_22());
            pst.setString(24,ad.getMmqb_23());
            pst.setString(25,ad.getMmqb_24());
            pst.setString(26,ad.getMmqb_25());
            pst.setString(27,ad.getMmqb_26());
            pst.setString(28,ad.getMmqb_27());
            pst.setString(29,ad.getMmqb_28());
            pst.setString(30,ad.getMmqb_29());
            pst.setString(31,ad.getMmqb_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQb");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQb");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addMMQb_12(MmqbDB ad){
        try{
            String sql="insert into mmqb_12(id , mmqb_1,mmqb_2,mmqb_3,mmqb_4,mmqb_5,mmqb_6,mmqb_7,mmqb_8,mmqb_9,mmqb_10,mmqb_11,mmqb_12,mmqb_13,mmqb_14,mmqb_15,mmqb_16,mmqb_17,mmqb_18,mmqb_19,mmqb_20,mmqb_21,mmqb_22,mmqb_23,mmqb_24,mmqb_25,mmqb_26,mmqb_27,mmqb_28,mmqb_29,mmqb_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqb_1());
            pst.setString(3,ad.getMmqb_2());
            pst.setString(4,ad.getMmqb_3());
            pst.setString(5,ad.getMmqb_4());
            pst.setString(6,ad.getMmqb_5());
            pst.setString(7,ad.getMmqb_6());
            pst.setString(8,ad.getMmqb_7());
            pst.setString(9,ad.getMmqb_8());
            pst.setString(10,ad.getMmqb_9());
            pst.setString(11,ad.getMmqb_10());
            pst.setString(12,ad.getMmqb_11());
            pst.setString(13,ad.getMmqb_12());
            pst.setString(14,ad.getMmqb_13());
            pst.setString(15,ad.getMmqb_14());
            pst.setString(16,ad.getMmqb_15());
            pst.setString(17,ad.getMmqb_16());
            pst.setString(18,ad.getMmqb_17());
            pst.setString(19,ad.getMmqb_18());
            pst.setString(20,ad.getMmqb_19());
            pst.setString(21,ad.getMmqb_20());
            pst.setString(22,ad.getMmqb_21());
            pst.setString(23,ad.getMmqb_22());
            pst.setString(24,ad.getMmqb_23());
            pst.setString(25,ad.getMmqb_24());
            pst.setString(26,ad.getMmqb_25());
            pst.setString(27,ad.getMmqb_26());
            pst.setString(28,ad.getMmqb_27());
            pst.setString(29,ad.getMmqb_28());
            pst.setString(30,ad.getMmqb_29());
            pst.setString(31,ad.getMmqb_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQb");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQb");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
