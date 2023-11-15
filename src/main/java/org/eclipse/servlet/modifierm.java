package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import org.eclipse.bean.*;
import org.eclipse.Dao.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifierm")
public class modifierm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierm.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String mail=request.getParameter("mail");
		String profil=request.getParameter("profil");
		String pwd=request.getParameter("pwd");
		PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
		Personne p = new Personne(id,nom, prenom, mail, profil, pwd);
			try {
				personneDaoImpl.update(p);
				List <Personne> liste = personneDaoImpl.getAll();
				request.setAttribute("personne", liste);
				this.getServletContext().getRequestDispatcher("/WEB-INF/consulterm.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

}
