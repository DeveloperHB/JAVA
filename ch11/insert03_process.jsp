<%@ page import="java.sql.*"%>
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
 
 PreparedStatement pstmt = null;
 
 try {
 String sql = "INSERT INTO Member2(ID,passwd,name) VALUES(?,?,?)";
 pstmt= conn.prepareStatement(sql);
 pstmt.setString(1,ID);
 pstmt.setString(2,passwd);
 pstmt.setString(3,name);
 pstmt.executeUpdate();
 out.println("Member 테이블에 데이터 삽입 성공");
 }catch (SQLException ex) {
 out.println("Member 테이블에 데이터 삽입 실패<br>");
 out.println("SQLException:" + ex.getMessage());
 }finally{
 if(pstmt != null)
 pstmt.close();
 if(conn != null)
 conn.close();
 }
 %>
 
 <%-- PreparedStatement 개체
 - 동적인 커리에 사용함
 - 하나의 객체로 여러 번의 쿼리를 실행할 수 있음
 - 동일한 쿼리문을 특정 값만 바꾸어서 여러 번 실행해야 할 때
  매개변수가 많아서 쿼리문을 정리해야 할 때 유용함
  - 형식
  PreparedStatement prepareStatemnt(String sql)
  throws SQLException
  1)매개변수 sql: 데이터베이스에 보낼 쿼리문.
   쿼리문에 정해지지 않은 값을 물음표(?)로 표시함
   2) 이 물음표에 값을 할당하기 위해 setXxx()메소드를 사용함
    --%>

</body>
</html>