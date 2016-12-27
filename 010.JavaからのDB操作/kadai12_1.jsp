<%-- 
    Document   : kadai12_1
    Created on : 2016/12/27, 13:08:06
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
        <form action="/database_control/kadai12_2" method="post">
            name検索<input type="text" name="txtname">
            age検索<input type="text" name="txtage">
            birthday検索<input type="text" name="txtbirthday">
            <input type="submit" value="検索">
        </form>
    </body>
</html>
