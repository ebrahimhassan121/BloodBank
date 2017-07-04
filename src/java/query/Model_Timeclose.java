/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entities.Hospital;
import entities.Timeclose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class Model_Timeclose {
  CheckDatabase cd=new CheckDatabase();
      Connection connect=null;
     ResultSet rs=null;
    public int insert_timeclose(Timeclose timeclose) throws SQLException{
        int result=0;
        try{
          connect=cd.check();
         String query="INSERT INTO `timeclose`(`id`, `time`, `date`, `bloodtype`, `hospital_id`, `donor_ssn`) VALUES"
         + " (null,'"+timeclose. getTime()+"','"+timeclose.getDate()+"','"+timeclose.getBloodtrpe()+"','"+timeclose.getHospital_id()+"','"+timeclose.getDonar_id()+"') ";
         Statement ps = connect.createStatement();
         
       result=  ps.executeUpdate(query);
        
        }catch(SQLException e){
            System.out.println("error\t"+e.getMessage());
        }finally{
          closeConnection(connect);
          return result;
        }
    }
      public ResultSet select_timeclose(int id) throws SQLException{
         
        try{
          connect=cd.check();
         String query="SELECT * FROM `timeclose` WHERE `hospital_id`='"+id+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
         return rs;     
        } }
      
      public ArrayList select_timeReserved(int id , String date){
      ArrayList<Long> reservedTimes=null;
        
        try{
          connect=cd.check();
         String query="SELECT `time` FROM `timeclose` WHERE `hospital_id`='"+id+"' AND `date`='"+date+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
         while(rs.next()){
             reservedTimes.add(rs.getLong("time"));
         }
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }
        finally{
            return  reservedTimes;
        }
      
      }
      
       public ResultSet select_timecloseTDI(int id,int flag) throws SQLException{
         
        try{
          connect=cd.check();
         String query="SELECT `time`, `date` , `hospital_id` FROM `timeclose` WHERE `donor_ssn`='"+id+"' AND flag="+flag;
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
         return rs;     
        } }
      public ResultSet selectTimeCloseTD(int id) throws SQLException{
         
        try{
          connect=cd.check();
         String query="SELECT   `time`, `date`  FROM `timeclose  WHERE `hospital_id`='"+id+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
            closeConnection(connect);
         return rs; 
         
        } }
      public void closeConnection( Connection connect) throws SQLException{
          connect.close();
      }
      public void closeConnections( ) throws SQLException{
          connect.close();
      }
      public void closeResultSet (ResultSet rs) throws SQLException{
          rs.close();
      }
      
}
        
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   

