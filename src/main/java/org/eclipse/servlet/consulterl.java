package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.Dao.LoansDaoImpl;
import org.eclipse.bean.Loans;




@WebServlet("/consulterl")
public class consulterl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoansDaoImpl loanDaoImpl = new LoansDaoImpl(); 
	     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null) {	
			if(action.equals("Supprimer")){
					int id = Integer.parseInt(request.getParameter("id"));
					
					try {
						loanDaoImpl.remove(id);
						List<Loans> liste = loanDaoImpl.getAll();
						request.setAttribute("loans", liste);
						request.getRequestDispatcher("/WEB-INF/consulterl.jsp").forward(request, response);
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}else if(action.equals("modifier")){
				int id=Integer.parseInt(request.getParameter("id"));
				String codel=request.getParameter("codel");
				String codead=request.getParameter("codead");
				String datel=request.getParameter("datel");
				String dateb=request.getParameter("dateb");
				Loans loan = new Loans (id,codel, codead,datel,dateb);			
				request.setAttribute("loan", loan);
				request.getRequestDispatcher("/WEB-INF/modifierl.jsp").forward(request, response);
		}
		}
			try {
				List <Loans> liste = loanDaoImpl.getAll();
				request.setAttribute("loans", liste);
				this.getServletContext().getRequestDispatcher("/WEB-INF/consulterl.jsp").forward(request, response);
		
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);     
		this.getServletContext().getRequestDispatcher("/WEB-INF/consulterl.jsp").forward(request, response);	
			
	}

}
