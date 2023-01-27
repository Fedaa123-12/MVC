package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.FilmDAO;
import models.Film;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public update() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//gets the id and sends back a set of data based on it
		FilmDAO dao = new FilmDAO();
		int filmID = Integer.valueOf(request.getParameter("update"));	
		Film film = dao.getFilmByID(filmID);
		request.setAttribute("film", film);
		request.getRequestDispatcher("updateFilm.jsp").forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmDAO dao = new FilmDAO();
		//receives the data and updates them
		int ID = Integer.valueOf(request.getParameter("updateId"));
		String title = request.getParameter("updateTitle");
		int year = Integer.valueOf(request.getParameter("updateYear"));
		String director = request.getParameter("updateDirector");
		String stars = request.getParameter("updateStars");
		String review = request.getParameter("updateReview");
		Film f = new Film(ID,title,year,director,stars,review);
		try {
			dao.updateFilm(f);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("showAll");
		}
	}


