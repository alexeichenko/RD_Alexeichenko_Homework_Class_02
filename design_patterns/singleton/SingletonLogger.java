package design_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonLogger {
    private static SingletonLogger instance;
    private List<String> logMessages;
    private SingletonLogger() {
        logMessages = new ArrayList<>();
    }
    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }
    public void log(String message) {
        logMessages.add(message);
    }
    public void printLogs() {
        for (String message : logMessages) {
            System.out.println(message);
        }
    }





}
