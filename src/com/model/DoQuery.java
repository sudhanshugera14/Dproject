package com.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DoQuery {
	public String register(Registration setget) throws SQLException {

		int ID = setget.getID();
		String name = setget.getName();
		String email = setget.getEmail();
		int salary = setget.getSalary();
		int deptID = setget.getDeptID();
		String deptName = setget.getDeptName();
		String deptLoc = setget.getDeptLoc();

		Connection con = null;
		Statement state = null;

		con = DataConnection.makeConnection();
		state = con.createStatement();

		con.setAutoCommit(false);
		try {
			int i = state.executeUpdate("insert into employee(emp_id, emp_name, email, emp_salary)values('"+ID+"','"+name+"','"+email+"','"+salary+"')");
			int j = state.executeUpdate("insert into department(dept_id, dept_name, dept_location, emp_id)values('"+deptID+"','"+deptName+"','"+deptLoc+"','"+ID+"')");
			
			con.commit();
			return "Registered";
		} catch (SQLException e) {
			con.rollback();
			return "Not registered and rolled back";
		}

	}
}
