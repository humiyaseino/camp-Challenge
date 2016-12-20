<%-- 
    Document   : sample
    Created on : 2016/12/19, 11:22:11
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ操作2</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); 
        String name = request.getParameter("txtname");
        String seibetu = request.getParameter("rdoseibetu");
        String syumi = request.getParameter("txtsyumi");
        out.print("あなた名前は"+name+"性別は"+seibetu+"趣味は"+syumi+"です");
        %>
    </body>
</html>
