package com.Assignment.JPADemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.JPADemo.Repository.DepartmentRepo;
import com.Assignment.JPADemo.model.Department;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentRepo deptRepo;
	
	
	@PostMapping("/saveDept")
	public String saveDept(@RequestBody Department dept) {
		deptRepo.save(dept);
	return "Department Saved";
	}

}
