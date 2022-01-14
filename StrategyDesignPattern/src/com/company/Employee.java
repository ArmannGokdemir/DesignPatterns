package com.company;

public abstract class Employee {
    private int salary,dayOff;
    private SalaryCalculator salaryCalculator;
    private DayOffCallculator dayOffCallculator;

    public void calculateSalary(SalaryCalculator salaryCalculator){
        this.salaryCalculator=salaryCalculator;
        salaryCalculator.calculateSalary(this);

    }

    public void calculateDaysOff(DayOffCallculator dayOffCallculator){
        this.dayOffCallculator=dayOffCallculator;
        dayOffCallculator.calculateDaysOff(this);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }
}
