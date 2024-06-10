<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Form Processing</title>
</head>
<body>
<%-- form 태그와 input 태그로 간당한 회원 가입 양식 만들기 --%>
<h3>회원가입</h3>
<form action='#'name="member"method="post">
<p>아이디 : <input type="text" name="id">
<input type="button" value="아이디 중복검사">
<p>비밀번호:<input type="password" name="passwd">
<p>이름: <input type="text name="name">
<p>연락처: <input type="text"maxlength"4" size="4"
name="phone1">
-<input type = "text" maxlength="4" size="4"
name="phone2"> -
<input type="text" maxlength="4" size="4"
name="phone3">
<p>성별: <input type="radio" name="sex"
value= "남성" checked>남성
<input type="radio" name="sex"
value="여성" > 여성
<p>취미 : 독서<input type="checkbox" name="hobby1" checked>
운동<input type="checkbox" name="hobby2">
영화<input type="checkbox" name="hobby3">
<p><input type="submit" value="가입하기">
<input type="reset"value="다시쓰기"> </p>

</form>

</body>
</html>
<%-- input 태그
사용자가 텍스트 입력이나 선택 등을 다양하게 할 수 있도록 공간을 만드는 태그
종료 태그 없이 단독으로 사용할 수 있음

input 태그의 기본 속성
text: 기본값으로 한줄 텍스트를 입력할 때 사용
radio: 라디오버튼으로 열거된 것 중 하나만 선택할 때 사용
checkbox: 다중 선택할 때 사용
password: 암호 입력할 때 사용
hidden: 보이지 않게 숨겨서 값을 전송 할 때 사용
buttton: 버튼모양 출력할 때 사용
reset: 폼에 입력된 값을 모두 초기화 할 때 사용
submit: 폼에 입력된 값을 모두 서버에 전송할 ㄸ ㅐ사용
--%>