package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Department> checkDepartmentList() {
        return departmentRepository.findAllByIsExistTrue();
    }

    @Override
    public List<Department> checkInActiveDepartmentList() {
          return departmentRepository.findAllByIsExistFalse();
    }

    @Override
    public List<Department> deleteDepartmentId() {
        return departmentRepository.delete();
    }


}
