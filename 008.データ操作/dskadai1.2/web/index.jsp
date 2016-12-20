<%-- 
    Document   : index
    Created on : 2016/12/19, 11:00:11
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ操作</title>
    </head>
    <body>
        <form action="./sample.jsp" method="post">
            NAME:<input type="text" name="txtname">
            性別:<input type="radio" name="rdoseibetu" value="男"/>男
                 <input type="radio" name="rdoseibetu" value="女"/>女
            趣味:<textarea name = "txtsyumi"></textarea>
            <input type="submit" value="送信">
        </form> 
    </body>
</html>
