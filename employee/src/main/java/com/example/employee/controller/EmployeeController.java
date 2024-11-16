package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam int id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping("/all-employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam int id) {
        employeeService.deleteEmployee(id);
    }
}
