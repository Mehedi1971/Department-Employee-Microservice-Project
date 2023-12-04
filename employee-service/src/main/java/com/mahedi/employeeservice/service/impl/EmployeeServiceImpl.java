package com.mahedi.employeeservice.service.impl;

import com.mahedi.employeeservice.model.Employee;
import com.mahedi.employeeservice.repository.EmployeeRepository;
import com.mahedi.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
//        EmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> findByDepartment(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }

    @Override
    public void updateEmployee(Long id) {
        employeeRepository.findById(id);
    }
}