package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.DoQuery;
import com.model.Registration;



/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerServlet() {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("ID"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int salary = Integer.parseInt(request.getParameter("salary"));
		int deptID = Integer.parseInt(request.getParameter("exp"));
		String deptName = request.getParameter("deptName");
		String deptLoc = request.getParameter("deptLoc");

		Registration setget = new Registration();

		setget.setID(ID);
		setget.setName(name);
		setget.setEmail(email);
		setget.setSalary(salary);
		setget.setDeptID(deptID);
		setget.setDeptName(deptName);
		setget.setDeptLoc(deptLoc);

		DoQuery query = new DoQuery();

		String check = "";
		try {
			check = query.register(setget);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (check.equals("Registered")) {
			request.getRequestDispatcher("/Successful.jsp").forward(request,
					response);
		}
		else if (check.equals("Not registered and rolled back")){
			request.getRequestDispatcher("/view.jsp").forward(request,
					response);
		}

	}

}