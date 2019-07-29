<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Application</title>
<h1>Add Application</h1>
</head>
<body>
<form action="addapp.do" method="post">
App Id      : <select name="appId">
<option>-------select-------</option>
<c:forEach items="${addApp}" var="list">  
      <option>${list}</option>
</c:forEach>
</select>
</form>

</body>
</html>