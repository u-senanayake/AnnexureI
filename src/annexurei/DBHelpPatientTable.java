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

public class DBHelpPatientTable {
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public ResultSet getState(Patient patient){
        ResultSet rs1=null;
        try{
            String table_click=patient.getTable_click();
            String sql="select  * from state where id='"+table_click+"'";
            pst=conn.prepareStatement(sql);
            rs1=pst.executeQuery();
            return rs1;
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage()+"get state");
        }
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
        return rs1;
    }
     public ResultSet getNameID(){
        ResultSet rst=null; 
        try{
            String sql="SELECT id,name FROM patient";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rst=rs;
            }
       catch (Exception exp){
           JOptionPane.showMessageDialog(null, exp.getMessage());
           System.out.println(exp.getMessage());
       }
        
        return rst;
    }
     public void addPatientTable(Patient patient){
         try{
            String sql="insert into patient(ID,NAME,GENDER,RELIGION,RACE,TOWN,EMPLOYEEMENT,DATE_BIRTH,REGISTER_DATE,DATE_T6,DATE_T12,EMAIL,TELEPHONE,CONTACT_PERSON,ADRESS,REFERED_BY,AGE,DIOGNOSIS,LEVEL_MOTIVATION)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,patient.getId() );
            pst.setString(2,patient.getName());
            pst.setString(3, patient.getGender());
            pst.setString(4,patient.getReligion());
            pst.setString(5,patient.getRace());
            pst.setString(6,patient.getTown());
            pst.setString(7,patient.getEmployeement());
            pst.setString(8,patient.getDate_birth());
            pst.setString(9,patient.getRegister_date());
            pst.setString(10,patient.getDate_t6());
            pst.setString(11,patient.getDate_t12());
            pst.setString(12,patient.getEmail());
            pst.setString(13,patient.getTelephone());
            pst.setString(14,patient.getContact_person());
            pst.setString(15,patient.getAdress());
            pst.setString(16,patient.getReferedby());
            pst.setString(17,patient.getAge());
            pst.setString(18,patient.getDiognosis());
            pst.setString(19,patient.getLevel_motivation());
            pst.execute();
            JOptionPane.showMessageDialog(null, "saved");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());}
        finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){}
            }
     }
}
