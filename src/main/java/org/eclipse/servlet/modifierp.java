package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.Dao.PenaliteDaoImpl;
import org.eclipse.bean.Penality;


@WebServlet("/modifierp")
public class modifierp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierpe.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String codepe=request.getParameter("codepe");
		String codead=request.getParameter("codead");
		String penality=request.getParameter("penalty");
		PenaliteDaoImpl penaliteDaoImpl = new PenaliteDaoImpl();
		Penality penalit = new Penality (id,codepe, codead,penality);
		try {
			 penaliteDaoImpl.update(penalit);
			 List <Penality> liste = penaliteDaoImpl.getAll();
			 request.setAttribute("penalite", liste);
			 this.getServletContext().getRequestDispatcher("/WEB-INF/consulterpe.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
