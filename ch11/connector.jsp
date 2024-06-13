<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*"%>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>Database SQL</title>
</head>
<body>


<%-- JDBC API로 데이터 베이스 접속하기 --%>
<%
Connection conn = null;
try{
String url ="jdbc:mysql://localhost:3306/jspbookDB";
String user = "root";
String password = "1234";

Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection(url,user,password);
out.println("데이터베이스 연결 성공");
}catch (SQLException ex) {
out.println("데이터베이스 연결 실패<br>");
out.println("SQLException:" +ex.getMessage());
}finally{
if (conn!=null)
conn.close();
}
%>



<%--
 JDBC(Java DataBase Connectivity)
-자바/JSP 프로그램 내에서 데이터베이스와 관련된 작업을 처리할 수 있도록
도와주는 자바 표준 인터페이스
-관계형 데이터베이스 시스템에 접근하여 SQL 문을 실행하기 위한 자바 API또는 자바 라이브러리
-JDBC API를 사용하면 DBMS의 종류에 상관없이 데이터베이스 작업을 처리할 수 있음

JDBC를 사용한 JSP와 데이터베이스의 연동
1)java.sql.* 패키지 임포트
2)JDBC 드라이버 로딩
3)데이터베이스 접속을 위한 Connection 객체 생성
4)쿼리문을 실행하기 위한 Statement/PreparedStatement/
CallableStatement 객체 생성
5)쿼리 실행
6)쿼리 실행의 결과 값(int, ResultSet) 사용
7)사용된 객체(ResultSet, Statement/PreparedStatement/
CallableStatement, Connection) 종료

-JDBC 드라이버 로딩
-JDBC 드라이버 로딩 단계에서는 드라이버 인터페이스를 구현하는 작업
-Class.forName()메소드를 이용하여 JDBC 드라이버를 로딩
-JDBC 드라이버가 로딩되면 자동으로 

-MySQL 드라이버 로딩 예
<%
try {
Class.forName("com.mysql.jdbc.Driver");
} catch (SQLException ex) {
// 예외 발생 처리
}


-Connection 객체 생성
-JDBC 드라이버에서 데이터베이스와 연결 된 커넥션을 가져오기 위해
DriveManager 클래스의 getConnection()메소드를 사용함
-DriverManager 클래스로 Connection 객체를 생성 할 때
JDBC드라이버를 검색하고, 검색된 드라이버를 이용하여
Connection객체를 생성한 후 이를 반환함
-형식
Static Connection getConnection(String url, String user, String password)
1)매개변수 url :데이터베이스 경로.
url의 표현 형식 : jdbc:dbms 이름:주소:포트 번호[데이터베이스 식별자]
2)매개변수 user, password: 데이터베이스 사용자 이름, 비밀번호

-데이터베이스 연결 닫기
-데이터베이스 연결이 더 이상 필요하지 않으면 close()메소드로 생성한 Connection객체를 해제
-데이터베이스 리소스를 사용하기 않기 위해 사용을 끝내자마자 리소스를 해제하는 것이 좋음
-형식
 void close() throws SQLException
 -Close()메소드 사용 예: 데이터베이스의 연결 종료하기
  Connection conn = null;
  try {
  //JDBC 드라이버 로딩
  //Connection 객체 생성
  }catch (SQLException e) {
  //예외 발생 처리
  } finally {
  
 --%>
</body>
</html>