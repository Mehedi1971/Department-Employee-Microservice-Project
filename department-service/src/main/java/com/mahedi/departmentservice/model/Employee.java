package com.mahedi.departmentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//public record Employee(Long id, Long departmentId,String name,int age,String position) {
//}
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long departmentId;
    private String name;
    private int age;
    private String position;

    }
