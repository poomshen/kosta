<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%
		String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	LoginDTO dto = new LoginDTO();
    	
    %>
    
    
    입력 받은 아이디 : <%=id%>
   입력 받은 비밀번호 : <%=pw%>