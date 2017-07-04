/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import query.Model_hospital;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "UpdatePhone", urlPatterns = {"/UpdatePhone"})
public class UpdatePhone extends HttpServlet {

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
       int phones=Integer.parseInt(request.getParameter("size"));
               int hospital_id = Integer.parseInt(request.getParameter("id"));

       String   nphone,ophone;
               Model_hospital model_hospital = new Model_hospital();
               int result=0;

             
            for (int i = 0; i < phones; i++) {
                  nphone=request.getParameter("nphone"+i);
                ophone=request.getParameter("ophone"+i);
                if(nphone.equals(ophone)){}
                else{
                      try {
                       result = result+ model_hospital.update_phone_hospital(nphone, ophone);

                      } catch (SQLException ex) {
                          Logger.getLogger(UpdatePhone.class.getName()).log(Level.SEVERE, null, ex);
                      }
                }
 
        }
if (result >= 1) {
                     response.sendRedirect("hospital/setting.jsp");

                } else {
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
