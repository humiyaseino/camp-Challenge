<%-- 
    Document   : kadai9.1
    Created on : 2016/12/26, 14:03:10
    Author     : mypc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/database_control/kadai9_2" method="post">
            profilesID<input type="text" name="txtprofilesID">
            name<input type="text" name="txtname">
            tell<input type="text" name="txttell" value="例、090-1234-5678">
            age<input type="text"  name="txtage" value="数字でお願いします">
            birthday<input type="text" name="txtbirthday" value="例、1999-12-09">
            <input type="submit" value="送信">
        </form>
    </body>
</html>
