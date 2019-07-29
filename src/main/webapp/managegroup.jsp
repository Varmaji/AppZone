<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Manage Group</h1>
</head>
<body>

<form action="invite.do" method="post">

<pre>
MANAGE GROUP: <select name="groupname">
<option>======select=======</option>
<c:forEach items="${groupNames}" var="list">  
      <option>${list}</option>
</c:forEach>
</select>
EMAIL ID:<input type=text name="emailid">

</pre>
<input type="submit" name="invite">
</form>
</body>
</html>