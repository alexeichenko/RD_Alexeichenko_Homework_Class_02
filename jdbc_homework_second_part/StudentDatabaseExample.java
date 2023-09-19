package jdbc_homework_second_part;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDatabaseExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String jdbcUser = "root";
        String jdbcPassword = "061295";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
            // Створення таблиці students
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "age INT NOT NULL" +
                    ")";
            try (PreparedStatement createTableStatement = connection.prepareStatement(createTableSQL)) {
                createTableStatement.execute();
                System.out.println("Таблицю students успішно створено.");
            }

            // Додавання студента до бази даних
            String insertStudentSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
            try (PreparedStatement insertStatement = connection.prepareStatement(insertStudentSQL)) {
                insertStatement.setString(1, "Іван Петров");
                insertStatement.setInt(2, 20);
                insertStatement.executeUpdate();
                System.out.println("Студента успішно додано до таблиці.");
            }

            // Зчитування інформації про студентів
            String selectStudentsSQL = "SELECT id, name, age FROM students";
            try (PreparedStatement selectStatement = connection.prepareStatement(selectStudentsSQL)) {
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        System.out.println("ID: " + id + ", Ім'я: " + name + ", Вік: " + age);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
