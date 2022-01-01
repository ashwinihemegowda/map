//package com.torryharris.practce;
//
//import com.torryharris.practce.model.Employee;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class Hello {
//    @GetMapping("hello")
//    public String hello() {
//        System.out.println("hello");
//        return "hello";
//    }
//    @GetMapping("/hi")
//    public String hi(){
//        System.out.println("hi");
//        return "hi";
//    }
//    @GetMapping("/emp")
//    public Employee getEmpById(){
//        Employee emp=new Employee(101,"ram",25000.00);
//        System.out.println(emp.toString());
//        return emp;
//    }
//    @GetMapping("/*")
//    public String pg404(){
//        System.out.println("page404");
//        return "page looking for is not found";
//    }
//
//
//    }
//
