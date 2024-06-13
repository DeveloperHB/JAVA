<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Database SQL</title>
</head>
<body>
<%@ include file = "dbconn.jsp" %>
<%
 request.setCharacterEncoding("utf-8");
 String ID = request.getParameter("ID");
 String passwd = request.getParameter("passwd");
 String name = request.getParameter("name");
 
 Statement stmt = null;
 
 try {
 String sql = "INSERT INTO Member1(ID,passwd,name) VALUES('"+ID+"','"+passwd+"','"+name+"')";
 stmt= conn.createStatement();
 stmt.executeUpdate(sql);
 out.println("Member 테이블에 데이터 삽입 성공");
 }catch (SQLException ex) {
 out.println("Member 테이블에 데이터 삽입 실패<br>");
 out.println("SQLException:" + ex.getMessage());
 }finally{
 if(stmt != null)
 stmt.close();
 if(conn != null)
 conn.close();
 }
 %>
 
 <%-- Statement 객체로 데이터 접근하기
 -Statement 개체는 정적인 쿼리에 사용함
 -하나의  --%>

</body>
</html>