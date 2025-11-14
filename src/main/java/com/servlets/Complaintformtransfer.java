package com.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/complaintformtransfer")
public class Complaintformtransfer  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("id");
		HttpSession session = req.getSession();
		session.setAttribute("email", email);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("compliantform.jsp");
		requestDispatcher.forward(req, resp);
	}
}
