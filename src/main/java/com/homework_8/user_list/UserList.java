package com.homework_8.user_list;

import com.homework_8.user.User;

import java.util.Arrays;
import java.util.List;

public class UserList {
    List<User> list = Arrays.asList(
            new User("Вася", 16, "Днепр"),
            new User("Петя", 23, "Днепр"),
            new User("Елена", 42, "Луцк"),
            new User("Елена", 92, "Чернигов"),
            new User("Сергей", 5, "Киев"),
            new User("Марина", 32, "Киев"),
            new User("Иван Иванович", 69, "Львов")
    );
    public List<User> getUserList(){
        return list;
    }
}