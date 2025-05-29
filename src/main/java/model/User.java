package model;

import java.util.Date;

public class User {
    private String login;
    private String name;
    private String password;
    private Date bornDate;

    public User(String login, String password, String name, Date bornDate) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.bornDate = bornDate;
    }

    public String getName() {
        return this.name;
    }

    public String getLogin() {
        return this.login;
    }

    public String getBornDate() {
        return this.bornDate.toString();
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setBornDate(Date newBornDate) {
        this.bornDate = newBornDate;
    }
}
