<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        <% if(!hs.getAttribute("name").equals("") && !hs.getAttribute("year").equals("") && !hs.getAttribute("month").equals("") && !hs.getAttribute("day").equals("") && hs.getAttribute("type") != null && !hs.getAttribute("tell").equals("") && !hs.getAttribute("comment").equals("")){ %>
        <h1>登録確認</h1>
        名前:<%= hs.getAttribute("name")%><br>
        生年月日:<%= hs.getAttribute("year")+"年"+hs.getAttribute("month")+"月"+hs.getAttribute("day")+"日"%><br>
        種別:<%= hs.getAttribute("type")%><br>
        電話番号:<%= hs.getAttribute("tell")%><br>
        自己紹介:<%= hs.getAttribute("comment")%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
        <h2>以下の項目を再確認してください<h2/>
            <%if(hs.getAttribute("name").equals("")){%>
            <p>名前</p>
            <%}%>
            <%if(hs.getAttribute("year").equals("")){%>
            <p>年</p>
            <%}%>
            <%if(hs.getAttribute("month").equals("")){%>
            <p>月</p>
            <%}%>
            <%if(hs.getAttribute("day").equals("")){%>
            <p>日</p>
            <%}%>
            <%if(hs.getAttribute("type") == (null)){%>
            <p>種別</p>
            <%}%>
            <%if(hs.getAttribute("tell").equals("")){%>
            <p>電話番号</p>
            <%}%>
            <%if(hs.getAttribute("comment").equals("")){%>
            <p>自己紹介</p>
            <%}%>
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
