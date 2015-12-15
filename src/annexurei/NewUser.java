/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annexurei;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Udayanga
 */
public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    Statement stmt;
    Connection conn =DBConnect.Connect();
    ResultSet rs=null;
    PreparedStatement pst=null;
    public NewUser() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    private void createDatabase(){
        try {
        sta.setText("Creating Database");
        String databaseName = "annexurei_1";
        String userName = "root";
        String password = "";

        String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
        Connection connection = DriverManager.getConnection(url,userName, password);

        String sql = "CREATE DATABASE " + databaseName;

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText(databaseName + " Database has been created successfully");
    } catch (SQLException | HeadlessException e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createUserTable(){
        try {
        sta.setText("Creating User table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE  `user` (`user_name` varchar(10) NOT NULL,`password` varchar(10) NOT NULL) ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
       // JOptionPane.showMessageDialog(null, "User table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("User table has been created successfully");
    } catch (SQLException | HeadlessException e) {
sta.setText(e.getMessage());        
//JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void insertToTable(){
        try{
            //Statement stmt;
            Connection conn1 =DBConnect.Connect();
            //ResultSet rs=null;
            PreparedStatement pst1=null;
            
            String sql="INSERT INTO user (user_name, password) VALUES(?, ?);";
            pst1=conn1.prepareStatement(sql);
            pst1.setString(1,USER.getText() );
            pst1.setString(2,PASS.getText());
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Saved");
            }
            catch(SQLException | HeadlessException ex){
             sta.setText(ex.getMessage());
                //JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    private void createAuditTable(){
        try {
            sta.setText("Creating AUDIT table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `audit` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `audit_1` int(11) NOT NULL,\n" +
"  `audit_2` int(11) NOT NULL,\n" +
"  `audit_3` int(11) NOT NULL,\n" +
"  `audit_4` int(11) NOT NULL,\n" +
"  `audit_5` int(11) NOT NULL,\n" +
"  `audit_6` int(11) NOT NULL,\n" +
"  `audit_7` int(11) NOT NULL,\n" +
"  `audit_8` int(11) NOT NULL,\n" +
"  `audit_9` int(11) NOT NULL,\n" +
"  `audit_10` int(11) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
       // JOptionPane.showMessageDialog(null, "Audit table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Audit table has been created successfully");
    } catch (SQLException | HeadlessException e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createAudit_6Table(){
        try {
            sta.setText("Creating Audit 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `audit_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `audit_1` int(11) NOT NULL,\n" +
"  `audit_2` int(11) NOT NULL,\n" +
"  `audit_3` int(11) NOT NULL,\n" +
"  `audit_4` int(11) NOT NULL,\n" +
"  `audit_5` int(11) NOT NULL,\n" +
"  `audit_6` int(11) NOT NULL,\n" +
"  `audit_7` int(11) NOT NULL,\n" +
"  `audit_8` int(11) NOT NULL,\n" +
"  `audit_9` int(11) NOT NULL,\n" +
"  `audit_10` int(11) NOT NULL\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "Audit 6 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Audit 6 table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createAudit_12Table(){
        try {
            sta.setText("Creating AUDIT 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `audit_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `audit_1` int(11) NOT NULL,\n" +
"  `audit_2` int(11) NOT NULL,\n" +
"  `audit_3` int(11) NOT NULL,\n" +
"  `audit_4` int(11) NOT NULL,\n" +
"  `audit_5` int(11) NOT NULL,\n" +
"  `audit_6` int(11) NOT NULL,\n" +
"  `audit_7` int(11) NOT NULL,\n" +
"  `audit_8` int(11) NOT NULL,\n" +
"  `audit_9` int(11) NOT NULL,\n" +
"  `audit_10` int(11) NOT NULL\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "Audit 12 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Audit 12 table has been created successfully");
    } catch (Exception e) {
       sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createBloodTable(){
        try {
            sta.setText("Creating Blood Test table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `blood_test` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `alt_sgpt` varchar(20) NOT NULL,\n" +
"  `gamma` varchar(20) NOT NULL,\n" +
"  `mcv` varchar(20) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "Blood table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Blood table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createBlood_6Table(){
        try {
            sta.setText("Creating Blood Test 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `blood_test_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `alt_sgpt` varchar(20) NOT NULL,\n" +
"  `gamma` varchar(20) NOT NULL,\n" +
"  `mcv` varchar(20) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "Blood 6 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Blood 6 table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createBlood_12Table(){
        try {
            sta.setText("Creating Blood Test 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `blood_test_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `alt_sgpt` varchar(20) NOT NULL,\n" +
"  `gamma` varchar(20) NOT NULL,\n" +
"  `mcv` varchar(20) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "Blood 12 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Blood 12 table has been created successfully");
                
    } catch (Exception e) {
      sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMiniTable(){
        try {
            sta.setText("Creating MINI table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mini` (\n" +
"  `alcohol_dependence_current` varchar(5) NOT NULL,\n" +
"  `alcohol_abuse_current` varchar(5) NOT NULL,\n" +
"  `psychotic_disoeder_current` varchar(5) NOT NULL,\n" +
"  `psychotic_disoeder_lifetime` varchar(5) NOT NULL,\n" +
"  `id` varchar(10) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MINI table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MINI table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQaTable(){
        try {
            sta.setText("Creating MMQa table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqa` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqa_1` varchar(2) NOT NULL,\n" +
"  `mmqa_2` varchar(2) NOT NULL,\n" +
"  `mmqa_3` varchar(2) NOT NULL,\n" +
"  `mmqa_4` varchar(2) NOT NULL,\n" +
"  `mmqa_5` varchar(2) NOT NULL,\n" +
"  `mmqa_6` varchar(2) NOT NULL,\n" +
"  `mmqa_7` varchar(2) NOT NULL,\n" +
"  `mmqa_8` varchar(2) NOT NULL,\n" +
"  `mmqa_9` varchar(2) NOT NULL,\n" +
"  `mmqa_10` varchar(2) NOT NULL,\n" +
"  `mmqa_11` varchar(2) NOT NULL,\n" +
"  `mmqa_12` varchar(2) NOT NULL,\n" +
"  `mmqa_13` varchar(2) NOT NULL,\n" +
"  `mmqa_14` varchar(2) NOT NULL,\n" +
"  `mmqa_15` varchar(2) NOT NULL,\n" +
"  `mmqa_16` varchar(2) NOT NULL,\n" +
"  `mmqa_17` varchar(2) NOT NULL,\n" +
"  `mmqa_18` varchar(2) NOT NULL,\n" +
"  `mmqa_19` varchar(2) NOT NULL,\n" +
"  `mmqa_20` varchar(2) NOT NULL,\n" +
"  `mmqa_21` varchar(2) NOT NULL,\n" +
"  `mmqa_22` varchar(2) NOT NULL,\n" +
"  `mmqa_23` varchar(2) NOT NULL,\n" +
"  `mmqa_24` varchar(2) NOT NULL,\n" +
"  `mmqa_25` varchar(2) NOT NULL,\n" +
"  `mmqa_26` varchar(2) NOT NULL,\n" +
"  `mmqa_27` varchar(2) NOT NULL,\n" +
"  `mmqa_28` varchar(2) NOT NULL,\n" +
"  `mmqa_29` varchar(2) NOT NULL,\n" +
"  `mmqa_30` varchar(2) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
       // JOptionPane.showMessageDialog(null, "MMQa table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
       sta.setText("MMQa table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQa_6Table(){
        try {
            sta.setText("Creating MMQa 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqa_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqa_1` varchar(2) NOT NULL,\n" +
"  `mmqa_2` varchar(2) NOT NULL,\n" +
"  `mmqa_3` varchar(2) NOT NULL,\n" +
"  `mmqa_4` varchar(2) NOT NULL,\n" +
"  `mmqa_5` varchar(2) NOT NULL,\n" +
"  `mmqa_6` varchar(2) NOT NULL,\n" +
"  `mmqa_7` varchar(2) NOT NULL,\n" +
"  `mmqa_8` varchar(2) NOT NULL,\n" +
"  `mmqa_9` varchar(2) NOT NULL,\n" +
"  `mmqa_10` varchar(2) NOT NULL,\n" +
"  `mmqa_11` varchar(2) NOT NULL,\n" +
"  `mmqa_12` varchar(2) NOT NULL,\n" +
"  `mmqa_13` varchar(2) NOT NULL,\n" +
"  `mmqa_14` varchar(2) NOT NULL,\n" +
"  `mmqa_15` varchar(2) NOT NULL,\n" +
"  `mmqa_16` varchar(2) NOT NULL,\n" +
"  `mmqa_17` varchar(2) NOT NULL,\n" +
"  `mmqa_18` varchar(2) NOT NULL,\n" +
"  `mmqa_19` varchar(2) NOT NULL,\n" +
"  `mmqa_20` varchar(2) NOT NULL,\n" +
"  `mmqa_21` varchar(2) NOT NULL,\n" +
"  `mmqa_22` varchar(2) NOT NULL,\n" +
"  `mmqa_23` varchar(2) NOT NULL,\n" +
"  `mmqa_24` varchar(2) NOT NULL,\n" +
"  `mmqa_25` varchar(2) NOT NULL,\n" +
"  `mmqa_26` varchar(2) NOT NULL,\n" +
"  `mmqa_27` varchar(2) NOT NULL,\n" +
"  `mmqa_28` varchar(2) NOT NULL,\n" +
"  `mmqa_29` varchar(2) NOT NULL,\n" +
"  `mmqa_30` varchar(2) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MMQa 6 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MMQa 6 table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQa_12Table(){
        try {
            sta.setText("Creating MMQa 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqa_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqa_1` varchar(2) NOT NULL,\n" +
"  `mmqa_2` varchar(2) NOT NULL,\n" +
"  `mmqa_3` varchar(2) NOT NULL,\n" +
"  `mmqa_4` varchar(2) NOT NULL,\n" +
"  `mmqa_5` varchar(2) NOT NULL,\n" +
"  `mmqa_6` varchar(2) NOT NULL,\n" +
"  `mmqa_7` varchar(2) NOT NULL,\n" +
"  `mmqa_8` varchar(2) NOT NULL,\n" +
"  `mmqa_9` varchar(2) NOT NULL,\n" +
"  `mmqa_10` varchar(2) NOT NULL,\n" +
"  `mmqa_11` varchar(2) NOT NULL,\n" +
"  `mmqa_12` varchar(2) NOT NULL,\n" +
"  `mmqa_13` varchar(2) NOT NULL,\n" +
"  `mmqa_14` varchar(2) NOT NULL,\n" +
"  `mmqa_15` varchar(2) NOT NULL,\n" +
"  `mmqa_16` varchar(2) NOT NULL,\n" +
"  `mmqa_17` varchar(2) NOT NULL,\n" +
"  `mmqa_18` varchar(2) NOT NULL,\n" +
"  `mmqa_19` varchar(2) NOT NULL,\n" +
"  `mmqa_20` varchar(2) NOT NULL,\n" +
"  `mmqa_21` varchar(2) NOT NULL,\n" +
"  `mmqa_22` varchar(2) NOT NULL,\n" +
"  `mmqa_23` varchar(2) NOT NULL,\n" +
"  `mmqa_24` varchar(2) NOT NULL,\n" +
"  `mmqa_25` varchar(2) NOT NULL,\n" +
"  `mmqa_26` varchar(2) NOT NULL,\n" +
"  `mmqa_27` varchar(2) NOT NULL,\n" +
"  `mmqa_28` varchar(2) NOT NULL,\n" +
"  `mmqa_29` varchar(2) NOT NULL,\n" +
"  `mmqa_30` varchar(2) NOT NULL\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MMQa 12 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MMQa 12 table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQbTable(){
        try {
            sta.setText("Creating MMQb table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqb` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqb_1` varchar(2) NOT NULL,\n" +
"  `mmqb_2` varchar(2) NOT NULL,\n" +
"  `mmqb_3` varchar(2) NOT NULL,\n" +
"  `mmqb_4` varchar(2) NOT NULL,\n" +
"  `mmqb_5` varchar(2) NOT NULL,\n" +
"  `mmqb_6` varchar(2) NOT NULL,\n" +
"  `mmqb_7` varchar(2) NOT NULL,\n" +
"  `mmqb_8` varchar(2) NOT NULL,\n" +
"  `mmqb_9` varchar(2) NOT NULL,\n" +
"  `mmqb_10` varchar(2) NOT NULL,\n" +
"  `mmqb_11` varchar(2) NOT NULL,\n" +
"  `mmqb_12` varchar(2) NOT NULL,\n" +
"  `mmqb_13` varchar(2) NOT NULL,\n" +
"  `mmqb_14` varchar(2) NOT NULL,\n" +
"  `mmqb_15` varchar(2) NOT NULL,\n" +
"  `mmqb_16` varchar(2) NOT NULL,\n" +
"  `mmqb_17` varchar(2) NOT NULL,\n" +
"  `mmqb_18` varchar(2) NOT NULL,\n" +
"  `mmqb_19` varchar(2) NOT NULL,\n" +
"  `mmqb_20` varchar(2) NOT NULL,\n" +
"  `mmqb_21` varchar(2) NOT NULL,\n" +
"  `mmqb_22` varchar(2) NOT NULL,\n" +
"  `mmqb_23` varchar(2) NOT NULL,\n" +
"  `mmqb_24` varchar(2) NOT NULL,\n" +
"  `mmqb_25` varchar(2) NOT NULL,\n" +
"  `mmqb_26` varchar(2) NOT NULL,\n" +
"  `mmqb_27` varchar(2) NOT NULL,\n" +
"  `mmqb_28` varchar(2) NOT NULL,\n" +
"  `mmqb_29` varchar(2) NOT NULL,\n" +
"  `mmqb_30` varchar(2) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MMQb table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MMQb table has been created successfully");
    } catch (SQLException | HeadlessException e) {
       sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQb_6Table(){
        try {
            sta.setText("Creating MMQb 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqb_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqb_1` varchar(2) NOT NULL,\n" +
"  `mmqb_2` varchar(2) NOT NULL,\n" +
"  `mmqb_3` varchar(2) NOT NULL,\n" +
"  `mmqb_4` varchar(2) NOT NULL,\n" +
"  `mmqb_5` varchar(2) NOT NULL,\n" +
"  `mmqb_6` varchar(2) NOT NULL,\n" +
"  `mmqb_7` varchar(2) NOT NULL,\n" +
"  `mmqb_8` varchar(2) NOT NULL,\n" +
"  `mmqb_9` varchar(2) NOT NULL,\n" +
"  `mmqb_10` varchar(2) NOT NULL,\n" +
"  `mmqb_11` varchar(2) NOT NULL,\n" +
"  `mmqb_12` varchar(2) NOT NULL,\n" +
"  `mmqb_13` varchar(2) NOT NULL,\n" +
"  `mmqb_14` varchar(2) NOT NULL,\n" +
"  `mmqb_15` varchar(2) NOT NULL,\n" +
"  `mmqb_16` varchar(2) NOT NULL,\n" +
"  `mmqb_17` varchar(2) NOT NULL,\n" +
"  `mmqb_18` varchar(2) NOT NULL,\n" +
"  `mmqb_19` varchar(2) NOT NULL,\n" +
"  `mmqb_20` varchar(2) NOT NULL,\n" +
"  `mmqb_21` varchar(2) NOT NULL,\n" +
"  `mmqb_22` varchar(2) NOT NULL,\n" +
"  `mmqb_23` varchar(2) NOT NULL,\n" +
"  `mmqb_24` varchar(2) NOT NULL,\n" +
"  `mmqb_25` varchar(2) NOT NULL,\n" +
"  `mmqb_26` varchar(2) NOT NULL,\n" +
"  `mmqb_27` varchar(2) NOT NULL,\n" +
"  `mmqb_28` varchar(2) NOT NULL,\n" +
"  `mmqb_29` varchar(2) NOT NULL,\n" +
"  `mmqb_30` varchar(2) NOT NULL\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MMQb 6 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MMQb 6 table has been created successfully");
    } catch (Exception e) {
        sta.setText(e.getMessage());
        //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void createMMQb_12Table(){
        try {
            sta.setText("Creating MMQb 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `mmqb_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `mmqb_1` varchar(2) NOT NULL,\n" +
"  `mmqb_2` varchar(2) NOT NULL,\n" +
"  `mmqb_3` varchar(2) NOT NULL,\n" +
"  `mmqb_4` varchar(2) NOT NULL,\n" +
"  `mmqb_5` varchar(2) NOT NULL,\n" +
"  `mmqb_6` varchar(2) NOT NULL,\n" +
"  `mmqb_7` varchar(2) NOT NULL,\n" +
"  `mmqb_8` varchar(2) NOT NULL,\n" +
"  `mmqb_9` varchar(2) NOT NULL,\n" +
"  `mmqb_10` varchar(2) NOT NULL,\n" +
"  `mmqb_11` varchar(2) NOT NULL,\n" +
"  `mmqb_12` varchar(2) NOT NULL,\n" +
"  `mmqb_13` varchar(2) NOT NULL,\n" +
"  `mmqb_14` varchar(2) NOT NULL,\n" +
"  `mmqb_15` varchar(2) NOT NULL,\n" +
"  `mmqb_16` varchar(2) NOT NULL,\n" +
"  `mmqb_17` varchar(2) NOT NULL,\n" +
"  `mmqb_18` varchar(2) NOT NULL,\n" +
"  `mmqb_19` varchar(2) NOT NULL,\n" +
"  `mmqb_20` varchar(2) NOT NULL,\n" +
"  `mmqb_21` varchar(2) NOT NULL,\n" +
"  `mmqb_22` varchar(2) NOT NULL,\n" +
"  `mmqb_23` varchar(2) NOT NULL,\n" +
"  `mmqb_24` varchar(2) NOT NULL,\n" +
"  `mmqb_25` varchar(2) NOT NULL,\n" +
"  `mmqb_26` varchar(2) NOT NULL,\n" +
"  `mmqb_27` varchar(2) NOT NULL,\n" +
"  `mmqb_28` varchar(2) NOT NULL,\n" +
"  `mmqb_29` varchar(2) NOT NULL,\n" +
"  `mmqb_30` varchar(2) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "MMQb 12 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("MMQb 12 table has been created successfully");
    } catch (SQLException | HeadlessException e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
    sta.setText(e.getMessage());    
    }
    }
    private void createPatientTable(){
        try {
            sta.setText("Creating Patient table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `patient` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `name` varchar(30) NOT NULL,\n" +
"  `gender` varchar(10) NOT NULL,\n" +
"  `religion` varchar(20) NOT NULL,\n" +
"  `race` varchar(20) NOT NULL,\n" +
"  `town` varchar(20) NOT NULL,\n" +
"  `employeement` varchar(30) NOT NULL,\n" +
"  `date_birth` date NOT NULL,\n" +
"  `register_date` date NOT NULL,\n" +
"  `date_t6` date DEFAULT NULL,\n" +
"  `date_t12` date DEFAULT NULL,\n" +
"  `email` varchar(30) NOT NULL,\n" +
"  `telephone` varchar(15) NOT NULL,\n" +
"  `contact_person` varchar(100) NOT NULL,\n" +
"  `adress` varchar(70) NOT NULL,\n" +
"  `refered_by` varchar(20) NOT NULL,\n" +
"  `age` varchar(15) NOT NULL,\n" +
"  `diognosis` varchar(50) NOT NULL,\n" +
"  `level_motivation` varchar(30) NOT NULL,\n" +
"  PRIMARY KEY (`id`)\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
       // JOptionPane.showMessageDialog(null, "Patient table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
       sta.setText("Patient table has been created successfully");
    } catch (SQLException | HeadlessException e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
    sta.setText(e.getMessage());    
    }
    }
    private void createQlefQsfTable(){
        try {
            sta.setText("Creating Q LEF Q SF table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `q_lef_q_sf` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `q_lef_q_sf_1` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_2` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_3` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_4` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_5` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_6` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_7` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_8` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_9` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_10` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_11` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_12` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_13` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_14` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_15` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_16` int(11) NOT NULL\n" +
")  ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
       // JOptionPane.showMessageDialog(null, "Q LEF QSF table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
       sta.setText("Q LEF QSF table has been created successfully");
    } catch (SQLException | HeadlessException e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
    sta.setText(e.getMessage());    
    }
    }
    private void createQlefQs_6fTable(){
        try {
            sta.setText("Creating Q LEF Q SF 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `q_lef_q_sf_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `q_lef_q_sf_1` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_2` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_3` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_4` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_5` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_6` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_7` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_8` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_9` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_10` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_11` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_12` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_13` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_14` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_15` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_16` int(11) NOT NULL\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    //        JOptionPane.showMessageDialog(null, "Q LEF QSF 6 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Q LEF QSF 6 table has been created successfully");
    } catch (SQLException | HeadlessException e) {
       // JOptionPane.showMessageDialog(null, e.getMessage());
       sta.setText(e.getMessage());
    }
    }
    private void createQlefQsf_12Table(){
        try {
            sta.setText("Creating Q LEF Q SF 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `q_lef_q_sf_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `q_lef_q_sf_1` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_2` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_3` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_4` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_5` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_6` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_7` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_8` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_9` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_10` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_11` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_12` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_13` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_14` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_15` int(11) NOT NULL,\n" +
"  `q_lef_q_sf_16` int(11) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
     //   JOptionPane.showMessageDialog(null, "Q LEF QSF 12 table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("Q LEF QSF 12 table has been created successfully");
    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, e.getMessage());
       sta.setText(e.getMessage());
    }
    }
    private void createStateTable(){
        try {
            sta.setText("Creating State table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `state` (\n" +
"  `T0_audit` varchar(1) NOT NULL,\n" +
"  `T0_tlfb` varchar(1) NOT NULL,\n" +
"  `T0_mmqa` varchar(1) NOT NULL,\n" +
"  `T0_mmqb` varchar(1) NOT NULL,\n" +
"  `T0_qles_qsf` varchar(1) NOT NULL,\n" +
"  `T6_tlfb` varchar(1) NOT NULL,\n" +
"  `T6_mmqa` varchar(1) NOT NULL,\n" +
"  `T6_mmqb` varchar(1) NOT NULL,\n" +
"  `T6_qles_qsf` varchar(1) NOT NULL,\n" +
"  `T6_blood` varchar(1) NOT NULL,\n" +
"  `T12_audit` varchar(1) NOT NULL,\n" +
"  `T12_tlfb` varchar(1) NOT NULL,\n" +
"  `T12_mmqa` varchar(1) NOT NULL,\n" +
"  `T12_mmqb` varchar(1) NOT NULL,\n" +
"  `T12_qles_qsf` varchar(1) NOT NULL,\n" +
"  `T12_blood` varchar(1) NOT NULL,\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `T0_blood` varchar(1) NOT NULL,\n" +
"  PRIMARY KEY (`id`)\n" +
") ";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "State table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("State table has been created successfully");
    } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
        sta.setText(e.getMessage());
    }
    }
    private void createTlfbTable(){
        try {
            sta.setText("Creating TLFB table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `tlfb` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `tlfb_1` int(11) NOT NULL,\n" +
"  `tlfb_2` int(11) NOT NULL,\n" +
"  `tlfb_3` int(11) NOT NULL,\n" +
"  `tlfb_4` int(11) NOT NULL,\n" +
"  `tlfb_5` int(11) NOT NULL,\n" +
"  `tlfb_6` int(11) NOT NULL,\n" +
"  `tlfb_7` int(11) NOT NULL,\n" +
"  `tlfb_8` int(11) NOT NULL,\n" +
"  `tlfb_9` int(11) NOT NULL,\n" +
"  `tlfb_10` int(11) NOT NULL,\n" +
"  `tlfb_11` int(11) NOT NULL,\n" +
"  `tlfb_12` int(11) NOT NULL,\n" +
"  `tlfb_13` int(11) NOT NULL,\n" +
"  `tlfb_14` int(11) NOT NULL,\n" +
"  `tlfb_15` int(11) NOT NULL,\n" +
"  `tlfb_16` int(11) NOT NULL,\n" +
"  `tlfb_17` int(11) NOT NULL,\n" +
"  `tlfb_18` int(11) NOT NULL,\n" +
"  `tlfb_19` int(11) NOT NULL,\n" +
"  `tlfb_20` int(11) NOT NULL,\n" +
"  `tlfb_21` int(11) NOT NULL,\n" +
"  `tlfb_22` int(11) NOT NULL,\n" +
"  `tlfb_23` int(11) NOT NULL,\n" +
"  `tlfb_24` int(11) NOT NULL,\n" +
"  `tlfb_25` int(11) NOT NULL,\n" +
"  `tlfb_26` int(11) NOT NULL,\n" +
"  `tlfb_27` int(11) NOT NULL,\n" +
"  `tlfb_28` int(11) NOT NULL,\n" +
"  `tlfb_29` int(11) NOT NULL,\n" +
"  `tlfb_30` int(11) NOT NULL,\n" +
"  `tlfb_31` int(11) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        JOptionPane.showMessageDialog(null, "TLFB table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("TLFB table has been created successfully");
    } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
        sta.setText(e.getMessage());
    }
    }
    private void createTlfb_6Table(){
        try {
            sta.setText("Creating TLFB 6 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `tlfb_6` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `tlfb_1` int(11) NOT NULL,\n" +
"  `tlfb_2` int(11) NOT NULL,\n" +
"  `tlfb_3` int(11) NOT NULL,\n" +
"  `tlfb_4` int(11) NOT NULL,\n" +
"  `tlfb_5` int(11) NOT NULL,\n" +
"  `tlfb_6` int(11) NOT NULL,\n" +
"  `tlfb_7` int(11) NOT NULL,\n" +
"  `tlfb_8` int(11) NOT NULL,\n" +
"  `tlfb_9` int(11) NOT NULL,\n" +
"  `tlfb_10` int(11) NOT NULL,\n" +
"  `tlfb_11` int(11) NOT NULL,\n" +
"  `tlfb_12` int(11) NOT NULL,\n" +
"  `tlfb_13` int(11) NOT NULL,\n" +
"  `tlfb_14` int(11) NOT NULL,\n" +
"  `tlfb_15` int(11) NOT NULL,\n" +
"  `tlfb_16` int(11) NOT NULL,\n" +
"  `tlfb_17` int(11) NOT NULL,\n" +
"  `tlfb_18` int(11) NOT NULL,\n" +
"  `tlfb_19` int(11) NOT NULL,\n" +
"  `tlfb_20` int(11) NOT NULL,\n" +
"  `tlfb_21` int(11) NOT NULL,\n" +
"  `tlfb_22` int(11) NOT NULL,\n" +
"  `tlfb_23` int(11) NOT NULL,\n" +
"  `tlfb_24` int(11) NOT NULL,\n" +
"  `tlfb_25` int(11) NOT NULL,\n" +
"  `tlfb_26` int(11) NOT NULL,\n" +
"  `tlfb_27` int(11) NOT NULL,\n" +
"  `tlfb_28` int(11) NOT NULL,\n" +
"  `tlfb_29` int(11) NOT NULL,\n" +
"  `tlfb_30` int(11) NOT NULL,\n" +
"  `tlfb_31` int(11) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        //JOptionPane.showMessageDialog(null, "TLFB table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("TLFB table has been created successfully");
    } catch (Exception e) {
       // JOptionPane.showMessageDialog(null, e.getMessage());
       sta.setText(e.getMessage());
    }
    }
    private void createTlfb_126Table(){
        try {
            sta.setText("Creating TLFB 12 table");
        Connection connection = DBConnect.Connect();
        

        String sql = "CREATE TABLE IF NOT EXISTS `tlfb_12` (\n" +
"  `id` varchar(10) NOT NULL,\n" +
"  `tlfb_1` int(11) NOT NULL,\n" +
"  `tlfb_2` int(11) NOT NULL,\n" +
"  `tlfb_3` int(11) NOT NULL,\n" +
"  `tlfb_4` int(11) NOT NULL,\n" +
"  `tlfb_5` int(11) NOT NULL,\n" +
"  `tlfb_6` int(11) NOT NULL,\n" +
"  `tlfb_7` int(11) NOT NULL,\n" +
"  `tlfb_8` int(11) NOT NULL,\n" +
"  `tlfb_9` int(11) NOT NULL,\n" +
"  `tlfb_10` int(11) NOT NULL,\n" +
"  `tlfb_11` int(11) NOT NULL,\n" +
"  `tlfb_12` int(11) NOT NULL,\n" +
"  `tlfb_13` int(11) NOT NULL,\n" +
"  `tlfb_14` int(11) NOT NULL,\n" +
"  `tlfb_15` int(11) NOT NULL,\n" +
"  `tlfb_16` int(11) NOT NULL,\n" +
"  `tlfb_17` int(11) NOT NULL,\n" +
"  `tlfb_18` int(11) NOT NULL,\n" +
"  `tlfb_19` int(11) NOT NULL,\n" +
"  `tlfb_20` int(11) NOT NULL,\n" +
"  `tlfb_21` int(11) NOT NULL,\n" +
"  `tlfb_22` int(11) NOT NULL,\n" +
"  `tlfb_23` int(11) NOT NULL,\n" +
"  `tlfb_24` int(11) NOT NULL,\n" +
"  `tlfb_25` int(11) NOT NULL,\n" +
"  `tlfb_26` int(11) NOT NULL,\n" +
"  `tlfb_27` int(11) NOT NULL,\n" +
"  `tlfb_28` int(11) NOT NULL,\n" +
"  `tlfb_29` int(11) NOT NULL,\n" +
"  `tlfb_30` int(11) NOT NULL,\n" +
"  `tlfb_31` int(11) NOT NULL\n" +
")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
//        JOptionPane.showMessageDialog(null, "TLFB table has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        sta.setText("TLFB table has been created successfully");
    } catch (SQLException | HeadlessException e) {
        //JOptionPane.showMessageDialog(null, e.getMessage());
        sta.setText(e.getMessage());
    }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        USER = new javax.swing.JTextField();
        PASS = new javax.swing.JPasswordField();
        BTN_CREATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sta = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlpanel/Actions-user-group-new-icon.png"))); // NOI18N

        jLabel3.setText("User name");

        jLabel4.setText("Password");

        BTN_CREATE.setText("Create");
        BTN_CREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CREATEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(USER)
                    .addComponent(PASS)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_CREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(BTN_CREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sta.setEditable(false);
        sta.setColumns(20);
        sta.setRows(5);
        jScrollPane1.setViewportView(sta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CREATEActionPerformed
        createDatabase();
        createUserTable();
        createTlfb_126Table();
        createTlfb_6Table();
        createTlfbTable();
        createStateTable();
        createQlefQsf_12Table();
        createQlefQs_6fTable();
        createQlefQsfTable();
        createPatientTable();
        createMMQb_12Table();
        createMMQb_6Table();
        createMMQbTable();
        createMMQa_12Table();
        createMMQa_6Table();
        createMMQaTable();
        createMiniTable();
        createBlood_12Table();
        createBlood_6Table();
        createBloodTable();
        createAudit_12Table();
        createAudit_6Table();
        createAuditTable();
        insertToTable();    
        sta.setText("Database created.Close this and login aganin");
// TODO add your handling code here:
    }//GEN-LAST:event_BTN_CREATEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREATE;
    private javax.swing.JPasswordField PASS;
    private javax.swing.JTextField USER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea sta;
    // End of variables declaration//GEN-END:variables
}
