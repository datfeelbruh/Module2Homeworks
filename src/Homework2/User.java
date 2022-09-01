package Homework2;

import java.util.List;

public class User {
    int id;
    List<Integer> userList;

    public User(int id) {
        this.id = id;
    }

    public void setUserList(List<Integer> list) {
        this.userList = list;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getUserList() {
        return userList;
    }
}

