package com.techlabs.controller.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		Boolean flag = false;
		HttpSession session = request.getSession();
		session.setAttribute("loginFlag", flag);
		if (username.equalsIgnoreCase("root")
				&& password.equalsIgnoreCase("admin")) {
			flag = true;

			session.setAttribute("loginFlag", flag);
			request.getRequestDispatcher("loggedIn.jsp").forward(request,
					response);
		} else {
			session.setAttribute("loginFlag", flag);
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}
	}

}
