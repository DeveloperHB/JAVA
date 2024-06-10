<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>

<title>Implict Objects</title>
</head>
<body>
  <%
  request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
  %>
  <p> 이 름 : <%= name %>
<%-- request.setCharacterEncoding("utf-8");
폼에서 한글 입력을 정상적으로 처리하려면 반드시 필요함 --%>
<%-- getParameter(String name)
요청 파라미터 이름이 name인 값을 전달받음.
요청 파라미터 값이 없으면 null 반환 --%> 
 
</body>
</html>