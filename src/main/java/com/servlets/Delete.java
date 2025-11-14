package com.servlets;

import java.io.IOException;

import com.DBados.Complaintsdao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Delete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cid =Integer.parseInt(req.getParameter("id")) ;
		Complaintsdao dao = new Complaintsdao();
		dao.deleteComplaint(cid);
		resp.sendRedirect("userportal");
	}
}
