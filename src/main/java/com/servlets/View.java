package com.servlets;

import java.io.IOException;

import com.DBados.Complaintsdao;
import com.models.Complaints;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view")
public class View  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String compid = req.getParameter("id");
		Complaintsdao dao = new Complaintsdao();
		Complaints viewComplaint = dao.viewComplaint(compid);
		HttpSession session = req.getSession();
		session.setAttribute("complaint", viewComplaint);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("view.jsp");
		requestDispatcher.forward(req, resp);
	}
}
