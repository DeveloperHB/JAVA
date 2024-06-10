<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Form Processing</title>
</head>
<body>
<p> 독서 : <%=request.getParameter("reading") %></p>
<p> 운동 : <%=request.getParameter("exercise") %></p>
<p> 영화 : <%=request.getParameter("movie") %></p>

<%-- 요청 파라미터의 값 받기
request 내장 객체는 웹 브라우저가 서버로 보낸 요청에 대한 다양한 정보를 담고 따라서
getParameter()메소드를 이용하여 요청 파라미터의 값을 얻을 수 있음
String 변수=request.getParameter("요청 파라미터 이름"); --%>
</body>
</html>