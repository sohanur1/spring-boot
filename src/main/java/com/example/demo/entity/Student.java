package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    private String studentName;
    private String studentAddress;
    private String studentMail;
}
