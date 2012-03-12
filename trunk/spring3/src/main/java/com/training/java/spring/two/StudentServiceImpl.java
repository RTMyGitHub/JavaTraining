package com.training.java.spring.two;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

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
