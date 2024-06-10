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
      
      <%
         person.setId(20240611);
         person.setName("임현민");
         %>
                  
         <jsp:include page="useBean03.jsp"/>
         
<%-- 외부 파일 useBean03.jsp 의 내용을 포함하여 출력하도록
Include 액션 태그의 page 속성을 작성함 --%>     
    

</body>
</html>