package com.company;

public class User {

    private String name;
    private int creditNote;
    private int money;
    private String NationalityNumber;

    public User(String name,String nationalityNumber ,int creditNote, int money) {
        this.name = name;
        this.creditNote = creditNote;
        this.money = money;
        this.NationalityNumber=nationalityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditNote() {
        return creditNote;
    }

    public void setCreditNote(int creditNote) {
        this.creditNote = creditNote;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = this.money+money;
    }

    public String getNationalityNumber() {
        return NationalityNumber;
    }

    public void setNationalityNumber(String nationalityNumber) {
        NationalityNumber = nationalityNumber;
    }
}
