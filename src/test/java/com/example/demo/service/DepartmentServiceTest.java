package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
     @Autowired
    private DepartmentService departmentService;

     @MockBean
     private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department=
                Department.builder()
                        .departmentName("EEE")
                        .departmentAddress("Dhaka")
                        .departmentCode("EEE--007")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("EEE"))
                .thenReturn(department);

    }
    @Test
    @DisplayName("GET DATA BASED ON VALID NAME")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName="EEE";
        Department found=departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName,found.getDepartmentName());

    }
}