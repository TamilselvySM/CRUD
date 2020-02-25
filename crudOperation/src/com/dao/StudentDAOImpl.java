package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;
import com.util.DBConnection;


public class StudentDAOImpl implements StudentDAO {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public List<Student> get() {

		List<Student> list = null;
		Student student = null;
		
		try {
			 list = new ArrayList<Student>();
			 
				String sql = "SELECT * FROM student";
				connection = DBConnection.openConnection();
				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql);
				while(resultSet.next()) {
					student = new Student();
					student.setId(resultSet.getInt("id"));
					student.setName(resultSet.getString("name"));
					student.setEmail(resultSet.getString("email"));
					student.setDepartment(resultSet.getString("department"));
					student.setDob(resultSet.getString("dob"));
					list.add(student);
				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
