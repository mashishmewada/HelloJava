package com.java.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import com.java.Dao.UserDao;
import com.java.entities.Message;
import com.java.entities.User;
import com.java.helper.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		 try (PrintWriter out = response.getWriter()) {
			 
			 String useremail = request.getParameter("email");
			 String userpassword = request.getParameter("user_password");
			 
			 UserDao udao = new UserDao(ConnectionProvider.getConnection());
			 
			 User user = udao.getUserByEmailAndPassword(useremail, userpassword);
			 
			 if(user == null){
				 
				//login.................
				 //error...
           		System.out.println("Invalid Details..try again"+useremail+","+userpassword);
           	
				 Message msg = new
				 Message("Invalid Email or Password ! try again","error","alert-danger");
				 HttpSession s = request.getSession(); s.setAttribute("msg", msg);
				 
               
               response.sendRedirect("Login.jsp");

			 }else {
				 //......
				 // login success
				 HttpSession s = request.getSession();
				 s.setAttribute("currentUser", s);
				 response.sendRedirect("Profile.jsp");
				 
			 }
			 
			 
		 }
	}

}
