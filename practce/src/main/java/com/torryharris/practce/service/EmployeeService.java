package com.torryharris.practce.service;


import com.torryharris.practce.model.Employee;
import com.torryharris.practce.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees()
    {
        System.out.println("getAllEmployee");
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int eid){
        System.out.println("servicelist");
        return employeeRepository.findById(eid).get();
    }

    public Employee addEmployee(Employee emp) {
        System.out.println("addEmployee");
        return employeeRepository.save(emp);
    }
    public Employee updateEmployee(Employee emp) {
        System.out.println("updateEmployee");
        return employeeRepository.save(emp);
    }

    public Employee deleteEmployee(int eid) {
        System.out.println("deleteEmployee"+eid);
        return null;
    }

}


//@Service
//public class EmployeeService {
//
//    public List<Employee> empList=new ArrayList<>();
//    {
//        empList.add(new Employee(101,"sonu",55000.0));
//        empList.add(new Employee(102,"manu",45000.0));
//        empList.add(new Employee(103,"tonu",5500.0));
//        empList.add(new Employee(104,"ponu",35000.0));
//        empList.add(new Employee(105,"gonu",60000.0));
//    }
//    public List<Employee> getAllEmployee(){
//        System.out.println("servicelist");
//        return empList;
//    }
//    public Employee getEmployeeById(int eid){
//        System.out.println("service id");
//        return empList.get(0);
//    }
//    public Employee addEmployee(Employee emp) {
//        System.out.println("addEmployee");
//        empList.add(emp);
//        return emp;
//    }
//    public Employee updateEmployee(Employee emp) {
//        System.out.println("updateEmployee");
//        return emp;
//    }
//
//    public Employee deleteEmployee(int eid) {
//        System.out.println("deleteEmployee"+eid);
//        return null;
//    }
//
//}
