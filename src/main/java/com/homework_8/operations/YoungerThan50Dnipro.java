package com.homework_8.operations;

import com.homework_8.user.User;

import java.util.List;
import java.util.stream.Collectors;

public class YoungerThan50Dnipro {
    public void getYoungerThan50Dnipro(List<User> userList) {
        System.out.println("User Younger Than 50 with Dnipro: "
                + userList.stream()
                .filter(u -> u.getAge() < 50 && "Днепр".equals(u.getCity()))
                .collect(Collectors.toList()));
    }
}