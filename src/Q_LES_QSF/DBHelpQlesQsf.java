/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_LES_QSF;

import annexurei.DBConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Udayanga
 */
public class DBHelpQlesQsf {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addQlesQsf(QlesQsfDB ad){
        try{
            String sql="insert into q_lef_q_sf(id,q_lef_q_sf_1,q_lef_q_sf_2,q_lef_q_sf_3,q_lef_q_sf_4,q_lef_q_sf_5,q_lef_q_sf_6,q_lef_q_sf_7,q_lef_q_sf_8,q_lef_q_sf_9,q_lef_q_sf_10,q_lef_q_sf_11,q_lef_q_sf_12,q_lef_q_sf_13,q_lef_q_sf_14,q_lef_q_sf_15,q_lef_q_sf_16)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2,ad.getQlesqsf_1());
            pst.setInt(3,ad.getQlesqsf_2());
            pst.setInt(4,ad.getQlesqsf_3());
            pst.setInt(5,ad.getQlesqsf_4());
            pst.setInt(6,ad.getQlesqsf_5());
            pst.setInt(7,ad.getQlesqsf_6());
            pst.setInt(8,ad.getQlesqsf_7());
            pst.setInt(9,ad.getQlesqsf_8());
            pst.setInt(10,ad.getQlesqsf_9());
            pst.setInt(11,ad.getQlesqsf_10());
            pst.setInt(12,ad.getQlesqsf_11());
            pst.setInt(13,ad.getQlesqsf_12());
            pst.setInt(14,ad.getQlesqsf_13());
            pst.setInt(15,ad.getQlesqsf_14());
            pst.setInt(16,ad.getQlesqsf_15());
            pst.setInt(17,ad.getQlesqsf_16());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Q-LES Q-SF");

        }

        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Q-LES Q-SF");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addQlesQsf_6(QlesQsfDB ad){
        try{
            String sql="insert into q_lef_q_sf_6(id,q_lef_q_sf_1,q_lef_q_sf_2,q_lef_q_sf_3,q_lef_q_sf_4,q_lef_q_sf_5,q_lef_q_sf_6,q_lef_q_sf_7,q_lef_q_sf_8,q_lef_q_sf_9,q_lef_q_sf_10,q_lef_q_sf_11,q_lef_q_sf_12,q_lef_q_sf_13,q_lef_q_sf_14,q_lef_q_sf_15,q_lef_q_sf_16)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2,ad.getQlesqsf_1());
            pst.setInt(3,ad.getQlesqsf_2());
            pst.setInt(4,ad.getQlesqsf_3());
            pst.setInt(5,ad.getQlesqsf_4());
            pst.setInt(6,ad.getQlesqsf_5());
            pst.setInt(7,ad.getQlesqsf_6());
            pst.setInt(8,ad.getQlesqsf_7());
            pst.setInt(9,ad.getQlesqsf_8());
            pst.setInt(10,ad.getQlesqsf_9());
            pst.setInt(11,ad.getQlesqsf_10());
            pst.setInt(12,ad.getQlesqsf_11());
            pst.setInt(13,ad.getQlesqsf_12());
            pst.setInt(14,ad.getQlesqsf_13());
            pst.setInt(15,ad.getQlesqsf_14());
            pst.setInt(16,ad.getQlesqsf_15());
            pst.setInt(17,ad.getQlesqsf_16());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Q-LES Q-SF");

        }

        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Q-LES Q-SF");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addQlesQsf_12(QlesQsfDB ad){
        try{
            String sql="insert into q_lef_q_sf_12(id,q_lef_q_sf_1,q_lef_q_sf_2,q_lef_q_sf_3,q_lef_q_sf_4,q_lef_q_sf_5,q_lef_q_sf_6,q_lef_q_sf_7,q_lef_q_sf_8,q_lef_q_sf_9,q_lef_q_sf_10,q_lef_q_sf_11,q_lef_q_sf_12,q_lef_q_sf_13,q_lef_q_sf_14,q_lef_q_sf_15,q_lef_q_sf_16)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getId());
            pst.setInt(2,ad.getQlesqsf_1());
            pst.setInt(3,ad.getQlesqsf_2());
            pst.setInt(4,ad.getQlesqsf_3());
            pst.setInt(5,ad.getQlesqsf_4());
            pst.setInt(6,ad.getQlesqsf_5());
            pst.setInt(7,ad.getQlesqsf_6());
            pst.setInt(8,ad.getQlesqsf_7());
            pst.setInt(9,ad.getQlesqsf_8());
            pst.setInt(10,ad.getQlesqsf_9());
            pst.setInt(11,ad.getQlesqsf_10());
            pst.setInt(12,ad.getQlesqsf_11());
            pst.setInt(13,ad.getQlesqsf_12());
            pst.setInt(14,ad.getQlesqsf_13());
            pst.setInt(15,ad.getQlesqsf_14());
            pst.setInt(16,ad.getQlesqsf_15());
            pst.setInt(17,ad.getQlesqsf_16());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Q-LES Q-SF");

        }

        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Q-LES Q-SF");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
