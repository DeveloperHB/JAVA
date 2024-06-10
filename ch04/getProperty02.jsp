<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Action Tag</title>
</head>
<body>

      <jsp:useBean id="person" class="ch04.com.dao.Person" ></jsp:useBean>
      <jsp:setProperty name="person" property="id" value="20240610" />
      <jsp:getProperty name="person" property="name" value="임현배" />
<%-- useBean 액션 태그의 id 속성 값을 통해 Person 클래스와 id와 name에 값을 저장하도록
setProperty 액션 태그를 작성함 --%>
      <p> 아이디 :<jsp:getProperty property="id" name="person"/>
      <p> 이름 : <jsp:getProperty property="name" name="person"/>
<%-- useBean 액션 태그의 id 속성 값을 통해 
person 클래스의 id와 name에 값을 가져와 출력하도록
getproperty 액션 태그를 작성함 --%>  
  


</body>
</html>