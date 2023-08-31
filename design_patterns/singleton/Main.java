package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Реалізація Singleton
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.log("First event occurred.");
        singletonLogger.log("Second event occurred.");

        SingletonLogger sameSingletonLogger = SingletonLogger.getInstance();
        sameSingletonLogger.log("Third event occurred.");
        singletonLogger.printLogs(); // Виведе всі три події
    }
}
