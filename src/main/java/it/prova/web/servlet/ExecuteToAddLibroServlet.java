package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Libro;

@WebServlet("/ExecuteToAddLibroServlet")
public class ExecuteToAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExecuteToAddLibroServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titoloParameter2 = request.getParameter("titoloInput2");
		String genereParameter2 = request.getParameter("genereInput2");
		String pagineParameter2 = request.getParameter("pagineInput2");
		RequestDispatcher rd = null;
		
		if (titoloParameter2 != null && !titoloParameter2.isEmpty() && titoloParameter2.equalsIgnoreCase(titoloParameter2) &&
				genereParameter2 != null && !genereParameter2.isEmpty() && genereParameter2.equalsIgnoreCase(genereParameter2) &&
				pagineParameter2 != null && !pagineParameter2.isEmpty() && pagineParameter2.matches("[0-9]+")) {
			
			Libro libro = new Libro(titoloParameter2, genereParameter2, Integer.valueOf(pagineParameter2));
			ExcecuteRicercaLibroServlet.libri.add(libro);
			
			rd = request.getRequestDispatcher("aggiuntaLibroConferma.jsp");
			
		} else {
			rd = request.getRequestDispatcher("cercaLibro.jsp");
		}
		rd.forward(request, response);
	}

}
