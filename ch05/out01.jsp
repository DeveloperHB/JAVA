<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
<%-- out 내장 객체로 오늘의 날짜 및 시각 출력하기 --%>
<% 
out.println("오늘의 날짜 및 시각"+"<br>");
out.println(java.util.Calendar.getInstance().getTime());
%>

<%-- out 내장 객체
1)웹 브라우저에 데이터를 전송하는 출력 스트림 객체
2)JSP 컨테이너는 JSP 페이지에 사용되는 모든 표현문 태그와 HTML,
일반 텍스트 등을 OUT 내장 객체를 통해 웹 브라우저에 그대로 전달함 --%>
</body>
</html>