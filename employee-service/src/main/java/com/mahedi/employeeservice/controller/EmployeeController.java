package com.mahedi.employeeservice.controller;

import com.mahedi.employeeservice.model.Employee;
import com.mahedi.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping()
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Employee employee){
        employeeService.updateEmployee(id);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Deleted";
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId){
        return employeeService.findByDepartment(departmentId);
    }
}
