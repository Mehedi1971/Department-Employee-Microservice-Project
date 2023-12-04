package com.mahedi.departmentservice.client;

import com.mahedi.departmentservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

//@HttpExchange
@FeignClient(name = "employee-service")
public interface EmployeeClient {
    @GetExchange("/employee/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
