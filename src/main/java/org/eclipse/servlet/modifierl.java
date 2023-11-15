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


@WebServlet("/modifierl")
public class modifierl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierl.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String codep=request.getParameter("codel");
		String codead=request.getParameter("codead");
		String datel=request.getParameter("datel");
		String dateb=request.getParameter("dateb");
		LoansDaoImpl loanDaoImpl = new LoansDaoImpl();
		Loans loan = new Loans (id,codep, codead,dateb,datel);
	
		try {
			loanDaoImpl.update(loan);
			List <Loans> liste = loanDaoImpl.getAll();
			request.setAttribute("loans", liste);
			this.getServletContext().getRequestDispatcher("/WEB-INF/consulterl.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
