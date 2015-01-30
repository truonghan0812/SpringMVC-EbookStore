<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Book</title>
<link rel="stylesheet" href="/myapp-web/css/myapp.css" />
</head>
<body>
	
	<sf:form commandName="book" action="/myapp-web/saveBook"> <!-- commandName is key of the object in modelandview -->
		<sf:errors path="*" cssClass="errorBlock" />
		Title: <sf:input path="title"/> <!-- Path is attribute of the object in commandName -->
		<sf:errors path="title" cssClass="error"/>
		
		Price: <sf:input path="price"/>
		<sf:errors path="price" cssClass="error"/>
		
		<input type="submit">	
	</sf:form>

</body>
</html>