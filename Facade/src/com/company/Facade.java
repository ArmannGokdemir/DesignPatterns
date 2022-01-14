package com.company;

public class Facade {
    private CreditabilityChecker creditabilityChecker = new CreditabilityChecker();
    private UserChecker userChecker=new UserChecker();
    private GiveCredit giveCredit =new GiveCredit();

    public void GiveCredit(User user,int amount){
        if(!userChecker.CheckUser(user)){
            if(creditabilityChecker.CreditPointCheck(user)){
                giveCredit.GiveCredit(user,amount);
            }
        }
    }
}
