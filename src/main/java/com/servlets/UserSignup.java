package com.servlets;

import java.io.IOException;

import com.DBados.SignupOrLoginados;
import com.models.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/usersignup")
public class UserSignup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		User u1 = new User(email,password);
		SignupOrLoginados ado = new SignupOrLoginados();
		ado.userSignup(u1);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
		requestDispatcher.forward(req, resp);
	}
}
