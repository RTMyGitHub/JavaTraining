package com.training.java.spring.two;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceImplTest {

	@Test
	public void testGetStudents() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		StudentService service = context.getBean(StudentService.class);
		List<Student> students = service.getStudents();
		
		for(Student aStudent : students)
		{
			System.out.println("City = " + aStudent.getCity());
		}
	}
	
	
}
