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


@WebServlet("/booking")
public class booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		if(action != null) {
			if(action.equals("reserver")){
				   int code=Integer.parseInt(request.getParameter("code"));
					String titre=request.getParameter("titre");
					String langue=request.getParameter("langue");
					String auteur=request.getParameter("auteur");
					String prix=request.getParameter("prix");
					Livre livre=new Livre(code,titre,langue,auteur,prix);
					request.setAttribute("livre",livre);
					request.getRequestDispatcher("/WEB-INF/booking.jsp").forward(request, response);
		}
		
	}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookId = Integer.parseInt(request.getParameter("code"));
		LivreDaoImpl livreDaoImpl = new LivreDaoImpl();
        try {
            boolean reserved = livreDaoImpl.reserveBook(bookId);
            if (reserved) {
                response.sendRedirect("Home.jsp");
            } else {
            	response.sendRedirect("Home.jsp");
            }
        } catch (SQLException e) {
            throw new ServletException("Error reserving book", e);
        }
	}

}
