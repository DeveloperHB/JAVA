<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*, java.util.*" %>
    <% request.setCharacterEncoding("UTF-8"); %>

    
    <%
    String num = request.getParameter("num");
    String pass = request.getParameter("pass");
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/Test";
    
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url,"root","1234");
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String strSQL = "select pass from tblboard where num = ?";
    pstmt = conn.prepareStatement(strSQL);
    pstmt.setInt(1, Integer.parseInt(num));
    
    rs = pstmt.executeQuery();
    rs.next();
    
    String goodpass = rs.getString("pass").trim();
    if(pass.equals(goodpass)){
    response.sendRedirect("modify.jsp?num=" + num);
    }else{
    response.sendRedirect("modify_pass.jsp?num=" + num);
    }
    
    rs.close();
    pstmt.close();
    conn.close();
    
    %>