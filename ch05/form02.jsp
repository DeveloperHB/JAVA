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
<p>연락처: <select name="phone1">
<option value="010">010</option>
<option value="011">011</option>
<option value="016">016</option>
<option value="017">017</option>
<option value="019">019</option>
</select>
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
<%-- select 태그
여러 개의 항목이 나타나는 목록 상자에서 항목을 선택하는 태그
시작 태그와 종료 태그가 있으며, 리스트 박스에 여러 항목을 추가 삽입하기 위해
반드시 option 태그를 포함해야함

select 태그의 속성
name: 목록상자의 이름을 설정함
size: 한번에 표시할 항목의 개수를 설정함
multiple: 다중 선택이 가능하도록 함.
ctrl을 눌러 목록 상자의 항목을 다중 선택함 --%>
</body>
</html>