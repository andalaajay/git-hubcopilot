package com.copilot.demo.repo;
//connect to database with repository annotation
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copilot.demo.entity.Employee;

@Repository

public interface EmpRepo extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);
}
