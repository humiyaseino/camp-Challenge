<%-- 
    Document   : search
    Created on : 2017/01/05, 12:55:05
    Author     : mypc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jums.JumsHelper" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUNS検索画面</title>
    </head>
    <body>
        <form action="" method="get">
            名前(部分一致)<input type="text" name="txtname">
            <br/><br/>
        </form>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
