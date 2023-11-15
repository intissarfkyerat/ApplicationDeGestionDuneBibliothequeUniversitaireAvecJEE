package org.eclipse.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.eclipse.Dao.ContactDaoImpl;
import org.eclipse.bean.Contact;

@WebServlet("/contact")
public class contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/contact.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String msg=request.getParameter("message");
		
		Contact contact=new Contact(nom,email,phone,msg);
		ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
		try {
			contactDaoImpl.save(contact);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

        request.getRequestDispatcher("/WEB-INF/contact.jsp").forward(request, response);
	}

	
	
}
