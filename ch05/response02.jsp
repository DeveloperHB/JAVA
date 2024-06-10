<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
 <p>이 페이지는 5초마다 새로고침 됩니다.
 <%
 response.setIntHeader("Refresh", 5);
 %>
 <p><%=(new java.util.Date()) %>
 
 <%-- 응답 http 헤더 관련 메소드
 서버가 웹 브라우저에 응답하는 정보에 헤더를 추가하는 기능을 제공함
 헤더 정보에는 주로 서버에 대한 정보가 저장되어 있음
 
 setIntHeader(String name,int value): 설정한 헤더이름 name에
 정수값 value를 설정함 --%>
</body>
</html>