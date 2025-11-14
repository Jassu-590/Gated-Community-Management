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

@WebServlet("/updatetransfer")
public class UpdateTransfer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cid = req.getParameter("id");
		Complaintsdao c = new Complaintsdao();
		Complaints viewComplaint = c.viewComplaint(cid);
		HttpSession session = req.getSession();
		session.setAttribute("updatecomplaint", viewComplaint);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(req, resp);
	}
}
