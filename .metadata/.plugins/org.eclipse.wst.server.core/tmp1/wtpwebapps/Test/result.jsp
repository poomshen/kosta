<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%
		String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	LoginDTO dto = new LoginDTO();
    	
    %>
    
    
    �Է� ���� ���̵� : <%=id%>
   �Է� ���� ��й�ȣ : <%=pw%>