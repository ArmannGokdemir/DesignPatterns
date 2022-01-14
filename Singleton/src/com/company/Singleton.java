package com.company;

import java.util.concurrent.locks.Lock;

public class Singleton  {
    private static Singleton singletonObject;
    private static Object locker=new Object();


    private Singleton(){

    }

    public static Singleton getInstance(){

        if(singletonObject == null){

            synchronized (locker){
                if(singletonObject == null){
                    singletonObject = new Singleton();
                }
            }
        }
        return singletonObject;
    }

}
