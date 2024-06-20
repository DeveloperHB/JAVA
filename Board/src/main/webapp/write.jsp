<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>

<title> 게시판 </title>
<script language="javaScript">
function Check()
{
	if (Write.name.value.length <1) 
		alert("작성자를 입력하세요.");
	Write.name.focus();
	return false;
	}
	
	if(Write.pass.value.length<1) {
		alert("비밀번호를 입력하세요.");
		Write.pass.focus();
		return false;
	}
	
	if(Write.email.value.indexOf("@") + "" == "-1" ||
	           Write.email.value.indexOf(".") + "" == "-1" ||
	           Write.email.value =="" )
		{ alert("E-mail을 입력하세요.");
		Write.email.focus();
		return false;
		}
	
	if(Write.title.value.length < 1) {
		alert("글제목을 입력하세요.");
		Write.write_title.focus();
		return false;
	}
	
	if(Write.contents.value.length <1) {
		alert("글내용을 입력하세요.");
		Write.contents.focus();
		return false;
	}
	
	Write.submit();
	)
</script>
</head>
<body>

<center><font size='3'><b> 게시판 글쓰기 </b></font>

<table border='0' width='600' cellpadding='0' cellspacing='0'>
<tr>
<td><hr size='1' noshade>
</td>
</tr>
</table>

<Form Name ='Write' Action='write_input.jsp' Method='post'
 OnSubmit= 'return Check()'>
 
 <table border='0' width='600' cellpadding='2' cellspacing='2'>
 <tr>
 <td width='100' bgcolor='cccccc'>
 <font size='2'><center><b>작성자</b></center></font>
 </td>
 <td>
 <p><input type='text' size='12' name='name'> *필수 </p>
 </td>
 </tr>
 <tr>
 <td width'100' bgcolor='ccccc'>
 <font size= '2'><center><b>비밀번호</b></center></font></td>
<td>
 <p> <input type='password' size='12' name='pass'>
 *필수 (게시물 수정 삭제시 필요합니다.)</p>
  </td>
 </tr>
 <tr>
 <td width='100' bgcolor='ccccc'>
 <font size='2'><center><b>E-mail</b></center></font>
 </td>
 <td>
 <font size='2'><input type='text' size=40
 maxlength='50' name='email'></font>
 </td>
 </tr>
 <tr>
 <td width='100' bgcolor='ccccc'>
 <font size='2'><center><b>글 제목</b></center></font>
 </td>
 <td>
 <font size='2'><input type='text' size='70'
 maxlength='50' name='title'></font>
 </td>
 </tr>
 <tr>
 <td width='100' bgcolor='ccccc'>
 <font size='2'><center><b>글 내용</b></center></font>
 </td>
 </tr>
 <tr>
 <td>
 <font size='2'><textarea cols='70' rows='15' wrap='virtual'
 name='contents'> </textarea> </font>
 </td>
 </tr>
 <tr>
 <td colspan='2'>
 <hr size='1' noshade>
 </td>
 </tr>
 <tr>
 <td align='center' colspan='2' width='100%'>
 <table>
 <tr>
 <td width='100' align='center'>
 <input type = 'reset' value = '다시 작성'>
 </td>
 <td width='200' align='center'>
 <input Type = 'submit' value= '등록' >
 </td>
 </tr>
 </table>
</center>
</td></tr></table></Form></center>
</body>
</html>