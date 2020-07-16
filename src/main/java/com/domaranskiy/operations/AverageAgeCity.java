package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.List;

public class AverageAgeCity {
    public void getAverageAgeCity(List<User> userList, String cityName) {
        System.out.println("Average Age " + cityName + ": "
                + userList.stream()
                .filter(user -> cityName.equals(user.getCity()))
                .mapToInt(User::getAge)
                .average()
                .getAsDouble());
    }
}