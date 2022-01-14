package com.company;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Arman Gokdemir","1234567",79,15000);
        User user2=new User("Mehmet Gunmen","1234590354",45,1500);
        User user3=new User("Ahmet Catalcalan","",51,15000);

        Facade facade =new Facade();
        facade.GiveCredit(user1,15000);
        facade.GiveCredit(user2,15000);
        facade.GiveCredit(user3,15000);

        String a = "";



    }
}
