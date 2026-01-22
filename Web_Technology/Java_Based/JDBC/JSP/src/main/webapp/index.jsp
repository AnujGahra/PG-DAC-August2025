<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is the JSP</h1>

<%!  // declarative tag
int  result;
public void xyz(int i, int j) {
	result = i+j;
}
%>

<%  // Scriptlets
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	xyz(a, b);
	
	/* PrintWriter --> request */
	//out.print(a+b);
	
	
%> 
<%= result %> 
 

</body>
</html>