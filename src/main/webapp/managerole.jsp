<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Manage Role</h1>
</head>
<body>
	<pre>
<form action="updated.do" method="post">
Group Name      : <select name="groupname">
<option>-------select-------</option>
<c:forEach items="${groupNames}" var="list">  
      <option>${list}</option>
</c:forEach>
</select>
User Name       : <select name="username">
<option>-------select-------</option>
<c:forEach items="${usernames}" var="list">  
      <option>${list}</option>
</c:forEach>
</select>
Assign Role     : <select name="role">
<option>owner</option>
<option>User</option>
<%--
<option>-------select-------</option> <c:forEach items="${roles}" var="list">  
      <option>${list}</option>
</c:forEach> --%>
</select>

<input type="submit" name="Manage"><input type="submit"
				name="clear" value="Clear">
</form>
</pre>
</body>
</html>