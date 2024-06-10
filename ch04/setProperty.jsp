<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Action Tag</title>
</head>
<body>
<%-- 자바빈즈로 Person 클래스를 사용하도록
useBean 액션 태그를 작성함 --%>
      <jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" />
      <jsp:setProperty name = "person" property="id" value="20240610"/>
      <jsp:setProperty name = "person" property ="name" value="임현배" />
      <p>아이디 : <%=person.getId() %>
      <p>이 름 : <%=person.getName()%>
<%-- useBean 액션 태그의 id속성 값을 통해
person 클래스의 id와 name에 값을 저장하도록
setProperty 액션 태그를 작성함 --%>      
                        
<%-- setProperty 액션 태그
1)usebean 액션 태그와 함께 자바빈즈의 setter() 메소드에 접근하여
자바빈즈의 멤버 변수인 프로퍼티의 값을 저장하는 태그
2)폼 페이지로부터 전달되는 요청 파라미터의 값을 직접 저장하거나
자바빈즈의 프로퍼티로 변경하여 값을 저장할 수 있음

<jsp:setProperty name="자바빈즈 식별이름"
property="프로퍼티 이름" value="값"/>
 --%>

</body>
</html>