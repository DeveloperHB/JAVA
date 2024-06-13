<%@page import="java.io.PrintWriter"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@page import="user.userDTO"%>
<%@page import="user.userDAO"%>


<%
request.setCharacterEncoding("UTF-8");
String ID = "0";
String Password ="0";

if(request.getParameter("ID") !=null) {
	ID = (String) request.getParameter("ID");
}
if (request.getParameter("Password") !=null) {
	Password = (String) request.getParameter("Password");
}

if(ID == null || Password == null) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('입력이 안 된 사항이 있습니다.')");
	script.println("history.back();");
	script.println("</script>");
	script.close();
	return;
	
	
}

userDAO userDAO = new userDAO();
int result = userDAO.join(ID,Password);

if(result == 1) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('회원 가입에 성공했습니다.')");
	script.println("location.href = 'index.jsp';");
	script.println("</script>");
	script.close();
	
return;
}


%>