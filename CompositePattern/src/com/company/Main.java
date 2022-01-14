package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 Employee dev = new Developer();
     Employee manager = new Manager();
     Employee designer = new Designer();

        Employee dev2 = new Developer();
        Employee manager2 = new Manager();
        Employee designer2 = new Designer();
        dev2.setName("arman");


        Employee dev3 = new Developer();
        Employee manager3 = new Manager();
        Employee designer3 = new Designer();
       dev3.setName("arman");
        Employee dev4 = new Developer();
        Employee manager4 = new Manager();
        Employee designer4 = new Designer();

        Group group1 = new Group();
        group1.AddEmployee(manager);

        Group group2 = new Group();
        group2.AddEmployee(dev);
        group2.AddEmployee(designer);
        dev4.setName("mehmet");

        Group group3 = new Group();
        Group group4 = new Group();
        group4.AddEmployee(dev2);

        group3.AddEmployee(dev3);
        group4.AddEmployee(group3);
        group2.AddEmployee(group4);
        group3.AddEmployee(dev4);
        ArrayList<Employee> employees = group3.GetEmployeeList();
        for (Employee employee: employees ) {
            employee.ShowInfo();

        }
        group1.AddEmployee(group2);
    }
}
