package com.homework_8.operations;

import com.homework_8.user.User;

import java.util.List;

public class AverageAgeLviv {
    public void getAverageAgeLviv(List<User> userList) {
        double averageAge = userList.stream()
                .filter(user -> "Львов".equals(user.getCity()))
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
        System.out.println("Average Age Lviv: " + averageAge);
    }
}