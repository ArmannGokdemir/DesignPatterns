package com.company;

public class Main {

    public static void main(String[] args) {



        WebSalesReport webReport = new WebSalesReport(new WebEmpPerformanceReport());
        DesktopSalesReport desktopReport = new DesktopSalesReport(new DesktopEmpPerformanceReport());

        webReport.report();
        desktopReport.report();

    }
}
