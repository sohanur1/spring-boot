package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {


    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/departments")
   public List<Department> fetchDepartmentList(){

        return departmentService.fetchDepartmentList();
   }

   @GetMapping("/departments/active")
   public List<Department> checkDepartmentList(){

        return departmentService.checkDepartmentList();
   }

    @GetMapping("/departments/inactive")
    public List<Department> checkInActiveDepartmentList(){

        return departmentService.checkInActiveDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById( @PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentId(@PathVariable ("id") Long departmentId,
                                          @RequestBody Department department){
        return departmentService.updateDepartmentId(departmentId,department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
       return departmentService.fetchDepartmentByName(departmentName);
    }






}
