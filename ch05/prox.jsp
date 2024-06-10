<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Implicit Objects</title>
</head>
<body>
 <%
 request.setCharacterEncoding("utf-8");
 String name = request.getParameter("name");
  %>
  <p>
  이름 : <%= name%><br>
  요청 정보 길이: <%= request.getContentLength() %><br>
  클라이언트 전송 방식 : <%=request.getMethod() %><br>
  요청 URI : <%=request.getRequestURI() %><br>
  서버 이름 : <%=request.getServerName() %><br>
  서버 포트 : <%=request.getServerPort() %><br>
  </p>
  <%-- 웹 브라우저/서버 관련 메소드 종류
  getContentLength():웹 브라우저의 요청 파라미터 길이를 가져옴
  getMethod():웹 브라우저의 HTTP 요청메소드(GET,Post)를 가져옴
  getRequestURI():웹 브라우저가 요청항 URI 경로를 가져옴
  getServerName():서버이름을 가져옴
  getServerPort():실행중인 서버 포트번호를 가져옴
  getRemoteAddr():웹브라우저의 ip주소를 가져옴
  getCharacterEncoding(): 웹브라우저의 문자 인코딩을 가져옴
  getContentType(): 웹브라우저의 컨텐츠 유형을 가져옴 
  getQueryString():웹브라우저의 전체 요청 파라미터 문자열을 가져옴 
  (물음표(?) 다음 url에 할당된 문자열)
  getProtocol():웹브라우저의 요청 프로토콜을 가져옴--%>

</body>
</html>