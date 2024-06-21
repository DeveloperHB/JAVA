
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*,java.util.*" %>
    <%request.setCharacterEncoding("UTF-8"); %>

    <%
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
     String email = request.getParameter("email");
      String title = request.getParameter("title");
       String contents = request.getParameter("contents");
       
       String driver = "com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://127.0.0.1:3306/Test";
       
       Class.forName(driver);
       Connection conn = DriverManager.getConnection(url,"root","1234");
       
       PreparedStatement pstmt1 = null, pstmt2 = null;
       
       Calendar dateIn = Calendar.getInstance();
       String indate = Integer.toString(dateIn.get(Calendar.YEAR))+"-";
       indate = indate + Integer.toString(dateIn.get(Calendar.MONTH)+1)+"-";
       indate = indate + Integer.toString(dateIn.get(Calendar.DATE))+"-";
       indate = indate + Integer.toString(dateIn.get(Calendar.HOUR_OF_DAY))+":";
       indate = indate + Integer.toString(dateIn.get(Calendar.MINUTE))+":";
       indate = indate + Integer.toString(dateIn.get(Calendar.SECOND));
       
       String strSQL = "select max(num) from tblboard";
       pstmt1 = conn.prepareStatement(strSQL);
       ResultSet rs = pstmt1.executeQuery();
       int num = 1;
       
       if(!rs.wasNull())
    	   rs.next();
           num = rs.getInt(1)+1; 
           }
       
       String strSQL1 = "INSERT INTO tblboard (name, pass, email, title, contents, writedate, readcount) VALUES (?,?,?,?,?,?,?) ";
       
       pstmt = conn.prepareStatement(strSQL1);
       pstmt2.setString(1, name);
       pstmt2.setString(2, pass);
       pstmt2.setString(3, email);
       pstmt2.setString(4, title);
       pstmt2.setString(5, contents);
       pstmt2.setString(6, indate);
       pstmt2.setInt(7, 0);
       pstmt2.executeUpdate();
       
       pstmt1.close();
       pstmt2.close();
       conn.close();
       response.sendRedirect("listboard.jsp");
       %>
       