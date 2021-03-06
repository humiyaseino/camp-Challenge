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
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <input type="text" name="name" value="<%if (hs.getAttribute("name") != null){out.print(hs.getAttribute("name"));}%>">
        <br><br>

        生年月日:　
        <select name="year">
            <option value="<%if (hs.getAttribute("year") != null){out.print(hs.getAttribute("year"));}%>"><%if (hs.getAttribute("year") != null){out.print(hs.getAttribute("year"));}else{out.print("----");}%></option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
        </select>年
        <select name="month">
            <option value="<%if (hs.getAttribute("month") != null){out.print(hs.getAttribute("month"));}%>"><%if (hs.getAttribute("month") != null){out.print(hs.getAttribute("month"));}else{out.print("--");}%></option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="<%if (hs.getAttribute("day") != null){out.print(hs.getAttribute("day"));}%>"><%if (hs.getAttribute("day") != null){out.print(hs.getAttribute("day"));}else{out.print("--");}%></option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1"<%if (hs.getAttribute("type") != null && hs.getAttribute("type").equals("1")){%>checked<%}%>>エンジニア<br>
        <input type="radio" name="type" value="2"<%if (hs.getAttribute("type") != null && hs.getAttribute("type").equals("2")){%>checked<%}%>>営業<br>
        <input type="radio" name="type" value="3"<%if (hs.getAttribute("type") != null && hs.getAttribute("type").equals("3")){%>checked<%}%>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%if (hs.getAttribute("tell") != null){out.print(hs.getAttribute("tell"));}%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%if (hs.getAttribute("comment") != null){out.print(hs.getAttribute("comment"));}%></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
