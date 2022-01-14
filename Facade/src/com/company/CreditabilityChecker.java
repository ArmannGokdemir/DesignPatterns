package com.company;

public class CreditabilityChecker {
    private boolean creditCheck = false;

    public boolean CreditPointCheck(User user){
        if(user.getCreditNote()<50){
            creditCheck=false;
            System.out.println("We cant give credit to "+"Mr "+user.getName()+" not enough credit note");
        }
        else if(user.getCreditNote()>50){
            creditCheck=true;
            System.out.println("We can give credit to "+"Mr "+user.getName());
        }
        return creditCheck;
    }
}
