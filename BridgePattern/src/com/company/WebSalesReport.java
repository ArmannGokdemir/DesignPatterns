package com.company;

public class WebSalesReport extends Report {
    EmployeePerformanceReport employeePerformanceReport;

    public WebSalesReport(EmployeePerformanceReport employeePerformanceReport){
        this.employeePerformanceReport = employeePerformanceReport;
    }
    public void report(){
        employeePerformanceReport.FormatReport();
    }


}
