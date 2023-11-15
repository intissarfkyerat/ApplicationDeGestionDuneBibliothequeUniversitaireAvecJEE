package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.Dao.PersonneDaoImpl;
import org.eclipse.bean.Personne;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
		String mail=request.getParameter("mail");
		String pwd=request.getParameter("pwd");
		if(mail.equals("intissarf8@gmail.com") && pwd.equals("123")){
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}else {
		Personne verifierPersonne;
		try {
			verifierPersonne = personneDaoImpl.findByEmail(mail);
			if(verifierPersonne!=null){
		          request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
			}else {
				  request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
     }
	     

}
