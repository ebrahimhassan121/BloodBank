/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entities.Hospital;
import entities.Phones;
import entities.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public class Model_hospital {

    CheckDatabase cd = new CheckDatabase();
    Connection connect = null;

    public int insert_hospital(Hospital hospital) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "INSERT INTO `hospital`(`id`, `name`, `email`, `password`, `state`, `street`) VALUES"
                    + ""
                    + ""
                    + " (null, '" + hospital.getName() + "', '" + hospital.getEmail() + "', '" + hospital.getPassword() + "', '" + hospital.getState()+ "', '" + hospital.getStreet()+ "');";

            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }
public void closeConnection() throws SQLException{
          connect.close();
      }
      public void closeResultSet (ResultSet rs) throws SQLException{
          rs.close();
      }
    public List<Hospital> select_hospittal(String email, String password) throws SQLException {
        List<Hospital> l = new ArrayList<>();
        Hospital hospital = new Hospital();
        ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT * FROM `hospital` WHERE `email`='" + email + "' AND `password`='" + password + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                hospital.setId(rs.getInt(1));

                hospital.setName(rs.getString(2));
                hospital.setEmail(rs.getString(3));
                hospital.setPassword(rs.getString(4));
                hospital.setState(rs.getString(5));
                hospital.setStreet(rs.getString(6));

                l.add(hospital);

            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return l;
        }
    }
     public String selectHospittalName(int id) throws SQLException {
                     String name=null;

        ResultSet rs = null;
        try {
            connect = cd.check();
             String query = "SELECT  `name` FROM `hospital` WHERE `id`='"+id+"' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
 
                name=rs.getString(1);
                 

            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return name;
        }
    }
    
    public ResultSet selectHospittalByState(String state) throws SQLException {
         ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT * FROM `hospital` WHERE `state`='" + state + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return rs;
            
        }
    }
    public ResultSet selectHospittal(String state) throws SQLException {
         ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT * FROM `hospital` WHERE `state`='" + state + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return rs;
        }
    }
    public ResultSet selectHospittalAll() throws SQLException {
         ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT * FROM `hospital` WHERE 1 ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return rs;
        }
    }
    public ArrayList selectHospittalStates() throws SQLException {
          ResultSet rs = null;
          String query=null ;
          ArrayList<String> states=new ArrayList<String>();
        try {
          
            query= "SELECT `state` FROM `hospital` WHERE 1 ";
          
            connect = cd.check();
           
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
               states.add(rs.getString("state"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return states;
        }
    }
    public ArrayList selectHospitalsByState(String state) throws SQLException {
         ResultSet rs = null;
         ArrayList<String> names=new ArrayList<>();
        try {
            connect = cd.check();
            String query = "SELECT `name` FROM `hospital` WHERE `state`='" + state + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while(rs.next()){
                names.add(rs.getString("name"));
            }
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return names;
            
        }
    }
    public ResultSet selectHospitalsByStateAndBloodType(String state,String Type) throws SQLException {
         ResultSet rs = null;
         ArrayList<String> names=new ArrayList<>();
        try {
            connect = cd.check();
            //String query="select * from `"+ Type+"` where "+ Type+".hospital_id IN (SELECT ID FROM `hospital` WHERE `state`='" + state + "')";
         String query="select `id`, `name`, `email`, `password`, `state`, `street` FROM `hospital` WHERE (`state` =\"" + state + "\" AND `id` IN ( select `hospital_id` from `"+Type+"` where 1=1 )) ";
        //    System.out.println(query);

//  String query = "SELECT * FROM `hospital` WHERE `state`='" + state + "' And ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
//            while(rs.next()){
//                String name=rs.getString("name");
//                System.out.println(name);
//                names.add(name);
//            }
//            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return rs;
            
        }
    }
    
    
     public int selectHospitalIDByName(String name) throws SQLException {
         ResultSet rs = null;
         int id = 0;
         ArrayList<String> names=new ArrayList<>();
        try {
            connect = cd.check();
            String query = "SELECT `id` FROM `hospital` WHERE `name`='" + name + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while(rs.next()){
                id=rs.getInt("id");
            }
            
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
             
            return id;
            
        }
    }
    /* 
          define    :this method for check hospital if find
          parameter :take name,password from enttities hospital
          return    : 1 if find other if not find
     */
    public int check_hospital(String email, String password) {
        int result = 0;
        try {
            List<Hospital> l = select_hospittal(email, password);
            if (!(l.isEmpty())) {
                result = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Model_hospital.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return result;
        }

    }

    /* 
          define    :this method for select email
          parameter :take name,password from enttities hospital
          return    : String:email 
     */
    public String select_email_hospital(String name, String password) {
        String email = null;
        try {
            List<Hospital> l = select_hospittal(name, password);
            for (Hospital hospital : l) {
                email = hospital.getEmail();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return email;
        }

    }

    /* 
          define    :this method for select id for hospital
          parameter :take name,password from enttities hospital
          return    : int :id 
     */
    public int select_id_hospital(String name, String password) {
        int id = 0;
        try {
            List<Hospital> l = select_hospittal(name, password);
            for (Hospital hospital : l) {
                id = hospital.getId();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return id;
        }

    }

    public int update_name_hospital(String password, String email, String uname) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `hospital` SET `name`='" + uname + "' WHERE `email`='" + email + "'AND password='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_email_hoospital(String password, String name, String email) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `hospital` SET `email`='" + email + "' WHERE `name`='" + name + "'AND password='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_password_hospital(String password, String name, String upassword) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `hospital` SET `password`='" + upassword + "' WHERE `name`='" + name + "'AND password='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }
    /////////////////////////
    public int update_state_hospital( String nstate,int id) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "UPDATE `hospital` SET  `state`='"+nstate+"'   WHERE `id`='"+id+"' ";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }
     /////////////////////////
    public int update_street_hospital( String nstreet,int id) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "UPDATE `hospital` SET  `street`='"+nstreet+"'   WHERE `id`='"+id+"' ";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    /////////////////////////////////////////
     public String select_state_hospital(String name, String password) {
        String state = null;
        try {
            List<Hospital> l = select_hospittal(name, password);
            for (Hospital hospital : l) {
                state = hospital.getState();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return state;
        }

    }

///////////////////////////////////////////////////////////////////////
     public String select_street_hospital(String name, String password) {
        String street = null;
        try {
            List<Hospital> l = select_hospittal(name, password);
            for (Hospital hospital : l) {
                street = hospital.getStreet();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return street;
        }

    }

    
    
  /////////////////////////////////////////////  
    
    
    Phones phones = new Phones();

    public int insert_phone_hospital(String phone, int id) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " INSERT INTO `phones`(`id`, `phoneNumber`, `id_hospital`) VALUES "
                    + "(null,'" +phone+ "','" + id + "')";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }public int update_phone_hospital(String nphone,String ophone ) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "UPDATE `phones` SET  `phoneNumber`='"+nphone+"'  WHERE `phoneNumber`='"+ophone+"'  ";
            Statement ps =  connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public ArrayList<String> select_phone_hospittal(int id) throws SQLException {
        ArrayList<String> x = new ArrayList<>();
        int i = 0;
        Phones phones = new Phones();
        ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT `phoneNumber` FROM `phones` WHERE `id_hospital`='" + id + "'";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                x.add(rs.getString(1));
                i++;

            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return x;
        }
    }

}
