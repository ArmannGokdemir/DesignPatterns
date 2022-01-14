package com.company;
//For adapting OracleLogger to system
public class LoggerAdapter implements ILogger{
    private OracleLogger oracleLogger;
    public LoggerAdapter(OracleLogger oracleLogger){
        this.oracleLogger=oracleLogger;
    }
    @Override
    public void LogPerson(User user) {
        oracleLogger.UserLogging(user.getName(), user.getAge());

    }
}
