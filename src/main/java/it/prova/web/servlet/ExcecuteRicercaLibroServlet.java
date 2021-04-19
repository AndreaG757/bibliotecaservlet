package it.prova.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Libro;

@WebServlet("/ExcecuteRicercaLibroServlet")
public class ExcecuteRicercaLibroServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public static List<Libro> libri = new ArrayList<>();  
   
    public ExcecuteRicercaLibroServlet() {
    	addLibriInLista();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titoloParameter = request.getParameter("titoloInput");
		String genereParameter = request.getParameter("genereInput");
		String pagineParameter = request.getParameter("pagineInput");
		RequestDispatcher rd = null;
		
		if (titoloParameter != null && !titoloParameter.isEmpty() && genereParameter != null && !genereParameter.isEmpty() &&
			pagineParameter != null && !pagineParameter.isEmpty() && pagineParameter.matches("[0-9]+")) {
			
			Libro libro = new Libro(titoloParameter, genereParameter, Integer.valueOf(pagineParameter));
			
			if (cercaLibroInLista(libro)) {
				rd = request.getRequestDispatcher("libroTrovato.jsp");
				request.setAttribute("libro_attribute", libro);
			} else {
				rd = request.getRequestDispatcher("libroNonTrovato.jsp");
			}
			
		} else {
			rd = request.getRequestDispatcher("libroNonTrovato.jsp");
		}
		
		rd.forward(request, response);
	}

	public static List<Libro> getLibri() {
		return libri;
	}

	public static void setLibri(List<Libro> libri) {
		ExcecuteRicercaLibroServlet.libri = libri;
	}

	public boolean cercaLibroInLista(Libro libro) {
		for (Libro libroTemp : libri) {
			if (libroTemp.equals(libro)) 
				return true;
		}
		return false;
	}
	
	private static void addLibriInLista() {
		libri.add(new Libro("La penna", "giallo", 220));
		libri.add(new Libro("Il pollo", "thriller", 302));
		libri.add(new Libro("Le ciliegie", "romanzo", 422));
		libri.add(new Libro("Il mango", "comunicazione", 323));
		libri.add(new Libro("Il cigno", "cronaca nera", 232));
	}
	
}
