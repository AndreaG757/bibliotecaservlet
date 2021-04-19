<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cerca Libro</title>
</head>
<body>

	<h1>Inserisci libro da cercare.</h1>
	<form action="ExcecuteRicercaLibroServlet" method="post">
		<label for="titoloInput">Titolo: </label>
		<input type="text" name="titoloInput"><br>
		<label for="genereInput">Genere: </label>
		<input type="text" name="genereInput"><br>
		<label for="pagineInput">Pagine:</label>
		<input type="text" name="pagineInput">
		<input type="submit" value="Invio">
	</form>

</body>
</html>