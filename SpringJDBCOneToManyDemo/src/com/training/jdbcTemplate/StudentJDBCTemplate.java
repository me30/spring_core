package com.training.jdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.training.dao.StudentDAO;
import com.training.mapper.StudentMapper;
import com.training.pojo.Student;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private SimpleJdbcCall jdbcCall;
	private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);

		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}

	public List<Student> listStudents() {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		String SQL = "select NAME, age,city,area from student,address where student.address_id=address.id;";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public void create(String area, String pincode, String city, String name, Integer age) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		String SQL1 = "insert into Address (AREA, PINCODE, CITY) values(?,?,?)";
		String SQL2 = "INSERT INTO Student (NAME, AGE, ADDRESS_ID) values (?,?,?)";
		
		//save data and return its identity id...
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplateObject.update(
		    new PreparedStatementCreator() {
		        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		            PreparedStatement ps =
		                connection.prepareStatement(SQL1, new String[] {"id"});
		            ps.setString(1, area);
		            ps.setString(2, pincode);
		            ps.setString(3, city);
		            return ps;
		        }
		    },
		    keyHolder);
		
		Integer addressId = Integer.parseInt(keyHolder.getKey().toString());
		jdbcTemplateObject.update( SQL2,name, age,addressId);
		System.out.println("Created Record Name = " + name + " Age = " + age + " " + area + " " + pincode + " " + city);
		return;

	}
	@Override
	public void delete(Integer id) {
		String SQL = "delete from student where id = ?";
		String SQL1 = "delete from address where id = ?";
		jdbcTemplateObject.update(SQL, id);
		jdbcTemplateObject.update(SQL1, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	
	@Override
	public void update(String studentName, int age, String area, int id) {
		String SQL = "update student,address set student.name =?,student.age = ?, address.AREA= ? where student.address_id=address.id and student.id=?;";
		jdbcTemplateObject.update(SQL, studentName, age,area,id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}
}