package com.employeemanagement.controller;

import java.util.List;

import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeService.getEmployeeById(id);
    }

    public boolean deleteEmployee(int id) {
        return employeeService.deleteEmployee(id);
    }
}