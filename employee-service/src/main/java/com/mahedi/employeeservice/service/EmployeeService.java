package com.mahedi.employeeservice.service;

import com.mahedi.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee saveEmployee(Employee employee);

    void updateEmployee(Long id);

    void deleteEmployee(Long id);

    List<Employee> findByDepartment(Long departmentId);
}
