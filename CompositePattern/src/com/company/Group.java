package com.company;

import java.util.ArrayList;

public class Group extends Employee{

    private ArrayList<Employee> employeeList = new ArrayList<Employee>();



    public void AddEmployee(Employee emp){
        employeeList.add(emp);
    }

    public ArrayList GetEmployeeList(){

        return this.employeeList;
    }

    public void  RemoveEmployee(Employee emp){
        int index = employeeList.indexOf(emp);
        employeeList.remove(index);
    }

}
