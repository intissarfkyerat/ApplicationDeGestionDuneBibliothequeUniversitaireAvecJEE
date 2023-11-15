package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.eclipse.Dao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.bean.Personne;

@WebServlet("/consulterm")
public class consulterm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null) {	
			if(action.equals("Supprimer")){
					int id = Integer.parseInt(request.getParameter("id"));
					
					try {
						personneDaoImpl.remove(id);
						List<Personne> liste = personneDaoImpl.getAll();
						request.setAttribute("personne", liste);
						request.getRequestDispatcher("/WEB-INF/consulterm.jsp").forward(request, response);
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}else if(action.equals("modifier")){
				int id=Integer.parseInt(request.getParameter("id"));
				String nom=request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String mail=request.getParameter("mail");
				String profil=request.getParameter("profile");
				String pwd=request.getParameter("pwd");
				Personne personne = new Personne(id,nom, prenom, mail, profil, pwd);
				request.setAttribute("personne", personne);
				request.getRequestDispatcher("/WEB-INF/modifierm.jsp").forward(request, response);
		}
		
		}
			try {
				List <Personne> liste = personneDaoImpl.getAll();
				request.setAttribute("personne", liste);
				this.getServletContext().getRequestDispatcher("/WEB-INF/consulterm.jsp").forward(request, response);
		
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);     
		this.getServletContext().getRequestDispatcher("/WEB-INF/consulterm.jsp").forward(request, response);	
			
	}

}
