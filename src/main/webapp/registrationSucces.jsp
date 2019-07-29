<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

.header-right {
  float: right;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}
.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}



</style> 
</head>
<body>
<div class="header">
  <a href="#default" class="logo">Application Zone</a>
  <div class="header-right">
    <a href="creategroup.jsp">Create Group</a>s
    <a href="creategrp.do">Manage Group</a>
    <a href="manage.do">Manage Role</a>
    <a href="addapp.do">Add App</a>
    <a href="#">Map Environment</a>
    <a href="#">Search App</a>
    
  </div>
</div>

</body>
</html>