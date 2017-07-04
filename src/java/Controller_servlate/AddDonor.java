/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import entities.Donors;
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
import query.Model_donors;
import query.Model_hospital;
import query.Model_typeblood;

/**
 *
 * @author ahmed
 */
@WebServlet(name = "AddDonor", urlPatterns = {"/AddDonor"})
public class AddDonor extends HttpServlet {

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
        HttpSession httpSession=request.getSession();
        Model_hospital model_hospital=new Model_hospital();
        Model_donors  model_donors=new Model_donors();
        Model_typeblood model_typeblood=new Model_typeblood();
        Donors  donor=new Donors();
        
        int ssn,numberofbage, id,result;
       String bloodtype,description,statusblood ,name,password;
        
        ssn=Integer.parseInt(request.getParameter("ssn"));
        numberofbage=Integer.parseInt(request.getParameter("numberofbage"));
        bloodtype=request.getParameter("bloodtype");
        description=request.getParameter("description").toString();
        statusblood=request.getParameter("statusblood");
        name=(String)httpSession.getAttribute("username");
        password=(String)httpSession.getAttribute("password");
        id=model_hospital.select_id_hospital(name, password);
        
        if(statusblood==null){
           statusblood="false"; 
        }else{
             statusblood="true"; 
        }
        
        
        if("O+".equals(bloodtype)){try { model_typeblood.updateAddCountBlood(id, "opositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}
        else if ("O-".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "onegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("A+".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "apositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("A-".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "anegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("B-".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "bnegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("B+".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "bpositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("AB-".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "abnegative", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else if ("AB+".equals(bloodtype)){{try { model_typeblood.updateAddCountBlood(id, "abpositive", numberofbage);} catch (SQLException ex) { Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);}}}
        else{}
         donor.setBloodtype(bloodtype);
         donor.setHospital_id(id); 
         donor.setSsn(ssn);
         donor.setNumber_of_bags(numberofbage);
         donor.setBloodstatus(statusblood);
         donor.setDescription(description);

         
         
        
        try {
            result=model_donors.insert_donor(donor);
            
            if(result==1){
               
                  RequestDispatcher dispatcher=request.getRequestDispatcher("hospital/profile.jsp");
                 dispatcher.forward(request, response);
            }else{
             RequestDispatcher dispatcher=request.getRequestDispatcher("hospital/adddonor.jsp");
                 dispatcher.forward(request, response);   
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDonor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddDonor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> "+ssn+"</h1>");
            out.println("<h1> "+numberofbage+"</h1>");
            out.println("<h1> "+bloodtype+"</h1>");
            out.println("<h1> "+statusblood+"</h1>");
            out.println("<h1> "+description+"</h1>");
             out.println("<h1> "+name+"</h1>");
            out.println("<h1> "+password+"</h1>");

            out.println("</body>");
            out.println("</html>");
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
