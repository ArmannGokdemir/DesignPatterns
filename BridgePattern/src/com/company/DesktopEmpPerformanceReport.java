package com.company;

public class DesktopEmpPerformanceReport implements EmployeePerformanceReport{
    @Override
    public void FormatReport() {
        System.out.println("data gathered through desktop");
    }
}
