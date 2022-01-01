package com.torryharris.practce.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)//value generated automatically
    private int eid;
    private String eName;
    private double salary;
    @ManyToOne
    @JoinColumn(name="departmentId",nullable=true)//must be identical to department table field name
    private Department department;

    public Employee() {
    }

    public Employee(String eName, double salary, Department department) {
        this.eName = eName;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String eName, double salary) {
        this.eName = eName;
        this.salary = salary;
    }

    public Employee(int eid, String eName, double salary, Department department) {
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
        this.department = department;
    }

    public Employee(int eid, String eName, double salary) {
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
