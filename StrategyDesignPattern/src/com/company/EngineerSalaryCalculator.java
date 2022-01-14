package com.company;

public class EngineerSalaryCalculator implements SalaryCalculator{
    @Override
    public void calculateSalary(Employee employee) {

        employee.setSalary(15000);

    }
}
