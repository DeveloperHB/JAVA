<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="addrbook_error.jsp"
    import="addrbook.*,java.util.*"%>
    
<%request.setCharacterEncoding("UTF-8");%>

<jsp:useBean id="ab" class="addrbook.AddrBean"/>
<jsp:useBean id="addrbook" class="addrbook.AddrBook"/>
<jsp:setProperty name="addrbook" property="*"/>

<%
//컨트롤러 요청 파라미터
String action = request.getParameter("action");

//주소록 목록 요청인 경우
if(action.equals("list")) {
 ArrayList<AddrBook> datas = ab.getDBList();
 request.setAttribute("datas", datas);
 pageContext.forward("addrbook_list.jsp");
 }
 //주소록 등록 요청인 경우
 else if(action.equals("insert")) {
	 if(ab.insertDB(addrbook)) {
		 response.sendRedirect("addrbook_control.jsp?action=list");
	 }
	 else 
		 throw new Exception("DB 입력오류");
 
   }
 else if(action.equals)("edit")){
	   Addrbook abook = ad.getDB(addrbook.getAb_id());
	   if!request.getParameter("upasswd").equals("1234")){
		   out.println("<script>alert('비밀번호가 틀렸습니다.!');history.go(-1);</script>");
	   }
	   else {
		   request.setAttribute("ab".abook);
		   pageContext.forwatd("addrbook_edit_form.jsp");
	   }
   }
  
 else if(action.equals("update")) {
	 if(ab.updateDB(addrbook)) {
		 response.sendRedirect("addrbook_control.jsp?action=list");
	 }
	 else
		 throw new Exception("DB 삭제 오류");
 }
 else{
	 ㅐ
	 if(action.equals("delete")) {
 }
 }
 else
 