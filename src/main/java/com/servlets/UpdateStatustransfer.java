package com.servlets;

import java.io.IOException;

import com.DBados.Adminados;
import com.models.Complaints;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/updatestatus")
public class UpdateStatustransfer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cid = req.getParameter("id");
		Adminados ado = new Adminados();
		Complaints viewStatus = ado.viewStatus(Integer.parseInt(cid));
		HttpSession session = req.getSession();
		session.setAttribute("view", viewStatus);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("statusupdate.jsp");
		requestDispatcher.forward(req, resp);
	}
}
