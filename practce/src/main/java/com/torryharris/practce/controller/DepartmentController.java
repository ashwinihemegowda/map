package com.torryharris.practce.controller;

import com.torryharris.practce.model.Department;
import com.torryharris.practce.model.Employee;
import com.torryharris.practce.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DepartmentController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getdepbyid/{did}")//select * from employee where did=20
    public Department getDepById(@PathVariable(name = "did") int did) {
        LOG.info("getEmpById" + did);
        return departmentService.getDepartmentById(did);
    }

    @GetMapping("/getdepbyname/{depname}")//select * from employee where eid=2
    public List<Department> getDepByName(@PathVariable(name = "depname") String depname) {
        LOG.info("getEmpById" + depname);
        return departmentService.getDepartmentByName(depname);
    }
}
