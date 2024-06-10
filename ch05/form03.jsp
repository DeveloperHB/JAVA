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
<p><textarea name="comment" cols="30" rows="3"
placeholder="가입인사를 입력해주세요"></textarea>
<p><input type="submit" value="가입하기">
<input type="reset"value="다시쓰기"> </p>

<%-- textarea 태그
1)여러 줄의 텍스트를 입력할 수 있는 태그
2)기본 값은<textarea>와 </textarea> 태그 사이에 설정
3)입력 폼 안에 사용된 태그와 띄어쓰기가 그대로 출력됨

<textarea cols="너비 값" rows="높이 값">
</textarea> --%>
