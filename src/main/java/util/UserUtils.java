package util;

import model.User;

import java.util.ArrayList;

public class UserUtils {
    static ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
