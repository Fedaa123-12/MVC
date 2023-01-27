package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.FilmDAO;
import models.Film;

/**
 * Servlet implementation class showAll
 */
@WebServlet("/showAll")
public class showAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public showAll() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//send all films back to the jsp file
		FilmDAO dao = new FilmDAO();
		ArrayList<Film> allFilms = dao.getAllFilms(); 
		request.setAttribute("showFilms", allFilms);
		RequestDispatcher rd = request.getRequestDispatcher("movies.jsp");
		rd.forward(request, response);
	}
}
