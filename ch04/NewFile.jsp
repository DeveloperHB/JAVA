<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action Tag</title>
</head>
<body>

<jsp:useBean id="date" class="java.util.Date" />
<p><%
            out.print("오늘의 날짜 및 시각");
    %>
    <p><%=date%>
<%-- 자바빈즈
1)동적 콘텐츠 개발을 위해 자바 코드를 사용하여
자바 클래스로 로직을 작성하는 방법
2)JSP 페이지에서 화면을 표현하기 위한 계산식이나
자료의 처리를 담당하는 자바코드를 따로 분리하여 작성하는 것
3)자바빈즈 : 데이터 표현을 목적으로 하는 자바 클래스
프로퍼티(데이터를 담는 멤버 변수)와 데이터를 가져오거나
저장하는 메소드로 구성됨--%>
<%-- 자바빈즈를 작성할 때 규칙 
1)자바 클래스는 java.it.Serializable 인터페이스를
구현해야함
2)인수가 없는 기본 생성자가 있어야 함
3) 모든 멤버 변수인 프로퍼티는 private 접근 지정자로 설정해야 함
4) 모든 멤버 변수인 프로퍼티는 getter/setter()메소드가 존재해야함
Getter()메소드: 멤버 변수에 저장된 값을 가져올 수 있는 메소드
Setter()메소드: 멤버 변수에 값을 저장할 수 있는 메소드--%>

<%-- useBean 액션 태그 
1)jsp 페이지에서 자바빈즈를 사용하기 위해 실제 자바 클래스를 선언하고
초기화하는 태그
2)id 속성과 scope 속성을 바탕으로 자바빈즈의 객체를 검색함
id: 자바빈즈를 식별하기 위한 이름
class: 자바빈즈 이름
scope: 자바빈즈가 저장되는 영역을 설정
<jsp:useBean id="자바빈즈 식별이름" class="자바빈즈이름"
 scope="범위" />>
}--%>

</body>
</html>
