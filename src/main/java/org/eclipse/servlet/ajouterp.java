package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.bean.Penality;
import org.eclipse.Dao.PenaliteDaoImpl;
@WebServlet("/ajouterp")
public class ajouterp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouterp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codep=request.getParameter("cpenalty");
		String codead=request.getParameter("caderant");
		String penalite=request.getParameter("penalty");
		PenaliteDaoImpl penaliteDaoImpl = new PenaliteDaoImpl();
		Penality penality = new Penality (codep, codead,penalite);
		try {
			
			penaliteDaoImpl.save(penality);
			List <Penality> liste = penaliteDaoImpl.getAll();
			request.setAttribute("penalite", liste);
			this.getServletContext().getRequestDispatcher("/WEB-INF/consulterp.jsp").forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
		
	}


