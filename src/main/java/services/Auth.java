package services;

import model.User;
import util.ReadInput;
import util.UserUtils;

import java.util.ArrayList;

public class Auth {
    private UserUtils userUtils = new UserUtils();
    private ArrayList<User> users;
    private User loggedInUser;

    public Auth() {
        users = userUtils.getUsers();
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void printMenu() {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println("Enter the choice");
            int Choice = ReadInput.getscanner().nextInt();
            if (Choice == 1) {
                System.out.println("Enter the user Name");
                String username = ReadInput.getscanner().next();
                System.out.println("Enter the password");
                String password = ReadInput.getscanner().next();
                boolean isUserExists = users.stream().anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
                if (isUserExists) {
                    loggedInUser = users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                            .findFirst().get();
                    break;

                } else {
                    System.out.println("Invalid user");
                }

            } else if (Choice == 2) {
                System.out.println("Enter name");
                String username = ReadInput.getscanner().next();
                System.out.println("Enter emailId");
                String emailId = ReadInput.getscanner().next();
                System.out.println("Enter the password");
                String password = ReadInput.getscanner().next();
                boolean isUserExists = users.stream().anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(emailId));
                if (isUserExists) {
                    System.out.println("Already entered");
                } else {
                    User newUser = new User();
                    newUser.setId(users.size() + 1);
                    newUser.setEmail(emailId);
                    newUser.setUsername(username);
                    newUser.setPassword(password);
                    users.add(newUser);
                }

            }

        }
    }
}
