package com.employeemanagement;

import com.employeemanagement.controller.EmployeeController;
import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;

public class EmployeeManagementApplication {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();

        EmployeeController employeeController =
                new EmployeeController(employeeService);

        Employee employee1 = new Employee(
                1,
                "Yaser",
                "yaser@gmail.com",
                "IT",
                5000
        );

        Employee employee2 = new Employee(
                2,
                "Rahul",
                "rahul@gmail.com",
                "HR",
                4500
        );

        // Add Employees
        employeeController.addEmployee(employee1);
        employeeController.addEmployee(employee2);

        // Display Employees
        System.out.println("Employee List:");

        for (Employee employee : employeeController.getAllEmployees()) {

            System.out.println(
                    employee.getId() + " | " +
                    employee.getName() + " | " +
                    employee.getEmail() + " | " +
                    employee.getDepartment() + " | " +
                    employee.getSalary()
            );
        }

        // Find Employee
        System.out.println("\nSearch Employee:");

        Employee employee = employeeController.getEmployeeById(1);

        if (employee != null) {
            System.out.println(
                    employee.getId() + " | " +
                    employee.getName() + " | " +
                    employee.getEmail()
            );
        }

        // Delete Employee
        employeeController.deleteEmployee(2);

        System.out.println("\nAfter Delete:");

        for (Employee emp : employeeController.getAllEmployees()) {
            System.out.println(
                    emp.getId() + " | " +
                    emp.getName() + " | " +
                    emp.getDepartment()
            );
        }
    }
}