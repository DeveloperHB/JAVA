<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Enumeration" %>

<html>
<head>

<title>Implicit Objects</title>
</head>
<body>
<% 
Enumeration en = request.getHeaderNames();
while (en.hasMoreElements()) {
String headerName = (String) en.nextElement();
String headerValue = request.getHeader(headerName);
%>
<%=headerName %> : <%=headerValue %><br>
<%
}
%>
<%-- Enumeration en= request.getHeaderNames();
모든 헤더 이름을 가져오도록 getHeaderNames()메소드를 작성하고,
이를 모두 저장하도록 Enumeration 객체 타입 변수 en 을 작성함 --%>
<%-- while (en.hasMoreElements())
hasMoreElMents() 메소드를 통해 저장된 헤더 이름이 있을 때가지 반복 --%>
<%-- en.nextElement()
nextElements() 메소드로 현재 헤더이름을 가져옴
 --%>
 <%-- request.getHeader(headerName)
 getHeader() 메소드로 설정된 헤더 이름의 값을 가져옴 --%>
<%-- 요청 HTTP 헤더
웹 부라우저는 HTTP 헤더에 부가적인 정보를 담아 서버로 전송함
--%>
<%-- 요청 HTTP 헤더 관련 메소드
getHeader(String Name): 설정한 name의 헤더값을 가져옴
getHeader(String Name): 설정한 name의 헤더 목록값을 가져옴
getHeaderNames():모든 헤더 이름을 가져옴
 --%>
 
</body>
</html>