<%@page import="it.prova.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Libro libroInLibroTrovato = (Libro) request.getAttribute("libro_attribute"); %>

	<h1>Il libro che cerchi e'</h1>
	<%= libroInLibroTrovato.getTitolo() %>
	<%= libroInLibroTrovato.getGenere() %>
	<%= libroInLibroTrovato.getPagine() %>
	
	<a href="cercaLibro.jsp">Home</a>

</body>
</html>