package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.Dao.PersonneDaoImpl;
import org.eclipse.bean.Personne;
 

@WebServlet("/sign")
public class sign extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/sign.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String mail=request.getParameter("mail");
		String profile=request.getParameter("profile");
		String pwd=request.getParameter("pwd");
		PersonneDaoImpl personneDaoImpl=new PersonneDaoImpl();
		Personne personne=new Personne(nom,prenom,mail,profile,pwd);
		try {
			      personneDaoImpl.save(personne);
		          request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
