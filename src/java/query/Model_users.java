package query;

import entities.Hospital;
import entities.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmed
 */
public class Model_users {

    CheckDatabase cd = new CheckDatabase();
    Users user = new Users();
    Hospital hospital = new Hospital();
    Connection connect = null;
    ResultSet re = null;

    /* 
          define    :this method for inset user to database 
          parameter :take object from enttities users
          return    : 1 if insert other if not insert
     */
    public int insert_user(Users user) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "INSERT INTO `user` (`id`, `name`, `password`, `email`, `birthdate`, `phonenumber`, `ssn`,`type`) VALUES "
                    + "(NULL, '" + user.getName() + "', '" + user.getPassword() + "', '" + user.getEmail() + "', '" + user.getBirthdate() + "', '" + user.getPhonrnumber() + "', '" + user.getSsn() + "','user');";

            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public List<Users> select_user(String email, String password) throws SQLException {
        List<Users> l = new ArrayList<>();
        Users users = new Users();
        ResultSet rs = null;
        try {
            connect = cd.check();
            String query = "SELECT * FROM `user` WHERE `email`='" + email + "' AND `password`='" + password + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                users.setName(rs.getString(2));
                users.setPassword(rs.getString(3));
                users.setAddress(rs.getString(4));
                users.setEmail(rs.getString(5));
                users.setBirthdate(rs.getString(6));
                users.setPhonrnumber(rs.getString(7));
                users.setSsn(rs.getInt(9));
                l.add(users);
            
            }

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            rs.close();
            connect.close();
            return l;
        }
    }

    public int check_user(String name, String password) {
        int result = 0;
        try {
            List<Users> l = select_user(name, password);
            System.out.println(l.size());
            if (!(l.isEmpty())) {
                result = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return result;
        }

    }

    public void closeConnection() throws SQLException {
        connect.close();
    }

    public void closeResultSet() throws SQLException {
        re.close();
    }

    public ResultSet selectUserNAP(int ssn) throws SQLException {

        try {
            connect = cd.check();
            String query = "SELECT   `name`,   `address`,   `phonenumber`  FROM `user` WHERE `ssn`='" + ssn + "'";
            Statement ps = connect.createStatement();

            re = ps.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            return re;
        }
    }

    public String select_email(String name, String password) {
        String email = null;
        try {
            List<Users> l = select_user(name, password);
            for (Users users : l) {
                email = users.getEmail();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return email;
        }

    }
     public String select_phone(String name, String password) {
        String phone = null;
        try {
            List<Users> l = select_user(name, password);
            for (Users users : l) {
                phone = users.getPhonrnumber();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return phone;
        }

    }

    public int select_ssn(String name, String password) {
        int ssn = 0;
        try {
            List<Users> l = select_user(name, password);
            for (Users users : l) {
                ssn = users.getSsn();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_users.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return ssn;
        }

    }

    public int update_name(String password, String email, String uname) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `user` SET  `name`='" + uname + "'  WHERE  `email`='" + email + "' AND `password`='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_email(String password, String old_email, String email) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `user` SET  `email`='" + email + "'  WHERE  `email`='" + old_email + "' AND `password`='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_password(String password, String email, String upassword) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `user` SET  `password`='" + upassword + "'  WHERE  `email`='" + email + "' AND `password`='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_phones(String password, String email, String phone) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `user` SET  `phonenumber`='" + phone + "'  WHERE  `email`='" + email + "' AND `password`='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    public int update_birthdate(String password, String email, String birth) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = " UPDATE `user` SET  `birthdate`='" + birth + "'  WHERE  `email`='" + email + "' AND `password`='" + password + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

    /////////////////////////////////////////////////////////
    public String selectUserBloodType(int ssn) throws SQLException {
        ResultSet rs = null;
        String bloodType = null;
        try {
            connect = cd.check();
            String query = " SELECT `bloodtype` FROM `donor` WHERE `ssn`='" + ssn + "' ";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                bloodType = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } 
           finally {
            rs.close();
            connect.close();
            return bloodType;
        }
        
    }
    /////////////////////////////////////////////////////////
    public String selectUserNmaeByEmail(String email) throws SQLException {
        ResultSet rs = null;
        String username = null;
        try {
            connect = cd.check();
            String query = " SELECT `name` FROM `user` WHERE `email`='"+email+"'";
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                username = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } 
           finally {
            rs.close();
            connect.close();
            return username;
        }
        
    }

    //////////////////////////////////////////////////
    public int insert_closetime() throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "INSERT INTO `timeclose`(`id`, `time`, `date`, `bloodtype`, `hospital_id`, `donor_ssn`) VALUES"
                    + " (null,'" + user.getName() + "','" + user.getPassword() + "','" + user.getEmail() + "','" + user.getBirthdate() + "','"
                    + user.getPhonrnumber() + "','" + user.getSsn() + "');";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            connect.close();
            return result;
        }
    }

}
