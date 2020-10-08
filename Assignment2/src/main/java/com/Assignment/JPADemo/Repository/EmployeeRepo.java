package com.Assignment.JPADemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.JPADemo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
