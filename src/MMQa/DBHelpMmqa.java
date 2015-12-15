/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMQa;

/**
 *
 * @author Udayanga
 */
import annexurei.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DBHelpMmqa {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    public void addMMQa(MmqaDB ad){
        try{
            String sql="insert into mmqa(id , mmqa_1,mmqa_2,mmqa_3,mmqa_4,mmqa_5,mmqa_6,mmqa_7,mmqa_8,mmqa_9,mmqa_10,mmqa_11,mmqa_12,mmqa_13,mmqa_14,mmqa_15,mmqa_16,mmqa_17,mmqa_18,mmqa_19,mmqa_20,mmqa_21,mmqa_22,mmqa_23,mmqa_24,mmqa_25,mmqa_26,mmqa_27,mmqa_28,mmqa_29,mmqa_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqa_1());
            pst.setString(3,ad.getMmqa_2());
            pst.setString(4,ad.getMmqa_3());
            pst.setString(5,ad.getMmqa_4());
            pst.setString(6,ad.getMmqa_5());
            pst.setString(7,ad.getMmqa_6());
            pst.setString(8,ad.getMmqa_7());
            pst.setString(9,ad.getMmqa_8());
            pst.setString(10,ad.getMmqa_9());
            pst.setString(11,ad.getMmqa_10());
            pst.setString(12,ad.getMmqa_11());
            pst.setString(13,ad.getMmqa_12());
            pst.setString(14,ad.getMmqa_13());
            pst.setString(15,ad.getMmqa_14());
            pst.setString(16,ad.getMmqa_15());
            pst.setString(17,ad.getMmqa_16());
            pst.setString(18,ad.getMmqa_17());
            pst.setString(19,ad.getMmqa_18());
            pst.setString(20,ad.getMmqa_19());
            pst.setString(21,ad.getMmqa_20());
            pst.setString(22,ad.getMmqa_21());
            pst.setString(23,ad.getMmqa_22());
            pst.setString(24,ad.getMmqa_23());
            pst.setString(25,ad.getMmqa_24());
            pst.setString(26,ad.getMmqa_25());
            pst.setString(27,ad.getMmqa_26());
            pst.setString(28,ad.getMmqa_27());
            pst.setString(29,ad.getMmqa_28());
            pst.setString(30,ad.getMmqa_29());
            pst.setString(31,ad.getMmqa_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQa");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQa");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addMMQa_6(MmqaDB ad){
        try{
            String sql="insert into mmqa_6(id , mmqa_1,mmqa_2,mmqa_3,mmqa_4,mmqa_5,mmqa_6,mmqa_7,mmqa_8,mmqa_9,mmqa_10,mmqa_11,mmqa_12,mmqa_13,mmqa_14,mmqa_15,mmqa_16,mmqa_17,mmqa_18,mmqa_19,mmqa_20,mmqa_21,mmqa_22,mmqa_23,mmqa_24,mmqa_25,mmqa_26,mmqa_27,mmqa_28,mmqa_29,mmqa_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqa_1());
            pst.setString(3,ad.getMmqa_2());
            pst.setString(4,ad.getMmqa_3());
            pst.setString(5,ad.getMmqa_4());
            pst.setString(6,ad.getMmqa_5());
            pst.setString(7,ad.getMmqa_6());
            pst.setString(8,ad.getMmqa_7());
            pst.setString(9,ad.getMmqa_8());
            pst.setString(10,ad.getMmqa_9());
            pst.setString(11,ad.getMmqa_10());
            pst.setString(12,ad.getMmqa_11());
            pst.setString(13,ad.getMmqa_12());
            pst.setString(14,ad.getMmqa_13());
            pst.setString(15,ad.getMmqa_14());
            pst.setString(16,ad.getMmqa_15());
            pst.setString(17,ad.getMmqa_16());
            pst.setString(18,ad.getMmqa_17());
            pst.setString(19,ad.getMmqa_18());
            pst.setString(20,ad.getMmqa_19());
            pst.setString(21,ad.getMmqa_20());
            pst.setString(22,ad.getMmqa_21());
            pst.setString(23,ad.getMmqa_22());
            pst.setString(24,ad.getMmqa_23());
            pst.setString(25,ad.getMmqa_24());
            pst.setString(26,ad.getMmqa_25());
            pst.setString(27,ad.getMmqa_26());
            pst.setString(28,ad.getMmqa_27());
            pst.setString(29,ad.getMmqa_28());
            pst.setString(30,ad.getMmqa_29());
            pst.setString(31,ad.getMmqa_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQa");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQa");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addMMQa_12(MmqaDB ad){
        try{
            String sql="insert into mmqa_12(id , mmqa_1,mmqa_2,mmqa_3,mmqa_4,mmqa_5,mmqa_6,mmqa_7,mmqa_8,mmqa_9,mmqa_10,mmqa_11,mmqa_12,mmqa_13,mmqa_14,mmqa_15,mmqa_16,mmqa_17,mmqa_18,mmqa_19,mmqa_20,mmqa_21,mmqa_22,mmqa_23,mmqa_24,mmqa_25,mmqa_26,mmqa_27,mmqa_28,mmqa_29,mmqa_30)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setString(2,ad.getMmqa_1());
            pst.setString(3,ad.getMmqa_2());
            pst.setString(4,ad.getMmqa_3());
            pst.setString(5,ad.getMmqa_4());
            pst.setString(6,ad.getMmqa_5());
            pst.setString(7,ad.getMmqa_6());
            pst.setString(8,ad.getMmqa_7());
            pst.setString(9,ad.getMmqa_8());
            pst.setString(10,ad.getMmqa_9());
            pst.setString(11,ad.getMmqa_10());
            pst.setString(12,ad.getMmqa_11());
            pst.setString(13,ad.getMmqa_12());
            pst.setString(14,ad.getMmqa_13());
            pst.setString(15,ad.getMmqa_14());
            pst.setString(16,ad.getMmqa_15());
            pst.setString(17,ad.getMmqa_16());
            pst.setString(18,ad.getMmqa_17());
            pst.setString(19,ad.getMmqa_18());
            pst.setString(20,ad.getMmqa_19());
            pst.setString(21,ad.getMmqa_20());
            pst.setString(22,ad.getMmqa_21());
            pst.setString(23,ad.getMmqa_22());
            pst.setString(24,ad.getMmqa_23());
            pst.setString(25,ad.getMmqa_24());
            pst.setString(26,ad.getMmqa_25());
            pst.setString(27,ad.getMmqa_26());
            pst.setString(28,ad.getMmqa_27());
            pst.setString(29,ad.getMmqa_28());
            pst.setString(30,ad.getMmqa_29());
            pst.setString(31,ad.getMmqa_30());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to MMQa");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save MMQa");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
