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
import org.eclipse.Dao.*;

@WebServlet("/consulterp")
public class consulterp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PenaliteDaoImpl penaliteDaoImpl = new PenaliteDaoImpl();  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null) {	
			if(action.equals("Supprimer")){
					int id = Integer.parseInt(request.getParameter("id"));
					try {
						penaliteDaoImpl.remove(id);
						List<Penality> liste = penaliteDaoImpl.getAll();
						request.setAttribute("penalite", liste);
						request.getRequestDispatcher("/WEB-INF/consulterp.jsp").forward(request, response);
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}else if(action.equals("modifier")){
				int id=Integer.parseInt(request.getParameter("id"));
				String codepe=request.getParameter("codepe");
				String codead=request.getParameter("codead");
				String penalite=request.getParameter("penalite");
				Penality pe = new Penality(id,codepe,codead,penalite);
				request.setAttribute("penalite", pe);
				request.getRequestDispatcher("/WEB-INF/modifierpe.jsp").forward(request, response);
		}
		}
			try {
				List <Penality> liste = penaliteDaoImpl.getAll();
				request.setAttribute("penalite", liste);
				this.getServletContext().getRequestDispatcher("/WEB-INF/consulterp.jsp").forward(request, response);
		
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);     
		this.getServletContext().getRequestDispatcher("/WEB-INF/consulterp.jsp").forward(request, response);	
			
	}

}
