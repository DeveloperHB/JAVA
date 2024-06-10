<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Action Tag</title>
</head>
<body>
<%-- 자바빈즈로 Person 클래스를 사용하도록
useBean 액션 태그를 작성함 --%>
      <jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" />
      <p>아이디 : <%=person.getId() %>
      <p>이 름 : <%=person.getName()%>
      
      <%-- scope="사용 범위"
      1)scope="page" - 자바빈 크래스를 현재 페이지 내에서만 사용 가능하고 페이지를 이동하면 유지되지 않음.
      2)scope="request" - 리퀘스트 요청을 받고 처리가 완료될 때 까지 유지
      3)scope="session" - 세션 영역이 유지되는 동안
                          (브라우저 종료 전까지) 사용가능.
      4)scope="application" - 서버 종료 전까지 유지.
       --%>

</body>
</html>