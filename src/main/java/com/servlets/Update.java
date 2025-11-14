package com.servlets;

import java.io.IOException;

import com.DBados.Complaintsdao;
import com.models.Complaints;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class Update extends  HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Complaints c = new Complaints();
		c.setCid(Integer.parseInt(req.getParameter("cid")));
		c.setName(req.getParameter("name"));
		c.setFlatNo(req.getParameter("flat"));
		c.setEmail(req.getParameter("email"));
		c.setMobile(req.getParameter("phone"));
		c.setComplaintType(req.getParameter("ctype"));
		c.setUrgencyLevel(req.getParameter("urgency"));
		c.setComplaintDesp(req.getParameter("desc"));
		c.setStatusid(req.getParameter("statusid"));
		
		Complaintsdao dao = new Complaintsdao();
		dao.updateComplaint(c);
		
		resp.sendRedirect("userportal");
		
	}
}
