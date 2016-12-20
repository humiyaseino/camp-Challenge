<%-- 
    Document   : index
    Created on : 2016/12/19, 14:04:16
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>

<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession hs = request.getSession();
            
                if(request.getParameter("txtname")!=null){
            String getname = request.getParameter("txtname");
            hs.setAttribute("name", getname);
                }
                if(request.getParameter("txtsex")!=null){
            String getsex = request.getParameter("txtsex");
            hs.setAttribute("sex", getsex);
                }
                if(request.getParameter("txtlike")!=null){
            String getlike = request.getParameter("txtlike");
            hs.setAttribute("like", getlike);
                }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ操作応用</title>
    </head>
    <body text="green">
        <form action="./index.jsp" method="post">
            <P><EM>名前</EM><input type="text" name="txtname" value="<%if(hs.getAttribute("name")!=null){out.print(hs.getAttribute("name"));}%>"></p>
            <P>性別<input type="radio" name="txtsex" value="0" <%if(hs.getAttribute("sex")!=null && hs.getAttribute("sex").equals("0")){%>checked<%}%>>男性
            <FONT color="red">
            <input type="radio" name="txtsex" value="1" <%if(hs.getAttribute("sex")!=null && hs.getAttribute("sex").equals("1")){%>checked<%}%>>女性
            </FONT></P>
            <P>趣味<textarea name = "txtlike" value=""><%if (hs.getAttribute("like")!= null){out.print(hs.getAttribute("like"));}%></textarea></P>
            <input type="submit" value="送信">
        </form> 
        <h1></h1>
    </body>
</html>
