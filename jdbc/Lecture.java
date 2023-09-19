package jdbc;

import jdbc.fetch.UserWithDepartmentFetcher;
import jdbc.init.DatabaseCreationFacade;
import jdbc.model.Department;
import jdbc.model.User;
import jdbc.service.DepartmentService;
import jdbc.service.UserService;

import java.sql.SQLException;
import java.util.List;

/*
  package init :
    DatabaseConnection - to create connection and database schema
    DatabaseInitializer - to create tables (user and department)
    UserCreator - to create users
    DepartmentCreator - to create departments
  package model :
    User - model of user (the same as in database)
    Department - model of department (the same as in database)
  package crud :
    UserManager - Create / Read / Update / Delete user
    DepartmentManager - Create / Read / Update / Delete user
  package fetch :
    UserWithDepartmentFetcher - to fetch all Users with Departments and information regarding JDBC classes
  package transactional :
    TransactionalInfo - class with information regarding transactions
    TransactionalExample - class with example how to run custom transaction
 */
public class Lecture {
    public static void main(String[] args) {
        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        //after first run -> make it false, to create database -> true
        databaseCreationFacade.createAndInsertDatabase(false);

        UserWithDepartmentFetcher userWithDepartmentFetcher = new UserWithDepartmentFetcher();
        try {
            List<User> userList = userWithDepartmentFetcher.fetchUsersWithDepartments();
            System.out.println(userList);
            UserService userService = new UserService();
            User user = userService.getUserById(1);
            System.out.println(user);
            DepartmentService departmentService = new DepartmentService();
            Department department = departmentService.getDepartmentById(1);
            System.out.println(department);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
