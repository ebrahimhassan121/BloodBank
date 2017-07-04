/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import entities.Timeclose;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import query.Model_Timeclose;
import query.Model_hospital;
import query.Model_users;

/**
 *
 * @author EHS
 */
@WebServlet(name = "ReserveAppointment", urlPatterns = {"/ReserveAppointment"})
public class ReserveAppointment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("sssss");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession httpSession = request.getSession();
        try {
            String State, hospital, date, time;
            State = request.getParameter("government");
            hospital = request.getParameter("hospital");
            date = request.getParameter("resevedDate").toString().replace('/', '-');
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
            Date dsdf = sdf.parse(date);
            sdf.applyPattern("yyy-mm-dd");
            String newDateString = sdf.format(dsdf);
            System.out.println(newDateString);
            time = request.getParameter("time");
            Model_hospital MH = new Model_hospital();
            Model_Timeclose model_Timeclose = new Model_Timeclose();
            Timeclose timeclose = new Timeclose();
            String hTemp = (String) hospital.subSequence((hospital.indexOf("hospital=")) + 9, hospital.length());
            int hospital_id = MH.selectHospitalIDByName(hTemp);
            String time_24 = LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm a")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            int ssn = (int)(httpSession.getAttribute("ssn"));
            String BloodType = new Model_users().selectUserBloodType(ssn);
            timeclose.setHospital_id(hospital_id);
            timeclose.setDonar_id(ssn);
            timeclose.setDate(newDateString);
            timeclose.setTime(time_24);
            timeclose.setBloodtrpe(BloodType);
            int result = model_Timeclose.insert_timeclose(timeclose);
            response.sendRedirect("user/reservedAppointment.jsp");

        } catch (Exception ex) {
            response.sendRedirect("login.jsp");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
