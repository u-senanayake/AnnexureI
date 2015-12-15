/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import annexurei.*;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Udayanga
 */
public class DBHelpState {
    Connection conn=DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
        public void addState(state sts){
            try{
            String sql="insert into state(ID,T0_audit,T0_tlfb,T0_mmqa,T0_mmqb,T0_qles_qsf,T0_blood,T6_tlfb,T6_mmqa,T6_mmqb,T6_qles_qsf,T6_blood,T12_audit,T12_tlfb,T12_mmqa,T12_mmqb,T12_qles_qsf,T12_blood)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,sts.getId() );
            pst.setString(2,sts.getT0_audit());
            pst.setString(3,sts.getT0_tlfb());
            pst.setString(4,sts.getT0_mmqa());
            pst.setString(5,sts.getT0_mmqb());
            pst.setString(6,sts.getT0_qles_qsf());
            pst.setString(7,sts.getT0_blood());
            pst.setString(8,sts.getT6_tlfb());
            pst.setString(9,sts.getT6_mmqa());
            pst.setString(10,sts.getT6_mmqb());
            pst.setString(11,sts.getT6_qles_qsf());
            pst.setString(12,sts.getT6_blood());
            pst.setString(13,sts.getT12_audit());
            pst.setString(14,sts.getT12_tlfb());
            pst.setString(15,sts.getT12_mmqa());
            pst.setString(16,sts.getT12_mmqb());
            pst.setString(17,sts.getT12_qles_qsf());
            pst.setString(18,sts.getT12_blood());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Adedd to state ");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+"\nDB add State");}
        
     }
        public void updateStateBlood(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_blood ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(Exception exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update");      
      }
           
    } 
        
         public void updateStateBlood_6(state s){
            try{
            String id=s.getId();
            String sql="update state set T6_blood ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update blood 6");      
            }
           
        }
        public void updateStateBlood_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_blood ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update blood 12");      
            }
            
        }
        /*****************************************************************************
         * TLFB
         */
        public void updateStateTLFB(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_tlfb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(Exception exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update TLFB ");      
      }
            
    } 
        
         public void updateStateTLFB_6(state s){
            try{
            String id=s.getId();
            String sql="update state set T6_tlfb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update TLFB 6");      
            }
            
        }
        public void updateStateTLFB_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_tlfb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update TLFB 12");      
            }
            
        }
        /*****************************************************************************
         * MMQa
         */
        public void updateStateMMQa(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_mmqa ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(Exception exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQa ");      
      }
            
    } 
        
         public void updateStateMMQa_6(state s){
            try{
            String id=s.getId();
            String sql="update state set T6_mmqa ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQa 6");      
            }
            
        }
        public void updateStateMMQa_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_mmqa ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQa 12");      
            }
            
        }
                /*****************************************************************************
         * MMQb
         */
        public void updateStateMMQb(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_mmqb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(Exception exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQb ");      
      }
            
    } 
        
         public void updateStateMMQb_6(state s){
            try{
            String id=s.getId();
            String sql="update state set T6_mmqb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQb 6");      
            }
            
        }
        public void updateStateMMQb_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_mmqb ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(SQLException | HeadlessException exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update MMQb 12");      
            }
            
        }
        
                        /*****************************************************************************
         * 
         */
        public void updateStateQlesQsf(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_qles_qsf ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(SQLException | HeadlessException exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update QlesQsf ");      
      }
            
    } 
        
         public void updateStateQlesQsf_6(state s){
            try{
            String id=s.getId();
            String sql="update state set T6_qles_qsf ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update QlesQsf 6");      
            }
            
        }
        public void updateStateQlesQsf_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_qles_qsf ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update QlesQsf 12");      
            }
            
        }
        
                        /*****************************************************************************
         * 
         */
        public void updateStateAUDIT(state s){
            try{
            String id=s.getId();
            String sql="update state set T0_audit ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
      }
      catch(Exception exp){
        JOptionPane.showMessageDialog(null, exp.getMessage()+"State update AUDIT ");      
      }
            
    } 
        
//         public void updateStateAUDIT_6(state s){
//            try{
//            String id=s.getId();
//            String sql="update state set T6_qles_qsf ='y' where id=?";
//            pst=conn.prepareStatement(sql);
//            pst.setString(1, id);
//            pst.execute();
//            JOptionPane.showMessageDialog(null, "State table Updated");
//            }
//            catch(Exception exp){
//                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update QlesQsf 6");      
//            }
//        }
        public void updateStateAUDIT_12(state s){
            try{
            String id=s.getId();
            String sql="update state set T12_audit ='y' where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "State table Updated");
            }
            catch(Exception exp){
                JOptionPane.showMessageDialog(null, exp.getMessage()+"State update AUDIT 12");      
            }
            
        }
}

