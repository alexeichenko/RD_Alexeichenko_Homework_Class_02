package jdbc.service;

import jdbc.crud.UserManager;
import jdbc.model.User;

import java.sql.SQLException;

public class UserService {
    private UserManager userManager;

    public UserService() {
        this.userManager = new UserManager();
    }

    public void createUser(User user) throws SQLException {
        userManager.insertUser(user);
    }

    public User getUserById(int id) throws SQLException {
        return userManager.findUserById(id);
    }

    public void updateUser(User user) throws SQLException {
        userManager.updateUser(user);
    }

    public void deleteUser(int id) throws SQLException {
        userManager.deleteUser(id);
    }
}