/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import query.Model_hospital;
import query.Model_users;

/**
 *
 * @author ahmed
 */
public class Login extends HttpServlet {

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
        processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        
        String email,password,type;
        int result=0;
        int ssn;
        
        Model_hospital model_hospital=new Model_hospital();
        Model_users model_users=new Model_users();
       email=request.getParameter("email");
       password=request.getParameter("password");
        System.out.println(email+"/"+password);
       type=request.getParameter("type");
         if( type.equals("d")){   // donor
              result=model_users.check_user(email, password);
              System.out.println(result);
             if(result==1){
                 ssn=model_users.select_ssn(email, password);
                 HttpSession  httpSession=request.getSession();
                 httpSession.setAttribute("email", email);
                 httpSession.setAttribute("password", password);
                 httpSession.setAttribute("ssn", ssn);
                 httpSession.setAttribute("type", type);

                 response.sendRedirect("user/profile.jsp");
             }else{
                 response.sendRedirect("login.jsp?error=incorrect-Login");
             }
             
             
             
         }else{                  //  hospital
         result=model_hospital.check_hospital(email, password);
             if(result==1){
                 HttpSession  httpSession=request.getSession();
                 httpSession.setAttribute("email", email);
                 httpSession.setAttribute("password", password);

                 RequestDispatcher dispatcher=request.getRequestDispatcher("hospital/profile.jsp");
                 dispatcher.forward(request, response);
             }else{
                   response.sendRedirect("login.jsp?error=incorrect-Login");
                 
             }
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
