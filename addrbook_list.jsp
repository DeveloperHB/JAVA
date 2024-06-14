<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="addrbook_error.jsp"
    import="java.util.*, addrbook.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="addrbook.css" type="text/css"
media="screen"/>

<script type="text/javascript">
function check(ab_id) {
	pwd = prompt('수정/삭제 하려면 비밀번호를 넣으세요.');
	document.location.href="addrbook_control.jsp?action=edit&ab_id="+ab_id+"&upasswd="+pwd;
}
</script>
<meta charset="UTF-8">
<title>주소록:목록화면</title>
</head>
<jsp:useBean id="datas" scope="request" class="java.util.ArrayList" />

<body>
<div align="center">
<H2>주소록:목록화면</H2>
<HR>
<form>
<a href="addrbook_form.jsp">주소록 등록</a><p>
                   <table border="1">
                   <tr><th>번호</th><th>이름</th><th>전화번호</th><th>생일</th><th>회사</th><th>메모</th></tr>
                   <%
                   for(AddrBook ab : (ArrayList<AddrBook>)datas){
                   %>
                   <tr>
                   <td><a href="javascript:check(<%=ab.getAb_id()%>)"><%=ab.getAb_id() %></a></td>
                   <td><%=ab.getAb_tel() %></td>
                   <td><%=ab.getAb_name() %></td>
                   <td><%=ab.getAb_birth() %></td>
                   <td><%=ab.getAb_comdept() %></td>
                   <td><%=ab.getAb_memo() %></td>
                   </tr>
                   <%
                   }
                   %> 
                   <tr>
                   <td>
                   
                   <a href="addbook_edit_form.jsp">1</a></td><td>임현배</td><td>010-2134-2112</td><td>1987</td>
                   
                   <td>한국대학교</td><td>IT대학</td>
                   </tr>
                   
                   <tr>
                   <td>2</td><td>둘리</td><td>010-252-2525</td><td>1999-01-01</td>
                   <td>민국대학교</td><td>의과대학</td>
                   
                   </table>
</form></div>
</body>
</html>