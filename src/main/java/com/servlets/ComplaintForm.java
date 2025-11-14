package com.servlets;

import java.io.IOException;

import com.DBados.Complaintsdao;
import com.models.Complaints;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/complaintform")
public class ComplaintForm extends HttpServlet{
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String flat = req.getParameter("flat");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String ctype = req.getParameter("type");
		String urgency = req.getParameter("urgency");
		String desc = req.getParameter("desc");
		
		Complaints c1 = new Complaints(name,flat,email,phone,ctype,urgency,desc);
		
		Complaintsdao dao = new Complaintsdao();
		dao.insertComplaint(c1);
		resp.sendRedirect("userportal");
		
	}
}
