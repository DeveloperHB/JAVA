<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Action Tag</title>
</head>
<body>

      <jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" />
      <p>아이디 : <jsp:getProperty name="person" property="id" />
      <p>이 름 : <jsp:getProperty name="person" property="name" />
      
      <%-- useBean 액션 태그의 id 속성 값을 통해
      Person 클래스의 id와 name 에 값을 가져와 출력하도록
      getproperty 액션 태그를 작성함 --%>
      
      <%--getProperty 액션 태그
      useBean 액션 태그와 함께 자바빈즈의 getter() 메소드에 접근하여 자바빈즈의
      멤버 변수인 프로퍼티의 값을 가져오는 태그
      
      <jsp:getProperty name="자바빈즈 식별이름"
      property="프로퍼티 이름"/>
      --%>


</body>
</html>