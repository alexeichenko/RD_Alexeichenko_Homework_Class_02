package jdbc_homework_fist_part.init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public static volatile DBConnection instance;
    private Connection connection;

    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "061295";
            String base_url = "jdbc:mysql://localhost:3306/";
            // Підключення без вказівки схеми
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "rd_homework";
            try (Statement statement = initialConnection.createStatement()) {
                // Створення схеми, якщо вона не існує
                statement.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            }
            initialConnection.close();
            // Підключення до створеної (або існуючої) схеми
            String url = base_url + dbName;
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    public static DBConnection getDbInstance() throws SQLException {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null || instance.getDbConnection().isClosed()) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    public Connection getDbConnection() {
        return connection;
    }
}
