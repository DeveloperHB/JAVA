<%@ page contentType="text/html; charset=utf-8" %>

<%-- form 태그
사용자가 다양한 정보를 입력하고 서로 전달할 때 사용하는 태그
단독으로 쓰이지 않고 사용자가 다양한 정보를 입력하는 양식을 포함하는 최상위 태그
<form 속성1="값1" [속성2="값2"...]
//다양한 입력 양식 태그(<input>,<select>,<textarea>)
   </form>
 a)속성을 이용하여 폼 데이터를 전송할 때 어디로 보낼지,
 어떤 방식으로 보낼지 설정함
 b)form 태그의 모든 속성은 필수가 아니라 선택적으로 사용함
  
--%>

<%-- form 태그 속성
action:폼데이터를 받아 처리하는 웹페이지의 url을 설정함
method :get ,post 지정(폼데이터가 전송되는 http방식 설정)
1)get방식: 이름과 값의 형태로 url에 포함되어 전송, 속도 빠름, 보안 없음, 전송량이 제한적(4096B)
2)post방식:http헤더 속에 감춰서 전송, 속도 느림, 보안 있음, 전송량이 제한없음

--%>