package com.company;

public class DepartmantADaysOff implements DayOffCallculator{
    @Override
    public void calculateDaysOff(Employee employee) {
        employee.setDayOff(12);
    }
}
