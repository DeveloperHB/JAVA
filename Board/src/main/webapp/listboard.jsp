<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>


</head>
<body>
<%
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/Test";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"root","1234");

Statement stmt = conn.createStatement();

String strSQL = "select * from tblboard";
ResultSet rs = stmt.executeQuery(strSQL);

%>

<center><font size='3'><b>게시판</b></font></center>
<Table border='0' width='600' cellpadding='0' cellspacing='0'>
   <TR>
        <td><hr size='1' noshade></td>
   </TR>
</Table>

<table border='0' cellspacing=1 cellpadding=2 width='600'>
<TR bgcolor = 'ccccc'>
    <TD><font size=2><center>번호</center> </font></TD>
    <TD><font size=2><center>글 제목</center> </font></TD>
    <TD><font size=2><center>작성자</center> </font></TD>
    <TD><font size=2><center>작성일</center> </font></TD>
    <TD><font size=2><center>조회</center> </font></TD>
    
</TR>

<%
while(rs.next()){
	
	int num = rs.getInt("num");
	String name = rs.getString("name");
	String email = rs.getString("email");
	String title = rs.getString("title");
	String writedate = rs.getString("writedate");
	int readcount = rs.getInt("readcount");
	%>
	<TR bgcolor='ededed'>
	<TD align = center><font size=2 color='black'><%=num%></font></TD>
	<TD align=left>
	<a href="write_output.jsp?num=<%=num%>">
	<font size = 2 color='black'><%=title%> </font></a>
	</TD>
	<td align=center>
	<a href="<%=email %>">
	<font size = 2 color='black'><%=name %></font>
	</a>
	</td>
	<td align=center><font size=2><%=writedate %></font>
	</td>
	<td align=center><font size=2><%=readcount %></font>
	</td>
	
	<% 
}
%>
</table>

<table border='0' width='600' cellpadding='0' cellspacing='0'>
<tr>
<td><hr size='1' noshade>
</td>
</tr>
</table>

<table border='0' width='600'>
<tr>
<td align=left>
</td>

<td align='right'>
<a href='write.jsp'>[등록]</a>
</td>
</table>

<%
rs.close();
stmt.close();
conn.close();
%>
</center>
</body>
</html>

