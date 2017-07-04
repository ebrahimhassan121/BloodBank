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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import query.Model_hospital;
import query.Model_typeblood;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "blood", urlPatterns = {"/blood"})
public class blood extends HttpServlet {

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
 
        request.setCharacterEncoding("UTF-8");
         HttpSession httpSession = request.getSession();
         Model_typeblood model_typeblood=new Model_typeblood();
         Model_hospital model_hospital=new Model_hospital();
        int numberofbage,id; int result=0;
        String name, password, bloodtype;

        name = (String) httpSession.getAttribute("username");
        password = (String) httpSession.getAttribute("password");
        numberofbage = Integer.parseInt(request.getParameter("numberofbage"));
        bloodtype = request.getParameter("bloodtype");
        id=model_hospital.select_id_hospital(name, password);
        if("O+".equals(bloodtype)){try {result= model_typeblood.updateSubCountBlood(id, "opositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}
        else if ("O-".equals(bloodtype)){{try {result=model_typeblood.updateSubCountBlood(id, "onegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("A+".equals(bloodtype)){{try {result= model_typeblood.updateSubCountBlood(id, "apositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("A-".equals(bloodtype)){{try {result= model_typeblood.updateSubCountBlood(id, "anegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("B-".equals(bloodtype)){{try {result= model_typeblood.updateSubCountBlood(id, "bnegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("B+".equals(bloodtype)){{try {result= model_typeblood.updateSubCountBlood(id, "bpositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("AB-".equals(bloodtype)){{try{result= model_typeblood.updateSubCountBlood(id, "abnegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("AB+".equals(bloodtype)){{try{result= model_typeblood.updateSubCountBlood(id, "abpositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else{} 
        if(result==1){                                  
            
            response.sendRedirect("hospital/blood.jsp");
            
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
