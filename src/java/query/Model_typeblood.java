/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entities.Bloodtype;
import entities.Timeclose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ahmed
 */
public class Model_typeblood {
  CheckDatabase cd=new CheckDatabase();
      Connection connect=null;
     ResultSet rs=null;
    public int insertBloodType(Bloodtype bloodtype,String tablename) throws SQLException{
        int result=0;
        try{
          connect=cd.check(); 
         String query= "INSERT INTO `"+tablename+"`(`id`, `count`, `hospital_id`) VALUES (null,'"+bloodtype.getCount()+"','"+bloodtype.getHospital_id()+"')";
         
                 Statement ps = connect.createStatement();
         
       result=  ps.executeUpdate(query);
        
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{
          closeConnection();
          return result;
        }}
    public void closeConnection() throws SQLException{
          connect.close();
      }
      public void closeResultSet () throws SQLException{
          rs.close();
      }  

public ResultSet selectBloodType(int id, String tablename) throws SQLException{
         
        try{
          connect=cd.check();
         String query="SELECT * FROM `"+tablename+"` WHERE `hospital_id`=1='"+id+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
         return rs;     
        } }


public int selectCountBlood(int id, String tablename) throws SQLException{
         int count=0;
        try{ 
          connect=cd.check();
         String query="SELECT `count` FROM `"+tablename+"` WHERE `hospital_id`='"+id+"'";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
         while(rs.next()){
         count=rs.getInt(1);
         }
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
            closeResultSet();
            closeConnection();
         return count;     
        } }

public int selectSumBloodType(  String tablename) throws SQLException{
         int count=0;
        try{ 
          connect=cd.check();
         String query="SELECT SUM(`count` )FROM `"+tablename+"`  ";
         Statement ps = connect.createStatement();
         
         rs=  ps.executeQuery(query); 
         while(rs.next()){
         count=rs.getInt(1);
         }
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{    
            closeResultSet();
            closeConnection();
         return count;     
        } }

 public int updateAddCountBlood(int id,String tablename,int numberofbage) throws SQLException{
        int result=0;
        int count=selectCountBlood(id, tablename);
        count=count+numberofbage;
        try{
          connect=cd.check(); 
         String query= "UPDATE `"+tablename+"` SET `count`='"+count+"'  WHERE `hospital_id`='"+id+"' ";
                 Statement ps = connect.createStatement();
         
       result=  ps.executeUpdate(query);
        
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{
          closeConnection();
          return result;
        }}
public int updateSubCountBlood(int id,String tablename,int numberofbage) throws SQLException{
        int result=0;
        int count=selectCountBlood(id, tablename);
        count=count-numberofbage;
        try{
          connect=cd.check(); 
         String query= "UPDATE `"+tablename+"` SET `count`='"+count+"'  WHERE `hospital_id`='"+id+"' ";
                 Statement ps = connect.createStatement();
         
       result=  ps.executeUpdate(query);
        
        }catch(SQLException e){
            System.out.println("error/n"+e.getMessage());
        }finally{
          closeConnection();
          return result;
        }}




}
