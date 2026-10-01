package com.employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import com.employeemanagement.model.Employee;

public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    public void delete(int id) {
        Employee employee = findById(id);

        if (employee != null) {
            employees.remove(employee);
        }
    }
}