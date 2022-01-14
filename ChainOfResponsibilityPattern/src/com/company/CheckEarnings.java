package com.company;

public class CheckEarnings extends BaseCreditRequest {

    public void ExecuteProcess(Customer customer){

        if(this.creditConfirmed==true){
            if(customer.getSalary()>=customer.getLoanAmount()/20){
                this.creditConfirmed=true;

            }
            else this.creditConfirmed=false;

        }
        }



}
