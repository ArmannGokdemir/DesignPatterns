package com.company;

public class CheckKbbScore extends BaseCreditRequest{

    public void ExecuteProcess(Customer customer){



            if(customer.getKbbScore()>1000){
                this.creditConfirmed=true;


            }
            else this.creditConfirmed=false;



    }

}
