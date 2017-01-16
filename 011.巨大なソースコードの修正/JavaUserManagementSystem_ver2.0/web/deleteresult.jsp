<%@page import="jums.JumsHelper" %>
<%@page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession hs = request.getSession();
    jums.JumsHelper jh = jums.JumsHelper.getInstance();
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除結果画面</title>
    </head>
    <body>
    <h1>削除確認</h1>
    削除しました。<br>
    </body><br>
    <form action="SearchResult" method="post">
        <input type="hidden" name="ac" value="<%=hs.getAttribute("ac")%>"> 
        <input type="submit" name="searchresult" value="検索結果へ戻る">
    </form>
    <%=jh.home()%>
</html>
