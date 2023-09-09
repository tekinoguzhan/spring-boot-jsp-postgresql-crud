package com.otekin.dev.demo.crudapp.service;


import com.otekin.dev.demo.crudapp.dto.StudentDTO;
import java.util.List;

public interface StudentService {

	public void createOrUpdateStudent(StudentDTO empDTO);
	
	public List<StudentDTO> getAllStudent();
	
	public void deleteStudent(Long id);
	
	public StudentDTO editStudent(Long id);
	
}
