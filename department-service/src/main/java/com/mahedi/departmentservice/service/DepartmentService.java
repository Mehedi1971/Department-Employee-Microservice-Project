package com.mahedi.departmentservice.service;

import com.mahedi.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();

    Department saveDepartment(Department department);

    void deleteDepartment(Long id);

    void updateDepartment(Long id);
}
