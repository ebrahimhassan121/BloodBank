/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

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
import query.Model_hospital;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "UpddateAdress", urlPatterns = {"/UpddateAdress"})
public class UpddateAdress extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String ostate,nstate,ostreet,nstreet;
        int id=Integer.parseInt(request.getParameter("idh"));
        Model_hospital model_hospital=new Model_hospital();
        ostate=request.getParameter("ostate");
        nstate=request.getParameter("nstate");
        ostreet=request.getParameter("ostreet");
        nstreet=request.getParameter("nstreet");
        int r1=0,r2=0;
        if( ostate.equals(nstate)) {}else{
            try {
                r1=model_hospital.update_state_hospital(nstate, id);
            } catch (SQLException ex) {
                Logger.getLogger(UpddateAdress.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }   
        if(ostreet.equals(nstreet)) {}else{
            try {
                r1=model_hospital.update_street_hospital(nstreet, id);
            } catch (SQLException ex) {
                Logger.getLogger(UpddateAdress.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
                 if (r1 == 1||r2==1) {
                     response.sendRedirect("hospital/setting.jsp");

                } else {
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
