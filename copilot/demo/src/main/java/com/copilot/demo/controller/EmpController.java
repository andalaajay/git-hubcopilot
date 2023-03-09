package com.copilot.demo.controller;
//add annotation for controller
import com.copilot.demo.EmpService;
import com.copilot.demo.entity.Employee;
import com.copilot.demo.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    private EmpService serv;
    //function to add employee
    public void addEmployee(Employee emp) {
        serv.addEmployee(emp);
    }
    //function to delete employee
    public void deleteEmployee(int id) {
        serv.deleteEmployee(id);
    }
    //function to update employee
    public void updateEmployee(Employee emp) {
        serv.updateEmployee(emp);
    }
    //function to get employee by id
    public Employee getEmployee(int id) {
        return serv.getEmployee(id);
    }



}
