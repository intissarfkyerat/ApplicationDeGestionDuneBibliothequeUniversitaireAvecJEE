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



@WebServlet("/consulterb")
public class consulterb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LivreDaoImpl livreDaoImpl = new LivreDaoImpl(); 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
	if(action != null) {	
		if(action.equals("Supprimer")){
				int code = Integer.parseInt(request.getParameter("code"));
				livreDaoImpl.remove(code);
				try {
					
					List<Livre> liste = livreDaoImpl.getAll();
					request.setAttribute("livres", liste);
					request.getRequestDispatcher("/WEB-INF/consulterb.jsp").forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}else if(action.equals("modifier")){
			   int code=Integer.parseInt(request.getParameter("code"));
				String titre=request.getParameter("titre");
				String langue=request.getParameter("langue");
				String auteur=request.getParameter("auteur");
				String prix=request.getParameter("prix");
				Livre livre=new Livre(code,titre, langue, auteur, prix);
				request.setAttribute("livre", livre);
				request.getRequestDispatcher("/WEB-INF/modifierb.jsp").forward(request, response);
		}
		}
	
	
		try {
			List <Livre> liste = livreDaoImpl.getAll();
			request.setAttribute("livres", liste);
			this.getServletContext().getRequestDispatcher("/WEB-INF/consulterb.jsp").forward(request, response);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        
		doGet(request, response);     
		this.getServletContext().getRequestDispatcher("/WEB-INF/consulterb.jsp").forward(request, response);	
			

	}

}
