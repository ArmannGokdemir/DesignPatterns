package com.company;

public class TechinicanSalaryCalculator implements SalaryCalculator{
    @Override
    public void calculateSalary(Employee employee) {
        employee.setSalary(6000);
    }
}
