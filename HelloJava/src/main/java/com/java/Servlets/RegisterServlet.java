package com.java.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.Dao.UserDao;
import com.java.entities.User;
import com.java.helper.ConnectionProvider;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()){
        	
        	//fetch's form data
        	String check = request.getParameter("check");
        	if (check == null) {
				
        		out.println("Something went wrong or unchecked the Box...");
        		
        		
			} else {
				
				
				String name = request.getParameter("user_name");
				String email = request.getParameter("user_email");
				String password = request.getParameter("user_password");
				
				
				//create user object and set all data to that object..
				User user = new User(name, email, password);
				
				//create a user dao object..
				UserDao dao = new UserDao(ConnectionProvider.getConnection());
				
				try {
					if (dao.saveUser(user)) {
						
						 out.println("<h1>Welcome "+name+", You are Successful registred.</h1>");
						 out.println("<h2>Name : "+name+"</h2>");
						 out.println("<h2>Email : "+email+"</h2>");
						 out.println("<h2>Password : "+password+"</h2>");
						 out.println("<h3><A HREF=\"Login.jsp\">Login here</A><h3>");
						 //response.sendRedirect("Login.jsp");
						
					} else {
						
						out.println("Something went wrong or Email is already in used.");

					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
        }
        
	}

}
