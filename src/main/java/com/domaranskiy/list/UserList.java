package com.domaranskiy.list;

import java.util.Arrays;
import java.util.List;

public class UserList {
    List<User> list = Arrays.asList(
            new User("Vasya", 16, "Dnipro"),
            new User("Petya", 23, "Dnipro"),
            new User("Elena", 42, "Lutsk"),
            new User("Elena", 92, "Chernigov"),
            new User("Sergey", 5, "Kiev"),
            new User("Maryna", 32, "Kiev"),
            new User("Ivan  Ivanovich", 69, "Lviv")
    );

    public List<User> getUserList() {
        return list;
    }
}