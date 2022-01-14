package com.company;

public class Main {

    public static void main(String[] args) {
	Employee manager = new Manager();
    Employee technician = new Technician();
    Employee engineer = new Engineer();




    manager.calculateSalary(new ManagerSalaryCalculator());
    manager.calculateDaysOff(new DepartmantADaysOff());

    technician.calculateSalary(new TechinicanSalaryCalculator());
    technician.calculateDaysOff(new DepartmantBDaysOff());

    engineer.calculateSalary(new EngineerSalaryCalculator());
    engineer.calculateDaysOff(new DepartmantBDaysOff());

        System.out.println("Engineer salary : "+engineer.getSalary()+" Engineer days off : "+engineer.getDayOff());




    }
}
