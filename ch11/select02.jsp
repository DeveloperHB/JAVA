<%@ page import="java.sql.*"%>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Database SQL</title>
</head>
<body>
<%@ include file = "dbconn.jsp" %>
<table width="300" border="1">
     <tr>
      <th>아이디</th>
      <th>비밀번호</th>
      <th>이름</th>
     </tr>
<%
 ResultSet rs = null;
 PreparedStatement pstmt = null;
 
 try{
  String sql = "select * from member2";
  pstmt = conn.prepareStatement(sql);
  rs= pstmt.executeQuery();
  
  while (rs.next()) {
  String id = rs.getString("id");
  String pw = rs.getString("passwd");
  String name = rs.getString("name");
  %> 
   <tr>
      <th><%=id %></th>
      <th><%=pw %></th>
      <th><%=name %></th>
     </tr>
<%
  }
 }catch(SQLException ex) {
	 out.println("Member 호출에 실패했습니다.<br>");
	 out.println("SQLExveption: " + ex.getMessage());
 }finally{
	 if(rs !=null)
		 rs.close();
	 if(pstmt != null)
		 pstmt.close();
	 if(conn != null)
	 conn.close();
	 
 }
%>
</table>
</body>
</html>