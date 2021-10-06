package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {




    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

   public List<Department> checkDepartmentList();

    List<Department> checkInActiveDepartmentList();


    Department fetchDepartmentById(Long departmentId);
    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentId(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}






