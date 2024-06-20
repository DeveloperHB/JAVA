<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*,java.util.*" %>
    <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>
</head>
<body>
<%
String num = request.getParameter("num");

String driver ="com.mysql.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/Test";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"root","1234");

PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	String strSQL = "SELECT * FROM tblboard WHERE num = ?";
	pstmt = conn.prepareStatement(strSQL);
	pstmt.setInt(1, Integer.parseInt(num));
	
	rs = pstmt.executeQuery();
	rs.next();
	
	String name = rs.getString("name");
	String title = rs.getString("title");
	String contents = rs.getString("contents").trim();
	String writedate = rs.getString("writedate");
	int readcount = rs.getInt("readcount");
	%>
<center><font size='3'><b> 게시판 </b></font></center>
<table border='0' width='600' cellpadding='0' cellspacing='0'>
<tr>
<td> <hr size='1' noshade>
</td>
</tr>
</table>

<table border='0' width='600'>
<tr>
<td align='left'>
<font size='2'>작성자: <%=name %> </font>
</td>
<td align='right'>
<font size='2'>작성일: <%=writedate %>, 조회수:<%=readcount %> </font>
</td>
</tr>
</table>

<table border='0' cellspacing=3 cellpadding=3 width='600'>
<tr bgcolor='cccccc'>
<td align='center'>
<font size='3'><b><%=title %></b></font>
</td>
</tr>
</table>

<Table border='0' cellspacing=5 cellpadding=10 width='600'>
<tr bgcolr='ededed'>
<td><font size='2' color=''><%=contents %></font>
</td>
</tr>
</Table>
<table border='0' width='600'>
<tr>
<td align='right'>
<font size='2'><br></font>

</td>
</tr>
</table>
<table border='0' width '600>
<tr>
<td align='right'>
<a href='write.jsp'>[글쓰기]</a>
<a href='listboard.jsp'>[목록보기]</a>

</td>
</tr>
</table>
<%
strSQL="UPDATE tblboard SET readcount = readcount + 1 WHERE num = ?";
pstmt = conn.prepareStatement(strSQL);
pstmt.setInt(1, Integer.parseInt(num));
pstmt.executeUpdate();

}catch (SQLException e) {
	out.print("SQL에러" + e.toString());
}catch (Exception ex) {
	out.print("JSP에러" + ex.toString());
}finally{
	rs.close();
	pstmt.close();
	conn.close();
	
}
%>




</body>
</html>