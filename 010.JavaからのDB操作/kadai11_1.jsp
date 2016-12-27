<%-- 
    Document   : kadai11_1
    Created on : 2016/12/27, 11:17:26
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
        <Form action="/database_control/kadai11_2" method="post">
            選択profilesID<input type="txet" name="txtprofilesID">
            上書きname<input type="text" name="txtname">
            上書きtell<input type="txet" name="txttell">
            上書きage<input type="text" name="txtage">
            上書きbirthday<input type="text" name="txtbrithday">
            <input type="submit" value="上書き開始">
        </Form>
    </body>
</html>
