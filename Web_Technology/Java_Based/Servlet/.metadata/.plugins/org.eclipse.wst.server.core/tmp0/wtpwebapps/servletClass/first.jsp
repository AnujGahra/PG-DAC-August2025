<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		int n1 = Integer.parseInt(request.getParameter("first"));
		int n2 = Integer.parseInt(request.getParameter("second"));
		
		int sum = n1+ n2;
		out.print("Square = " + sum);
		
%>


</body>
</html>