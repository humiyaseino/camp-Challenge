/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseKadai;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mypc
 */
public class kadai13_2 extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai13_2</title>");
            request.setCharacterEncoding("UTF-8");
            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_rs = null;
            HttpSession hs = request.getSession();
            //RequestDispatcher product = request.getRequestDispatcher("/database_control/kadai/kadai13_3product.jsp");

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "seino", "seino");
                db_st = db_con.prepareStatement("select * from user where name=? and password=?");
                db_st.setString(1, request.getParameter("txtname"));
                db_st.setString(2, request.getParameter("txtpassword"));

                db_rs = db_st.executeQuery();
                //if () {

                if (hs.getAttribute("login") != null && db_rs.next()) {
                    hs.setAttribute("login-e", null);
                    hs.setAttribute("login", "in");
                } else {
                    hs.setAttribute("login-e", "error");
                }

            } catch (ClassNotFoundException e) {
                out.print(e.getMessage());
            } catch (SQLException e) {
                out.print(e.getMessage());
            } catch (Exception e) {
                out.print(e.getMessage());
            } finally {
                try {
                    if (db_con == null) {
                        db_con.close();
                    }
                    if (db_st == null) {
                        db_st.close();
                    }
                    if (db_rs == null) {
                        db_rs.close();
                    }
                } catch (SQLException e) {
                    out.print(e.getMessage());
                } catch (Exception e) {
                    out.print(e.getMessage());
                }
            }
            RequestDispatcher product = request.getRequestDispatcher("/kadai/kadai13_login.jsp");
            product.forward(request, response);

            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
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
