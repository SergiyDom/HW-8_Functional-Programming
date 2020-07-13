package com.homework_8.operations;

import com.homework_8.user.User;

import java.util.List;
import java.util.stream.Collectors;

public class OlderThan40 {
    public void getOlderThan40(List<User> userList) {
        userList.stream()
                .filter(user -> user.getAge() > 40)
                .collect(Collectors.toList());
        System.out.println("Older Than 40: ");
    }
}