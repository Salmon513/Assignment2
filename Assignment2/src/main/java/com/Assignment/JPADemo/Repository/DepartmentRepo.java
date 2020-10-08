package com.Assignment.JPADemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.JPADemo.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
