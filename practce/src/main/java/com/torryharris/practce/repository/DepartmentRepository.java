package com.torryharris.practce.repository;

import com.torryharris.practce.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    public abstract List<Department> findByDepartmentName(String departmentName);
}
