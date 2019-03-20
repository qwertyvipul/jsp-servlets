package com.example.login_application;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.login_application.dto.User;
import com.example.login_application.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "A simple login servlet.", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(username, password);
		
		if(result) {
			User user = loginService.getUser(username);
			// request.getSession().setAttribute("user", user);
			// response.sendRedirect("success.jsp");
			/*
			 * Another way to the above stuff
			 * We are gonna use Request Dispatcher Object
			 * The same request and response as of the current page
			 * is forwarded to the redirecting page as well
			 */
			request.setAttribute("user", user);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
			return;
		}else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
