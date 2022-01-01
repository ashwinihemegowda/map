package com.torryharris.practce.repository;

import com.torryharris.practce.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public abstract List<Employee> findByeName(String eName);
    public abstract List<Employee> findBysalary(Double salary);
    public abstract List<Employee> findBysalaryGreaterThanEqual(double salary);

}
