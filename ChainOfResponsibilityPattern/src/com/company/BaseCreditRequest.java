package com.company;

public abstract class BaseCreditRequest {

    public boolean creditConfirmed;

    protected BaseCreditRequest nextHandler;

    public void setNextHandler(BaseCreditRequest nextHandler){
        this.nextHandler=nextHandler;
    }

    public void Execute(Customer customer){

        ExecuteProcess(customer);
        if(this.nextHandler!=null){

            this.nextHandler.creditConfirmed=this.creditConfirmed;
            this.nextHandler.Execute(customer);

        }

    }
    public void ExecuteProcess(Customer customer){

    }


}
