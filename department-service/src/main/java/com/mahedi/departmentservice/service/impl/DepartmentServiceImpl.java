package com.mahedi.departmentservice.service.impl;

import com.mahedi.departmentservice.model.Department;
import com.mahedi.departmentservice.repository.DepartmentRepository;
import com.mahedi.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
//        departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(Long id) {
        departmentRepository.findById(id);
    }
}
