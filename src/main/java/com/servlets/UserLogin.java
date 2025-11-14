package com.servlets;

import java.io.IOException;

import com.DBados.SignupOrLoginados;
import com.models.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userlogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		User u1 = new User();
		u1.setEmail(email);
		u1.setPassword(password);
		SignupOrLoginados dos= new SignupOrLoginados();
		if(dos.UserLogin(u1)) {
			
			String name = u1.getEmail().split("@")[0];
			ServletContext servletContext = req.getServletContext();
			servletContext.setAttribute("name", name);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("userportal");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
			requestDispatcher.forward(req, resp);
		}
	}
}
