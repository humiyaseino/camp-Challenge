package jums;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class SearchResult extends HttpServlet {

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
            //セッション開始
            HttpSession session = request.getSession();
        try {
            request.setCharacterEncoding("UTF-8");//リクエストパラメータの文字コードをUTF-8に変更
            
            //アクセスルートチェック
            String accesschk = request.getParameter("ac");
            if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }
            //フォームからの入力を取得して、JavaBeansに格納
            UserDataBeans udb = new UserDataBeans();
            boolean requestGetFlg = false;

            if(request.getParameter("name") != null && !request.getParameter("name").equals("")) {
                udb.setName(request.getParameter("name"));
                requestGetFlg = true;
            }
            if(request.getParameter("year") != null){
                udb.setYear(request.getParameter("year"));
                requestGetFlg = true;
            }
            if (request.getParameter("type") != null){
                udb.setType(request.getParameter("type"));
                requestGetFlg = true;
            }
            
            if(requestGetFlg){
                session.removeAttribute("searchData");
            }
            //
            UserDataDTO searchData = new UserDataDTO();
            
            if (session.getAttribute("searchData") != null) {
                searchData = (UserDataDTO)session.getAttribute("searchData");
            } else {
                //DTOオブジェクトにマッピング。DB専用のパラメータに変換
                
                udb.UD2DTOMapping(searchData);
            }
            UserDataDTO resultData = UserDataDAO.getInstance().search(searchData);
            session.setAttribute("resultData", resultData);
            session.setAttribute("searchData", searchData);

            request.getRequestDispatcher("/searchresult.jsp").forward(request, response);
        } catch (Exception e) {
            //何らかの理由で失敗したらエラーページにエラー文を渡して表示。想定は不正なアクセスとDBエラー
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
