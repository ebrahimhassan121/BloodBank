/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entities.Timeclose;
import entities.Timespace;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public class Model_timespace {

    CheckDatabase cd = new CheckDatabase();
    Connection connect = null;
    ResultSet rs = null;

    public int insert_timespace(String time, int id) throws SQLException {
        int result = 0;
        try {

            connect = cd.check();
            String query = " INSERT INTO `time_space`(`id`, `time`, `hospital_id`) VALUES (null,'" + time + "','" + id + "')";

            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            closeConnection();
            return result;
        }
    }

    public ResultSet select_timespace(int id) throws SQLException {

        try {
            connect = cd.check();
            String query = "SELECT * FROM `time_space` WHERE  `hospital_id`='" + id + "'";

            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            return rs;
        }
    }

    public ArrayList select_timeAvailable(int id, String Date) throws SQLException {
        ArrayList<String> availableTimes = new ArrayList<>();
        try {
            connect = cd.check();
            /*SELECT time
            FROM time_space
            WHERE hospital_id = 14 AND time NOT IN
            (SELECT time 
            FROM timeclose WHERE hospital_id = 14   and timeclose.date="2017-07-04"

            ) 
            
             */
            //Date date = new Date(Date);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date(Long.parseLong(Date));
            //date.setTime(d);
            System.out.println(dateFormat.format(date));
            String DateFormated = dateFormat.format(date);
            String query = "SELECT `time` FROM `time_space` WHERE  `hospital_id`='" + id + "' AND time Not IN   "
                    + "(SELECT `time` \n"
                    + "FROM `timeclose` WHERE ( (`date`='" + DateFormated + "') AND (`hospital_id`=" + id + " )  )\n"
                    + "\n"
                    + "            )  ";
            System.out.println("date://" + Date);
            Statement ps = connect.createStatement();

            rs = ps.executeQuery(query);
            while (rs.next()) {
                long t = rs.getTime("time").getTime();

                System.out.println("dddd" + t);
                String strDateFormat = "HH:mm a";
                SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
                    availableTimes.add(sdf.format(t));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // System.out.println(availableTimes.size());
            return availableTimes;
        }
    }

    public int delet_timespace(int id) throws SQLException {
        int result = 0;
        try {
            connect = cd.check();
            String query = "DELETE FROM `time_space` WHERE `hospital_id`='" + id + "'";
            Statement ps = connect.createStatement();

            result = ps.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("error/n" + e.getMessage());
        } finally {
            closeConnection();
            return result;
        }
    }

    public void closeConnection() throws SQLException {
        connect.close();
    }

    public void closeResultSet() throws SQLException {
        rs.close();
    }

    public void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

//    public static void main(String[] args) {
//        Model_timespace mt = new Model_timespace();
//        ArrayList<Long> avt = null;
//        try {
//            avt = mt.select_timeAvailable(14, "1499205600000");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            //   Logger.getLogger(Model_timespace.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(avt.get(0));
//    }
}
