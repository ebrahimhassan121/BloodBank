/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import entities.Timespace;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import query.Model_hospital;
import query.Model_timespace;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "TimeSpace", urlPatterns = {"/TimeSpace"})
public class TimeSpace extends HttpServlet {

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
        processRequest(request, response);
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
        processRequest(request, response);
         response.setContentType("text/html;charset=UTF-8");
                  HttpSession httpSession = request.getSession();
         Model_hospital model_hospital=new Model_hospital();
         Model_timespace model_timespace=new Model_timespace();
         int id,re=0;
          String  name = (String) httpSession.getAttribute("username");
      String  password = (String) httpSession.getAttribute("password");
         id=model_hospital.select_id_hospital(name, password);
          String []time=request.getParameterValues("time");
        try {
            model_timespace.delet_timespace(id);
        } catch (SQLException ex) {
            Logger.getLogger(TimeSpace.class.getName()).log(Level.SEVERE, null, ex);
        }

         for (int i = 0; i < time.length; i++) {
            try {
               re=  model_timespace.insert_timespace(time[i], id);
            } catch (SQLException ex) {
                Logger.getLogger(TimeSpace.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         if(re==1){                                  
            
            response.sendRedirect("hospital/donatedate.jsp");
            
        }else{
            
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
