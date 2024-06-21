<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*, java.util.*" %>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>
<script language=javascript">
function Check()
{
	if(Modify.name.value.length < 1){
		alert("작성자를 입력하세요.");
		Modify.name.focus();
		return false;
	}
	
	if(Modify.pass.value.length < 1){
		alert("비밀번호를 입력하세요.");
		Modify.pass.focus();
		return false;
		
	}
	
	if(Modify.email.value.indexOf("@") + "" == "-1" ||
			Modify.email.value.indexOf(".") + "" == "-1" ||
			Modify.email.value == "")
		{
		alert("E-mail을 입력하세요.");
		Modify.email.focus();
		return false;
		}
		
	if(Modify.contents.valus.length < 1){
		alert("글 내용을 입력하세요.");
		Modify.contents.focus();
		return false;
	}
	
	Modify.submit();
		}
		
		function list()
		
		{
			location.href = "listboard.jsp";
			
		}
</script>
</head>
<body>
<%
String num = request.getParameter("num");

String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/Test";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"root","1234");

PreparedStatement pstmt = null;
ResultSet rs = null;

try{
String strSQL = "selet*from tblboard where num = ?";
pstmt = conn.prepareStatement(strSQL);
pstmt.setInt(1, Integer.parseInt(num));

rs = pstmt.executeQuery();
re.next();

String name = rs.getStirng("name");
String email = rs.getString("email");
String title = rs.getStirng("contents").trim();
String writedate = rs.getString("writedate");
int readcount = rs.getInt("readcount");


%>
<center><font size='3'><b> 게시판 글수정 </b></font>
<table border='0' width='600' cellpading='0' cellspacing='0'>
<tr>
<td><hr size='1' noshade> 

</td>

</tr>

</table>

<form name = 'modify' action='modify_output.jsp' Method='post' onSubmit='return Check()' >
<input type='hidden' name='num' value='<%=num %>'>

<table border='0' width='600'>
<tr>
<td width='100' bgcolor='cccccc'>
<font size='2'><center><b>작성자</b></center></font>

</td>
<td>
<p><input type='text' size='12' name='name' value="<%name %>">;
</td>
</tr>
<tr>
<td width='100' bdcolor='cccccc'>
<font size='2'><center><b>비밀번호</b></center></font>
</td>
<td>
<p><input type = 'password' size='12' nmae='pass'>*필수</p>
</td>
</tr>
<tr>
<td width='100' bgcolor='cccccc'>
<font size='2'><center><b>E-mail</b></center></font>
</td>
<td>
<font size='2'><input type='text' size='40' maxlength='50'name='email' value="<%=email %>"></font>
</td>
</tr>
<tr>
<td colspan='2'>
<hr size='1' noshade>
</td>
</tr>
<tr>
<td width='100' bgcolor='cccccc'>
<font size='2'><center><b>글 제목</b></center></font>
</td>
<td>
 <font size='2'><input type='text' size='40' maxlength='50'name='email' value="<%=title%>"></font>
 </font>
</td>
</tr>
<tr>
<td bgcolor='cccccc'>
<font size = '2'><center><b>글 내용</b></center></font>
</td>
</tr>
<td>
<font size ='2'>
<textera cols='70' rows='15' wrap='virtual' name='contents'></textera>
</td>
</font>
</table>
<tr>
<td colspan='2'>
<hr size='1' noshade>
</td>
</tr>
<tr>
<td>             "안적음"
</td>
</tr>
 
</form>
</center>
<%
}catch (SQLException e) {
	out.print("sql에러 " + e.toString());
}catch(Exception ex) {
	out.print("jsp에러 " + ex.toString());
}finally{
	rs.close();
	pstmt.close();
	conn.close();
}
%>
</body>
</html>