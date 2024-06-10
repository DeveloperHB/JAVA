<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
  
 <% 
 request.setCharacterEncoding("utf-8");
 String userid=request.getParameter("id");
 String password=request.getParameter("passwd");
 
 if(userid.equals("관리자") && password.equals("1234")){
	 response.sendRedirect("response01_success.jsp");
 }else{
	 response.sendRedirect("response01_failed.jsp");
 } %>
 
 
 <%-- response 내장 객체
 1)사용자의 요청을 처리한 결과를 서버에서 웹 브라우저로 전달하는
 정보를 저장하고 서버는 응답 헤더와 요청 처리 결과 데이터를
 웹 브라우저로 보냄
 2)JSP 컨테이너는 서버에서 웹 브라우저로 응답하는 정보를 처리하기 위해
 javax.servlet.http.httpServerletResponse객체 타입의 response내장
 객체를 사용하여 사용자의 요청에 응답 --%>
 <%-- 페이지 이동(=리다이액션(redirection))
 1)사용자가 새로운 페이지를 요청할 때와 같이 페이지를 강제로 이동하는 것
 2)서버는 웹 브라우저에 다른 페이지로 강제 이동하도록 response내장 객체의 리다이렉션 메소드를 제공함
 3)페이지 이동 시에는 문자 인코딩을 알맞게 설정해야함
 sendRedirect(String url):설정한 url 페이지로 강제 이동함 --%>
</body>
</html>