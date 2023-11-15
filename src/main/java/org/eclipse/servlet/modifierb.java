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


@WebServlet("/modifierb")
public class modifierb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierb.jsp").forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("code"));
		String titre=request.getParameter("titre");
		String langue=request.getParameter("langue");
		String auteur=request.getParameter("auteur");
		String prix=request.getParameter("prix");
		LivreDaoImpl livreDaoImpl = new LivreDaoImpl(); 
	      
		Livre livre=new Livre(code,titre, langue, auteur, prix);
		
		try {
			livreDaoImpl.update(livre);
			List <Livre> liste = livreDaoImpl.getAll();
			request.setAttribute("livres", liste);
			this.getServletContext().getRequestDispatcher("/WEB-INF/consulterb.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
