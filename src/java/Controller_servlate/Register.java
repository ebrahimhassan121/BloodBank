/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import entities.Users;
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
import query.Model_users;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

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
        String name, password, email, birthdate, r_password;    // feilds for form 
            final int ssn;                                            // for constant number use in hospital
    int result=0; 
           //  recieve fields from users
              name = request.getParameter("name");
            password = request.getParameter("password");
            r_password = request.getParameter("r_password");
            email = request.getParameter("email");
            birthdate = request.getParameter("birthdate");
            ssn = new GenerateRandomNumber().generate();

                        Users x =new Users();
                        x.setName(name);
                        x.setEmail(email);
                        x.setPassword(password);
                        x.setBirthdate(birthdate);
                        x.setPhonrnumber("01060311593");
                        x.setSsn(ssn);
                        Model_users m=new Model_users();
        try {
            result=    m.insert_user(x);
            if(result==1){
               
                  RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
                 dispatcher.forward(request, response);
            }else{
               try (PrintWriter out = response.getWriter()) {
          
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet1</title>");
            out.println("</head>");
            out.println("<body>");
              out.println("<h1> Some thing error in database </h1>");

              

            out.println("</body>");
            out.println("</html>");

        }   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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
//        
            
    }// </editor-fold>

}
