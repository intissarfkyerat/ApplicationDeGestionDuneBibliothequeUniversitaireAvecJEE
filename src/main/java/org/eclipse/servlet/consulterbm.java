package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.Dao.LivreDaoImpl;
import org.eclipse.bean.Livre;

@WebServlet("/consulterbm")
public class consulterbm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LivreDaoImpl livreDaoImpl = new LivreDaoImpl();   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/consulterbm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Livre l = livreDaoImpl.getLivreMoinsEmprunte();
			request.setAttribute("livres", l);
			this.getServletContext().getRequestDispatcher("/WEB-INF/consulterbm.jsp").forward(request, response);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
