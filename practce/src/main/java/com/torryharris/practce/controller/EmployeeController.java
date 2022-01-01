package com.torryharris.practce.controller;

import com.torryharris.practce.model.Employee;
import com.torryharris.practce.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private final Logger LOG= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/*")
    public String pg404() {
       LOG.warn("page404");
        return "page looking for is not found";
    }

    @GetMapping("/getempbyid/{eid}")//select * from employee where eid=2
    public Employee getEmpById(@PathVariable(name="eid") int eid) {
        LOG.info("getEmpById" + eid);
        return employeeService.getEmployeeById(eid);
    }

    @GetMapping("/getempbyfirstname/{ename}")//select * from employee where eid=2
    public List<Employee> getEmpByFirstName(@PathVariable(name="ename") String ename) {
        LOG.info("getEmpById" + ename);
        return employeeService.getEmployeeByFirstName(ename);
    }

    @GetMapping("/getempbysalary/{salary}")//select * from employee where eid=2
    public List<Employee> getEmpBySalary(@PathVariable(name="salary") Double salary) {
        LOG.info("getEmpById" + salary);
        return employeeService.getEmployeeBySalary(salary);
    }

    @GetMapping("/emplist")//select * from employee
    public List<Employee> empList() {
        LOG.info("empList");
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addemp")
    public Employee addEmp(@RequestBody Employee emp) {
        LOG.info("addEmp"+emp.toString());
        return employeeService.addEmployee(emp);

    }
    @PutMapping("/updateemp")
    public Employee updateEmp(@RequestBody Employee emp) {
        LOG.info("updateEmp");
        return employeeService.updateEmployee(emp);

    }
    @DeleteMapping("/deleteemp/{eid}")
    public Employee deleteEmp(@PathVariable(name="eid") int eid) {
        LOG.info("deleteEmp"+eid);
        return employeeService.deleteEmployee(eid);

    }
}
