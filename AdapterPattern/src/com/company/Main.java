package com.company;

public class Main {

    public static void main(String[] args) {
        User user1= new User("arman gokdemir",22);
        User user2 = new User("Mehmet Canıbaz",19);
        User user3 = new User("Ayşe Gürmez",22);

        ILogger mssqlLogger = new MsSqlLogger();
        ILogger postgresqlLogger = new PostgreSQLLogger();
        ILogger oracleLogger = new LoggerAdapter(new OracleLogger());
        LogManager logManager = new LogManager(postgresqlLogger);
        mssqlLogger.LogPerson(user1);
        postgresqlLogger.LogPerson(user2);
        oracleLogger.LogPerson(user3);
        logManager.LogPerson(user1);

    }
}
