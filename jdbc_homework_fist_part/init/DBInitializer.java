package jdbc_homework_fist_part.init;

import jdbc.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitializer {
    private void initializeDb() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        try (Statement statement = connection.createStatement()) {
            // Створення змінної country
            statement.execute(
                    "CREATE TABLE IF NOT EXIST country (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL" +
                            ")"
            );
            // Створення таблиці city
            statement.execute(
                    "CREATE TABLE IF NOT EXIST city (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "surname VARCHAR(255) NOT NULL," +
                            "country_id INT," +
                            "FOREIGN KEY (country_id) REFERENCES country(id)" +
                            ")"
            );
        }
    }
    public void createDb() {
        try {
            initializeDb();
            System.out.println("Database and tables created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
