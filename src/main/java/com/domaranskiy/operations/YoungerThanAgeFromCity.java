package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.List;
import java.util.stream.Collectors;

public class YoungerThanAgeFromCity {
    public void getYoungerThanAgeFromCity(List<User> userList, int age, String cityName) {
        System.out.println("User Younger Than " + age + " with " + cityName + ": "
                + userList.stream()
                .filter(u -> u.getAge() < age && cityName.equals(u.getCity()))
                .collect(Collectors.toList()));
    }
}