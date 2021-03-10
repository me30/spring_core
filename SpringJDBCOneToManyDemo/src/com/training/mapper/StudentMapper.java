package com.training.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.pojo.Address;
import com.training.pojo.Student;

public class StudentMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		Address address = new Address();
		
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		address.setArea(rs.getString("area"));
		address.setCity(rs.getString("city"));
	
		student.setAddress(address);

		return student;
	}
}