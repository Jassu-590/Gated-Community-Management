package com.servlets;

import java.io.IOException;
import java.util.List;

import com.DBados.Adminados;
import com.models.Complaints;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminportal")
public class AdminPortal extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Adminados ado = new Adminados();
		List<Complaints> adminData = ado.adminData();
		HttpSession session = req.getSession();
		session.setAttribute("complaints", adminData);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminportal.jsp");
		requestDispatcher.forward(req, resp);
	}
}
