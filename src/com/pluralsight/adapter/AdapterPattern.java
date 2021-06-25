package com.pluralsight.adapter;
// Good for connecting new code to legacy code
// Converts interface into another interface (translates requests)
// Client centric
// Examples: Arrays -> Lists

import java.util.Arrays;
import java.util.List;

public class AdapterPattern {

    public static void main(String args[]) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);




//        Integer[] arrayOfInts = new Integer[]{42, 43, 44};
//        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
//        System.out.println(arrayOfInts);
//        System.out.println(listOfInts);
    }
}