package com.mahedi.departmentservice.controller;

import com.mahedi.departmentservice.client.EmployeeClient;
import com.mahedi.departmentservice.model.Department;
import com.mahedi.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;
    private final EmployeeClient employeeClient;


    @GetMapping()
    public List<Department> getAll(){
        return departmentService.getAll();
    }

    @PostMapping()
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

//    @PutMapping("/{id}")
//    public void updateDepartment(@PathVariable Long id, @RequestBody Department department){
//        departmentService.updateDepartment(id);
//    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartment(id);
        return "Deleted";
    }

    @GetMapping("/with-employees")
    public List<Department> getAllWithemployees(){
        return departmentService.getAllWithemployees();
    }

}
