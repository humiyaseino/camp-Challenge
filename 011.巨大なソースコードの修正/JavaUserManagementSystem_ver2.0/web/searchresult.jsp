<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
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
                <td><a href="ResultDetail?paramID=<%=udd.getAllUserID(i)%>"id=<%=udd.getAllUserID(i)%>><%= udd.getAllName(i)%></a></td>
                <td><%= udd.getAllBirthday(i)%></td>
                <td><%= jh.exTypenum(udd.getAllType(i))%></td>
                <td><%= udd.getAllNewDate(i)%></td>
            </tr>
         </table>
        <%}%>
        <a href="Search">検索画面へ戻る</a><br>
        <%=jh.home()%>
    </body>
</html>
