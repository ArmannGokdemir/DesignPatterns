package com.company;

public class MsSqlLogger implements ILogger{
    @Override
    public void LogPerson(User user) {
        System.out.println(user.getName()+"has been logged by MSSQL");

    }
}
