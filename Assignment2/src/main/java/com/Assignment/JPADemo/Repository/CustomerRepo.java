package com.Assignment.JPADemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.JPADemo.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
