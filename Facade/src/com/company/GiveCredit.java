package com.company;

public class GiveCredit {
    public void GiveCredit(User user,int creditAmount){
        user.setMoney(creditAmount);
        System.out.println("Mr "+user.getName()+"'s Credit transaction is completed.");
    }
}
