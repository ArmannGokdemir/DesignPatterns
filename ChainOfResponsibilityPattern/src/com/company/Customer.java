package com.company;

public class Customer {
    private String name;
    private int kbbScore;
    private int paymentTime;
    private int salary;
    private int loanAmount;

    public Customer(String name, int kbbScore, int paymentTime, int salary) {
        this.name = name;
        this.kbbScore = kbbScore;
        this.paymentTime = paymentTime;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKbbScore() {
        return kbbScore;
    }

    public void setKbbScore(int kbbScore) {
        this.kbbScore = kbbScore;
    }

    public int getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(int paymentTime) {
        this.paymentTime = paymentTime;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
}
