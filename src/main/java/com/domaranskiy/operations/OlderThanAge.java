package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.List;
import java.util.stream.Collectors;

public class OlderThanAge {
    public void getOlderThanAge(List<User> userList, int age) {
        System.out.println("Older Than " + age + ": "
                + userList.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList()));
    }
}