package com.torryharris.practce.controller;

import com.torryharris.practce.model.Employee;
import com.torryharris.practce.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/*")
    public String pg404() {
        System.out.println("page404");
        return "page looking for is not found";
    }

    @GetMapping("/emp")//select * from employee where eid=2
    public Employee getEmpById() {
        System.out.println("emp");
        int eid = 2;
        return employeeService.getEmployeeById(eid);
    }

    @GetMapping("/emplist")//select * from employee
    public List<Employee> empList() {
        System.out.println("empList");
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addemp")
    public Employee addEmp(@RequestBody Employee emp) {
        System.out.println("addEmp");
        return employeeService.addEmployee(emp);

    }
    @PutMapping("/updateemp")
    public Employee updateEmp(@RequestBody Employee emp) {
        System.out.println("updateEmp");
        return employeeService.updateEmployee(emp);

    }
    @DeleteMapping("/deleteemp/{eid}")
    public Employee deleteEmp(@PathVariable(name="eid") int eid) {
        System.out.println("deleteEmp"+eid);
        return employeeService.deleteEmployee(eid);

    }
}
