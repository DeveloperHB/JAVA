<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Implicit Objects</title>
</head>
<body>
<%
  request.setCharacterEncoding("utf-8");
  String userid = request.getParameter("id");
  String password = request.getParameter("passwd");
  %>
  <p>아이디 : <%=userid%>
  <p>비밀번호 : <%=password%>
  
  <%-- request.setCharacterEncoding("utf-9");
  폼페이지에서 입력한 한글을 처리하도록 request 내장 객체의
  setCharacterEnding() 메소드에 문자 인코딩 유형을
  utf-8로 작성함 --%>
 

</body>
</html>