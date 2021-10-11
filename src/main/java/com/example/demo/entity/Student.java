package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    private String studentName;
    private String studentAddress;
    private String studentMail;

    @ManyToOne
    @JoinColumn(name = "department_id", insertable = false,updatable = false)
    private Department department;
}
