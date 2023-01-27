package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.FilmDAO;
import models.Film;

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public insert() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("insertMovie.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmDAO dao = new FilmDAO();
		
		//get the posted data and insert them 
		String title = request.getParameter("title");
		int year = Integer.valueOf(request.getParameter("year"));
		String director = request.getParameter("director");
		String stars = request.getParameter("stars");
		String review = request.getParameter("review");
		Film f = new Film(title,year,director,stars,review);
		try {
			dao.insertContact(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("showAll");
	}
}