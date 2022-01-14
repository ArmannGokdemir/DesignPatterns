package com.company;

public class WebEmpPerformanceReport implements EmployeePerformanceReport{
    @Override
    public void FormatReport() {
        System.out.println("data gathered through web");
    }
}
