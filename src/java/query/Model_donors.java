/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entities.Donors;
import entities.Timeclose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ahmed
 */
public class Model_donors {
    
     CheckDatabase cd=new CheckDatabase();
      Connection connect=null;
     ResultSet rs=null;
     Model_Timeclose model_Timeclose=new Model_Timeclose();
    public int insert_donor(Donors donors ) throws SQLException{
        int result=0;
        try{
          connect=cd.check();
         String query="INSERT INTO `donor`(`id`, `bloodtype`, `bloodstatus`, `Number_of_bags`, `description`, `ssn`, `hospital_id`) VALUES (null,"
                 + "'"+donors.getBloodtype()+"','"+donors.getBloodstatus()+"','"+donors.getNumber_of_bags()+"','"+donors.getDescription()+"','"+donors.getSsn()+"','"+donors.getHospital_id()+"') ";
                  
           Statement ps = connect.createStatement();
         
       result=  ps.executeUpdate(query);
        
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{
          closeConnection(connect);
          return result;
        }
    }
    
    public void closeConnection( Connection connect) throws SQLException{
          connect.close();
      }
      public void closeResultSet (ResultSet rs) throws SQLException{
          rs.close();
      }
      
      
      public ResultSet selectDonorTS(int id) throws SQLException{
         
        try{
          connect=cd.check();
         String query="SELECT `bloodtype`, `bloodstatus`,`ssn` FROM `donor`  WHERE `hospital_id`='"+id+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
         return rs;     
        } }
      
       
      public String selectDonorBloodType(int hid,int ssn) throws SQLException {
                     String bloddtype=null;

        ResultSet rs = null;
        try {
            connect = cd.check();
         String query="SELECT  `bloodtype`   FROM `donor` WHERE `hospital_id`='"+hid+"' AND`ssn`='"+ssn+"'";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
 
                bloddtype=rs.getString(1);
                 

            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return bloddtype;
        }
    }  
      public String selectDonorStatus(int hid,int ssn) throws SQLException {
                     String bloodstatus=null;

        ResultSet rs = null;
        try {
            connect = cd.check();
         String query="SELECT  `bloodstatus`   FROM `donor` WHERE `hospital_id`='"+hid+"' AND`ssn`='"+ssn+"'";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
 
                bloodstatus=rs.getString(1);
                 

            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return bloodstatus;
        }
    } 
      public int selectNumberOfDonors( ) throws SQLException{
         int count=0;
        try{ 
          connect=cd.check();
         String query="SELECT COUNT(`id` )FROM `donor`";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
         while(rs.next()){
         count=rs.getInt(1);
         }
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
           rs.close();
           connect.close();
         return count;     
        } }
}
