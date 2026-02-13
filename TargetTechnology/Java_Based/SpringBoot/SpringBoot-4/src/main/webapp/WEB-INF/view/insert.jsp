<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
<form action="/insert" method="post">

    <label>Employee ID:</label><br>
    <input type="number" name="id" required><br><br>

    <label>Name:</label><br>
    <input type="text" name="name" required><br><br>

    <label>Address:</label><br>
    <input type="text" name="address" required><br><br>

    <label>Salary:</label><br>
    <input type="number" name="salary" step="0.01" required><br><br>
    
    <label>Date:</label><br>
    <input type="date" id="date" name="date"> <br> <br>

    <button type="submit">Submit</button>

</form>


</body>
</html>