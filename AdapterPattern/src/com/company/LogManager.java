package com.company;

public class LogManager implements ILogger{
    ILogger logger;

    public LogManager(ILogger logger){
       this.logger = logger;
    }

    @Override
    public void LogPerson(User user) {
        logger.LogPerson(user);

    }
}
