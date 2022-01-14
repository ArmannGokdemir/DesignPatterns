package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Arman",15000,7,12560);
        Customer customer1 = new Customer("Mehmet",15000,5,5200);
        customer.setLoanAmount(150000);
        customer.setLoanAmount(20000);

        ArrayList<BaseCreditRequest> chain = new ArrayList<BaseCreditRequest>();

        chain.add(new CheckKbbScore());
        chain.add(new CheckEarnings());
        chain.add(new CheckCardPaymentTime());

        chain.get(0).setNextHandler(chain.get(1));
        chain.get(1).setNextHandler(chain.get(2));
        chain.get(0).Execute(customer);
        boolean creditConfirmed =chain.get(chain.size()-1).creditConfirmed;
        if(creditConfirmed){
            System.out.println("Mr "+customer.getName()+" your loan request has been accepted.");
        }
        else   System.out.println("Mr "+customer.getName()+" your loan request has been denied.");


    }
}
