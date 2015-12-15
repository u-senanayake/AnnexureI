/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodTest;

/**
 *
 * @author Udayanga
 */
import annexurei.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DBHelpBloodTest {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void addBloodTest(BloodTestDB ad){
        try{
            String sql="insert into blood_test(id,alt_sgpt,gamma,mcv)values(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getIs());
            pst.setString(2,ad.getAlt_sgpt());
            pst.setString(3,ad.getGamma());
            pst.setString(4,ad.getMcv());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Blood Test");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Blood Test");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addBloodTest_T6(BloodTestDB ad){
        try{
            String sql="insert into blood_test_6(id,alt_sgpt,gamma,mcv)values(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getIs());
            pst.setString(2,ad.getAlt_sgpt());
            pst.setString(3,ad.getGamma());
            pst.setString(4,ad.getMcv());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Blood Test");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Blood Test");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
    public void addBloodTest_T12(BloodTestDB ad){
        try{
            String sql="insert into blood_test_12(id,alt_sgpt,gamma,mcv)values(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,ad.getIs());
            pst.setString(2,ad.getAlt_sgpt());
            pst.setString(3,ad.getGamma());
            pst.setString(4,ad.getMcv());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved to Blood Test");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"Save Blood Test");}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
