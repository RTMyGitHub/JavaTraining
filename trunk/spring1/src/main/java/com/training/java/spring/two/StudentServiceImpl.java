package com.training.java.spring.two;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> allStudents =  dao.getStudents();
		
		List<Student> troyStudents = new ArrayList<Student>();
		
		for(Student aStudent : allStudents)
		{
			if(aStudent.getCity() != null && aStudent.getCity().equalsIgnoreCase("TROY"))
			{
				troyStudents.add(aStudent);
			}
		}
		
		return troyStudents;
	}
}
