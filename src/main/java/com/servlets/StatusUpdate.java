package com.servlets;

import java.io.IOException;

import com.DBados.Adminados;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/statusupdate")
public class StatusUpdate extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cid = Integer.parseInt(req.getParameter("cid"));
		String status = req.getParameter("status");
		Adminados dos = new Adminados();
		dos.updateStatus(cid, status);
		resp.sendRedirect("adminportal");
		
	}
}
