package com.torryharris.practce.model;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;
    private String city;

    public Department() {
    }

    public Department(int departmentId, String departmentName, String city) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.city = city;
    }

    public Department(String departmentName, String city) {
        this.departmentName = departmentName;
        this.city = city;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
