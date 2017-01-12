<%-- 
    Document   : kadai13_login
    Created on : 2016/12/27, 14:12:16
    Author     : mypc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><%HttpSession hs = request.getSession();%>
    <body><%if (hs.getAttribute("login") == null) {
            hs.setAttribute("login", "out");
        }
        if (hs.getAttribute("login") == "out") {%>
        <h1>ログイン認証フォーム</h1>
        <%if (hs.getAttribute("login-e") == "error") {%>
        <P>認証に失敗しました。</P>
            <%}%>
        <form action="/database_control/kadai13_2" method="post">
            name<input type="text" name="txtname">
            password<input type="password" name="txtpassword">
            <input type="submit" value="送信">
        </form>
        <%}%>
        <%if (hs.getAttribute("login") == "in") {%>
        
        <h1>ようこそ</h1>
        <h2>商品登録フォーム</h2>
        <form action="/database_control/kadai13_4touroku" method="post">
            商品ID<input type="text" name="txtproductID">
            名前<input type="text" name="txtname">
            値段<input type="text" name="txtprice">
            在庫<input type="text" name="txtstock"><br>
            <input type="submit" value="商品登録">
        </form>
        <h3>商品の一覧発表</h3>
        <form action="/database_control/kadai13_5itiran" method="post">
            <input type="submit" value="見る">
        </form>
        <h4>ログアウト</h4>
        <form action="/database_control/kadai13_logout" method="post">
            <input type="submit" value="ログアウト">
        </form>
        <%}%>
    </body>
</html>
