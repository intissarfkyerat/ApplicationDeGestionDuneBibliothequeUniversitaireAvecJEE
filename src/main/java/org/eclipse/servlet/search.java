package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.Dao.LivreDaoImpl;
import org.eclipse.bean.Livre;
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LivreDaoImpl livreDaoImpl = new LivreDaoImpl();    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/search.jsp").forward(request, response);
				
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc=request.getParameter("mc");
		try {
		List<Livre> liste= livreDaoImpl.getLivreParMC(mc);
		request.setAttribute("livres", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/search.jsp").forward(request, response);
		} catch (SQLException e) {					
			e.printStackTrace();
		}
     }
	     
	}
