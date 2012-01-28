package com.training.java.jdbc.student;

import java.util.List;

import org.junit.Test;

public class StudentDAOJDBCImplTest {
	
	@Test
	public void testGetAllStudents()  {
		
		StudentDAO dao = new StudentDAOJDBCImpl();
		List<Student> students = dao.getAllStudents();
		
		for(Student current : students)
		{
			System.out.println(current);
		}
	}
	
	@Test
	public void testCreateStudent(){
		StudentDAO dao = new StudentDAOJDBCImpl();
		
		Student student = new Student();
		student.setAge(20);
		student.setCity("Sterling Heights");
		student.setEmail("priya@gmail.com");
		student.setFirstName("Priya");
		student.setId(7);
		student.setLastName("Patel");
		student.setPhoneNumber("248-238-9874");
		
		dao.create(student);
		
		//assert that your student is created
		
		//delete the student that you just created
	}

}
