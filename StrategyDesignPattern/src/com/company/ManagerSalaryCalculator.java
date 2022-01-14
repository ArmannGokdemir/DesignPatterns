package com.company;

public class ManagerSalaryCalculator implements SalaryCalculator{
    @Override
    public void calculateSalary(Employee employee) {
        employee.setSalary(35000);
    }
}
