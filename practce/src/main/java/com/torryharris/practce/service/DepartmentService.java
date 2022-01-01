package com.torryharris.practce.service;

import com.torryharris.practce.model.Department;
import com.torryharris.practce.model.Employee;
import com.torryharris.practce.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final Logger LOG= LoggerFactory.getLogger(this.getClass());

    @Autowired
    DepartmentRepository departmentRepository;
    public Department getDepartmentById(int departmentId){
        LOG.info("servicelist");
        return departmentRepository.findById(departmentId).get();
    }
    public List<Department> getDepartmentByName(String name){
        LOG.info("getEmployeeByFirstName");
        return departmentRepository.findByDepartmentName(name);
    }

}
