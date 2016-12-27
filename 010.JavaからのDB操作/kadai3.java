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

/**
 *
 * @author mypc
 */
public class kadai3 extends HttpServlet {

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
            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_rs = null;
            String msg = "変更なし";

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                msg = "ドライバ成功しました";
            } catch (ClassNotFoundException e) {
                msg = "D失敗しました";
            } catch (Exception e) {
                msg = "D失敗しました";
            }
            //データベース接続
            try {
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "seino", "seino");
                msg = "データベース成功";
                // db_con.close();
            } catch (SQLException e_sql) {
                msg = "sデータベースエラー";
            } catch (Exception e) {
                msg = "eデータベースエラー";
            }
            //データベース作業
            try {
                db_st = db_con.prepareStatement("select * from profiles");

                db_rs = db_st.executeQuery();
                while (db_rs.next()) {
                    out.print("profilesID"+db_rs.getInt("ProfilesID")+"<br>");
                    out.print("name"+db_rs.getString("name")+"<br>");
                    out.print("tell"+db_rs.getString("tell")+"<br>");
                    out.print("age"+db_rs.getInt("age")+"<br>");
                    out.print("birthday"+db_rs.getDate("birthday")+"<br>");
                }
            } catch (SQLException e_sql) {
                msg = "sデータベースエラー";
            } catch (Exception e) {
                msg = "eデータベースエラー";
            } finally {
                try {
                    if (db_con == null) {
                        db_con.close();
                    }
                    if (db_st == null) {
                        db_st.close();
                    }
                    if (db_rs == null){
                        db_rs.close();
                    }
                    msg = "作業完了";
                } catch (SQLException e_sql) {
                    msg = "s.closeエラー";
                } catch (Exception e) {
                    msg = "closeエラー";
                }
            }
                    out.println("<title>Servlet kadai3</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println(msg);
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
            protected void doGet
            (HttpServletRequest request, HttpServletResponse response)
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
            protected void doPost
            (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);
            }

            /**
             * Returns a short description of the servlet.
             *
             * @return a String containing servlet description
             */
            @Override
            public String getServletInfo
            
            
                () {
        return "Short description";
            }// </editor-fold>

        }
