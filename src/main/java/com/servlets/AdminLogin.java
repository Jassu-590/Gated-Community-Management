package com.servlets;

import java.io.IOException;

import com.DBados.Adminados;
import com.models.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Admin a = new Admin();
		a.setUserName(username);
		a.setPassword(password);
		
		Adminados ado = new Adminados();
		if(ado.adminLogin(a)) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminportal");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
