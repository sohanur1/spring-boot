package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query
    List<Department> findAllByIsExistTrue();

    List<Department> findAllByIsExistFalse();

    Department findByDepartmentName(String departmentName);


}
