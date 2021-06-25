package com.pluralsight.adapter;
// Good for connecting new code to legacy code (retrofit)
// Converts interface into another interface (translates requests)
// Client centric
// Shouldn't add functionality (should use decorator then)
// Examples: Arrays -> Lists

import java.util.List;

public class AdapterPattern {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }
}