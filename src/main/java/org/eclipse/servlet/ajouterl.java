package org.eclipse.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.Dao.LoansDaoImpl;
import org.eclipse.bean.Loans;

@WebServlet("/ajouterl")
public class ajouterl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouterl.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codel=request.getParameter("codel");
		String codead=request.getParameter("codead");
		String datel=request.getParameter("datel");
		String dateb=request.getParameter("dateb");
		LoansDaoImpl loanDaoImpl = new LoansDaoImpl();
		Loans loan = new Loans(codel, codead,dateb,datel);
			try {
				loanDaoImpl.save(loan);
				List <Loans> liste = loanDaoImpl.getAll();
				request.setAttribute("loans", liste);
				this.getServletContext().getRequestDispatcher("/WEB-INF/consulterl.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

}
