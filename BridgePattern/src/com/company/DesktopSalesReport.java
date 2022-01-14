package com.company;

public class DesktopSalesReport extends Report{

    EmployeePerformanceReport employeePerformanceReport;

    public DesktopSalesReport(EmployeePerformanceReport employeePerformanceReport){
        this.employeePerformanceReport = employeePerformanceReport;
    }
    public void report(){
        employeePerformanceReport.FormatReport();
    }
}
