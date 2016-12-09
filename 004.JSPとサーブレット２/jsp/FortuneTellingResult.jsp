<%-- 
    Document   : FortuneTellingResult
    Created on : 2016/12/09, 16:38:45
    Author     : guest1Day
--%>
<%@page import="org.camp.servlet.ResultDate" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultDate date = (ResultDate)request.getAttribute("Date");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(date != null)
        out.print("あなたの"+date.getD()+"の運勢は"+date.getluck()+"です。");
         %>      
    </body>
</html>
