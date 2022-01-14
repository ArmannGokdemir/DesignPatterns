package com.company;

public class CheckCardPaymentTime extends BaseCreditRequest{

    public void ExecuteProcess(Customer customer){
        if(creditConfirmed==true){

            if(customer.getPaymentTime()<6){
                this.creditConfirmed=true;


            }
            else this.creditConfirmed=false;


        }
    }

}
