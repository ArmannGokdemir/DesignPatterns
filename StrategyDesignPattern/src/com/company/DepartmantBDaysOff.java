package com.company;

public class DepartmantBDaysOff implements DayOffCallculator{
    @Override
    public void calculateDaysOff(Employee employee) {
        employee.setDayOff(30);
    }
}
