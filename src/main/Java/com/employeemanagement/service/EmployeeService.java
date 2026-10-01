package com.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.employeemanagement.model.Employee;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Find Employee by ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Delete Employee
    public boolean deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);

        if (employee != null) {
            employees.remove(employee);
            return true;
        }

        return false;
    }
}