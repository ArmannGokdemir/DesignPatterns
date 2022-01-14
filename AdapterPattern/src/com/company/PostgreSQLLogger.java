package com.company;

public class PostgreSQLLogger implements ILogger{
    @Override
    public void LogPerson(User user) {
        System.out.println(user.getName()+"has been logged by postgreSQL");

    }
}
