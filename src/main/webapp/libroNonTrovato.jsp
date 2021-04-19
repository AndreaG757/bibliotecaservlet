<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libro Non Trovato</title>
</head>
<body>

	<h2>Il libro non esiste. Vuoi Crearlo?</h2>
	<form action="ExecuteToAddLibroServlet" method="post">
		<label for="titoloInput2">Titolo: </label>
		<input type="text" name="titoloInput2"><br>
		<label for="genereInput2">Genere: </label>
		<input type="text" name="genereInput2"><br>
		<label for="pagineInput2">Pagine:</label>
		<input type="text" name="pagineInput2">
		<input type="submit" value="Invio">
	</form>

</body>
</html>