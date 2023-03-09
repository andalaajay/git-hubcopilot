package com.copilot.demo;

import com.copilot.demo.entity.Employee;
import com.copilot.demo.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    //function to add employee
    public void addEmployee(Employee emp) {
        repo.save(emp);
    }
    //function to delete employee
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
    //function to update employee
    public void updateEmployee(Employee emp) {
        repo.save(emp);
    }
    //function to get employee by id
    public Employee getEmployee(int id) {
        return repo.findById(id).orElse(null);
    }
    //function to get all employees
    public Iterable<Employee> getAllEmployees() {
        return repo.findAll();
    }
    //function to get employee by name
    public Employee getEmployeeByName(String name) {
        return repo.findByName(name);
    }


}
