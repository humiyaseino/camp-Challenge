<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd = (UserDataDTO)session.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <%if(udd.getAllUserID().size()==0){
            out.print("見つかりませんでした");%><br>
        <%}%>
        <%for(int i = 0;i<udd.getAllUserID().size();i++){%>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <tr>
                <td><a href="ResultDetail?param=<%=udd.getAllUserID(i)%>"id=<%=udd.getAllUserID(i)%>><%= udd.getAllName(i)%></a></td>
                <td><%= udd.getAllBirthday(i)%></td>
                <td><%= udd.getAllType(i)%></td>
                <td><%= udd.getAllNewDate(i)%></td>
            </tr>
         </table>
        <%}%>
    </body>
    <a href="Search">検索画面へ戻る</a><br>
    <%=jh.home()%>
</html>
