package com.example.springdatajpa_demo.repository;

import com.example.springdatajpa_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
