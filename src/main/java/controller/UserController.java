package controller;

import model.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class UserController {
    private ArrayList<User> users;

    public UserController() {
        this.users = new ArrayList<User>();

        User user1 = new User("login1", "password1", "name1", new Date(123, Calendar.JANUARY, 1));
    }

    public User addUser(String name, String login, String password, Date bornDate) {
        User newUser;

        if (this.validateNewUser(name, login, password, bornDate)) {
            newUser = new User(login, password, name, bornDate);

            this.users.add(newUser);
            return newUser;
        };

        return null;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    private boolean validateNewUser(String name, String login, String password, Date bornDate) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        if (login == null || login.isEmpty()) {
            return false;
        }

        if (password == null || password.isEmpty()) {
            return false;
        }

        if (bornDate == null) {
            return false;
        }

        if (verifyIfLoginExists(login)) {
            return false;
        }

        return verifyDateIsValid(bornDate);
    }

    private boolean verifyIfLoginExists(String login) {
        if (!this.users.isEmpty()) {
            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean verifyDateIsValid(Date date) {
        Date currentDate = new Date();

        return !date.after(currentDate);
    }
}
