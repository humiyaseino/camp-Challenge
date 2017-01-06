<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.DirecLinkBanBeans" %>
<%
    HttpSession hs = request.getSession();
    DirecLinkBanBeans dlbb = (DirecLinkBanBeans)request.getAttribute("dlbb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
        <% if (dlbb.getDirect()) { %>
        <h1>登録結果</h1><br>
        名前:<%= hs.getAttribute("name")%><br>
        生年月日:<%= hs.getAttribute("year")+"年"+hs.getAttribute("month")+"月"+hs.getAttribute("day")+"日"%><br>
        種別:<%= hs.getAttribute("type")%><br>
        電話番号:<%= hs.getAttribute("tell")%><br>
        自己紹介:<%= hs.getAttribute("comment")%><br>
        以上の内容で登録しました。<br>
        <br><br>
        <%=JumsHelper.getInstance().home()%>
        <%} else {%>
        <h1>無効なアクセスです。</h1>
        <%}%>
    </body>
</html>
