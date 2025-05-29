package view;

import java.util.ArrayList;
import java.util.Scanner;

import constroller.TaskListController;
import constroller.UserController;
import model.User;

public class Menu {
    private Scanner menuScanner;
    private TaskListController taskListController;
    private UserController userController;

    public Menu() {
        this.menuScanner = new Scanner(System.in);
        taskListController = new TaskListController();
        userController = new UserController();
    }

    public int showMenuOptions() {
        int selectedOption = 0;

        System.out.println("1. Create user");
        System.out.println("2. List users");
        System.out.println("3. Create task list");
        System.out.println("4. List task lists");
        System.out.println("5, Add task to task list");
        System.out.println("6. Remove task from task list");
        System.out.println("7. Set task as done");
        System.out.println("8. Exit");

        selectedOption = menuScanner.nextInt();

        return selectedOption;
    }
    
    public void createUser() {
        System.out.println("Enter the user login:");
        String login = menuScanner.next();
        System.out.println("Enter the user password:");
        String password = menuScanner.next();

        UserController.createUser(login, password);
    }

    public void listUsers() {
        ArrayList<User> users = userController.getUsers();

        for (User user : users) {
            System.out.println("Login: " + user.getLogin());
            System.out.println("Name: " + user.getName());
            System.out.println("Born date: " + user.getBornDate());
        }
    }
}
