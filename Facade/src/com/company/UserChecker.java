package com.company;

public class UserChecker {
    private boolean checkUser=false;
    public boolean CheckUser(User user){
        if(user.getNationalityNumber().isEmpty()==true){
            checkUser=true;
            System.out.println("Check"+"MR "+user.getName()+"'s information");
        }
        return checkUser;
    }
}
