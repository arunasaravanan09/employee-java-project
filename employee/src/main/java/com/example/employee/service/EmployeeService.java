package com.example.employee.service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployee(int id) {
        return employeeDao.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: "+id));
    }

    public List<Employee> getEmployee() {
        return employeeDao.findAll();
    }

    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeDao.deleteById(id);
    }
}
