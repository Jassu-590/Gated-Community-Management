package com.servlets;

import java.io.IOException;
import java.util.List;

import com.DBados.Complaintsdao;
import com.models.Complaints;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userportal")
public class UserPortal extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		String attribute = (String)context.getAttribute("name");
		Complaintsdao dao = new Complaintsdao();
		List<Complaints> fetchComplaints = dao.fetchComplaints(attribute);
		HttpSession session = req.getSession();
		session.setAttribute("complaints", fetchComplaints);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("UserPortal.jsp");
		requestDispatcher.forward(req, resp);
	}
}
